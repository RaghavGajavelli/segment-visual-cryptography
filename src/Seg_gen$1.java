import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class Seg_gen$1 extends MouseAdapter {
    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {
        Seg_gen.this.generate.setBounds(160, 300, 180, 50);
    }
    
    @Override
    public void mouseExited(final MouseEvent mouseEvent) {
        Seg_gen.this.generate.setBounds(160, 300, 170, 50);
    }
}