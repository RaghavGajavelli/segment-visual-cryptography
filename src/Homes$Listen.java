import java.awt.Component;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 
// Decompiled by Procyon v0.6.0
// 

class Listen implements ActionListener
{
    Homes h1;
    
    public Listen(final Homes h1) {
        this.h1 = h1;
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        try {
            if (actionEvent.getSource() == Homes.this.enc && JOptionPane.showConfirmDialog(this.h1, "Are u sure u want to proceed for Encryption..? ", " ", 0) == 0) {
                final Seg_gen seg_gen = new Seg_gen();
                this.h1.hide();
                seg_gen.setVisible(true);
                seg_gen.setSize(2000, 1000);
            }
            if (actionEvent.getSource() == Homes.this.dyc && JOptionPane.showConfirmDialog(this.h1, "Are u sure u want to proceed for Decryption..? ", " ", 0) == 0) {
                final Decrypt decrypt = new Decrypt();
                this.h1.hide();
                decrypt.setVisible(true);
                decrypt.setSize(2000, 1000);
            }
            if (actionEvent.getSource() == Homes.this.exit && JOptionPane.showConfirmDialog(this.h1, "Are u sure u want to EXIT..? ", " ", 0) == 0) {
                System.exit(0);
            }
        }
        catch (final NumberFormatException ex) {}
        catch (final Exception ex2) {
            ex2.printStackTrace();
        }
    }
}
