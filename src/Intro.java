import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import java.awt.LayoutManager;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.6.0
// 

public class Intro extends JFrame
{
    JProgressBar progress;
    JButton button;
    JButton aboutus;
    JButton exit;
    JLabel label1;
    JLabel title;
    JLabel loading;
    ImagePanel background;
    ImageIcon loadIcon;
    Image loadImage;
    String path;
    
    public Intro() {
        this.path = null;
        this.setLayout(null);
        this.setTitle("Introduction to SBVC");
        (this.background = new ImagePanel(new ImageIcon(".\\images\\grungeintro.jpg").getImage())).setLayout(null);
        this.setLocation(250, 50);
        this.setResizable(false);
        this.loading = new JLabel("");
        this.loadIcon = new ImageIcon(".\\images\\load.gif");
        this.loading.setIcon(this.loadIcon);
        this.loading.setVisible(false);
        this.label1 = new JLabel("");
        this.title = new JLabel("Segment Based Visual Cryptography", 0);
        (this.button = new JButton("Continue")).setFont(new Font("DigifaceWide", 1, 17));
        (this.exit = new JButton("")).setIcon(new ImageIcon(".\\images\\exit.png"));
        this.button.setBackground(new Color(39, 143, 204));
        this.button.setForeground(new Color(255, 255, 255));
        this.aboutus = new JButton("", new ImageIcon(".\\images\\aboutus.jpeg"));
        (this.progress = new JProgressBar()).setVisible(false);
        this.background.setBounds(1, 1, 2000, 2000);
        this.label1.setBounds(280, 150, 150, 240);
        this.title.setFont(new Font("Monotype Corsiva", 1, 37));
        this.progress.setMinimum(0);
        this.progress.setMaximum(100);
        this.progress.setValue(0);
        this.progress.setBounds(250, 300, 200, 5);
        this.aboutus.setBounds(100, 400, 100, 35);
        this.button.setBounds(270, 320, 130, 50);
        this.loading.setBounds(330, 250, 48, 48);
        this.exit.setBounds(410, 320, 48, 48);
        this.background.add(this.label1);
        this.background.add(this.title);
        this.background.add(this.progress);
        this.background.add(this.button);
        this.background.add(this.loading);
        this.background.add(this.exit);
        this.add(this.background);
        final Listen listen = new Listen(this);
        this.button.addActionListener(listen);
        this.exit.addActionListener(listen);
    }
    
    public static void main(final String[] array) {
        final Intro intro = new Intro();
        intro.setVisible(true);
        intro.setSize(715, 570);
    }
    
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
                                Intro.this.label1.setText("Loading... " + i + " of 100%");
                                final Rectangle bounds = Intro.this.label1.getBounds();
                                bounds.x = 0;
                                bounds.y = 0;
                                Intro.this.label1.paintImmediately(bounds);
                                Intro.this.progress.setValue(i);
                                final Rectangle bounds2 = Intro.this.progress.getBounds();
                                bounds2.x = 0;
                                bounds2.y = 0;
                                Intro.this.progress.paintImmediately(bounds2);
                            }
                            final Home home = new Home();
                            Intro.this.setVisible(false);
                            home.setVisible(true);
                            home.setSize(660, 500);
                        }
                        catch (final InterruptedException ex) {}
                    }
                }
                new Thread(new ProgBar()).start();
            }
            if (actionEvent.getSource() == Intro.this.exit) {
                System.exit(0);
            }
        }
    }
}
