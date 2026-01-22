import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class Decrypt$2 extends MouseAdapter {
    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {
        Decrypt.this.seperate.setIcon(new ImageIcon(".\\images\\seperate.jpg"));
        Decrypt.this.seperate.setBounds(240, 560, 100, 56);
    }
    
    @Override
    public void mouseExited(final MouseEvent mouseEvent) {
        Decrypt.this.seperate.setIcon(new ImageIcon(".\\images\\seperatemin.jpg"));
        Decrypt.this.seperate.setBounds(250, 570, 80, 46);
    }
}