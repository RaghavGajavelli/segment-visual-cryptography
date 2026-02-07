import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class Randomshares$1 extends MouseAdapter {
    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {
        Randomshares.this.home.setIcon(new ImageIcon("./images/button-home.jpg "));
        Randomshares.this.home.setBounds(490, 510, 69, 70);
    }
    
    @Override
    public void mouseExited(final MouseEvent mouseEvent) {
        Randomshares.this.home.setIcon(new ImageIcon("./images/button-homemin.jpg"));
        Randomshares.this.home.setBounds(500, 510, 55, 56);
    }
}