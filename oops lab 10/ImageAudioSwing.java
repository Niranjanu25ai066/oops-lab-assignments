import java.io.File;
import javax.sound.sampled.*;
import javax.swing.*;

public class ImageAudioSwing extends JFrame {
    Clip clip;

    public ImageAudioSwing() {
        setTitle("Image + Audio");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel(new ImageIcon("image.jpg"));
        add(label);

        playAudio("audio.wav");

        setVisible(true);
    }

    void playAudio(String fileName) {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(fileName));
            clip = AudioSystem.getClip();
            clip.open(audio);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new ImageAudioSwing();
    }
}