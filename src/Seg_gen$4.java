import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class Seg_gen$4 extends MouseAdapter {
    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {
        Seg_gen.this.exit.setBounds(550, 387, 70, 70);
        Seg_gen.this.exit.setIcon(new ImageIcon("./images/close.jpg"));
    }
    
    @Override
    public void mouseExited(final MouseEvent mouseEvent) {
        Seg_gen.this.exit.setIcon(new ImageIcon("./images/closemin.jpg"));
        Seg_gen.this.exit.setBounds(550, 390, 70, 70);
    }
}