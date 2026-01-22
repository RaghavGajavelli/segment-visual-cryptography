import java.awt.Component;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 
// Decompiled by Procyon v0.6.0
// 

class Listen implements ActionListener
{
    Home h1;
    
    public Listen(final Home h1) {
        this.h1 = h1;
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        try {
            if (actionEvent.getSource() == Home.this.enc && JOptionPane.showConfirmDialog(this.h1, "Are u sure u want to proceed for Encryption..? ", " ", 0) == 0) {
                final Seg_gen seg_gen = new Seg_gen();
                this.h1.setVisible(false);
                seg_gen.setVisible(true);
                seg_gen.setSize(660, 500);
            }
            if (actionEvent.getSource() == Home.this.dyc && JOptionPane.showConfirmDialog(this.h1, "Are u sure u want to proceed for Decryption..? ", " ", 0) == 0) {
                final Decrypt decrypt = new Decrypt();
                this.h1.setVisible(false);
                decrypt.setVisible(true);
                decrypt.setSize(600, 700);
            }
            if (actionEvent.getSource() == Home.this.exit && JOptionPane.showConfirmDialog(this.h1, "Are u sure u want to EXIT..? ", " ", 0) == 0) {
                System.exit(0);
            }
            if (actionEvent.getSource() == Home.this.help) {
                Home.this.setVisible(false);
                final Tabpane tabpane = new Tabpane();
                tabpane.setSize(700, 600);
                tabpane.setVisible(true);
            }
        }
        catch (final NumberFormatException ex) {}
        catch (final Exception ex2) {
            ex2.printStackTrace();
        }
    }
}
