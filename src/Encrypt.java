import java.awt.Rectangle;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.6.0
// 

public class Encrypt extends JFrame
{
    JLabel name;
    JButton gen_share;
    JButton view_share;
    JButton prev;
    JButton next;
    JButton generate;
    JButton home;
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;
    int a;
    Label l1;
    TextField tdigit;
    Button Show;
    Button Clear;
    Graphics2D g2D;
    GradientPaint gradient;
    Rectangle topRectangle;
    Rectangle topRectangle1;
    Rectangle leftTopRectangle;
    Rectangle leftTopRectangle1;
    Rectangle leftBottomRectangle;
    Rectangle leftBottomRectangle1;
    Rectangle bottomRectangle;
    Rectangle bottomRectangle1;
    Rectangle rightBottomRectangle;
    Rectangle rightBottomRectangle1;
    Rectangle rightTopRectangle;
    Rectangle rightTopRectangle1;
    Rectangle midRectangle;
    Rectangle midRectangle1;
    
    public Encrypt() {
        this.a = 10;
        this.topRectangle = new Rectangle(27, 10, 45, 2);
        this.topRectangle1 = new Rectangle(27, 15, 45, 2);
        this.leftTopRectangle = new Rectangle(15, 18, 2, 50);
        this.leftTopRectangle1 = new Rectangle(20, 18, 2, 50);
        this.leftBottomRectangle = new Rectangle(15, 79, 2, 50);
        this.leftBottomRectangle1 = new Rectangle(20, 79, 2, 50);
        this.bottomRectangle = new Rectangle(27, 135, 45, 2);
        this.bottomRectangle1 = new Rectangle(27, 130, 45, 2);
        this.rightBottomRectangle = new Rectangle(77, 79, 2, 50);
        this.rightBottomRectangle1 = new Rectangle(82, 79, 2, 50);
        this.rightTopRectangle = new Rectangle(77, 18, 2, 50);
        this.rightTopRectangle1 = new Rectangle(82, 18, 2, 50);
        this.midRectangle = new Rectangle(27, 70, 45, 2);
        this.midRectangle1 = new Rectangle(27, 75, 45, 2);
    }
}
