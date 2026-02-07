import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class DisplayDigit$2 extends MouseAdapter {
    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {
        DisplayDigit.this.home.setIcon(new ImageIcon("./images/button-home.jpg "));
        DisplayDigit.this.home.setBounds(530, 390, 69, 70);
    }
    
    @Override
    public void mouseExited(final MouseEvent mouseEvent) {
        DisplayDigit.this.home.setIcon(new ImageIcon("./images/button-homemin.jpg"));
        DisplayDigit.this.home.setBounds(540, 390, 55, 56);
    }
}