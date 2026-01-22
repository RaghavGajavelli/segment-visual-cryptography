import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.6.0
// 

public class Homes extends JFrame
{
    int a;
    JLabel l1;
    JButton enc;
    JButton dyc;
    JButton exit;
    JButton help;
    
    public Homes() {
        this.a = 10;
        this.setLayout(null);
        this.l1 = new JLabel("   Segment Based Visual Crypotography ");
        this.enc = new JButton("ENCRYPTION");
        this.dyc = new JButton("DECRYPTION");
        this.exit = new JButton("EXIT");
        this.help = new JButton("HELP");
        this.l1.setFont(new Font("Monotype Corsiva", 1, 34));
        this.enc.setFont(new Font("Tahoma", 0, 20));
        this.dyc.setFont(new Font("Tahoma", 0, 20));
        this.exit.setFont(new Font("Tahoma", 0, 20));
        this.help.setFont(new Font("Tahoma", 0, 20));
        this.l1.setBounds(200, 25, 600, 50);
        this.enc.setBounds(150, 250, 180, 40);
        this.dyc.setBounds(360, 250, 180, 40);
        this.exit.setBounds(500, 600, 100, 25);
        this.help.setBounds(380, 600, 100, 25);
        final Listen l = new Listen(this);
        this.enc.addActionListener(l);
        this.dyc.addActionListener(l);
        this.exit.addActionListener(l);
        this.add(this.l1);
        this.add(this.enc);
        this.add(this.dyc);
        this.add(this.exit);
        this.add(this.help);
    }
    
    public static void main(final String[] array) {
        final Homes homes = new Homes();
        homes.setVisible(true);
        homes.setSize(2000, 2000);
    }
    
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
}
