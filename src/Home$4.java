import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

class Home$4 extends MouseAdapter {
    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {
        Home.this.help.setBounds(440, 385, 80, 76);
        Home.this.help.setIcon(new ImageIcon("./images/HelpIcon.jpg"));
    }
    
    @Override
    public void mouseExited(final MouseEvent mouseEvent) {
        Home.this.help.setBounds(450, 385, 60, 57);
        Home.this.help.setIcon(new ImageIcon("./images/HelpIconmin.jpg"));
    }
}