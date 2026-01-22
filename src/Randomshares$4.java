import java.awt.Image;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.io.File;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class Randomshares$4 extends WindowAdapter {
    @Override
    public void windowClosing(final WindowEvent windowEvent) {
        try {
            final File output = new File("C:/recovered/share1.jpg");
            final File output2 = new File("C:/recovered/share2.jpg");
            final Dimension preferredSize = Randomshares.this.Imagelab1.getPreferredSize();
            final Image image = Randomshares.this.Imagelab1.createImage(preferredSize.width, preferredSize.height);
            Randomshares.this.Imagelab1.paint(image.getGraphics());
            ImageIO.write((RenderedImage)image, "jpg", output);
            final Dimension preferredSize2 = Randomshares.this.Imagelab2.getPreferredSize();
            final Image image2 = Randomshares.this.Imagelab2.createImage(preferredSize2.width, preferredSize2.height);
            Randomshares.this.Imagelab2.paint(image2.getGraphics());
            ImageIO.write((RenderedImage)image2, "jpg", output2);
            JOptionPane.showMessageDialog(Randomshares.this.Imagelab2, "Shares saved at default location C:/recovered/ ", " ", 1);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
}