import java.awt.Component;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 
// Decompiled by Procyon v0.6.0
// 

class Listen implements ActionListener
{
    Encrypt e1;
    
    public Listen(final Encrypt e1) {
        this.e1 = e1;
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        if (actionEvent.getSource() == Encrypt.this.gen_share) {
            JOptionPane.showMessageDialog(this.e1, "Shares generated successfully..!!! ", " ", 1);
        }
        if (actionEvent.getSource() == Encrypt.this.home) {
            final Home home = new Home();
            this.e1.setVisible(false);
            home.setVisible(true);
            home.setSize(2000, 1000);
        }
        if (actionEvent.getSource() == Encrypt.this.view_share) {
            final View_share view_share = new View_share();
            this.e1.setVisible(false);
            view_share.setVisible(true);
            view_share.setSize(2000, 1000);
        }
    }
}
