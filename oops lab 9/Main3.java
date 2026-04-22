class SinThread extends Thread {
    double x;

    SinThread(double x) {
        this.x = x;
    }

    public void run() {
        double result = 0;
        int sign = 1;
        for (int i = 1; i <= 10; i += 2) {
            double term = Math.pow(x, i) / fact(i);
            result += sign * term;
            sign *= -1;
        }
        System.out.println("sin(x) = " + result);
    }

    double fact(int n) {
        double f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }
}

class CosThread extends Thread {
    double x;

    CosThread(double x) {
        this.x = x;
    }

    public void run() {
        double result = 0;
        int sign = 1;
        for (int i = 0; i <= 10; i += 2) {
            double term = Math.pow(x, i) / fact(i);
            result += sign * term;
            sign *= -1;
        }
        System.out.println("cos(x) = " + result);
    }

    double fact(int n) {
        double f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }
}

public class Main3 {
    public static void main(String[] args) {
        double x = Math.PI / 4;

        new SinThread(x).start();
        new CosThread(x).start();
    }
}