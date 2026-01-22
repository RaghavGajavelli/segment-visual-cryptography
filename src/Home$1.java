import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class Home$1 extends MouseAdapter {
    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {
        Home.this.enc.setBounds(150, 250, 200, 110);
        Home.this.lock.setVisible(true);
    }
    
    @Override
    public void mouseExited(final MouseEvent mouseEvent) {
        Home.this.enc.setBounds(150, 250, 180, 90);
        Home.this.lock.setVisible(false);
    }
}