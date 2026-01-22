import java.awt.Image;
import java.awt.Dimension;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.io.File;
import java.awt.image.BufferedImage;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class View_share$2 extends MouseAdapter {
    @Override
    public void mouseClicked(final MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == 3) {
            try {
                View_share.this.jfc.setFileSelectionMode(2);
                if (View_share.this.jfc.showSaveDialog(View_share.this.imagearea2) == 0) {
                    View_share.this.path = View_share.this.jfc.getSelectedFile().getAbsolutePath();
                    final BufferedImage bufferedImage = new BufferedImage(70, 70, 2);
                    System.out.println(View_share.this.path);
                    final File output = new File(View_share.this.path);
                    try {
                        final Dimension preferredSize = View_share.this.imagearea2.getPreferredSize();
                        final Image image = View_share.this.imagearea2.createImage(preferredSize.width, preferredSize.height);
                        View_share.this.imagearea2.paint(image.getGraphics());
                        ImageIO.write((RenderedImage)image, "jpg", output);
                    }
                    catch (final IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
            catch (final Exception ex2) {
                ex2.printStackTrace();
            }
        }
    }
}