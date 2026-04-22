import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawLineSwing extends JFrame {
    int x1, y1, x2, y2;

    public DrawLineSwing() {
        setTitle("Draw Line");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawLine(x1, y1, x2, y2);
            }
        };

        panel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }
        });

        panel.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();
                panel.repaint();
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DrawLineSwing();
    }
}