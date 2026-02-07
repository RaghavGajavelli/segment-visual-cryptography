import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class Decrypt$1 extends MouseAdapter {
    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {
        Decrypt.this.stak.setIcon(new ImageIcon("./images/stack.jpg"));
        Decrypt.this.stak.setBounds(240, 550, 103, 103);
    }
    
    @Override
    public void mouseExited(final MouseEvent mouseEvent) {
        Decrypt.this.stak.setIcon(new ImageIcon("./images/stackmin.png"));
        Decrypt.this.stak.setBounds(250, 570, 50, 50);
    }
}