import java.awt.*;
import javax.swing.*;

public class FontStylesSwing extends JFrame {

    public FontStylesSwing() {
        setTitle("Font Styles");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(3,1));

        JLabel l1 = new JLabel("Your Name", JLabel.CENTER);
        l1.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel l2 = new JLabel("Your Name", JLabel.CENTER);
        l2.setFont(new Font("SansSerif", Font.BOLD, 30));

        JLabel l3 = new JLabel("Your Name", JLabel.CENTER);
        l3.setFont(new Font("Monospaced", Font.ITALIC, 40));

        add(l1);
        add(l2);
        add(l3);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FontStylesSwing();
    }
}