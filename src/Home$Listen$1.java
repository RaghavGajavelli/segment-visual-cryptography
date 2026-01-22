import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class Home$Listen$1 extends MouseAdapter {
    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {
        Listen.this.this$0.key.setVisible(true);
    }
    
    @Override
    public void mouseExited(final MouseEvent mouseEvent) {
        Listen.this.this$0.key.setVisible(false);
    }
}