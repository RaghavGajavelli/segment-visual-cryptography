import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.6.0
// 

public class Tabpane extends JFrame
{
    JPanel pagePanel;
    JPanel pagePanel2;
    JTabbedPane tp;
    JButton home;
    JLabel Imagelab1;
    JLabel Imagelab2;
    JTextArea txt;
    ImagePanel background;
    
    public Tabpane() {
        this.setLayout(null);
        final ActionListen l = new ActionListen();
        this.setLocation(250, 50);
        this.setResizable(false);
        this.background = new ImagePanel(new ImageIcon(".\\images\\whitebg.jpg").getImage());
        this.tp = new JTabbedPane();
        this.home = new JButton("");
        (this.home = new JButton("", new ImageIcon(".\\images\\button-homemin.jpg"))).setToolTipText("Back to Home.");
        this.home.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        this.pagePanel = new JPanel();
        this.pagePanel2 = new JPanel();
        this.Imagelab1 = new JLabel("");
        this.Imagelab2 = new JLabel("");
        this.Imagelab1.setIcon(new ImageIcon(".\\images\\about-sbvc.jpg"));
        this.Imagelab2.setIcon(new ImageIcon(".\\images\\help-sbvc.jpg"));
        this.pagePanel.setBounds(10, 10, 50, 50);
        this.pagePanel2.setBounds(110, 10, 100, 100);
        this.home.addActionListener(l);
        this.Imagelab1.setBounds(0, 0, 640, 480);
        this.Imagelab2.setBounds(0, 0, 640, 480);
        this.tp.setBounds(10, 20, 640, 480);
        this.home.setBounds(590, 510, 55, 56);
        this.setBackground(Color.blue);
        this.pagePanel.add(this.Imagelab1);
        this.pagePanel2.add(this.Imagelab2);
        this.background.add(this.tp);
        this.background.add(this.home);
        this.add(this.background);
        this.tp.addTab("About SBVC", this.pagePanel);
        this.tp.addTab("help", this.pagePanel2);
        this.home.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(final MouseEvent mouseEvent) {
                Tabpane.this.home.setIcon(new ImageIcon(".\\images\\button-home.jpg"));
                Tabpane.this.home.setBounds(580, 500, 69, 70);
            }
            
            @Override
            public void mouseExited(final MouseEvent mouseEvent) {
                Tabpane.this.home.setIcon(new ImageIcon(".\\images\\button-homemin.jpg"));
                Tabpane.this.home.setBounds(590, 510, 55, 56);
            }
        });
    }
    
    public static void main(final String[] array) {
        final Tabpane tabpane = new Tabpane();
        tabpane.setSize(680, 600);
        tabpane.setVisible(true);
    }
    
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
}
