import java.awt.Component;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 
// Decompiled by Procyon v0.6.0
// 

class Listen implements ActionListener
{
    DisplayDigit dd1;
    Randomshares r;
    
    public Listen(final DisplayDigit dd1) {
        this.dd1 = dd1;
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        if (actionEvent.getSource() == DisplayDigit.this.gen_share) {
            DisplayDigit.this.gen_share.setEnabled(false);
            (this.r = new Randomshares(DisplayDigit.this.a)).setSize(630, 610);
            DisplayDigit.this.acadietimer.setVisible(true);
            DisplayDigit.this.DoBogusTask();
            JOptionPane.showMessageDialog(this.dd1, "Shares generated successfully..!!! ", " ", 1);
            DisplayDigit.this.view_share.setEnabled(true);
        }
        if (actionEvent.getSource() == DisplayDigit.this.home) {
            final Home home = new Home();
            this.dd1.setVisible(false);
            home.setVisible(true);
            home.setSize(660, 500);
        }
        if (actionEvent.getSource() == DisplayDigit.this.view_share) {
            this.dd1.setVisible(false);
            this.r.setVisible(true);
        }
        if (actionEvent.getSource() == DisplayDigit.this.prev) {
            final Seg_gen seg_gen = new Seg_gen();
            DisplayDigit.this.setVisible(false);
            seg_gen.setVisible(true);
            seg_gen.setVisible(true);
            seg_gen.setSize(660, 500);
        }
    }
}
