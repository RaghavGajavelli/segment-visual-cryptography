import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.Dimension;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JPanel;

// 
// Decompiled by Procyon v0.6.0
// 

class ImagePanel extends JPanel
{
    private Image img;
    
    ImagePanel(final String filename) {
        this(new ImageIcon(filename).getImage());
    }
    
    ImagePanel(final Image img) {
        this.img = img;
        final Dimension dimension = new Dimension(img.getWidth(null), img.getHeight(null));
        this.setPreferredSize(dimension);
        this.setMinimumSize(dimension);
        this.setMaximumSize(dimension);
        this.setSize(dimension);
        this.setLayout(null);
    }
    
    public void paintComponent(final Graphics graphics) {
        graphics.drawImage(this.img, 0, 0, null);
    }
}
