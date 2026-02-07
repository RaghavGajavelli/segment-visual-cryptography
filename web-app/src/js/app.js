/**
 * Segment-Based Visual Cryptography - Main Application
 *
 * Modern web implementation of visual cryptography using seven-segment displays
 */

import {
  generateShares,
  validatePIN,
  stackShares,
  encodeShare,
  decodeShare,
  DIGIT_SEGMENTS
} from './visualCrypto.js';

import { SegmentRenderer } from './segmentRenderer.js';

// Application state
const state = {
  currentView: 'home',
  pin: '',
  shares: null,
  loadedShare1: null,
  loadedShare2: null
};

// DOM Elements (populated after DOM load)
let elements = {};

/**
 * Initialize the application
 */
export function init() {
  cacheElements();
  setupEventListeners();
  showView('home');
}

/**
 * Cache DOM elements for performance
 */
function cacheElements() {
  elements = {
    // Views
    homeView: document.getElementById('home-view'),
    encryptView: document.getElementById('encrypt-view'),
    sharesView: document.getElementById('shares-view'),
    decryptView: document.getElementById('decrypt-view'),
    aboutView: document.getElementById('about-view'),

    // Navigation
    navEncrypt: document.getElementById('nav-encrypt'),
    navDecrypt: document.getElementById('nav-decrypt'),
    navAbout: document.getElementById('nav-about'),
    homeLinks: document.querySelectorAll('[data-nav="home"]'),

    // Encrypt view
    pinInput: document.getElementById('pin-input'),
    pinDigits: document.querySelectorAll('.pin-digit'),
    generateBtn: document.getElementById('generate-btn'),
    clearBtn: document.getElementById('clear-btn'),
    pinPreviewCanvas: document.getElementById('pin-preview'),
    pinError: document.getElementById('pin-error'),

    // Shares view
    share1Canvas: document.getElementById('share1-canvas'),
    share2Canvas: document.getElementById('share2-canvas'),
    downloadShare1: document.getElementById('download-share1'),
    downloadShare2: document.getElementById('download-share2'),
    downloadBoth: document.getElementById('download-both'),
    backToEncrypt: document.getElementById('back-to-encrypt'),
    goToDecrypt: document.getElementById('go-to-decrypt'),

    // Decrypt view
    loadShare1Btn: document.getElementById('load-share1'),
    loadShare2Btn: document.getElementById('load-share2'),
    share1Input: document.getElementById('share1-input'),
    share2Input: document.getElementById('share2-input'),
    share1Preview: document.getElementById('share1-preview'),
    share2Preview: document.getElementById('share2-preview'),
    stackBtn: document.getElementById('stack-btn'),
    resultCanvas: document.getElementById('result-canvas'),
    share1Status: document.getElementById('share1-status'),
    share2Status: document.getElementById('share2-status'),
    resetDecrypt: document.getElementById('reset-decrypt')
  };
}

/**
 * Setup all event listeners
 */
function setupEventListeners() {
  // Navigation
  elements.navEncrypt?.addEventListener('click', () => showView('encrypt'));
  elements.navDecrypt?.addEventListener('click', () => showView('decrypt'));
  elements.navAbout?.addEventListener('click', () => showView('about'));

  elements.homeLinks?.forEach(link => {
    link.addEventListener('click', () => showView('home'));
  });

  // Home view cards
  document.getElementById('card-encrypt')?.addEventListener('click', () => showView('encrypt'));
  document.getElementById('card-decrypt')?.addEventListener('click', () => showView('decrypt'));

  // PIN input
  elements.pinInput?.addEventListener('input', handlePinInput);
  elements.pinInput?.addEventListener('keypress', (e) => {
    if (e.key === 'Enter' && state.pin.length === 4) {
      handleGenerate();
    }
  });

  // PIN digit display clicks
  elements.pinDigits?.forEach((digit, index) => {
    digit.addEventListener('click', () => {
      elements.pinInput?.focus();
    });
  });

  // Buttons
  elements.generateBtn?.addEventListener('click', handleGenerate);
  elements.clearBtn?.addEventListener('click', handleClear);
  elements.downloadShare1?.addEventListener('click', () => downloadShare(1));
  elements.downloadShare2?.addEventListener('click', () => downloadShare(2));
  elements.downloadBoth?.addEventListener('click', downloadBothShares);
  elements.backToEncrypt?.addEventListener('click', () => showView('encrypt'));
  elements.goToDecrypt?.addEventListener('click', () => {
    // Auto-load shares if we just generated them
    if (state.shares) {
      state.loadedShare1 = state.shares.share1;
      state.loadedShare2 = state.shares.share2;
    }
    showView('decrypt');
  });

  // Decrypt view
  elements.loadShare1Btn?.addEventListener('click', () => elements.share1Input?.click());
  elements.loadShare2Btn?.addEventListener('click', () => elements.share2Input?.click());
  elements.share1Input?.addEventListener('change', (e) => handleShareLoad(e, 1));
  elements.share2Input?.addEventListener('change', (e) => handleShareLoad(e, 2));
  elements.stackBtn?.addEventListener('click', handleStack);
  elements.resetDecrypt?.addEventListener('click', resetDecrypt);
}

/**
 * Show a specific view
 */
function showView(viewName) {
  // Hide all views
  document.querySelectorAll('.view').forEach(view => {
    view.classList.remove('active');
  });

  // Update nav
  document.querySelectorAll('.nav-link').forEach(link => {
    link.classList.remove('active');
  });

  // Show requested view
  const view = document.getElementById(`${viewName}-view`);
  if (view) {
    view.classList.add('active');
    state.currentView = viewName;
  }

  // Update nav active state
  const navLink = document.getElementById(`nav-${viewName}`);
  if (navLink) {
    navLink.classList.add('active');
  }

  // View-specific initialization
  if (viewName === 'encrypt') {
    elements.pinInput?.focus();
    updatePinPreview();
  } else if (viewName === 'decrypt') {
    initDecryptView();
  }
}

/**
 * Handle PIN input changes
 */
function handlePinInput(e) {
  // Filter to digits only
  let value = e.target.value.replace(/\D/g, '');

  // Limit to 4 digits
  if (value.length > 4) {
    value = value.slice(0, 4);
  }

  e.target.value = value;
  state.pin = value;

  // Update visual PIN display
  updatePinDigits(value);

  // Update preview
  updatePinPreview();

  // Update generate button state
  const validation = validatePIN(value);
  elements.generateBtn.disabled = !validation.valid;

  // Show/hide error
  if (value.length > 0 && value.length < 4) {
    elements.pinError.textContent = `Enter ${4 - value.length} more digit${4 - value.length > 1 ? 's' : ''}`;
    elements.pinError.classList.add('visible');
  } else {
    elements.pinError.classList.remove('visible');
  }
}

/**
 * Update the visual PIN digit boxes
 */
function updatePinDigits(value) {
  elements.pinDigits?.forEach((digit, index) => {
    if (index < value.length) {
      digit.textContent = value[index];
      digit.classList.add('filled');
    } else {
      digit.textContent = '';
      digit.classList.remove('filled');
    }
  });
}

/**
 * Update the PIN preview canvas
 */
function updatePinPreview() {
  const canvas = elements.pinPreviewCanvas;
  if (!canvas) return;

  const renderer = new SegmentRenderer(canvas, {
    digitWidth: 60,
    digitHeight: 100,
    digitSpacing: 15,
    padding: 20,
    backgroundColor: '#0a0a1a',
    segmentOnColor: '#00ff88',
    segmentOffColor: '#1a1a3a'
  });

  renderer.setSize(4);
  renderer.clear();

  if (state.pin.length > 0) {
    // Render entered digits
    for (let i = 0; i < state.pin.length; i++) {
      const digit = state.pin[i];
      const segments = DIGIT_SEGMENTS[digit];
      const x = 20 + i * (60 + 15);
      renderer.renderDigit(digit, x, 20, segments);
    }

    // Render placeholders for remaining digits
    for (let i = state.pin.length; i < 4; i++) {
      const x = 20 + i * (60 + 15);
      renderer.renderDigit('8', x, 20, [false, false, false, false, false, false, false]);
    }
  } else {
    // Show placeholder
    for (let i = 0; i < 4; i++) {
      const x = 20 + i * (60 + 15);
      renderer.renderDigit('8', x, 20, [false, false, false, false, false, false, false]);
    }
  }
}

/**
 * Handle generate button click
 */
function handleGenerate() {
  const validation = validatePIN(state.pin);
  if (!validation.valid) {
    elements.pinError.textContent = validation.error;
    elements.pinError.classList.add('visible');
    return;
  }

  // Generate shares
  state.shares = generateShares(state.pin);

  // Show shares view
  showView('shares');

  // Render shares
  renderShares();
}

/**
 * Handle clear button click
 */
function handleClear() {
  state.pin = '';
  elements.pinInput.value = '';
  updatePinDigits('');
  updatePinPreview();
  elements.generateBtn.disabled = true;
  elements.pinError.classList.remove('visible');
  elements.pinInput?.focus();
}

/**
 * Render the generated shares
 */
function renderShares() {
  if (!state.shares) return;

  // Render Share 1
  const canvas1 = elements.share1Canvas;
  if (canvas1) {
    const renderer1 = new SegmentRenderer(canvas1, {
      digitWidth: 80,
      digitHeight: 140,
      digitSpacing: 20,
      padding: 30,
      backgroundColor: '#0a0a1a',
      segmentOnColor: '#ff6b6b',
      glowEffect: true
    });
    renderer1.setSize(4);
    renderer1.renderFullShare(state.shares.share1);
  }

  // Render Share 2
  const canvas2 = elements.share2Canvas;
  if (canvas2) {
    const renderer2 = new SegmentRenderer(canvas2, {
      digitWidth: 80,
      digitHeight: 140,
      digitSpacing: 20,
      padding: 30,
      backgroundColor: '#0a0a1a',
      segmentOnColor: '#4ecdc4',
      glowEffect: true
    });
    renderer2.setSize(4);
    renderer2.renderFullShare(state.shares.share2);
  }
}

/**
 * Download a share as PNG
 */
async function downloadShare(shareNum) {
  const canvas = shareNum === 1 ? elements.share1Canvas : elements.share2Canvas;
  if (!canvas) return;

  const blob = await new Promise(resolve => canvas.toBlob(resolve, 'image/png'));
  const url = URL.createObjectURL(blob);

  const a = document.createElement('a');
  a.href = url;
  a.download = `share${shareNum}.png`;
  a.click();

  URL.revokeObjectURL(url);
}

/**
 * Download both shares as separate files
 */
async function downloadBothShares() {
  await downloadShare(1);
  setTimeout(() => downloadShare(2), 500);
}

/**
 * Initialize decrypt view
 */
function initDecryptView() {
  // Check if we have loaded shares
  if (state.loadedShare1) {
    elements.share1Status?.classList.add('loaded');
    elements.share1Status.textContent = 'Share 1 Loaded';
    renderPreviewShare(elements.share1Preview, state.loadedShare1, '#ff6b6b');
  } else {
    elements.share1Status?.classList.remove('loaded');
    elements.share1Status.textContent = 'No share loaded';
  }

  if (state.loadedShare2) {
    elements.share2Status?.classList.add('loaded');
    elements.share2Status.textContent = 'Share 2 Loaded';
    renderPreviewShare(elements.share2Preview, state.loadedShare2, '#4ecdc4');
  } else {
    elements.share2Status?.classList.remove('loaded');
    elements.share2Status.textContent = 'No share loaded';
  }

  // Enable/disable stack button
  elements.stackBtn.disabled = !(state.loadedShare1 && state.loadedShare2);

  // Clear result
  const resultCanvas = elements.resultCanvas;
  if (resultCanvas) {
    const ctx = resultCanvas.getContext('2d');
    ctx.fillStyle = '#0a0a1a';
    ctx.fillRect(0, 0, resultCanvas.width, resultCanvas.height);
  }
}

/**
 * Render a small preview of a share
 */
function renderPreviewShare(canvas, shareData, color) {
  if (!canvas || !shareData) return;

  const renderer = new SegmentRenderer(canvas, {
    digitWidth: 40,
    digitHeight: 70,
    digitSpacing: 10,
    padding: 15,
    backgroundColor: '#0a0a1a',
    segmentOnColor: color,
    glowEffect: false
  });

  renderer.setSize(4);
  renderer.renderFullShare(shareData, color);
}

/**
 * Handle share file load
 */
function handleShareLoad(event, shareNum) {
  const file = event.target.files[0];
  if (!file) return;

  // Check if it's an image or JSON
  if (file.type.startsWith('image/')) {
    // For images, we'd need to decode - for now, use JSON format
    alert('Please use the JSON share format. Image decoding coming soon!');
    return;
  }

  const reader = new FileReader();
  reader.onload = (e) => {
    try {
      const shareData = decodeShare(e.target.result);

      if (shareNum === 1) {
        state.loadedShare1 = shareData;
      } else {
        state.loadedShare2 = shareData;
      }

      initDecryptView();
    } catch (err) {
      alert('Failed to load share: ' + err.message);
    }
  };
  reader.readAsText(file);
}

/**
 * Handle stack operation
 */
function handleStack() {
  if (!state.loadedShare1 || !state.loadedShare2) return;

  const resultCanvas = elements.resultCanvas;
  if (!resultCanvas) return;

  const renderer = new SegmentRenderer(resultCanvas, {
    digitWidth: 80,
    digitHeight: 140,
    digitSpacing: 20,
    padding: 30,
    backgroundColor: '#0a0a1a',
    segmentOnColor: '#00ff88',
    segmentGrayColor: '#2a2a4a',
    glowEffect: true
  });

  renderer.setSize(4);
  renderer.renderStackedResult(state.loadedShare1, state.loadedShare2);

  // Add animation class
  resultCanvas.classList.add('revealed');
}

/**
 * Reset decrypt view
 */
function resetDecrypt() {
  state.loadedShare1 = null;
  state.loadedShare2 = null;
  elements.share1Input.value = '';
  elements.share2Input.value = '';
  elements.resultCanvas?.classList.remove('revealed');
  initDecryptView();
}

// Auto-initialize when DOM is ready
if (document.readyState === 'loading') {
  document.addEventListener('DOMContentLoaded', init);
} else {
  init();
}

// Export for testing
export { state, showView };
