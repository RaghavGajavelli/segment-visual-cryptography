import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.6.0
// 

public class DisplayDigit extends JFrame
{
    JButton back;
    JButton gen_share;
    JButton view_share;
    JButton prev;
    JButton next;
    JButton home;
    JLabel name;
    JLabel Imagelab;
    JLabel acadietimer;
    DigitPanel[] panel;
    String a;
    ImagePanel background;
    InitRandom ir;
    
    public DisplayDigit(final String a) {
        this.panel = new DigitPanel[4];
        this.a = null;
        this.setLayout(null);
        this.setTitle("SEGMENT DISPLAY");
        this.setLocation(250, 50);
        this.setResizable(false);
        this.a = a;
        this.Imagelab = new JLabel("");
        this.acadietimer = new JLabel("");
        (this.background = new ImagePanel(new ImageIcon("./images/grunge_3.jpg").getImage())).setLayout(null);
        this.Imagelab.setIcon(new ImageIcon("./images/blackbg.jpg"));
        this.background.setBounds(1, 1, 2000, 2000);
        this.Imagelab.setBounds(50, 18, 500, 300);
        (this.name = new JLabel(" The segment display of the number is:")).setFont(new Font("DigifaceWide", 0, 12));
        this.name.setForeground(new Color(63, 90, 111));
        (this.gen_share = new JButton("GENERATE SHARES")).setBackground(new Color(39, 143, 204));
        this.gen_share.setForeground(new Color(255, 255, 255));
        this.gen_share.setFont(new Font("DigifaceWide", 0, 22));
        (this.view_share = new JButton("VIEW SHARES")).setEnabled(false);
        this.view_share.setBackground(new Color(39, 143, 204));
        this.view_share.setForeground(new Color(255, 255, 255));
        this.view_share.setFont(new Font("DigifaceWide", 0, 22));
        (this.prev = new JButton("", new ImageIcon("./images/leftcirclearrowmin.jpg"))).setToolTipText("Back one level.");
        this.prev.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        (this.home = new JButton("", new ImageIcon("./images/button-homemin.jpg"))).setToolTipText("Back to Home.");
        this.home.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        this.acadietimer.setIcon(new ImageIcon("./images/sandtimer.gif"));
        this.acadietimer.setVisible(false);
        this.gen_share.setBounds(50, 315, 270, 50);
        this.view_share.setBounds(340, 315, 270, 50);
        this.prev.setBounds(470, 390, 55, 55);
        this.name.setBounds(50, 20, 300, 50);
        this.home.setBounds(540, 390, 55, 56);
        this.acadietimer.setBounds(200, 200, 63, 63);
        final Seg_gen seg_gen = new Seg_gen();
        final char[] array = new char[this.a.length()];
        for (int i = 0; i < this.a.length(); ++i) {
            array[i] = this.a.charAt(i);
            System.out.println(array[i]);
        }
        this.panel[0] = new DigitPanel(array[0]);
        this.panel[1] = new DigitPanel(array[1]);
        this.panel[2] = new DigitPanel(array[2]);
        this.panel[3] = new DigitPanel(array[3]);
        this.panel[0].setBounds(20, 5, 100, 200);
        this.panel[1].setBounds(140, 5, 100, 200);
        this.panel[2].setBounds(260, 5, 100, 200);
        this.panel[3].setBounds(380, 5, 100, 200);
        this.panel[0].setBackground(new Color(0, 65, 100));
        this.Imagelab.add(this.panel[0]);
        this.Imagelab.add(this.panel[1]);
        this.Imagelab.add(this.panel[2]);
        this.Imagelab.add(this.panel[3]);
        this.background.add(this.Imagelab);
        this.background.add(this.prev);
        this.background.add(this.home);
        this.background.add(this.gen_share);
        this.background.add(this.view_share);
        this.background.add(this.home);
        this.background.add(this.name);
        this.background.add(this.acadietimer);
        this.add(this.background);
        final Listen listen = new Listen(this);
        this.gen_share.addActionListener(listen);
        this.view_share.addActionListener(listen);
        this.prev.addActionListener(listen);
        this.home.addActionListener(listen);
        this.ir = new InitRandom();
        this.prev.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(final MouseEvent mouseEvent) {
                DisplayDigit.this.prev.setIcon(new ImageIcon("./images/leftcirclearrow.jpg"));
                DisplayDigit.this.prev.setBounds(460, 380, 70, 70);
            }
            
            @Override
            public void mouseExited(final MouseEvent mouseEvent) {
                DisplayDigit.this.prev.setIcon(new ImageIcon("./images/leftcirclearrowmin.jpg"));
                DisplayDigit.this.prev.setBounds(470, 390, 55, 55);
            }
        });
        this.home.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(final MouseEvent mouseEvent) {
                DisplayDigit.this.home.setIcon(new ImageIcon("./images/button-home.jpg "));
                DisplayDigit.this.home.setBounds(530, 390, 69, 70);
            }
            
            @Override
            public void mouseExited(final MouseEvent mouseEvent) {
                DisplayDigit.this.home.setIcon(new ImageIcon("./images/button-homemin.jpg"));
                DisplayDigit.this.home.setBounds(540, 390, 55, 56);
            }
        });
    }
    
    public void DoBogusTask() {
        this.acadietimer.setVisible(true);
        for (int i = 0; i < 500; ++i) {}
    }
    
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
}
