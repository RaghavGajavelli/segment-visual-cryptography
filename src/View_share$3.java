import java.awt.Image;
import java.awt.Dimension;
import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.io.File;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class View_share$3 extends WindowAdapter {
    @Override
    public void windowClosing(final WindowEvent windowEvent) {
        try {
            final File output = new File("C:/recovered/share1.jpg");
            final File output2 = new File("C:/recovered/share2.jpg");
            final Dimension preferredSize = View_share.this.imagearea1.getPreferredSize();
            final Image image = View_share.this.imagearea1.createImage(preferredSize.width, preferredSize.height);
            View_share.this.imagearea1.paint(image.getGraphics());
            ImageIO.write((RenderedImage)image, "jpg", output);
            final Dimension preferredSize2 = View_share.this.imagearea2.getPreferredSize();
            final Image image2 = View_share.this.imagearea2.createImage(preferredSize2.width, preferredSize2.height);
            View_share.this.imagearea2.paint(image2.getGraphics());
            ImageIO.write((RenderedImage)image2, "jpg", output2);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
}