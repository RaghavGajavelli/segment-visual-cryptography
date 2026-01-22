import java.awt.event.ActionEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.Image;
import java.awt.Dimension;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.io.File;
import java.awt.image.BufferedImage;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Component;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.6.0
// 

public class View_share extends JFrame
{
    JLabel disp;
    JLabel shr1;
    JLabel shr2;
    JLabel imagearea1;
    JLabel imagearea2;
    JButton Browse1;
    JButton Browse2;
    JButton home;
    JButton prev;
    JButton Save1;
    JButton Save2;
    JButton print1;
    JButton print2;
    JTextField Textarea1;
    JTextField Textarea2;
    ImagePanel background;
    String path;
    JFileChooser jfc;
    
    public View_share() {
        this.path = null;
        this.jfc = null;
        this.setLayout(null);
        this.setTitle("VIEW SHARES");
        this.setLocation(250, 50);
        this.setResizable(false);
        this.background = new ImagePanel(new ImageIcon("whitebg.jpg").getImage());
        this.jfc = new JFileChooser("C:\\");
        this.shr1 = new JLabel(" Share 1 :");
        this.shr2 = new JLabel(" Share 2 :");
        (this.imagearea1 = new JLabel("")).setIcon(new ImageIcon("share1.jpeg"));
        (this.imagearea2 = new JLabel("")).setIcon(new ImageIcon("share2.jpg"));
        (this.prev = new JButton("", new ImageIcon("leftcirclearrow.jpg"))).setToolTipText("Back One Level");
        this.print1 = new JButton("Print");
        this.print2 = new JButton("Print");
        (this.home = new JButton("", new ImageIcon("button-home.jpg"))).setToolTipText("Diplays Home Page.");
        this.imagearea1.setBorder(BorderFactory.createLineBorder(Color.black));
        this.imagearea1.setToolTipText("Right Click on ShareA to Save.");
        this.imagearea2.setBorder(BorderFactory.createLineBorder(Color.black));
        this.imagearea2.setToolTipText("Right Click on ShareB to Save.");
        this.background.setBounds(1, 1, 2000, 2000);
        this.shr1.setBounds(20, 100, 60, 25);
        this.shr2.setBounds(20, 300, 60, 25);
        this.imagearea1.setBounds(100, 5, 580, 153);
        this.imagearea2.setBounds(100, 213, 580, 153);
        this.prev.setBounds(460, 420, 70, 70);
        this.home.setBounds(540, 420, 70, 70);
        this.print1.setBounds(140, 450, 70, 25);
        this.print2.setBounds(590, 450, 70, 25);
        final Listen listen = new Listen(this);
        this.prev.addActionListener(listen);
        this.home.addActionListener(listen);
        this.imagearea1.addMouseListener(listen);
        this.imagearea2.addMouseListener(listen);
        this.background.add(this.home);
        this.background.add(this.shr1);
        this.background.add(this.shr2);
        this.background.add(this.prev);
        this.background.add(this.imagearea1);
        this.background.add(this.imagearea2);
        this.imagearea1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == 3) {
                    try {
                        View_share.this.jfc.setFileSelectionMode(2);
                        if (View_share.this.jfc.showSaveDialog(View_share.this.imagearea1) == 0) {
                            View_share.this.path = View_share.this.jfc.getSelectedFile().getAbsolutePath();
                            final BufferedImage bufferedImage = new BufferedImage(70, 70, 2);
                            System.out.println(View_share.this.path);
                            final File output = new File(View_share.this.path);
                            try {
                                final Dimension preferredSize = View_share.this.imagearea1.getPreferredSize();
                                final Image image = View_share.this.imagearea1.createImage(preferredSize.width, preferredSize.height);
                                View_share.this.imagearea1.paint(image.getGraphics());
                                ImageIO.write((RenderedImage)image, "jpg", output);
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
        this.imagearea2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == 3) {
                    try {
                        View_share.this.jfc.setFileSelectionMode(2);
                        if (View_share.this.jfc.showSaveDialog(View_share.this.imagearea2) == 0) {
                            View_share.this.path = View_share.this.jfc.getSelectedFile().getAbsolutePath();
                            final BufferedImage bufferedImage = new BufferedImage(70, 70, 2);
                            System.out.println(View_share.this.path);
                            final File output = new File(View_share.this.path);
                            try {
                                final Dimension preferredSize = View_share.this.imagearea2.getPreferredSize();
                                final Image image = View_share.this.imagearea2.createImage(preferredSize.width, preferredSize.height);
                                View_share.this.imagearea2.paint(image.getGraphics());
                                ImageIO.write((RenderedImage)image, "jpg", output);
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
                    final Dimension preferredSize = View_share.this.imagearea1.getPreferredSize();
                    final Image image = View_share.this.imagearea1.createImage(preferredSize.width, preferredSize.height);
                    View_share.this.imagearea1.paint(image.getGraphics());
                    ImageIO.write((RenderedImage)image, "jpg", output);
                    final Dimension preferredSize2 = View_share.this.imagearea2.getPreferredSize();
                    final Image image2 = View_share.this.imagearea2.createImage(preferredSize2.width, preferredSize2.height);
                    View_share.this.imagearea2.paint(image2.getGraphics());
                    ImageIO.write((RenderedImage)image2, "jpg", output2);
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        this.add(this.background);
    }
    
    public static void main(final String[] array) {
        final View_share view_share = new View_share();
        view_share.setVisible(true);
        view_share.setSize(700, 530);
    }
    
    class Listen extends MouseAdapter implements ActionListener
    {
        View_share vs1;
        
        public Listen(final View_share vs1) {
            this.vs1 = vs1;
        }
        
        @Override
        public void actionPerformed(final ActionEvent actionEvent) {
            if (actionEvent.getSource() == View_share.this.home) {
                final Home home = new Home();
                this.vs1.setVisible(false);
                home.setVisible(true);
                home.setSize(660, 500);
            }
            if (actionEvent.getSource() == View_share.this.prev) {}
        }
    }
}
