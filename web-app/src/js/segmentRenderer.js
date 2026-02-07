/**
 * Seven-Segment Display Renderer
 *
 * Renders seven-segment displays on HTML5 Canvas
 * Supports rendering digits, shares, and stacked results
 */

// Segment geometry (relative to digit cell)
const SEGMENT_THICKNESS = 4;
const SEGMENT_GAP = 2;

/**
 * Segment path definitions (relative coordinates)
 * Each segment has two possible positions (0 and 1) for visual cryptography
 */
const SEGMENTS = {
  // top (horizontal)
  top: {
    type: 'horizontal',
    positions: [
      { x: 0.15, y: 0.08, width: 0.7, height: SEGMENT_THICKNESS },
      { x: 0.15, y: 0.12, width: 0.7, height: SEGMENT_THICKNESS }
    ]
  },
  // right top (vertical)
  rightTop: {
    type: 'vertical',
    positions: [
      { x: 0.82, y: 0.12, width: SEGMENT_THICKNESS, height: 0.35 },
      { x: 0.78, y: 0.12, width: SEGMENT_THICKNESS, height: 0.35 }
    ]
  },
  // right bottom (vertical)
  rightBottom: {
    type: 'vertical',
    positions: [
      { x: 0.82, y: 0.53, width: SEGMENT_THICKNESS, height: 0.35 },
      { x: 0.78, y: 0.53, width: SEGMENT_THICKNESS, height: 0.35 }
    ]
  },
  // bottom (horizontal)
  bottom: {
    type: 'horizontal',
    positions: [
      { x: 0.15, y: 0.88, width: 0.7, height: SEGMENT_THICKNESS },
      { x: 0.15, y: 0.84, width: 0.7, height: SEGMENT_THICKNESS }
    ]
  },
  // left bottom (vertical)
  leftBottom: {
    type: 'vertical',
    positions: [
      { x: 0.10, y: 0.53, width: SEGMENT_THICKNESS, height: 0.35 },
      { x: 0.14, y: 0.53, width: SEGMENT_THICKNESS, height: 0.35 }
    ]
  },
  // left top (vertical)
  leftTop: {
    type: 'vertical',
    positions: [
      { x: 0.10, y: 0.12, width: SEGMENT_THICKNESS, height: 0.35 },
      { x: 0.14, y: 0.12, width: SEGMENT_THICKNESS, height: 0.35 }
    ]
  },
  // middle (horizontal)
  middle: {
    type: 'horizontal',
    positions: [
      { x: 0.15, y: 0.48, width: 0.7, height: SEGMENT_THICKNESS },
      { x: 0.15, y: 0.52, width: 0.7, height: SEGMENT_THICKNESS }
    ]
  }
};

const SEGMENT_NAMES = ['top', 'rightTop', 'rightBottom', 'bottom', 'leftBottom', 'leftTop', 'middle'];

export class SegmentRenderer {
  constructor(canvas, options = {}) {
    this.canvas = canvas;
    this.ctx = canvas.getContext('2d');
    this.options = {
      backgroundColor: options.backgroundColor || '#1a1a2e',
      segmentOnColor: options.segmentOnColor || '#00ff88',
      segmentOffColor: options.segmentOffColor || '#2a2a4e',
      segmentGrayColor: options.segmentGrayColor || '#4a4a6e',
      digitWidth: options.digitWidth || 80,
      digitHeight: options.digitHeight || 140,
      digitSpacing: options.digitSpacing || 20,
      padding: options.padding || 30,
      glowEffect: options.glowEffect !== false
    };
  }

  /**
   * Clears the canvas with background color
   */
  clear() {
    this.ctx.fillStyle = this.options.backgroundColor;
    this.ctx.fillRect(0, 0, this.canvas.width, this.canvas.height);
  }

  /**
   * Draws a single segment
   *
   * @param {number} x - X position of digit cell
   * @param {number} y - Y position of digit cell
   * @param {string} segmentName - Name of segment (top, rightTop, etc.)
   * @param {string} color - Fill color
   * @param {number} position - Position index (0 or 1)
   */
  drawSegment(x, y, segmentName, color, position = 0) {
    const segment = SEGMENTS[segmentName];
    const pos = segment.positions[position];
    const { digitWidth, digitHeight } = this.options;

    const sx = x + pos.x * digitWidth;
    const sy = y + pos.y * digitHeight;
    const sw = segment.type === 'horizontal' ? pos.width * digitWidth : pos.width;
    const sh = segment.type === 'vertical' ? pos.height * digitHeight : pos.height;

    this.ctx.fillStyle = color;

    // Add glow effect for bright segments
    if (this.options.glowEffect && color === this.options.segmentOnColor) {
      this.ctx.shadowColor = color;
      this.ctx.shadowBlur = 10;
    } else {
      this.ctx.shadowBlur = 0;
    }

    // Draw rounded rectangle for segment
    const radius = 2;
    this.ctx.beginPath();
    this.ctx.roundRect(sx, sy, sw, sh, radius);
    this.ctx.fill();

    this.ctx.shadowBlur = 0;
  }

  /**
   * Renders a digit with all segments (for preview)
   *
   * @param {string} digit - Digit character '0'-'9'
   * @param {number} x - X position
   * @param {number} y - Y position
   * @param {boolean[]} segmentStates - Array of 7 booleans for segment on/off
   */
  renderDigit(digit, x, y, segmentStates) {
    const { segmentOnColor, segmentOffColor } = this.options;

    SEGMENT_NAMES.forEach((name, index) => {
      const isOn = segmentStates[index];
      const color = isOn ? segmentOnColor : segmentOffColor;
      // Draw both positions for a solid digit
      this.drawSegment(x, y, name, color, 0);
      this.drawSegment(x, y, name, color, 1);
    });
  }

  /**
   * Renders a share (one position per segment based on share data)
   *
   * @param {number[]} positions - Array of 7 position values (0 or 1)
   * @param {number} x - X position
   * @param {number} y - Y position
   * @param {string} color - Segment color
   */
  renderShare(positions, x, y, color = null) {
    const segmentColor = color || this.options.segmentOnColor;

    SEGMENT_NAMES.forEach((name, index) => {
      const position = positions[index];
      this.drawSegment(x, y, name, segmentColor, position);
    });
  }

  /**
   * Renders the stacked result of two shares
   *
   * @param {number[]} share1Positions - Share 1 positions
   * @param {number[]} share2Positions - Share 2 positions
   * @param {number} x - X position
   * @param {number} y - Y position
   */
  renderStackedShares(share1Positions, share2Positions, x, y) {
    const { segmentOnColor, segmentGrayColor } = this.options;

    SEGMENT_NAMES.forEach((name, index) => {
      const pos1 = share1Positions[index];
      const pos2 = share2Positions[index];

      if (pos1 === pos2) {
        // Same position = clearly visible
        this.drawSegment(x, y, name, segmentOnColor, pos1);
      } else {
        // Different positions = gray/fuzzy (draw both)
        this.drawSegment(x, y, name, segmentGrayColor, 0);
        this.drawSegment(x, y, name, segmentGrayColor, 1);
      }
    });
  }

  /**
   * Renders a complete 4-digit PIN
   *
   * @param {string} pin - 4-digit PIN
   * @param {boolean[][]} digitSegments - Array of 4 arrays, each with 7 segment states
   */
  renderPIN(pin, digitSegments) {
    const { digitWidth, digitSpacing, padding } = this.options;

    this.clear();

    for (let i = 0; i < 4; i++) {
      const x = padding + i * (digitWidth + digitSpacing);
      const y = padding;
      this.renderDigit(pin[i], x, y, digitSegments[i]);
    }
  }

  /**
   * Renders a complete share (4 digits)
   *
   * @param {number[][]} shareData - Array of 4 position arrays
   * @param {string} color - Optional color override
   */
  renderFullShare(shareData, color = null) {
    const { digitWidth, digitSpacing, padding } = this.options;

    this.clear();

    for (let i = 0; i < 4; i++) {
      const x = padding + i * (digitWidth + digitSpacing);
      const y = padding;
      this.renderShare(shareData[i], x, y, color);
    }
  }

  /**
   * Renders stacked shares (4 digits)
   *
   * @param {number[][]} share1Data - Share 1 data
   * @param {number[][]} share2Data - Share 2 data
   */
  renderStackedResult(share1Data, share2Data) {
    const { digitWidth, digitSpacing, padding } = this.options;

    this.clear();

    for (let i = 0; i < 4; i++) {
      const x = padding + i * (digitWidth + digitSpacing);
      const y = padding;
      this.renderStackedShares(share1Data[i], share2Data[i], x, y);
    }
  }

  /**
   * Sets canvas size based on content
   *
   * @param {number} digitCount - Number of digits (default 4)
   */
  setSize(digitCount = 4) {
    const { digitWidth, digitHeight, digitSpacing, padding } = this.options;

    this.canvas.width = padding * 2 + digitCount * digitWidth + (digitCount - 1) * digitSpacing;
    this.canvas.height = padding * 2 + digitHeight;
  }

  /**
   * Exports canvas to data URL
   *
   * @param {string} format - Image format ('png' or 'jpeg')
   * @returns {string} Data URL
   */
  toDataURL(format = 'png') {
    return this.canvas.toDataURL(`image/${format}`);
  }

  /**
   * Exports canvas to Blob for downloading
   *
   * @param {string} format - Image format
   * @returns {Promise<Blob>}
   */
  toBlob(format = 'png') {
    return new Promise((resolve) => {
      this.canvas.toBlob(resolve, `image/${format}`);
    });
  }
}

/**
 * Creates a renderer with default settings
 *
 * @param {HTMLCanvasElement} canvas
 * @returns {SegmentRenderer}
 */
export function createRenderer(canvas) {
  return new SegmentRenderer(canvas);
}
