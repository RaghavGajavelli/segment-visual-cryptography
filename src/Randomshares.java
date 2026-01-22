import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.Image;
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.io.File;
import java.awt.image.BufferedImage;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Component;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.6.0
// 

public class Randomshares extends JFrame
{
    JLabel Imagelab1;
    JLabel share1lab;
    JLabel Imagelab2;
    JLabel share2lab;
    JLabel info;
    JLabel hand;
    Share1panel[] panel;
    Share2panel[] panel2;
    JButton prev;
    JButton home;
    ImagePanel background;
    int i;
    int a;
    int flag1;
    int flag2;
    int[] randomIndex;
    int[] digit;
    String path;
    JFileChooser jfc;
    InitRandom ir;
    
    public Randomshares(final String s) {
        this.panel = new Share1panel[4];
        this.panel2 = new Share2panel[4];
        this.flag1 = 0;
        this.flag2 = 0;
        this.randomIndex = new int[7];
        this.digit = new int[4];
        this.path = null;
        this.jfc = null;
        this.setLayout(null);
        this.setLocation(250, 50);
        this.setResizable(false);
        this.setTitle("Shares 1 & 2");
        this.jfc = new JFileChooser("C:\\");
        (this.background = new ImagePanel(new ImageIcon(".\\images\\grunge_4.jpg").getImage())).setLayout(null);
        this.background.setBounds(1, 1, 2000, 2000);
        this.Imagelab1 = new JLabel("", 0);
        (this.info = new JLabel("Right click on shares to SAVE")).setForeground(new Color(63, 90, 111));
        this.info.setFont(new Font("DigifaceWide", 0, 12));
        (this.hand = new JLabel("")).setIcon(new ImageIcon(".\\images\\share.gif"));
        final ImageIcon imageIcon = new ImageIcon(".\\images\\blackbg.jpg");
        this.Imagelab1.setIcon(imageIcon);
        this.Imagelab1.setToolTipText("Right Click on Share1 to Save.");
        (this.prev = new JButton("", new ImageIcon(".\\images\\leftcirclearrow.jpg"))).setToolTipText("Back One Level");
        (this.home = new JButton("", new ImageIcon(".\\images\\button-homemin.jpg"))).setToolTipText("Back Home");
        this.home.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        (this.share1lab = new JLabel("Share 1: ")).setForeground(new Color(63, 90, 111));
        this.share1lab.setFont(new Font("DigifaceWide", 1, 11));
        (this.Imagelab2 = new JLabel("", 0)).setIcon(imageIcon);
        this.Imagelab2.setToolTipText("Right Click on Share2 to Save.");
        (this.share2lab = new JLabel("Share 2: ")).setForeground(new Color(63, 90, 111));
        this.share2lab.setFont(new Font("DigifaceWide", 1, 11));
        this.info.setBounds(210, 253, 250, 25);
        this.Imagelab1.setBounds(70, 30, 511, 219);
        this.Imagelab2.setBounds(70, 280, 511, 219);
        this.prev.setBounds(400, 505, 70, 70);
        this.home.setBounds(500, 510, 55, 56);
        final Random random = new Random();
        for (int i = 0; i < 7; ++i) {
            this.randomIndex[i] = random.nextInt(2);
        }
        this.panel[0] = new Share1panel(this.randomIndex);
        this.panel[1] = new Share1panel(this.randomIndex);
        this.panel[2] = new Share1panel(this.randomIndex);
        this.panel[3] = new Share1panel(this.randomIndex);
        final char[] array = new char[s.length()];
        for (int j = 0; j < s.length(); ++j) {
            array[j] = s.charAt(j);
        }
        this.panel[0].setBounds(20, 0, 100, 200);
        this.panel[1].setBounds(140, 0, 100, 200);
        this.panel[2].setBounds(260, 0, 100, 200);
        this.panel[3].setBounds(380, 0, 100, 200);
        this.Imagelab1.add(this.panel[0]);
        this.Imagelab1.add(this.panel[1]);
        this.Imagelab1.add(this.panel[2]);
        this.Imagelab1.add(this.panel[3]);
        this.panel2[0] = new Share2panel(array, this.randomIndex);
        this.panel2[1] = new Share2panel(array, this.randomIndex);
        this.panel2[2] = new Share2panel(array, this.randomIndex);
        this.panel2[3] = new Share2panel(array, this.randomIndex);
        this.share1lab.setBounds(5, 30, 70, 25);
        this.share2lab.setBounds(5, 280, 70, 25);
        this.hand.setBounds(0, 210, 51, 87);
        this.panel2[0].setBounds(20, 0, 100, 200);
        this.panel2[1].setBounds(140, 0, 100, 200);
        this.panel2[2].setBounds(260, 0, 100, 200);
        this.panel2[3].setBounds(380, 0, 100, 200);
        this.Imagelab2.add(this.panel2[0]);
        this.Imagelab2.add(this.panel2[1]);
        this.Imagelab2.add(this.panel2[2]);
        this.Imagelab2.add(this.panel2[3]);
        this.background.add(this.Imagelab1);
        this.background.add(this.share1lab);
        this.background.add(this.Imagelab2);
        this.background.add(this.share2lab);
        this.background.add(this.info);
        this.background.add(this.hand);
        this.home.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(final MouseEvent mouseEvent) {
                Randomshares.this.home.setIcon(new ImageIcon(".\\images\\button-home.jpg "));
                Randomshares.this.home.setBounds(490, 510, 69, 70);
            }
            
            @Override
            public void mouseExited(final MouseEvent mouseEvent) {
                Randomshares.this.home.setIcon(new ImageIcon(".\\images\\button-homemin.jpg"));
                Randomshares.this.home.setBounds(500, 510, 55, 56);
            }
        });
        this.Imagelab1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == 3) {
                    try {
                        Randomshares.this.jfc.setFileSelectionMode(2);
                        if (Randomshares.this.jfc.showSaveDialog(Randomshares.this.Imagelab1) == 0) {
                            Randomshares.this.path = Randomshares.this.jfc.getSelectedFile().getAbsolutePath();
                            final BufferedImage bufferedImage = new BufferedImage(70, 70, 2);
                            System.out.println(Randomshares.this.path);
                            final File output = new File(Randomshares.this.path);
                            try {
                                final Dimension preferredSize = Randomshares.this.Imagelab1.getPreferredSize();
                                final Image image = Randomshares.this.Imagelab1.createImage(preferredSize.width, preferredSize.height);
                                Randomshares.this.Imagelab1.paint(image.getGraphics());
                                ImageIO.write((RenderedImage)image, "jpg", output);
                                Randomshares.this.flag1 = 1;
                                if (Randomshares.this.flag1 == 1 && Randomshares.this.flag2 == 1) {
                                    JOptionPane.showMessageDialog(Randomshares.this.Imagelab1, "Shares saved at desired location ", " ", 1);
                                    JOptionPane.showMessageDialog(Randomshares.this.Imagelab1, "You can proceed for decryption from Home ", " ", 1);
                                }
                            }
                            catch (final IOException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                    catch (final Exception ex2) {
                        ex2.printStackTrace();
                    }
                }
            }
        });
        this.Imagelab2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == 3) {
                    try {
                        Randomshares.this.jfc.setFileSelectionMode(2);
                        if (Randomshares.this.jfc.showSaveDialog(Randomshares.this.Imagelab2) == 0) {
                            Randomshares.this.path = Randomshares.this.jfc.getSelectedFile().getAbsolutePath();
                            final BufferedImage bufferedImage = new BufferedImage(70, 70, 2);
                            System.out.println(Randomshares.this.path);
                            final File output = new File(Randomshares.this.path);
                            try {
                                final Dimension preferredSize = Randomshares.this.Imagelab2.getPreferredSize();
                                final Image image = Randomshares.this.Imagelab2.createImage(preferredSize.width, preferredSize.height);
                                Randomshares.this.Imagelab2.paint(image.getGraphics());
                                ImageIO.write((RenderedImage)image, "jpg", output);
                                Randomshares.this.flag2 = 1;
                                if (Randomshares.this.flag1 == 1 && Randomshares.this.flag2 == 1) {
                                    JOptionPane.showMessageDialog(Randomshares.this.Imagelab2, "Shares saved at desired location ", " ", 1);
                                    JOptionPane.showMessageDialog(Randomshares.this.Imagelab1, "You can proceed for decryption from Home ", " ", 1);
                                }
                            }
                            catch (final IOException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                    catch (final Exception ex2) {
                        ex2.printStackTrace();
                    }
                }
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent windowEvent) {
                try {
                    final File output = new File("C:/recovered/share1.jpg");
                    final File output2 = new File("C:/recovered/share2.jpg");
                    final Dimension preferredSize = Randomshares.this.Imagelab1.getPreferredSize();
                    final Image image = Randomshares.this.Imagelab1.createImage(preferredSize.width, preferredSize.height);
                    Randomshares.this.Imagelab1.paint(image.getGraphics());
                    ImageIO.write((RenderedImage)image, "jpg", output);
                    final Dimension preferredSize2 = Randomshares.this.Imagelab2.getPreferredSize();
                    final Image image2 = Randomshares.this.Imagelab2.createImage(preferredSize2.width, preferredSize2.height);
                    Randomshares.this.Imagelab2.paint(image2.getGraphics());
                    ImageIO.write((RenderedImage)image2, "jpg", output2);
                    JOptionPane.showMessageDialog(Randomshares.this.Imagelab2, "Shares saved at default location C:/recovered/ ", " ", 1);
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        this.background.add(this.home);
        this.add(this.background);
        final Listen listen = new Listen(this);
        this.prev.addActionListener(listen);
        this.home.addActionListener(listen);
    }
    
    class Listen implements ActionListener
    {
        Randomshares r1;
        
        public Listen(final Randomshares r1) {
            this.r1 = r1;
        }
        
        @Override
        public void actionPerformed(final ActionEvent actionEvent) {
            if (actionEvent.getSource() == Randomshares.this.home) {
                final Home home = new Home();
                this.r1.setVisible(false);
                home.setVisible(true);
                home.setSize(660, 500);
            }
            if (actionEvent.getSource() == Randomshares.this.prev) {}
        }
    }
}
