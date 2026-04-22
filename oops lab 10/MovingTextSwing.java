import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MovingTextSwing extends JFrame implements KeyListener {
    String text = "";
    int x = 400;

    public MovingTextSwing() {
        setTitle("Moving Text");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addKeyListener(this);
        setFocusable(true);

        Timer t = new Timer(100, e -> {
            x -= 5;
            if (x < 0) x = getWidth();
            repaint();
        });
        t.start();

        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(text, x, 150);
    }

    public void keyTyped(KeyEvent e) {
        text += e.getKeyChar();
    }

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new MovingTextSwing();
    }
}