/**
 * Unit Tests for Visual Cryptography Module
 *
 * Tests the core cryptographic logic for segment-based visual cryptography
 */

import { describe, it, expect, beforeEach } from 'vitest';
import {
  DIGIT_SEGMENTS,
  SEGMENT_COUNT,
  generateRandomPositions,
  generateShare1,
  generateShare2ForDigit,
  generateShares,
  stackShares,
  verifyShares,
  encodeShare,
  decodeShare,
  validatePIN
} from '../src/js/visualCrypto.js';

describe('DIGIT_SEGMENTS', () => {
  it('should have patterns for all digits 0-9', () => {
    for (let i = 0; i <= 9; i++) {
      expect(DIGIT_SEGMENTS[String(i)]).toBeDefined();
      expect(DIGIT_SEGMENTS[String(i)]).toHaveLength(SEGMENT_COUNT);
    }
  });

  it('should have correct pattern for digit 0 (all except middle)', () => {
    const pattern = DIGIT_SEGMENTS['0'];
    // 0: top, rightTop, rightBottom, bottom, leftBottom, leftTop ON; middle OFF
    expect(pattern).toEqual([true, true, true, true, true, true, false]);
  });

  it('should have correct pattern for digit 1 (right side only)', () => {
    const pattern = DIGIT_SEGMENTS['1'];
    // 1: rightTop, rightBottom ON; all others OFF
    expect(pattern).toEqual([false, true, true, false, false, false, false]);
  });

  it('should have correct pattern for digit 8 (all segments)', () => {
    const pattern = DIGIT_SEGMENTS['8'];
    // 8: all segments ON
    expect(pattern).toEqual([true, true, true, true, true, true, true]);
  });
});

describe('generateRandomPositions', () => {
  it('should return an array of length 7', () => {
    const positions = generateRandomPositions();
    expect(positions).toHaveLength(SEGMENT_COUNT);
  });

  it('should only contain values 0 or 1', () => {
    // Run multiple times to test randomness
    for (let i = 0; i < 100; i++) {
      const positions = generateRandomPositions();
      positions.forEach(pos => {
        expect(pos === 0 || pos === 1).toBe(true);
      });
    }
  });

  it('should produce varying results (not always same)', () => {
    const results = new Set();
    for (let i = 0; i < 50; i++) {
      results.add(JSON.stringify(generateRandomPositions()));
    }
    // Should have multiple unique results
    expect(results.size).toBeGreaterThan(1);
  });
});

describe('generateShare1', () => {
  it('should return a copy of the random positions', () => {
    const randomPositions = [0, 1, 0, 1, 1, 0, 0];
    const share1 = generateShare1(randomPositions);

    expect(share1).toEqual(randomPositions);
    // Should be a copy, not the same reference
    expect(share1).not.toBe(randomPositions);
  });
});

describe('generateShare2ForDigit', () => {
  it('should throw error for invalid digit', () => {
    expect(() => generateShare2ForDigit('a', [0, 0, 0, 0, 0, 0, 0])).toThrow('Invalid digit');
    expect(() => generateShare2ForDigit('10', [0, 0, 0, 0, 0, 0, 0])).toThrow('Invalid digit');
  });

  it('should use same position for ON segments', () => {
    // For digit 1, only rightTop (index 1) and rightBottom (index 2) are ON
    const randomPositions = [0, 1, 0, 1, 0, 1, 0];
    const share2 = generateShare2ForDigit('1', randomPositions);

    // ON segments (indices 1, 2) should match random positions
    expect(share2[1]).toBe(randomPositions[1]); // rightTop
    expect(share2[2]).toBe(randomPositions[2]); // rightBottom
  });

  it('should use opposite position for OFF segments', () => {
    // For digit 1, all except rightTop and rightBottom are OFF
    const randomPositions = [0, 1, 0, 1, 0, 1, 0];
    const share2 = generateShare2ForDigit('1', randomPositions);

    // OFF segments should be opposite
    expect(share2[0]).toBe(1 - randomPositions[0]); // top
    expect(share2[3]).toBe(1 - randomPositions[3]); // bottom
    expect(share2[4]).toBe(1 - randomPositions[4]); // leftBottom
    expect(share2[5]).toBe(1 - randomPositions[5]); // leftTop
    expect(share2[6]).toBe(1 - randomPositions[6]); // middle
  });
});

describe('generateShares', () => {
  it('should throw error for invalid PIN', () => {
    expect(() => generateShares('123')).toThrow('PIN must be exactly 4 digits');
    expect(() => generateShares('12345')).toThrow('PIN must be exactly 4 digits');
    expect(() => generateShares('abcd')).toThrow('PIN must be exactly 4 digits');
  });

  it('should return share1 and share2 arrays with 4 elements each', () => {
    const result = generateShares('1234');

    expect(result.share1).toHaveLength(4);
    expect(result.share2).toHaveLength(4);
    expect(result.randomPositions).toHaveLength(SEGMENT_COUNT);
  });

  it('should generate same random positions for all digits', () => {
    const result = generateShares('1234');

    // All share1 entries should be identical (same random positions)
    const firstShare1 = result.share1[0];
    result.share1.forEach(share => {
      expect(share).toEqual(firstShare1);
    });
  });
});

describe('stackShares', () => {
  it('should return true for matching positions', () => {
    const share1 = [0, 1, 0, 1, 0, 1, 0];
    const share2 = [0, 1, 0, 1, 0, 1, 0]; // Same positions

    const result = stackShares(share1, share2);

    // All segments should be visible (same positions)
    expect(result).toEqual([true, true, true, true, true, true, true]);
  });

  it('should return false for different positions', () => {
    const share1 = [0, 0, 0, 0, 0, 0, 0];
    const share2 = [1, 1, 1, 1, 1, 1, 1]; // All different

    const result = stackShares(share1, share2);

    // All segments should be hidden (different positions)
    expect(result).toEqual([false, false, false, false, false, false, false]);
  });

  it('should correctly mix visible and hidden segments', () => {
    const share1 = [0, 1, 0, 1, 0, 1, 0];
    const share2 = [0, 0, 0, 0, 0, 1, 1]; // Some same, some different

    const result = stackShares(share1, share2);

    expect(result).toEqual([true, false, true, false, true, true, false]);
  });
});

describe('verifyShares', () => {
  it('should return true when stacking reveals correct digit', () => {
    const randomPositions = [0, 1, 0, 1, 0, 1, 0];
    const share1 = generateShare1(randomPositions);
    const share2 = generateShare2ForDigit('5', randomPositions);

    expect(verifyShares('5', share1, share2)).toBe(true);
  });

  it('should return false when stacking reveals wrong digit', () => {
    const randomPositions = [0, 1, 0, 1, 0, 1, 0];
    const share1 = generateShare1(randomPositions);
    const share2 = generateShare2ForDigit('5', randomPositions);

    // Verify against wrong digit
    expect(verifyShares('3', share1, share2)).toBe(false);
  });

  it('should work for all digits 0-9', () => {
    for (let d = 0; d <= 9; d++) {
      const digit = String(d);
      const randomPositions = generateRandomPositions();
      const share1 = generateShare1(randomPositions);
      const share2 = generateShare2ForDigit(digit, randomPositions);

      expect(verifyShares(digit, share1, share2)).toBe(true);
    }
  });
});

describe('Full encryption/decryption cycle', () => {
  it('should correctly encrypt and decrypt all possible 4-digit PINs (sample)', () => {
    // Test a sample of PINs
    const testPINs = ['0000', '1234', '5678', '9999', '1111', '0123', '9876'];

    for (const pin of testPINs) {
      const { share1, share2 } = generateShares(pin);

      // Verify each digit
      for (let i = 0; i < 4; i++) {
        expect(verifyShares(pin[i], share1[i], share2[i])).toBe(true);
      }
    }
  });

  it('should produce shares that individually reveal nothing', () => {
    const { share1 } = generateShares('1234');

    // Share1 is random, so each digit's pattern should be the same
    // (since they all use the same random positions)
    const firstPattern = share1[0];
    share1.forEach(pattern => {
      expect(pattern).toEqual(firstPattern);
    });

    // The pattern should just be random 0s and 1s, not related to digits
  });
});

describe('encodeShare / decodeShare', () => {
  it('should encode share to JSON string', () => {
    const shareData = [[0, 1, 0, 1, 0, 1, 0], [1, 0, 1, 0, 1, 0, 1], [0, 0, 1, 1, 0, 0, 1], [1, 1, 0, 0, 1, 1, 0]];
    const encoded = encodeShare(shareData);

    expect(typeof encoded).toBe('string');
    expect(encoded).toContain('sbvc-share');
    expect(encoded).toContain('2.0');
  });

  it('should decode JSON string back to share data', () => {
    const originalData = [[0, 1, 0, 1, 0, 1, 0], [1, 0, 1, 0, 1, 0, 1], [0, 0, 1, 1, 0, 0, 1], [1, 1, 0, 0, 1, 1, 0]];
    const encoded = encodeShare(originalData);
    const decoded = decodeShare(encoded);

    expect(decoded).toEqual(originalData);
  });

  it('should throw error for invalid share format', () => {
    expect(() => decodeShare('invalid json')).toThrow('Failed to decode share');
    expect(() => decodeShare('{"type":"wrong"}')).toThrow('Invalid share format');
  });
});

describe('validatePIN', () => {
  it('should validate correct 4-digit PINs', () => {
    expect(validatePIN('1234').valid).toBe(true);
    expect(validatePIN('0000').valid).toBe(true);
    expect(validatePIN('9999').valid).toBe(true);
  });

  it('should reject empty or missing PIN', () => {
    expect(validatePIN('').valid).toBe(false);
    expect(validatePIN(null).valid).toBe(false);
    expect(validatePIN(undefined).valid).toBe(false);
  });

  it('should reject PINs with wrong length', () => {
    expect(validatePIN('123').valid).toBe(false);
    expect(validatePIN('12345').valid).toBe(false);
    expect(validatePIN('1').valid).toBe(false);
  });

  it('should reject non-numeric PINs', () => {
    expect(validatePIN('abcd').valid).toBe(false);
    expect(validatePIN('12ab').valid).toBe(false);
    expect(validatePIN('12.4').valid).toBe(false);
    expect(validatePIN('12-4').valid).toBe(false);
  });

  it('should provide appropriate error messages', () => {
    expect(validatePIN('').error).toBe('PIN is required');
    expect(validatePIN('123').error).toBe('PIN must be exactly 4 digits');
    expect(validatePIN('abcd').error).toBe('PIN must contain only digits');
  });
});

describe('Edge cases', () => {
  it('should handle PIN with all same digits', () => {
    const pins = ['0000', '1111', '2222', '3333', '4444', '5555', '6666', '7777', '8888', '9999'];

    for (const pin of pins) {
      const { share1, share2 } = generateShares(pin);

      for (let i = 0; i < 4; i++) {
        expect(verifyShares(pin[i], share1[i], share2[i])).toBe(true);
      }
    }
  });

  it('should handle consecutive digits', () => {
    const { share1, share2 } = generateShares('0123');

    for (let i = 0; i < 4; i++) {
      const digit = String(i);
      expect(verifyShares(digit, share1[i], share2[i])).toBe(true);
    }
  });

  it('should produce different share2 for different digits with same randomPositions', () => {
    const randomPositions = [0, 1, 0, 1, 0, 1, 0];

    const share2_for_1 = generateShare2ForDigit('1', randomPositions);
    const share2_for_8 = generateShare2ForDigit('8', randomPositions);

    // These should be different since digits 1 and 8 have different segment patterns
    expect(share2_for_1).not.toEqual(share2_for_8);
  });
});
