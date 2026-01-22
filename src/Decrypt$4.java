import java.awt.Image;
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.JOptionPane;
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

class Decrypt$4 extends MouseAdapter {
    @Override
    public void mouseClicked(final MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == 3) {
            try {
                Decrypt.this.jfc.setFileSelectionMode(2);
                if (Decrypt.this.jfc.showSaveDialog(Decrypt.this.resultbox) == 0) {
                    Decrypt.this.path = Decrypt.this.jfc.getSelectedFile().getAbsolutePath();
                    final BufferedImage bufferedImage = new BufferedImage(70, 70, 2);
                    System.out.println(Decrypt.this.path);
                    final File output = new File(Decrypt.this.path);
                    try {
                        final Dimension preferredSize = Decrypt.this.resultbox.getPreferredSize();
                        final Image image = Decrypt.this.resultbox.createImage(preferredSize.width, preferredSize.height);
                        Decrypt.this.resultbox.paint(image.getGraphics());
                        ImageIO.write((RenderedImage)image, "jpg", output);
                        Decrypt.this.flag1 = 1;
                        if (Decrypt.this.flag1 == 1 && Decrypt.this.flag2 == 1) {
                            JOptionPane.showMessageDialog(Decrypt.this.resultbox, "Stacked image saved at desired location ", " ", 1);
                        }
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