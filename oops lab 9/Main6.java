class PrimeThread extends Thread {
    public void run() {
        int count = 0, num = 2;
        while (count < 25) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    boolean isPrime(int n) {
        for (int i = 2; i <= n/2; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}

class FibonacciThread extends Thread {
    public void run() {
        int a = 1, b = 1;
        for (int i = 0; i < 50; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            try { Thread.sleep(100); } catch(Exception e) {}
        }
    }
}

public class Main6 {
    public static void main(String[] args) {
        PrimeThread p = new PrimeThread();
        FibonacciThread f = new FibonacciThread();

        p.setPriority(8);
        f.setPriority(5);

        p.start();
        f.start();
    }
}