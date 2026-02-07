import java.awt.Toolkit;
import javax.swing.filechooser.FileFilter;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.6.0
// 

public class Decrypt extends JFrame
{
    JLabel disp;
    JLabel shr1;
    JLabel shr2;
    JLabel shr1box;
    JLabel shr2box;
    JLabel resultbox;
    JLabel uparrow;
    JLabel downarrow;
    JLabel info;
    JButton Browse1;
    JButton Browse2;
    JButton home;
    JButton stak;
    JButton seperate;
    JTextField Textarea1;
    JTextField Textarea2;
    ImagePanel background;
    JFileChooser jfc;
    FileNameExtensionFilter filter;
    Image image1;
    Image image2;
    Image scaledImage;
    ImageIcon icon;
    Stack st;
    String imagePath;
    String commonPath;
    String path;
    int flag1;
    int flag2;
    File f1;
    File f2;
    File of;
    BufferedImage b1;
    BufferedImage b2;
    BufferedImage output;
    int c1;
    int c2;
    
    public Decrypt() {
        this.jfc = null;
        this.imagePath = null;
        this.commonPath = null;
        this.path = null;
        this.flag1 = 0;
        this.flag2 = 0;
        (this.background = new ImagePanel(new ImageIcon("./images/grunge_5.jpg").getImage())).setLayout(null);
        this.setLayout(null);
        this.setLocation(250, 35);
        this.setResizable(false);
        this.setTitle("DECRYPTION");
        (this.shr1 = new JLabel(" Share 1 :")).setFont(new Font("DigifaceWide", 0, 12));
        this.shr1.setForeground(new Color(63, 90, 111));
        (this.shr2 = new JLabel(" Share 2 :")).setFont(new Font("DigifaceWide", 0, 12));
        this.shr2.setForeground(new Color(63, 90, 111));
        this.shr1box = new JLabel("");
        this.shr2box = new JLabel("");
        this.resultbox = new JLabel("");
        (this.info = new JLabel("Right click on stacked image to SAVE")).setForeground(new Color(63, 90, 111));
        this.info.setFont(new Font("DigifaceWide", 0, 12));
        this.info.setVisible(false);
        (this.uparrow = new JLabel("")).setIcon(new ImageIcon("./images/uparrow.jpg"));
        this.uparrow.setVisible(false);
        (this.downarrow = new JLabel("")).setIcon(new ImageIcon("./images/downarrow.jpg"));
        this.downarrow.setVisible(false);
        (this.Browse1 = new JButton("Browse")).setFont(new Font("DigifaceWide", 1, 10));
        this.Browse1.setBackground(new Color(39, 143, 204));
        this.Browse1.setForeground(new Color(255, 255, 255));
        (this.Browse2 = new JButton("Browse")).setFont(new Font("DigifaceWide", 1, 10));
        this.Browse2.setBackground(new Color(39, 143, 204));
        this.Browse2.setForeground(new Color(255, 255, 255));
        (this.stak = new JButton("")).setIcon(new ImageIcon("./images/stackmin.png"));
        (this.seperate = new JButton("")).setIcon(new ImageIcon("./images/seperatemin.jpg"));
        this.seperate.setToolTipText("seperate shares");
        this.stak.setToolTipText("stack shares");
        this.stak.setEnabled(false);
        this.seperate.setVisible(false);
        (this.home = new JButton("", new ImageIcon("./images/button-homemin.jpg"))).setToolTipText("Back to Home.");
        this.home.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        this.Textarea1 = new JTextField(20);
        this.Textarea2 = new JTextField(20);
        this.filter = new FileNameExtensionFilter("JPG & GIF Images", new String[] { "jpg", "gif" });
        this.shr1.setBounds(90, 15, 70, 25);
        this.shr2.setBounds(90, 45, 70, 25);
        this.Textarea1.setBounds(170, 15, 220, 25);
        this.Textarea2.setBounds(170, 45, 220, 25);
        this.Browse1.setBounds(400, 15, 90, 27);
        this.Browse2.setBounds(400, 45, 90, 27);
        this.stak.setBounds(250, 570, 50, 50);
        this.seperate.setBounds(250, 570, 80, 46);
        this.uparrow.setBounds(227, 445, 93, 93);
        this.downarrow.setBounds(235, 103, 92, 92);
        this.info.setBounds(50, 190, 280, 27);
        this.home.setBounds(480, 580, 55, 56);
        this.shr1box.setBounds(35, 80, 511, 219);
        this.shr2box.setBounds(35, 319, 511, 219);
        this.resultbox.setBounds(35, 210, 511, 219);
        this.shr1box.setBackground(Color.black);
        this.shr2box.setBackground(Color.black);
        final Listen l = new Listen(this);
        this.Browse1.addActionListener(l);
        this.Browse2.addActionListener(l);
        this.home.addActionListener(l);
        this.stak.addActionListener(l);
        this.seperate.addActionListener(l);
        this.background.add(this.Browse1);
        this.background.add(this.Browse2);
        this.background.add(this.home);
        this.background.add(this.shr1);
        this.background.add(this.shr2);
        this.background.add(this.Textarea1);
        this.background.add(this.Textarea2);
        this.background.add(this.shr1box);
        this.background.add(this.shr2box);
        this.background.add(this.resultbox);
        this.background.add(this.stak);
        this.background.add(this.seperate);
        this.background.add(this.uparrow);
        this.background.add(this.downarrow);
        this.background.add(this.info);
        this.add(this.background);
        this.stak.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(final MouseEvent mouseEvent) {
                Decrypt.this.stak.setIcon(new ImageIcon("./images/stack.jpg"));
                Decrypt.this.stak.setBounds(240, 550, 103, 103);
            }
            
            @Override
            public void mouseExited(final MouseEvent mouseEvent) {
                Decrypt.this.stak.setIcon(new ImageIcon("./images/stackmin.png"));
                Decrypt.this.stak.setBounds(250, 570, 50, 50);
            }
        });
        this.seperate.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(final MouseEvent mouseEvent) {
                Decrypt.this.seperate.setIcon(new ImageIcon("./images/seperate.jpg"));
                Decrypt.this.seperate.setBounds(240, 560, 100, 56);
            }
            
            @Override
            public void mouseExited(final MouseEvent mouseEvent) {
                Decrypt.this.seperate.setIcon(new ImageIcon("./images/seperatemin.jpg"));
                Decrypt.this.seperate.setBounds(250, 570, 80, 46);
            }
        });
        this.home.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(final MouseEvent mouseEvent) {
                Decrypt.this.home.setIcon(new ImageIcon("./images/button-home.jpg"));
                Decrypt.this.home.setBounds(470, 570, 69, 70);
            }
            
            @Override
            public void mouseExited(final MouseEvent mouseEvent) {
                Decrypt.this.home.setIcon(new ImageIcon("./images/button-homemin.jpg"));
                Decrypt.this.home.setBounds(480, 580, 55, 56);
            }
        });
        this.resultbox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == 3) {
                    try {
                        Decrypt.this.jfc.setFileSelectionMode(2);
                        if (Decrypt.this.jfc.showSaveDialog(Decrypt.this.resultbox) == 0) {
                            Decrypt.this.path = Decrypt.this.jfc.getSelectedFile().getAbsolutePath();
                            final BufferedImage bufferedImage = new BufferedImage(70, 70, 2);
                            System.out.println(Decrypt.this.path);
                            final File output = new File(Decrypt.this.path);
                            try {
                                final Dimension preferredSize = Decrypt.this.resultbox.getPreferredSize();
                                final Image image = Decrypt.this.resultbox.createImage(preferredSize.width, preferredSize.height);
                                Decrypt.this.resultbox.paint(image.getGraphics());
                                ImageIO.write((RenderedImage)image, "jpg", output);
                                Decrypt.this.flag1 = 1;
                                if (Decrypt.this.flag1 == 1 && Decrypt.this.flag2 == 1) {
                                    JOptionPane.showMessageDialog(Decrypt.this.resultbox, "Stacked image saved at desired location ", " ", 1);
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
    }
    
    public void stackOperation() {
        for (int i = 0; i < 511; ++i) {
            for (int j = 0; j < 219; ++j) {
                this.c1 = this.b1.getRGB(i, j);
                this.c2 = this.b2.getRGB(i, j);
                this.convertC1();
                this.convertC2();
                if (this.c1 == this.c2 && this.c1 == -16777216) {
                    this.output.setRGB(i, j, -16777216);
                }
                else if (this.c1 == this.c2 && this.c1 == -1) {
                    this.output.setRGB(i, j, -1);
                }
                else if (this.c1 != this.c2) {
                    this.output.setRGB(i, j, -268431616);
                }
            }
        }
    }
    
    public void convertC1() {
        if (this.c1 > -15080200) {
            this.c1 = -1;
        }
        else {
            this.c1 = -16777216;
        }
    }
    
    public void convertC2() {
        if (this.c2 > -15080200) {
            this.c2 = -1;
        }
        else {
            this.c2 = -16777216;
        }
    }
    
    public static void main(final String[] array) {
        final Decrypt decrypt = new Decrypt();
        decrypt.setVisible(true);
        decrypt.setSize(600, 700);
    }
    
    class Listen implements ActionListener
    {
        Decrypt d1;
        String path1;
        String path2;
        
        public Listen(final Decrypt d1) {
            this.d1 = d1;
        }
        
        @Override
        public void actionPerformed(final ActionEvent actionEvent) {
            if (Decrypt.this.jfc == null) {
                Decrypt.this.jfc = new JFileChooser(System.getProperty("user.home"));
            }
            else {
                Decrypt.this.jfc = new JFileChooser(Decrypt.this.imagePath);
            }
            Decrypt.this.jfc.setFileFilter(Decrypt.this.filter);
            if (actionEvent.getSource() == Decrypt.this.Browse1) {
                final int showOpenDialog = Decrypt.this.jfc.showOpenDialog(this.d1);
                Decrypt.this.jfc.setFileSelectionMode(0);
                if (showOpenDialog == 0) {
                    this.d1.imagePath = Decrypt.this.jfc.getSelectedFile().getAbsolutePath();
                    this.d1.Textarea1.setText(this.d1.imagePath);
                    Decrypt.this.image1 = Toolkit.getDefaultToolkit().getImage(Decrypt.this.imagePath);
                    this.path1 = this.d1.imagePath;
                    Decrypt.this.scaledImage = Decrypt.this.image1.getScaledInstance(this.d1.shr1box.getWidth(), Decrypt.this.shr1box.getHeight(), 4);
                    Decrypt.this.icon = new ImageIcon(Decrypt.this.scaledImage);
                    this.d1.shr1box.setIcon(Decrypt.this.icon);
                    Decrypt.this.flag1 = 1;
                }
            }
            if (actionEvent.getSource() == Decrypt.this.Browse2) {
                final int showOpenDialog2 = Decrypt.this.jfc.showOpenDialog(this.d1);
                Decrypt.this.jfc.setFileSelectionMode(0);
                if (showOpenDialog2 == 0) {
                    this.d1.imagePath = Decrypt.this.jfc.getSelectedFile().getAbsolutePath();
                    this.d1.Textarea2.setText(this.d1.imagePath);
                    Decrypt.this.image2 = Toolkit.getDefaultToolkit().getImage(Decrypt.this.imagePath);
                    this.path2 = this.d1.imagePath;
                    Decrypt.this.scaledImage = Decrypt.this.image2.getScaledInstance(this.d1.shr2box.getWidth(), Decrypt.this.shr2box.getHeight(), 4);
                    Decrypt.this.icon = new ImageIcon(Decrypt.this.scaledImage);
                    this.d1.shr2box.setIcon(Decrypt.this.icon);
                    Decrypt.this.flag2 = 1;
                }
            }
            if (Decrypt.this.flag1 == 1 && Decrypt.this.flag2 == 1) {
                Decrypt.this.stak.setEnabled(true);
            }
            if (actionEvent.getSource() == Decrypt.this.home) {
                final Home home = new Home();
                this.d1.setVisible(false);
                home.setVisible(true);
                home.setSize(660, 500);
            }
            if (actionEvent.getSource() == Decrypt.this.stak) {
                Decrypt.this.shr1box.setVisible(false);
                Decrypt.this.shr2box.setVisible(false);
                Decrypt.this.resultbox.setVisible(true);
                Decrypt.this.info.setVisible(true);
                Decrypt.this.stak.setVisible(false);
                Decrypt.this.seperate.setVisible(true);
                Decrypt.this.uparrow.setVisible(true);
                Decrypt.this.downarrow.setVisible(true);
                try {
                    Decrypt.this.f1 = new File(this.path1);
                    Decrypt.this.b1 = ImageIO.read(Decrypt.this.f1);
                    Decrypt.this.f2 = new File(this.path2);
                    Decrypt.this.b2 = ImageIO.read(Decrypt.this.f2);
                    Decrypt.this.output = new BufferedImage(511, 219, 2);
                    Decrypt.this.stackOperation();
                    Decrypt.this.of = new File("./images/result.jpg");
                    ImageIO.write(Decrypt.this.output, "png", Decrypt.this.of);
                    Decrypt.this.resultbox.setIcon(new ImageIcon(Decrypt.this.output));
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
                JOptionPane.showMessageDialog(this.d1, "Shares Stacked Successfully", "Info", 1);
            }
            if (actionEvent.getSource() == Decrypt.this.seperate) {
                Decrypt.this.seperate.setVisible(false);
                Decrypt.this.stak.setVisible(true);
                Decrypt.this.resultbox.setVisible(false);
                Decrypt.this.shr1box.setVisible(true);
                Decrypt.this.shr2box.setVisible(true);
                Decrypt.this.info.setVisible(false);
            }
        }
    }
}
