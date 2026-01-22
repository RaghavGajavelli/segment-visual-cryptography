import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class Listen extends MouseAdapter implements ActionListener
{
    View_share vs1;
    
    public Listen(final View_share vs1) {
        this.vs1 = vs1;
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        if (actionEvent.getSource() == View_share.this.home) {
            final Home home = new Home();
            this.vs1.setVisible(false);
            home.setVisible(true);
            home.setSize(660, 500);
        }
        if (actionEvent.getSource() == View_share.this.prev) {}
    }
}
