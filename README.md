# Segment-Based Visual Cryptography (SBVC)

A visual cryptography implementation for encrypting 4-digit PINs using seven-segment displays.

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![License](https://img.shields.io/badge/license-MIT-green)
![Tests](https://img.shields.io/badge/tests-33%20passing-brightgreen)

---

## 🔐 What is Visual Cryptography?

Visual Cryptography is an encryption technique where:
- A secret image is split into 2 (or more) **shares**
- Each share alone looks like random noise — revealing nothing
- When shares are **physically overlaid** (or digitally stacked), the secret appears
- It has the encryption strength of a **one-time pad** — mathematically unbreakable

This project implements the **segment-based** variant using seven-segment display patterns.

---

## 💡 How It Works

### The Seven-Segment Display

```
   ━━━━━    (top)
  ┃    ┃   (upper-left, upper-right)
   ━━━━━    (middle)
  ┃    ┃   (lower-left, lower-right)
   ━━━━━    (bottom)
```

### The Encryption Process

1. **For each segment**, draw two parallel lines: `S1` and `S2`
2. **Share 1 (Random)**: For each segment, randomly pick `S1` or `S2` to be visible
3. **Share 2 (Encoded)**:
   - If the segment should be **ON** → pick the **same** line as Share 1
   - If the segment should be **OFF** → pick the **opposite** line
4. **Overlay**: When stacked, ON segments align, OFF segments cancel out

---

## 🚀 Quick Start

### Web Application (Recommended)

```bash
cd web-app
npm install
npm run dev
```

Open [http://localhost:3000](http://localhost:3000) in your browser.

**Or try the standalone demo** — just open `web-app/demo.html` in any browser (no server needed).

### Production Build

```bash
cd web-app
npm run build
npm run preview
```

---

## ✨ Features

- 🔒 **Secure** — Each share reveals nothing about the PIN
- 🎨 **Apple-style UI** — Beautiful dark theme with smooth animations
- 📱 **Responsive** — Works on desktop and mobile
- 🖼️ **Transparent PNG Export** — Save shares with no background
- ⚡ **No server** — Runs entirely in your browser
- 🧪 **33 unit tests** — Comprehensive test coverage

---

## 📁 Project Structure

```
segment-visual-cryptography/
├── web-app/                   # Modern web application
│   ├── demo.html              # Standalone demo (no build needed)
│   ├── src/js/
│   │   ├── visualCrypto.js    # Core cryptographic logic
│   │   ├── segmentRenderer.js # Canvas rendering
│   │   └── app.js             # UI controller
│   ├── src/css/styles.css     # Dark theme styles
│   └── tests/                 # Unit tests
├── src/                       # Original Java source (legacy)
├── docs/                      # Research paper
└── build/sbvc.jar             # Java JAR (legacy)
```

---

## 🧪 Testing

```bash
cd web-app
npm test              # Run tests once
npm run test:watch    # Watch mode
```

---

## 🔒 Security Properties

- **Perfect secrecy**: Each share alone reveals zero information about the secret
- **No computation needed**: Decryption is done visually by the human eye
- **One-time pad equivalent**: Given only one share, the secret cannot be recovered even with unlimited computing power
- **No data transmitted**: Runs entirely in your browser

---

## 📚 References

> **Borchert, B.** (2007). *Segment-based Visual Cryptography*. WSI-2007-04, Universität Tübingen.
> [📄 Read the paper](docs/Borchert_SegmentVC.pdf)

> **Naor, M. & Shamir, A.** (1994). *Visual Cryptography*. EUROCRYPT 1994.

---

## 🛠️ Legacy Java Application

The original Java Swing application is preserved in `src/`. To run:

```bash
java -jar build/sbvc.jar
```

Requires Java 11+ with GUI support.

---

## 📝 License

MIT License - see [LICENSE](LICENSE)

---

## 🙏 Acknowledgments

- **Bernd Borchert** — Segment-based visual cryptography concept
- **Moni Naor & Adi Shamir** — Inventing visual cryptography
