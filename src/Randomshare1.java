import java.awt.Component;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.6.0
// 

public class Randomshare1 extends JFrame
{
    JLabel Imagelab1;
    JLabel share1lab;
    JLabel Imagelab2;
    JLabel share2lab;
    Share1panel[] panel;
    Share2panel[] panel2;
    ImagePanel background;
    int i;
    int a;
    int[] randomIndex;
    int[] digit;
    String path;
    JFileChooser jfc;
    InitRandom ir;
    
    public Randomshare1(final String s) {
        this.panel = new Share1panel[4];
        this.panel2 = new Share2panel[4];
        this.randomIndex = new int[7];
        this.digit = new int[4];
        this.path = null;
        this.jfc = null;
        this.setLayout(null);
        this.setTitle("Share 1");
        this.jfc = new JFileChooser("C:\\");
        (this.background = new ImagePanel(new ImageIcon("whitebg.jpg").getImage())).setLayout(null);
        this.background.setBounds(1, 1, 2000, 2000);
        this.Imagelab1 = new JLabel("");
        final ImageIcon imageIcon = new ImageIcon("blackbg.jpg");
        this.Imagelab1.setIcon(imageIcon);
        this.share1lab = new JLabel("Share 1: ");
        (this.Imagelab2 = new JLabel("")).setIcon(imageIcon);
        this.Imagelab2.setBounds(50, 250, 500, 300);
        this.share2lab = new JLabel("Share 2: ");
        this.Imagelab1.setBounds(50, 30, 500, 300);
        this.Imagelab2.setBounds(50, 300, 500, 300);
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
        this.share1lab.setBounds(50, 50, 50, 25);
        this.panel[0].setBounds(20, 5, 100, 200);
        this.panel[1].setBounds(140, 5, 100, 200);
        this.panel[2].setBounds(260, 5, 100, 200);
        this.panel[3].setBounds(380, 5, 100, 200);
        this.Imagelab1.add(this.panel[0]);
        this.Imagelab1.add(this.panel[1]);
        this.Imagelab1.add(this.panel[2]);
        this.Imagelab1.add(this.panel[3]);
        this.panel2[0] = new Share2panel(array, this.randomIndex);
        this.panel2[1] = new Share2panel(array, this.randomIndex);
        this.panel2[2] = new Share2panel(array, this.randomIndex);
        this.panel2[3] = new Share2panel(array, this.randomIndex);
        this.share2lab.setBounds(50, 100, 50, 25);
        this.panel2[0].setBounds(20, 5, 100, 200);
        this.panel2[1].setBounds(140, 5, 100, 200);
        this.panel2[2].setBounds(260, 5, 100, 200);
        this.panel2[3].setBounds(380, 5, 100, 200);
        this.Imagelab2.add(this.panel2[0]);
        this.Imagelab2.add(this.panel2[1]);
        this.Imagelab2.add(this.panel2[2]);
        this.Imagelab2.add(this.panel2[3]);
        this.background.add(this.Imagelab1);
        this.background.add(this.share1lab);
        this.background.add(this.Imagelab2);
        this.background.add(this.share2lab);
        this.add(this.background);
    }
    
    public int[] getRan() {
        return this.randomIndex;
    }
    
    public static void main(final String[] array) {
        final Randomshare1 randomshare1 = new Randomshare1("1234");
        randomshare1.setVisible(true);
        randomshare1.setSize(700, 600);
    }
}
