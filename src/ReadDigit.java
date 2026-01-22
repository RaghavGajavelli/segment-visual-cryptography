import java.awt.event.ActionEvent;
import java.awt.Paint;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.LayoutManager;
import java.awt.Shape;
import java.awt.Rectangle;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.6.0
// 

public class ReadDigit extends JFrame
{
    static int a;
    JLabel l1;
    JTextField tdigit;
    JButton Show;
    JButton Clear;
    JPanel p1;
    Graphics2D g2D;
    public GradientPaint gradient;
    private Rectangle topRectangle;
    private Rectangle topRectangle1;
    private Rectangle leftTopRectangle;
    private Rectangle leftTopRectangle1;
    private Rectangle leftBottomRectangle;
    private Rectangle leftBottomRectangle1;
    private Rectangle bottomRectangle;
    private Rectangle bottomRectangle1;
    private Rectangle rightBottomRectangle;
    private Rectangle rightBottomRectangle1;
    private Rectangle rightTopRectangle;
    private Rectangle rightTopRectangle1;
    private Rectangle midRectangle;
    private Rectangle midRectangle1;
    
    void displayzero(final Graphics2D graphics2D) {
        graphics2D.draw(this.topRectangle);
        graphics2D.draw(this.topRectangle1);
        graphics2D.draw(this.leftTopRectangle);
        graphics2D.draw(this.leftTopRectangle1);
        graphics2D.draw(this.leftBottomRectangle);
        graphics2D.draw(this.leftBottomRectangle1);
        graphics2D.draw(this.bottomRectangle);
        graphics2D.draw(this.bottomRectangle1);
        graphics2D.draw(this.rightTopRectangle);
        graphics2D.draw(this.rightTopRectangle1);
        graphics2D.draw(this.rightBottomRectangle);
        graphics2D.draw(this.rightBottomRectangle1);
    }
    
    void displayone(final Graphics2D graphics2D) {
        graphics2D.draw(this.rightTopRectangle);
        graphics2D.draw(this.rightTopRectangle1);
        graphics2D.draw(this.rightBottomRectangle);
        graphics2D.draw(this.rightBottomRectangle1);
    }
    
    void displaytwo(final Graphics2D graphics2D) {
        graphics2D.draw(this.topRectangle);
        graphics2D.draw(this.topRectangle1);
        graphics2D.draw(this.midRectangle);
        graphics2D.draw(this.midRectangle1);
        graphics2D.draw(this.leftBottomRectangle);
        graphics2D.draw(this.leftBottomRectangle1);
        graphics2D.draw(this.bottomRectangle);
        graphics2D.draw(this.bottomRectangle1);
        graphics2D.draw(this.rightTopRectangle);
        graphics2D.draw(this.rightTopRectangle1);
    }
    
    void displaythree(final Graphics2D graphics2D) {
        graphics2D.draw(this.topRectangle);
        graphics2D.draw(this.topRectangle1);
        graphics2D.draw(this.midRectangle);
        graphics2D.draw(this.midRectangle1);
        graphics2D.draw(this.bottomRectangle);
        graphics2D.draw(this.bottomRectangle1);
        graphics2D.draw(this.rightTopRectangle);
        graphics2D.draw(this.rightTopRectangle1);
        graphics2D.draw(this.rightBottomRectangle);
        graphics2D.draw(this.rightBottomRectangle1);
    }
    
    void displayfour(final Graphics2D graphics2D) {
        graphics2D.draw(this.leftTopRectangle);
        graphics2D.draw(this.leftTopRectangle1);
        graphics2D.draw(this.midRectangle);
        graphics2D.draw(this.midRectangle1);
        graphics2D.draw(this.rightTopRectangle);
        graphics2D.draw(this.rightTopRectangle1);
        graphics2D.draw(this.rightBottomRectangle);
        graphics2D.draw(this.rightBottomRectangle1);
    }
    
    void displayfive(final Graphics2D graphics2D) {
        graphics2D.draw(this.topRectangle);
        graphics2D.draw(this.topRectangle1);
        graphics2D.draw(this.leftTopRectangle);
        graphics2D.draw(this.leftTopRectangle1);
        graphics2D.draw(this.midRectangle);
        graphics2D.draw(this.midRectangle1);
        graphics2D.draw(this.bottomRectangle);
        graphics2D.draw(this.bottomRectangle1);
        graphics2D.draw(this.rightBottomRectangle);
        graphics2D.draw(this.rightBottomRectangle1);
    }
    
    void displaysix(final Graphics2D graphics2D) {
        graphics2D.draw(this.topRectangle);
        graphics2D.draw(this.topRectangle1);
        graphics2D.draw(this.leftTopRectangle);
        graphics2D.draw(this.leftTopRectangle1);
        graphics2D.draw(this.midRectangle);
        graphics2D.draw(this.midRectangle1);
        graphics2D.draw(this.leftBottomRectangle);
        graphics2D.draw(this.leftBottomRectangle1);
        graphics2D.draw(this.bottomRectangle);
        graphics2D.draw(this.bottomRectangle1);
        graphics2D.draw(this.rightBottomRectangle);
        graphics2D.draw(this.rightBottomRectangle1);
    }
    
    void displayseven(final Graphics2D graphics2D) {
        graphics2D.draw(this.topRectangle);
        graphics2D.draw(this.topRectangle1);
        graphics2D.draw(this.rightTopRectangle);
        graphics2D.draw(this.rightTopRectangle1);
        graphics2D.draw(this.rightBottomRectangle);
        graphics2D.draw(this.rightBottomRectangle1);
    }
    
    void displayeight(final Graphics2D graphics2D) {
        graphics2D.draw(this.topRectangle);
        graphics2D.draw(this.topRectangle1);
        graphics2D.draw(this.leftTopRectangle);
        graphics2D.draw(this.leftTopRectangle1);
        graphics2D.draw(this.midRectangle);
        graphics2D.draw(this.midRectangle1);
        graphics2D.draw(this.leftBottomRectangle);
        graphics2D.draw(this.leftBottomRectangle1);
        graphics2D.draw(this.bottomRectangle);
        graphics2D.draw(this.bottomRectangle1);
        graphics2D.draw(this.rightTopRectangle);
        graphics2D.draw(this.rightTopRectangle1);
        graphics2D.draw(this.rightBottomRectangle);
        graphics2D.draw(this.rightBottomRectangle1);
    }
    
    void displaynine(final Graphics2D graphics2D) {
        graphics2D.draw(this.topRectangle);
        graphics2D.draw(this.topRectangle1);
        graphics2D.draw(this.leftTopRectangle);
        graphics2D.draw(this.leftTopRectangle1);
        graphics2D.draw(this.midRectangle);
        graphics2D.draw(this.midRectangle1);
        graphics2D.draw(this.bottomRectangle);
        graphics2D.draw(this.bottomRectangle1);
        graphics2D.draw(this.rightTopRectangle);
        graphics2D.draw(this.rightTopRectangle1);
        graphics2D.draw(this.rightBottomRectangle);
        graphics2D.draw(this.rightBottomRectangle1);
    }
    
    void fillzero(final Graphics2D graphics2D) {
        graphics2D.fill(this.topRectangle);
        graphics2D.fill(this.topRectangle1);
        graphics2D.fill(this.leftTopRectangle);
        graphics2D.fill(this.leftTopRectangle1);
        graphics2D.fill(this.leftBottomRectangle);
        graphics2D.fill(this.leftBottomRectangle1);
        graphics2D.fill(this.bottomRectangle);
        graphics2D.fill(this.bottomRectangle1);
        graphics2D.fill(this.rightTopRectangle);
        graphics2D.fill(this.rightTopRectangle1);
        graphics2D.fill(this.rightBottomRectangle);
        graphics2D.fill(this.rightBottomRectangle1);
    }
    
    void fillone(final Graphics2D graphics2D) {
        graphics2D.fill(this.rightBottomRectangle);
        graphics2D.fill(this.rightBottomRectangle1);
        graphics2D.fill(this.rightTopRectangle);
        graphics2D.fill(this.rightTopRectangle1);
    }
    
    void filltwo(final Graphics2D graphics2D) {
        graphics2D.fill(this.topRectangle);
        graphics2D.fill(this.topRectangle1);
        graphics2D.fill(this.midRectangle);
        graphics2D.fill(this.midRectangle1);
        graphics2D.fill(this.leftBottomRectangle);
        graphics2D.fill(this.leftBottomRectangle1);
        graphics2D.fill(this.bottomRectangle);
        graphics2D.fill(this.bottomRectangle1);
        graphics2D.fill(this.rightTopRectangle);
        graphics2D.fill(this.rightTopRectangle1);
    }
    
    void fillthree(final Graphics2D graphics2D) {
        graphics2D.fill(this.topRectangle);
        graphics2D.fill(this.topRectangle1);
        graphics2D.fill(this.midRectangle);
        graphics2D.fill(this.midRectangle1);
        graphics2D.fill(this.bottomRectangle);
        graphics2D.fill(this.bottomRectangle1);
        graphics2D.fill(this.rightTopRectangle);
        graphics2D.fill(this.rightTopRectangle1);
        graphics2D.fill(this.rightBottomRectangle);
        graphics2D.fill(this.rightBottomRectangle1);
    }
    
    void fillfour(final Graphics2D graphics2D) {
        graphics2D.fill(this.leftTopRectangle);
        graphics2D.fill(this.leftTopRectangle1);
        graphics2D.fill(this.midRectangle);
        graphics2D.fill(this.midRectangle1);
        graphics2D.fill(this.rightTopRectangle);
        graphics2D.fill(this.rightTopRectangle1);
        graphics2D.fill(this.rightBottomRectangle);
        graphics2D.fill(this.rightBottomRectangle1);
    }
    
    void fillfive(final Graphics2D graphics2D) {
        graphics2D.fill(this.topRectangle);
        graphics2D.fill(this.topRectangle1);
        graphics2D.fill(this.leftTopRectangle);
        graphics2D.fill(this.leftTopRectangle1);
        graphics2D.fill(this.midRectangle);
        graphics2D.fill(this.midRectangle1);
        graphics2D.fill(this.bottomRectangle);
        graphics2D.fill(this.bottomRectangle1);
        graphics2D.fill(this.rightBottomRectangle);
        graphics2D.fill(this.rightBottomRectangle1);
    }
    
    void fillsix(final Graphics2D graphics2D) {
        graphics2D.fill(this.topRectangle);
        graphics2D.fill(this.topRectangle1);
        graphics2D.fill(this.leftTopRectangle);
        graphics2D.fill(this.leftTopRectangle1);
        graphics2D.fill(this.midRectangle);
        graphics2D.fill(this.midRectangle1);
        graphics2D.fill(this.leftBottomRectangle);
        graphics2D.fill(this.leftBottomRectangle1);
        graphics2D.fill(this.bottomRectangle);
        graphics2D.fill(this.bottomRectangle1);
        graphics2D.fill(this.rightBottomRectangle);
        graphics2D.fill(this.rightBottomRectangle1);
    }
    
    void fillseven(final Graphics2D graphics2D) {
        graphics2D.fill(this.topRectangle);
        graphics2D.fill(this.topRectangle1);
        graphics2D.fill(this.rightTopRectangle);
        graphics2D.fill(this.rightTopRectangle1);
        graphics2D.fill(this.rightBottomRectangle);
        graphics2D.fill(this.rightBottomRectangle1);
    }
    
    void filleight(final Graphics2D graphics2D) {
        graphics2D.fill(this.topRectangle);
        graphics2D.fill(this.topRectangle1);
        graphics2D.fill(this.leftTopRectangle);
        graphics2D.fill(this.leftTopRectangle1);
        graphics2D.fill(this.midRectangle);
        graphics2D.fill(this.midRectangle1);
        graphics2D.fill(this.leftBottomRectangle);
        graphics2D.fill(this.leftBottomRectangle1);
        graphics2D.fill(this.bottomRectangle);
        graphics2D.fill(this.bottomRectangle1);
        graphics2D.fill(this.rightTopRectangle);
        graphics2D.fill(this.rightTopRectangle1);
        graphics2D.fill(this.rightBottomRectangle);
        graphics2D.fill(this.rightBottomRectangle1);
    }
    
    void fillnine(final Graphics2D graphics2D) {
        graphics2D.fill(this.topRectangle);
        graphics2D.fill(this.topRectangle1);
        graphics2D.fill(this.leftTopRectangle);
        graphics2D.fill(this.leftTopRectangle1);
        graphics2D.fill(this.midRectangle);
        graphics2D.fill(this.midRectangle1);
        graphics2D.fill(this.bottomRectangle);
        graphics2D.fill(this.bottomRectangle1);
        graphics2D.fill(this.rightTopRectangle);
        graphics2D.fill(this.rightTopRectangle1);
        graphics2D.fill(this.rightBottomRectangle);
        graphics2D.fill(this.rightBottomRectangle1);
    }
    
    public ReadDigit() {
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
        this.setLayout(null);
        this.l1 = new JLabel("Enter The Digit : ");
        this.tdigit = new JTextField();
        this.Show = new JButton("Show");
        this.Clear = new JButton("Clear");
        (this.p1 = new JPanel()).setBounds(20, 60, 100, 150);
        this.l1.setBounds(100, 200, 100, 25);
        this.tdigit.setBounds(225, 200, 100, 25);
        this.Show.setBounds(100, 250, 100, 25);
        this.Clear.setBounds(225, 250, 100, 25);
        final Listen listen = new Listen();
        this.Show.addActionListener(listen);
        this.Clear.addActionListener(listen);
        this.add(this.l1);
        this.add(this.tdigit);
        this.add(this.Show);
        this.add(this.Clear);
        this.add(this.p1);
    }
    
    @Override
    public void paint(final Graphics graphics) {
        this.setBackground(Color.black);
        (this.g2D = (Graphics2D)graphics).setBackground(Color.black);
        this.gradient = new GradientPaint(30.0f, 50.0f, Color.white, 100.0f, 100.0f, Color.white, true);
        this.g2D.setPaint(this.gradient);
        this.g2D.setPaint(this.gradient);
        if (ReadDigit.a != 10) {
            if (ReadDigit.a == 0) {
                this.displayzero(this.g2D);
                this.fillzero(this.g2D);
            }
            else if (ReadDigit.a == 1) {
                this.repaint();
                this.displayone(this.g2D);
                this.fillone(this.g2D);
            }
            else if (ReadDigit.a == 2) {
                this.displaytwo(this.g2D);
                this.filltwo(this.g2D);
            }
            else if (ReadDigit.a == 3) {
                this.displaythree(this.g2D);
                this.fillthree(this.g2D);
            }
            else if (ReadDigit.a == 4) {
                this.displayfour(this.g2D);
                this.fillfour(this.g2D);
            }
            else if (ReadDigit.a == 5) {
                this.displayfive(this.g2D);
                this.fillfive(this.g2D);
            }
            else if (ReadDigit.a == 6) {
                this.displaysix(this.g2D);
                this.fillsix(this.g2D);
            }
            else if (ReadDigit.a == 7) {
                this.displayseven(this.g2D);
                this.fillseven(this.g2D);
            }
            else if (ReadDigit.a == 8) {
                this.displayeight(this.g2D);
                this.filleight(this.g2D);
                this.repaint();
            }
            else if (ReadDigit.a == 9) {
                this.displaynine(this.g2D);
                this.fillnine(this.g2D);
            }
        }
    }
    
    public static void main(final String[] array) {
        final ReadDigit readDigit = new ReadDigit();
        readDigit.setVisible(true);
        readDigit.setSize(2000, 1000);
    }
    
    static {
        ReadDigit.a = 10;
    }
    
    class Listen implements ActionListener
    {
        @Override
        public void actionPerformed(final ActionEvent actionEvent) {
            try {
                if (actionEvent.getSource() == ReadDigit.this.Show) {
                    ReadDigit.a = Integer.parseInt(ReadDigit.this.tdigit.getText());
                    ReadDigit.this.repaint();
                }
                if (actionEvent.getSource() == ReadDigit.this.Clear) {
                    ReadDigit.this.tdigit.setText("");
                }
            }
            catch (final NumberFormatException ex) {
                System.out.println("Please Check The Number Format");
            }
            catch (final Exception ex2) {
                ex2.printStackTrace();
            }
        }
    }
}
