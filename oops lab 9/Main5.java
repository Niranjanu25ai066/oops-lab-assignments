class EvalThread extends Thread {
    String expr;

    EvalThread(String expr) {
        this.expr = expr;
    }

    public void run() {
        int a = 5, b = 2, c = 3, d = 4;
        int result = a * b + c / d;
        System.out.println("Result = " + result);
    }
}

public class Main5 {
    public static void main(String[] args) {
        new EvalThread("AB*CD/+").start();
    }
}