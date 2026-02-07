import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class Seg_gen$3 extends MouseAdapter {
    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {
        Seg_gen.this.home.setBounds(440, 383, 70, 70);
        Seg_gen.this.home.setIcon(new ImageIcon("./images/leftcirclearrow.jpg"));
    }
    
    @Override
    public void mouseExited(final MouseEvent mouseEvent) {
        Seg_gen.this.home.setIcon(new ImageIcon("./images/leftcirclearrowmin.jpg"));
        Seg_gen.this.home.setBounds(450, 393, 55, 55);
    }
}