import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClockSwing extends JFrame {
    JLabel label;

    public DigitalClockSwing() {
        label = new JLabel();
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setHorizontalAlignment(JLabel.CENTER);

        add(label);
        setTitle("Digital Clock");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        Timer t = new Timer(1000, e -> {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            label.setText(sdf.format(new Date()));
        });
        t.start();
    }

    public static void main(String[] args) {
        new DigitalClockSwing();
    }
}