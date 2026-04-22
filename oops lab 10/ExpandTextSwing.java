import java.awt.*;
import javax.swing.*;

public class ExpandTextSwing extends JFrame {
    int size = 6;
    boolean grow = true;

    JLabel label;

    public ExpandTextSwing() {
        label = new JLabel("Hello", JLabel.CENTER);
        add(label);

        setTitle("Expanding Text");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        Timer t = new Timer(100, e -> {
            if (grow) {
                size++;
                if (size == 96) grow = false;
            } else {
                size--;
                if (size == 6) grow = true;
            }

            label.setFont(new Font("Arial", Font.BOLD, size));
        });
        t.start();
    }

    public static void main(String[] args) {
        new ExpandTextSwing();
    }
}