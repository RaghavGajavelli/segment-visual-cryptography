import java.awt.image.RenderedImage;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public class Stack
{
    File f1;
    File f2;
    File of;
    BufferedImage b1;
    BufferedImage b2;
    BufferedImage output;
    int c1;
    int c2;
    
    public Stack(final String pathname, final String pathname2) {
        try {
            this.f1 = new File(pathname);
            this.b1 = ImageIO.read(this.f1);
            this.f2 = new File(pathname2);
            this.b2 = ImageIO.read(this.f2);
            this.output = new BufferedImage(511, 219, 2);
            this.stackOperation();
            this.of = new File("result.jpg");
            ImageIO.write(this.output, "png", this.of);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void stackOperation() {
        for (int i = 0; i < 511; ++i) {
            for (int j = 0; j < 219; ++j) {
                this.c1 = this.b1.getRGB(i, j);
                this.c2 = this.b2.getRGB(i, j);
                if (this.c1 == this.c2 && this.c1 == -16777216) {
                    this.output.setRGB(i, j, -16777216);
                }
                else if (this.c1 == this.c2 && this.c1 == -1) {
                    this.output.setRGB(i, j, -1);
                }
                else if (this.c1 != this.c2) {
                    this.output.setRGB(i, j, -16711936);
                }
            }
        }
    }
    
    public void convertC1() {
        if (this.c1 <= 0) {
            this.c1 = -16777216;
        }
        else if (this.c1 > 0) {
            this.c1 = -1;
        }
    }
    
    public void convertC2() {
        if (this.c2 <= 0) {
            this.c2 = -16777216;
        }
        else if (this.c2 > 0) {
            this.c2 = -1;
        }
    }
}
