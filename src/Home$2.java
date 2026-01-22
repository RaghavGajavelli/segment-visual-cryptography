import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class Home$2 extends MouseAdapter {
    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {
        Home.this.dyc.setBounds(375, 250, 200, 110);
        Home.this.key.setVisible(true);
    }
    
    @Override
    public void mouseExited(final MouseEvent mouseEvent) {
        Home.this.dyc.setBounds(375, 250, 180, 90);
        Home.this.key.setVisible(false);
    }
}