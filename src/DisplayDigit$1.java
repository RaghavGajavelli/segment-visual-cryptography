import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class DisplayDigit$1 extends MouseAdapter {
    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {
        DisplayDigit.this.prev.setIcon(new ImageIcon(".\\images\\leftcirclearrow.jpg"));
        DisplayDigit.this.prev.setBounds(460, 380, 70, 70);
    }
    
    @Override
    public void mouseExited(final MouseEvent mouseEvent) {
        DisplayDigit.this.prev.setIcon(new ImageIcon(".\\images\\leftcirclearrowmin.jpg"));
        DisplayDigit.this.prev.setBounds(470, 390, 55, 55);
    }
}