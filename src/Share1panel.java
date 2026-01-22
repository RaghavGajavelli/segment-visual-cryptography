import java.awt.Shape;
import java.awt.Paint;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import javax.swing.JPanel;

// 
// Decompiled by Procyon v0.6.0
// 

class Share1panel extends JPanel
{
    Graphics2D g2D;
    int[] ran;
    int a;
    String x;
    ImagePanel background;
    public GradientPaint gradient;
    private Rectangle topRectangle0;
    private Rectangle topRectangle1;
    private Rectangle leftTopRectangle0;
    private Rectangle leftTopRectangle1;
    private Rectangle leftBottomRectangle0;
    private Rectangle leftBottomRectangle1;
    private Rectangle bottomRectangle0;
    private Rectangle bottomRectangle1;
    private Rectangle rightBottomRectangle1;
    private Rectangle rightBottomRectangle0;
    private Rectangle rightTopRectangle1;
    private Rectangle rightTopRectangle0;
    private Rectangle midRectangle0;
    private Rectangle midRectangle1;
    
    Share1panel(final int[] array) {
        this.ran = new int[7];
        this.topRectangle0 = new Rectangle(27, 65, 45, 2);
        this.topRectangle1 = new Rectangle(27, 70, 45, 2);
        this.leftTopRectangle0 = new Rectangle(15, 75, 2, 50);
        this.leftTopRectangle1 = new Rectangle(20, 75, 2, 50);
        this.leftBottomRectangle0 = new Rectangle(15, 139, 2, 50);
        this.leftBottomRectangle1 = new Rectangle(20, 139, 2, 50);
        this.bottomRectangle0 = new Rectangle(27, 195, 45, 2);
        this.bottomRectangle1 = new Rectangle(27, 190, 45, 2);
        this.rightBottomRectangle1 = new Rectangle(77, 139, 2, 50);
        this.rightBottomRectangle0 = new Rectangle(82, 139, 2, 50);
        this.rightTopRectangle1 = new Rectangle(77, 78, 2, 50);
        this.rightTopRectangle0 = new Rectangle(82, 78, 2, 50);
        this.midRectangle0 = new Rectangle(27, 130, 45, 2);
        this.midRectangle1 = new Rectangle(27, 135, 45, 2);
        for (int i = 0; i < 7; ++i) {
            this.ran[i] = array[i];
        }
    }
    
    @Override
    public void paint(final Graphics graphics) {
        this.setBackground(Color.black);
        (this.g2D = (Graphics2D)graphics).setBackground(Color.black);
        this.gradient = new GradientPaint(30.0f, 50.0f, Color.white, 100.0f, 100.0f, Color.white, true);
        this.g2D.setPaint(this.gradient);
        if (this.ran[0] == 0) {
            this.g2D.draw(this.topRectangle0);
            this.g2D.fill(this.topRectangle0);
        }
        else if (this.ran[0] == 1) {
            this.g2D.draw(this.topRectangle1);
            this.g2D.fill(this.topRectangle1);
        }
        if (this.ran[1] == 0) {
            this.g2D.draw(this.rightTopRectangle0);
            this.g2D.fill(this.rightTopRectangle0);
        }
        else if (this.ran[1] == 1) {
            this.g2D.draw(this.rightTopRectangle1);
            this.g2D.fill(this.rightTopRectangle1);
        }
        if (this.ran[2] == 0) {
            this.g2D.draw(this.rightBottomRectangle0);
            this.g2D.fill(this.rightBottomRectangle0);
        }
        else if (this.ran[2] == 1) {
            this.g2D.draw(this.rightBottomRectangle1);
            this.g2D.fill(this.rightBottomRectangle1);
        }
        if (this.ran[3] == 0) {
            this.g2D.draw(this.bottomRectangle0);
            this.g2D.fill(this.bottomRectangle0);
        }
        else if (this.ran[3] == 1) {
            this.g2D.draw(this.bottomRectangle1);
            this.g2D.fill(this.bottomRectangle1);
        }
        if (this.ran[4] == 0) {
            this.g2D.draw(this.leftBottomRectangle0);
            this.g2D.fill(this.leftBottomRectangle0);
        }
        else if (this.ran[4] == 1) {
            this.g2D.draw(this.leftBottomRectangle1);
            this.g2D.fill(this.leftBottomRectangle1);
        }
        if (this.ran[5] == 0) {
            this.g2D.draw(this.leftTopRectangle0);
            this.g2D.fill(this.leftTopRectangle0);
        }
        else if (this.ran[5] == 1) {
            this.g2D.draw(this.leftTopRectangle1);
            this.g2D.fill(this.leftTopRectangle1);
        }
        if (this.ran[6] == 0) {
            this.g2D.draw(this.midRectangle0);
            this.g2D.fill(this.midRectangle0);
        }
        else if (this.ran[6] == 1) {
            this.g2D.draw(this.midRectangle1);
            this.g2D.fill(this.midRectangle1);
        }
    }
}
