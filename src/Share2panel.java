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

class Share2panel extends JPanel
{
    Graphics2D g2D;
    Graphics2D obj;
    static int[] ran;
    int a;
    int flag;
    int vinay;
    static int y;
    static int i;
    char[] digit;
    int intdigit;
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
    
    public Share2panel(final char[] array, final int[] ran) {
        this.flag = 0;
        this.vinay = 0;
        this.digit = new char[4];
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
        if (Share2panel.y > 3) {
            Share2panel.y -= 4;
        }
        this.digit[Share2panel.y] = array[Share2panel.y];
        this.repaint();
        ++Share2panel.y;
        Share2panel.ran = ran;
        for (int i = 0; i < 7; ++i) {}
    }
    
    @Override
    public void paint(final Graphics graphics) {
        this.setBackground(Color.black);
        (this.g2D = (Graphics2D)graphics).setBackground(Color.black);
        this.gradient = new GradientPaint(30.0f, 50.0f, Color.white, 100.0f, 100.0f, Color.white, true);
        this.g2D.setPaint(this.gradient);
        switch (this.digit[0]) {
            case '1': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                else {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                else {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle1);
                    this.g2D.fill(this.midRectangle1);
                    break;
                }
                this.g2D.draw(this.midRectangle0);
                this.g2D.fill(this.midRectangle0);
                break;
            }
            case '2': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '3': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '4': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                else {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                else {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '5': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '6': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '7': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                else {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle1);
                    this.g2D.fill(this.midRectangle1);
                    break;
                }
                this.g2D.draw(this.midRectangle0);
                this.g2D.fill(this.midRectangle0);
                break;
            }
            case '8': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '9': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '0': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle1);
                    this.g2D.fill(this.midRectangle1);
                    break;
                }
                this.g2D.draw(this.midRectangle0);
                this.g2D.fill(this.midRectangle0);
                break;
            }
            default: {
                System.out.println("");
                break;
            }
        }
        switch (this.digit[1]) {
            case '1': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                else {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                else {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle1);
                    this.g2D.fill(this.midRectangle1);
                    break;
                }
                this.g2D.draw(this.midRectangle0);
                this.g2D.fill(this.midRectangle0);
                break;
            }
            case '2': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '3': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '4': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                else {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                else {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '5': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '6': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '7': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                else {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle1);
                    this.g2D.fill(this.midRectangle1);
                    break;
                }
                this.g2D.draw(this.midRectangle0);
                this.g2D.fill(this.midRectangle0);
                break;
            }
            case '8': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '9': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '0': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle1);
                    this.g2D.fill(this.midRectangle1);
                    break;
                }
                this.g2D.draw(this.midRectangle0);
                this.g2D.fill(this.midRectangle0);
                break;
            }
            default: {
                System.out.println("");
                break;
            }
        }
        switch (this.digit[2]) {
            case '1': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                else {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                else {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle1);
                    this.g2D.fill(this.midRectangle1);
                    break;
                }
                this.g2D.draw(this.midRectangle0);
                this.g2D.fill(this.midRectangle0);
                break;
            }
            case '2': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '3': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '4': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                else {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                else {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '5': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '6': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '7': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                else {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle1);
                    this.g2D.fill(this.midRectangle1);
                    break;
                }
                this.g2D.draw(this.midRectangle0);
                this.g2D.fill(this.midRectangle0);
                break;
            }
            case '8': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '9': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '0': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle1);
                    this.g2D.fill(this.midRectangle1);
                    break;
                }
                this.g2D.draw(this.midRectangle0);
                this.g2D.fill(this.midRectangle0);
                break;
            }
            default: {
                System.out.println("");
                break;
            }
        }
        switch (this.digit[3]) {
            case '1': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                else {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                else {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle1);
                    this.g2D.fill(this.midRectangle1);
                    break;
                }
                this.g2D.draw(this.midRectangle0);
                this.g2D.fill(this.midRectangle0);
                break;
            }
            case '2': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '3': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '4': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                else {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                else {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '5': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '6': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '7': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                else {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle1);
                    this.g2D.fill(this.midRectangle1);
                    break;
                }
                this.g2D.draw(this.midRectangle0);
                this.g2D.fill(this.midRectangle0);
                break;
            }
            case '8': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '9': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle0);
                    this.g2D.fill(this.midRectangle0);
                    break;
                }
                this.g2D.draw(this.midRectangle1);
                this.g2D.fill(this.midRectangle1);
                break;
            }
            case '0': {
                if (Share2panel.ran[0] == 0) {
                    this.g2D.draw(this.topRectangle0);
                    this.g2D.fill(this.topRectangle0);
                }
                else {
                    this.g2D.draw(this.topRectangle1);
                    this.g2D.fill(this.topRectangle1);
                }
                if (Share2panel.ran[1] == 0) {
                    this.g2D.draw(this.rightTopRectangle0);
                    this.g2D.fill(this.rightTopRectangle0);
                }
                else {
                    this.g2D.draw(this.rightTopRectangle1);
                    this.g2D.fill(this.rightTopRectangle1);
                }
                if (Share2panel.ran[2] == 0) {
                    this.g2D.draw(this.rightBottomRectangle0);
                    this.g2D.fill(this.rightBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.rightBottomRectangle1);
                    this.g2D.fill(this.rightBottomRectangle1);
                }
                if (Share2panel.ran[3] == 0) {
                    this.g2D.draw(this.bottomRectangle0);
                    this.g2D.fill(this.bottomRectangle0);
                }
                else {
                    this.g2D.draw(this.bottomRectangle1);
                    this.g2D.fill(this.bottomRectangle1);
                }
                if (Share2panel.ran[4] == 0) {
                    this.g2D.draw(this.leftBottomRectangle0);
                    this.g2D.fill(this.leftBottomRectangle0);
                }
                else {
                    this.g2D.draw(this.leftBottomRectangle1);
                    this.g2D.fill(this.leftBottomRectangle1);
                }
                if (Share2panel.ran[5] == 0) {
                    this.g2D.draw(this.leftTopRectangle0);
                    this.g2D.fill(this.leftTopRectangle0);
                }
                else {
                    this.g2D.draw(this.leftTopRectangle1);
                    this.g2D.fill(this.leftTopRectangle1);
                }
                if (Share2panel.ran[6] == 0) {
                    this.g2D.draw(this.midRectangle1);
                    this.g2D.fill(this.midRectangle1);
                    break;
                }
                this.g2D.draw(this.midRectangle0);
                this.g2D.fill(this.midRectangle0);
                break;
            }
            default: {
                System.out.println("");
                break;
            }
        }
    }
    
    static {
        Share2panel.ran = new int[7];
        Share2panel.y = 0;
        Share2panel.i = 0;
    }
}
