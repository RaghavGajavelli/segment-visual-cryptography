import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class Home$3 extends MouseAdapter {
    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {
        Home.this.exit.setBounds(530, 390, 70, 70);
        Home.this.exit.setIcon(new ImageIcon(".\\images\\crystal.jpg"));
    }
    
    @Override
    public void mouseExited(final MouseEvent mouseEvent) {
        Home.this.exit.setBounds(540, 390, 50, 50);
        Home.this.exit.setIcon(new ImageIcon(".\\images\\crystalmin.jpg"));
    }
}