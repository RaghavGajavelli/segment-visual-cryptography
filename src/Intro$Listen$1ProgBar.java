import java.awt.Rectangle;

// 
// Decompiled by Procyon v0.6.0
// 

class ProgBar implements Runnable
{
    @Override
    public void run() {
        try {
            for (int i = 1; i < 101; ++i) {
                if (i == 30 || i == 40 || i == 50) {
                    Thread.sleep(400L);
                }
                if (i == 10 || i == 20 || i == 90 || i == 75) {
                    Thread.sleep(200L);
                }
                Listen.this.this$0.label1.setText("Loading... " + i + " of 100%");
                final Rectangle bounds = Listen.this.this$0.label1.getBounds();
                bounds.x = 0;
                bounds.y = 0;
                Listen.this.this$0.label1.paintImmediately(bounds);
                Listen.this.this$0.progress.setValue(i);
                final Rectangle bounds2 = Listen.this.this$0.progress.getBounds();
                bounds2.x = 0;
                bounds2.y = 0;
                Listen.this.this$0.progress.paintImmediately(bounds2);
            }
            final Home home = new Home();
            Listen.this.this$0.setVisible(false);
            home.setVisible(true);
            home.setSize(660, 500);
        }
        catch (final InterruptedException ex) {}
    }
}
