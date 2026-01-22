import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import javax.swing.JLabel;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.6.0
// 

public class Randomshare2 extends JFrame
{
    int[] ran2;
    Share2panel[] panel2;
    ImagePanel background;
    String a;
    int[] digit;
    JLabel Imagelab;
    JLabel share2lab;
    
    public Randomshare2(final String a, final InitRandom initRandom) {
        this.ran2 = new int[7];
        this.panel2 = new Share2panel[4];
        this.digit = new int[4];
        this.setLayout(null);
        this.setTitle("Share 2");
        (this.background = new ImagePanel(new ImageIcon("whitebg.jpg").getImage())).setLayout(null);
        this.background.setBounds(1, 1, 2000, 2000);
        (this.Imagelab = new JLabel("")).setIcon(new ImageIcon("blackbg.jpg"));
        this.Imagelab.setBounds(50, 250, 500, 300);
        this.share2lab = new JLabel("Share 2: ");
        this.ran2 = initRandom.getRandom();
        this.a = a;
        final char[] array = new char[a.length()];
        for (int i = 0; i < a.length(); ++i) {
            array[i] = a.charAt(i);
        }
        this.panel2[0] = new Share2panel(array, this.ran2);
        this.panel2[1] = new Share2panel(array, this.ran2);
        this.panel2[2] = new Share2panel(array, this.ran2);
        this.panel2[3] = new Share2panel(array, this.ran2);
        this.share2lab.setBounds(50, 50, 50, 25);
        this.panel2[0].setBounds(20, 5, 100, 200);
        this.panel2[1].setBounds(140, 5, 100, 200);
        this.panel2[2].setBounds(260, 5, 100, 200);
        this.panel2[3].setBounds(380, 5, 100, 200);
        this.Imagelab.add(this.panel2[0]);
        this.Imagelab.add(this.panel2[1]);
        this.Imagelab.add(this.panel2[2]);
        this.Imagelab.add(this.panel2[3]);
        this.background.add(this.Imagelab);
        this.background.add(this.share2lab);
        this.add(this.background);
        this.setVisible(true);
        this.setSize(700, 600);
    }
    
    public static void main(final String[] array) {
    }
}
