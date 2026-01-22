import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 
// Decompiled by Procyon v0.6.0
// 

class Listen implements ActionListener
{
    Randomshares r1;
    
    public Listen(final Randomshares r1) {
        this.r1 = r1;
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        if (actionEvent.getSource() == Randomshares.this.home) {
            final Home home = new Home();
            this.r1.setVisible(false);
            home.setVisible(true);
            home.setSize(660, 500);
        }
        if (actionEvent.getSource() == Randomshares.this.prev) {}
    }
}
