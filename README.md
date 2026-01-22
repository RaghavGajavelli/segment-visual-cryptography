# Segment-Based Visual Cryptography

A Java implementation of **Segment-Based Visual Cryptography** — a method to encrypt numeric messages using seven-segment displays. When two "share" images are overlaid, the secret number is revealed to the human eye.

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green.svg)

---

## 🔐 What is Visual Cryptography?

Visual Cryptography is an encryption technique where:
- A secret image is split into 2 (or more) **shares**
- Each share alone looks like random noise — revealing nothing
- When shares are **physically overlaid** (or digitally stacked), the secret appears
- It has the encryption strength of a **one-time pad** — mathematically unbreakable

This project implements the **segment-based** variant, which uses seven-segment display patterns instead of pixels.

---

## 💡 How Segment-Based Visual Cryptography Works

### Traditional (Pixel-Based) vs Segment-Based

| Pixel-Based | Segment-Based |
|-------------|---------------|
| Works on any image | Works on numeric digits (0-9) |
| Each pixel is split | Each segment is split |
| Harder to align | Easier to align |
| More random bits needed | Fewer random bits needed |

### The Seven-Segment Display

```
   ━━━━━    (top)
  ┃    ┃   (upper-left, upper-right)
   ━━━━━    (middle)
  ┃    ┃   (lower-left, lower-right)
   ━━━━━    (bottom)
```

Each digit 0-9 is formed by turning specific segments ON or OFF.

### The Encryption Process

1. **For each segment**, draw two parallel lines: `S1` and `S2`
2. **Share 1 (Random)**: For each segment, randomly pick `S1` or `S2` to be visible
3. **Share 2 (Encoded)**: 
   - If the segment should be **ON** → pick the **same** line as Share 1
   - If the segment should be **OFF** → pick the **opposite** line
4. **Overlay**: When stacked, ON segments show a visible line, OFF segments cancel out

---

## 🚀 Getting Started

### Prerequisites

- Java 8 or higher
- Java Swing (included in standard JDK)

### Running the Application

**Option 1: Run the JAR file**
```bash
cd build/
java -jar sbvc.jar
```

**Option 2: Compile from source**
```bash
# Compile all Java files
javac -d out src/*.java

# Copy resources
cp -r resources/images out/

# Run
cd out/
java Intro
```

---

## 📁 Project Structure

```
segment-visual-cryptography/
├── README.md
├── LICENSE
├── src/                    # Java source code
│   ├── Intro.java         # Splash screen
│   ├── Home.java          # Main menu
│   ├── Encrypt.java       # Encryption workflow
│   ├── Decrypt.java       # Decryption workflow
│   ├── DigitPanel.java    # Seven-segment display renderer
│   ├── Share1panel.java   # Random share generator
│   ├── Share2panel.java   # Encoded share generator
│   ├── Stack.java         # Overlay/combine shares
│   └── ...
├── resources/
│   └── images/            # UI graphics and icons
├── docs/
│   └── Borchert_SegmentVC.pdf  # Original research paper
└── build/
    └── sbvc.jar           # Runnable JAR file
```

---

## 🖥️ Application Workflow

### Encryption
1. Launch the application
2. Click **ENCRYPTION**
3. Enter a numeric message (e.g., `1234`)
4. Click **GENERATE SHARES**
5. Save both Share 1 and Share 2 as images

### Decryption
1. Click **DECRYPTION**
2. Load Share 1 and Share 2 images
3. Click **OVERLAY**
4. The secret number is revealed!

---

## 📚 Theory & References

This implementation is based on the research paper:

> **Borchert, B.** (2007). *Segment-based Visual Cryptography*. 
> WSI-2007-04, Universität Tübingen.
> 
> [📄 Read the paper](docs/Borchert_SegmentVC.pdf)

The original Visual Cryptography concept was introduced by:

> **Naor, M. & Shamir, A.** (1994). *Visual Cryptography*. EUROCRYPT 1994.

---

## 🔒 Security Properties

- **Perfect secrecy**: Each share alone reveals zero information about the secret
- **No computation needed**: Decryption is done visually by the human eye
- **One-time pad equivalent**: Given only one share, the secret cannot be recovered even with unlimited computing power

---

## 🛠️ Key Classes Explained

| Class | Purpose |
|-------|---------|
| `Intro` | Animated splash/loading screen |
| `Home` | Main menu with Encrypt/Decrypt options |
| `Seg_gen` | Input screen for the secret number |
| `DisplayDigit` | Renders digits using seven-segment display |
| `DigitPanel` | Draws individual segment patterns |
| `Share1panel` | Generates the random first share |
| `Share2panel` | Generates the encoded second share |
| `Decrypt` | UI for loading and overlaying shares |
| `Stack` | Performs the pixel-level overlay operation |
| `InitRandom` | Stores random values between components |

---

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 🙏 Acknowledgments

- **Bernd Borchert** — For the segment-based visual cryptography concept
- **Moni Naor & Adi Shamir** — For inventing visual cryptography
- Original college project implementation

---

## 📬 Contact

Feel free to open an issue or submit a pull request if you have suggestions or improvements!

