/**
 * Segment-Based Visual Cryptography Module
 *
 * This module implements visual cryptography using seven-segment displays.
 * A 4-digit PIN is split into two "shares" that individually reveal nothing,
 * but when overlaid (stacked) reveal the original PIN.
 *
 * Seven-Segment Display Layout:
 *      ─── a (top)
 *     │   │
 *   f │   │ b
 *     │   │
 *      ─── g (middle)
 *     │   │
 *   e │   │ c
 *     │   │
 *      ─── d (bottom)
 *
 * Segment indices:
 * 0 = top (a), 1 = rightTop (b), 2 = rightBottom (c),
 * 3 = bottom (d), 4 = leftBottom (e), 5 = leftTop (f), 6 = middle (g)
 */

// Segment patterns for digits 0-9
// true = segment ON, false = segment OFF
// Order: [top, rightTop, rightBottom, bottom, leftBottom, leftTop, middle]
export const DIGIT_SEGMENTS = {
  '0': [true,  true,  true,  true,  true,  true,  false],  // 0: a,b,c,d,e,f
  '1': [false, true,  true,  false, false, false, false],  // 1: b,c
  '2': [true,  true,  false, true,  true,  false, true ],  // 2: a,b,d,e,g
  '3': [true,  true,  true,  true,  false, false, true ],  // 3: a,b,c,d,g
  '4': [false, true,  true,  false, false, true,  true ],  // 4: b,c,f,g
  '5': [true,  false, true,  true,  false, true,  true ],  // 5: a,c,d,f,g
  '6': [true,  false, true,  true,  true,  true,  true ],  // 6: a,c,d,e,f,g
  '7': [true,  true,  true,  false, false, false, false],  // 7: a,b,c
  '8': [true,  true,  true,  true,  true,  true,  true ],  // 8: all
  '9': [true,  true,  true,  true,  false, true,  true ]   // 9: a,b,c,d,f,g
};

export const SEGMENT_COUNT = 7;

/**
 * Generates a random array of positions (0 or 1) for each segment
 * @returns {number[]} Array of 7 random values (0 or 1)
 */
export function generateRandomPositions() {
  return Array.from({ length: SEGMENT_COUNT }, () => Math.round(Math.random()));
}

/**
 * Generates Share 1 (random noise share)
 * For each segment, we draw at either position 0 or position 1 based on randomPositions
 *
 * @param {number[]} randomPositions - Array of 7 random values (0 or 1)
 * @returns {number[]} Share 1 positions - same as randomPositions (which position to draw each segment)
 */
export function generateShare1(randomPositions) {
  // Share 1 simply draws at the random positions
  return [...randomPositions];
}

/**
 * Generates Share 2 (complementary share based on digit)
 *
 * For segments that should be VISIBLE in the final result:
 *   - Draw at the SAME position as Share 1 (so when stacked, both overlap = visible)
 *
 * For segments that should be HIDDEN in the final result:
 *   - Draw at the OPPOSITE position from Share 1 (so when stacked, they're offset = gray/fuzzy)
 *
 * @param {string} digit - Single digit character '0'-'9'
 * @param {number[]} randomPositions - Array of 7 random values (0 or 1)
 * @returns {number[]} Share 2 positions for the digit
 */
export function generateShare2ForDigit(digit, randomPositions) {
  const segments = DIGIT_SEGMENTS[digit];
  if (!segments) {
    throw new Error(`Invalid digit: ${digit}`);
  }

  return segments.map((isOn, index) => {
    if (isOn) {
      // Segment should be ON: draw at SAME position as Share 1
      return randomPositions[index];
    } else {
      // Segment should be OFF: draw at OPPOSITE position from Share 1
      return 1 - randomPositions[index];
    }
  });
}

/**
 * Generates both shares for a complete 4-digit PIN
 *
 * @param {string} pin - 4-digit PIN string
 * @returns {{ randomPositions: number[], share1: number[][], share2: number[][] }}
 */
export function generateShares(pin) {
  if (!/^\d{4}$/.test(pin)) {
    throw new Error('PIN must be exactly 4 digits');
  }

  // Generate one set of random positions (shared across all 4 digits)
  const randomPositions = generateRandomPositions();

  const share1 = [];
  const share2 = [];

  for (const digit of pin) {
    share1.push(generateShare1(randomPositions));
    share2.push(generateShare2ForDigit(digit, randomPositions));
  }

  return {
    randomPositions,
    share1,
    share2
  };
}

/**
 * Stacks two shares to reveal the original digit
 * When both shares have a segment at the SAME position, the segment is visible (ON)
 * When shares have segments at DIFFERENT positions, the result is fuzzy (OFF/gray)
 *
 * @param {number[]} share1Positions - Share 1 positions for one digit
 * @param {number[]} share2Positions - Share 2 positions for one digit
 * @returns {boolean[]} Array of 7 booleans indicating if each segment is visible
 */
export function stackShares(share1Positions, share2Positions) {
  return share1Positions.map((pos1, index) => {
    const pos2 = share2Positions[index];
    // Segment is clearly visible only if both shares have it at the same position
    return pos1 === pos2;
  });
}

/**
 * Verifies that stacking shares reveals the correct digit
 *
 * @param {string} digit - Expected digit
 * @param {number[]} share1Positions - Share 1 positions
 * @param {number[]} share2Positions - Share 2 positions
 * @returns {boolean} True if stacking reveals the correct digit
 */
export function verifyShares(digit, share1Positions, share2Positions) {
  const expectedSegments = DIGIT_SEGMENTS[digit];
  const stackedResult = stackShares(share1Positions, share2Positions);

  return expectedSegments.every((expected, index) => expected === stackedResult[index]);
}

/**
 * Encodes share data to a JSON string for saving/sharing
 *
 * @param {number[][]} share - Array of 4 digit positions
 * @returns {string} JSON encoded share data
 */
export function encodeShare(share) {
  return JSON.stringify({
    version: '2.0',
    type: 'sbvc-share',
    data: share
  });
}

/**
 * Decodes share data from a JSON string
 *
 * @param {string} encoded - JSON encoded share data
 * @returns {number[][]} Array of 4 digit positions
 */
export function decodeShare(encoded) {
  try {
    const parsed = JSON.parse(encoded);
    if (parsed.type !== 'sbvc-share' || !Array.isArray(parsed.data)) {
      throw new Error('Invalid share format');
    }
    return parsed.data;
  } catch (e) {
    throw new Error('Failed to decode share: ' + e.message);
  }
}

/**
 * Validates PIN input
 *
 * @param {string} pin - PIN to validate
 * @returns {{ valid: boolean, error?: string }}
 */
export function validatePIN(pin) {
  if (!pin || typeof pin !== 'string') {
    return { valid: false, error: 'PIN is required' };
  }

  if (pin.length !== 4) {
    return { valid: false, error: 'PIN must be exactly 4 digits' };
  }

  if (!/^\d+$/.test(pin)) {
    return { valid: false, error: 'PIN must contain only digits' };
  }

  return { valid: true };
}
