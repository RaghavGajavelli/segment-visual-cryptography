import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class Decrypt$3 extends MouseAdapter {
    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {
        Decrypt.this.home.setIcon(new ImageIcon("./images/button-home.jpg"));
        Decrypt.this.home.setBounds(470, 570, 69, 70);
    }
    
    @Override
    public void mouseExited(final MouseEvent mouseEvent) {
        Decrypt.this.home.setIcon(new ImageIcon("./images/button-homemin.jpg"));
        Decrypt.this.home.setBounds(480, 580, 55, 56);
    }
}