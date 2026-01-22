import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 
// Decompiled by Procyon v0.6.0
// 

class Intro$1 implements ActionListener {
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        Intro.access$000(Intro.this).setVisible(true);
        Intro.access$100(Intro.this).setEnabled(false);
        for (int i = 1; i < 101; ++i) {
            Intro.this.DoBogusTask(i);
            Intro.access$200(Intro.this).setText("Loading... " + i + " of 100%");
            final Rectangle bounds = Intro.access$200(Intro.this).getBounds();
            bounds.x = 0;
            bounds.y = 0;
            Intro.access$200(Intro.this).paintImmediately(bounds);
            Intro.access$300(Intro.this).setValue(i);
            final Rectangle bounds2 = Intro.access$300(Intro.this).getBounds();
            bounds2.x = 0;
            bounds2.y = 0;
            Intro.access$300(Intro.this).paintImmediately(bounds2);
        }
        final Home home = new Home();
        Intro.this.setVisible(false);
        home.setVisible(true);
        home.setSize(660, 500);
    }
}