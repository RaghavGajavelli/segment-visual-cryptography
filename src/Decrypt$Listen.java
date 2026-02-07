import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.image.RenderedImage;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Component;
import javax.swing.filechooser.FileFilter;
import javax.swing.JFileChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 
// Decompiled by Procyon v0.6.0
// 

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
