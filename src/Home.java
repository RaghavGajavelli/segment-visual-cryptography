import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.6.0
// 

public class Home extends JFrame
{
    int a;
    JLabel l1;
    JLabel lock;
    JLabel key;
    JLabel segdispimg;
    JButton enc;
    JButton dyc;
    JButton exit;
    JButton help;
    ImagePanel background;
    
    public Home() {
        this.a = 10;
        this.setLayout(null);
        this.setLocation(250, 50);
        this.setResizable(false);
        (this.background = new ImagePanel(new ImageIcon("./images/home.jpg").getImage())).setLayout(null);
        this.l1 = new JLabel(" Segment Based Visual Cryptography ", 2);
        this.lock = new JLabel("");
        this.segdispimg = new JLabel("");
        this.key = new JLabel("");
        this.enc = new JButton("ENCRYPTION");
        this.dyc = new JButton("DECRYPTION");
        this.lock.setVisible(false);
        this.key.setVisible(false);
        this.enc.setBackground(new Color(39, 143, 204));
        this.enc.setForeground(new Color(255, 255, 255));
        this.dyc.setBackground(new Color(39, 143, 204));
        this.dyc.setForeground(new Color(255, 255, 255));
        this.l1.setFont(new Font("Monotype Corsiva", 1, 45));
        this.enc.setFont(new Font("DigifaceWide", 0, 22));
        this.dyc.setFont(new Font("DigifaceWide", 0, 22));
        this.l1.setForeground(new Color(34, 139, 234));
        this.lock.setIcon(new ImageIcon("./images/lockclosed.jpg"));
        this.key.setIcon(new ImageIcon("./images/lockopen.jpg"));
        this.segdispimg.setIcon(new ImageIcon("./images/Segdisplay.gif"));
        final ImageIcon icon = new ImageIcon("./images/crystalmin.jpg");
        (this.help = new JButton("", new ImageIcon("./images/HelpIconmin.jpg"))).setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        this.help.setToolTipText("Help");
        (this.exit = new JButton("", icon)).setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        this.background.setBounds(1, 1, 2000, 2000);
        this.lock.setBounds(280, 109, 170, 120);
        this.key.setBounds(280, 109, 170, 120);
        this.l1.setBounds(5, 25, 700, 60);
        this.segdispimg.setBounds(5, 70, 55, 75);
        this.segdispimg.setBorder(BorderFactory.createLineBorder(new Color(225, 225, 255)));
        this.enc.setBounds(150, 250, 180, 90);
        this.dyc.setBounds(375, 250, 180, 90);
        this.exit.setBounds(535, 390, 50, 50);
        this.help.setBounds(450, 385, 60, 57);
        final Listen listen = new Listen(this);
        this.enc.addActionListener(listen);
        this.dyc.addActionListener(listen);
        this.exit.addActionListener(listen);
        this.help.addActionListener(listen);
        this.background.add(this.lock);
        this.background.add(this.key);
        this.background.add(this.segdispimg);
        this.background.add(this.enc);
        this.background.add(this.dyc);
        this.background.add(this.exit);
        this.background.add(this.help);
        this.add(this.background);
        this.enc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(final MouseEvent mouseEvent) {
                Home.this.enc.setBounds(150, 250, 200, 110);
                Home.this.lock.setVisible(true);
            }
            
            @Override
            public void mouseExited(final MouseEvent mouseEvent) {
                Home.this.enc.setBounds(150, 250, 180, 90);
                Home.this.lock.setVisible(false);
            }
        });
        this.dyc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(final MouseEvent mouseEvent) {
                Home.this.dyc.setBounds(375, 250, 200, 110);
                Home.this.key.setVisible(true);
            }
            
            @Override
            public void mouseExited(final MouseEvent mouseEvent) {
                Home.this.dyc.setBounds(375, 250, 180, 90);
                Home.this.key.setVisible(false);
            }
        });
        this.exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(final MouseEvent mouseEvent) {
                Home.this.exit.setBounds(530, 390, 70, 70);
                Home.this.exit.setIcon(new ImageIcon("./images/crystal.jpg"));
            }
            
            @Override
            public void mouseExited(final MouseEvent mouseEvent) {
                Home.this.exit.setBounds(540, 390, 50, 50);
                Home.this.exit.setIcon(new ImageIcon("./images/crystalmin.jpg"));
            }
        });
        this.help.addMouseListener(new MouseAdapter() {
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
        });
    }
    
    public static void main(final String[] array) {
        final Home home = new Home();
        home.setVisible(true);
        home.setSize(670, 500);
    }
    
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
}
