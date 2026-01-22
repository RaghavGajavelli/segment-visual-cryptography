import java.awt.Component;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 
// Decompiled by Procyon v0.6.0
// 

class Listen implements ActionListener
{
    Seg_gen sg1;
    
    public Listen(final Seg_gen sg1) {
        this.sg1 = sg1;
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        try {
            if (actionEvent.getSource() == Seg_gen.this.generate && JOptionPane.showConfirmDialog(this.sg1, "Are u sure about the number..? ", " ", 0) == 0) {
                Seg_gen.this.a = Seg_gen.this.namefield.getText();
                final String a = Seg_gen.this.a;
                Seg_gen.this.x = Integer.parseInt(Seg_gen.this.namefield.getText());
                if (a.length() != 4) {
                    JOptionPane.showMessageDialog(this.sg1, "U should enter a 4 digit number..!!! ", " ", 1);
                }
                else {
                    final DisplayDigit displayDigit = new DisplayDigit(a);
                    this.sg1.setVisible(false);
                    displayDigit.setVisible(true);
                    displayDigit.setSize(660, 500);
                }
            }
        }
        catch (final NumberFormatException ex) {
            this.sg1.setVisible(true);
            JOptionPane.showMessageDialog(this.sg1, "Plz Check the number format..!!! ", " ", 1);
        }
        catch (final Exception ex2) {
            ex2.printStackTrace();
        }
        if (actionEvent.getSource() == Seg_gen.this.home) {
            final Home home = new Home();
            this.sg1.setVisible(false);
            home.setVisible(true);
            home.setSize(660, 500);
        }
        if (actionEvent.getSource() == Seg_gen.this.clear) {
            Seg_gen.this.namefield.setText("");
        }
        if (actionEvent.getSource() == Seg_gen.this.exit) {
            System.exit(0);
        }
    }
}
