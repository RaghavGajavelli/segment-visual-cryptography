import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 
// Decompiled by Procyon v0.6.0
// 

class ActionListen implements ActionListener
{
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        try {
            if (actionEvent.getSource() == Tabpane.this.home) {
                Tabpane.this.setVisible(false);
                final Home home = new Home();
                home.setVisible(true);
                home.setSize(660, 500);
            }
        }
        catch (final NumberFormatException ex) {}
        catch (final Exception ex2) {
            ex2.printStackTrace();
        }
    }
}
