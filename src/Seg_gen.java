import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.6.0
// 

public class Seg_gen extends JFrame
{
    JLabel name;
    JLabel Imagelab;
    JLabel here;
    JButton exit;
    JButton clear;
    JButton generate;
    JButton back;
    JButton home;
    JTextField namefield;
    ImagePanel background;
    Image Image1;
    Image ScaleImg;
    String a;
    int x;
    
    public Seg_gen() {
        this.setLayout(null);
        this.setLocation(250, 50);
        this.setResizable(false);
        this.background = new ImagePanel(new ImageIcon("./images/grunge_segdisplay.jpg").getImage());
        this.setTitle("SEGMENT GENERATION");
        this.Imagelab = new JLabel("");
        (this.here = new JLabel("here")).setFont(new Font("Tahoma", 1, 15));
        this.here.setForeground(new Color(0, 82, 164));
        (this.name = new JLabel(" Type the 4 digit PIN :")).setForeground(new Color(0, 82, 164));
        this.name.setFont(new Font("DigifaceWide", 0, 18));
        (this.generate = new JButton("GENERATE")).setBackground(new Color(39, 143, 204));
        this.generate.setForeground(new Color(255, 255, 255));
        this.generate.setFont(new Font("DigifaceWide", 0, 22));
        (this.clear = new JButton("CLEAR")).setBackground(new Color(39, 143, 204));
        this.clear.setForeground(new Color(255, 255, 255));
        this.clear.setFont(new Font("DigifaceWide", 0, 22));
        this.exit = new JButton("");
        final ImageIcon imageIcon = new ImageIcon("./images/closemin.jpg");
        this.exit.setIcon(imageIcon);
        this.exit.setToolTipText("Exit");
        this.exit.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        this.Imagelab.setIcon(imageIcon);
        this.namefield = new JTextField(20);
        this.Imagelab.setIcon(new ImageIcon("./images/point.jpg"));
        (this.home = new JButton("", new ImageIcon("./images/leftcirclearrowmin.jpg"))).setToolTipText("Back to Home.");
        this.home.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        this.background.setBounds(1, 1, 2000, 2000);
        this.here.setBounds(362, 80, 50, 25);
        this.Imagelab.setBounds(358, 100, 44, 90);
        this.name.setBounds(80, 195, 230, 35);
        this.generate.setBounds(160, 300, 180, 50);
        this.clear.setBounds(370, 300, 130, 50);
        this.namefield.setBounds(340, 200, 80, 25);
        this.exit.setBounds(550, 390, 70, 70);
        this.home.setBounds(450, 393, 55, 55);
        final Listen listen = new Listen(this);
        this.exit.addActionListener(listen);
        this.generate.addActionListener(listen);
        this.clear.addActionListener(listen);
        this.home.addActionListener(listen);
        this.background.add(this.exit);
        this.background.add(this.Imagelab);
        this.background.add(this.here);
        this.background.add(this.generate);
        this.background.add(this.name);
        this.background.add(this.namefield);
        this.background.add(this.clear);
        this.background.add(this.home);
        this.add(this.background);
        this.generate.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(final MouseEvent mouseEvent) {
                Seg_gen.this.generate.setBounds(160, 300, 180, 50);
            }
            
            @Override
            public void mouseExited(final MouseEvent mouseEvent) {
                Seg_gen.this.generate.setBounds(160, 300, 170, 50);
            }
        });
        this.clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(final MouseEvent mouseEvent) {
                Seg_gen.this.clear.setBounds(370, 300, 140, 50);
            }
            
            @Override
            public void mouseExited(final MouseEvent mouseEvent) {
                Seg_gen.this.clear.setBounds(370, 300, 130, 50);
            }
        });
        this.home.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(final MouseEvent mouseEvent) {
                Seg_gen.this.home.setBounds(440, 383, 70, 70);
                Seg_gen.this.home.setIcon(new ImageIcon("./images/leftcirclearrow.jpg"));
            }
            
            @Override
            public void mouseExited(final MouseEvent mouseEvent) {
                Seg_gen.this.home.setIcon(new ImageIcon("./images/leftcirclearrowmin.jpg"));
                Seg_gen.this.home.setBounds(450, 393, 55, 55);
            }
        });
        this.exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(final MouseEvent mouseEvent) {
                Seg_gen.this.exit.setBounds(550, 387, 70, 70);
                Seg_gen.this.exit.setIcon(new ImageIcon("./images/close.jpg"));
            }
            
            @Override
            public void mouseExited(final MouseEvent mouseEvent) {
                Seg_gen.this.exit.setIcon(new ImageIcon("./images/closemin.jpg"));
                Seg_gen.this.exit.setBounds(550, 390, 70, 70);
            }
        });
    }
    
    public static void main(final String[] array) {
        final Seg_gen seg_gen = new Seg_gen();
        seg_gen.setVisible(true);
        seg_gen.setSize(660, 500);
    }
    
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
}
