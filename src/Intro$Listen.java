import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 
// Decompiled by Procyon v0.6.0
// 

class Listen implements ActionListener
{
    Intro i1;
    
    public Listen(final Intro i1) {
        this.i1 = i1;
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        if (actionEvent.getSource() == Intro.this.button) {
            Intro.this.progress.setVisible(true);
            Intro.this.loading.setVisible(true);
            Intro.this.button.setEnabled(false);
            new Thread(new Listen.ProgBar()).start();
        }
        if (actionEvent.getSource() == Intro.this.exit) {
            System.exit(0);
        }
    }
}
