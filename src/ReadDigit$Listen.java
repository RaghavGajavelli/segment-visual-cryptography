import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 
// Decompiled by Procyon v0.6.0
// 

class Listen implements ActionListener
{
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        try {
            if (actionEvent.getSource() == ReadDigit.this.Show) {
                ReadDigit.a = Integer.parseInt(ReadDigit.this.tdigit.getText());
                ReadDigit.this.repaint();
            }
            if (actionEvent.getSource() == ReadDigit.this.Clear) {
                ReadDigit.this.tdigit.setText("");
            }
        }
        catch (final NumberFormatException ex) {
            System.out.println("Please Check The Number Format");
        }
        catch (final Exception ex2) {
            ex2.printStackTrace();
        }
    }
}
