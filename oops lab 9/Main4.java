import java.util.Random;

class Player extends Thread {
    int number;

    public void run() {
        Random r = new Random();
        number = r.nextInt(100);
        System.out.println(getName() + " -> " + number);
    }
}

public class Main4 {
    public static void main(String[] args) throws Exception {
        Player p1 = new Player();
        Player p2 = new Player();

        p1.start();
        p2.start();

        p1.join();
        p2.join();

        if (p1.number > p2.number)
            System.out.println("Player1 wins by " + (p1.number - p2.number));
        else
            System.out.println("Player2 wins by " + (p2.number - p1.number));
    }
}