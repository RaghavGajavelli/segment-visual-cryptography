import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class Seg_gen$2 extends MouseAdapter {
    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {
        Seg_gen.this.clear.setBounds(370, 300, 140, 50);
    }
    
    @Override
    public void mouseExited(final MouseEvent mouseEvent) {
        Seg_gen.this.clear.setBounds(370, 300, 130, 50);
    }
}