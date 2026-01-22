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

class Randomshares$3 extends MouseAdapter {
    @Override
    public void mouseClicked(final MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == 3) {
            try {
                Randomshares.this.jfc.setFileSelectionMode(2);
                if (Randomshares.this.jfc.showSaveDialog(Randomshares.this.Imagelab2) == 0) {
                    Randomshares.this.path = Randomshares.this.jfc.getSelectedFile().getAbsolutePath();
                    final BufferedImage bufferedImage = new BufferedImage(70, 70, 2);
                    System.out.println(Randomshares.this.path);
                    final File output = new File(Randomshares.this.path);
                    try {
                        final Dimension preferredSize = Randomshares.this.Imagelab2.getPreferredSize();
                        final Image image = Randomshares.this.Imagelab2.createImage(preferredSize.width, preferredSize.height);
                        Randomshares.this.Imagelab2.paint(image.getGraphics());
                        ImageIO.write((RenderedImage)image, "jpg", output);
                        Randomshares.this.flag2 = 1;
                        if (Randomshares.this.flag1 == 1 && Randomshares.this.flag2 == 1) {
                            JOptionPane.showMessageDialog(Randomshares.this.Imagelab2, "Shares saved at desired location ", " ", 1);
                            JOptionPane.showMessageDialog(Randomshares.this.Imagelab1, "You can proceed for decryption from Home ", " ", 1);
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