class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running using Runnable");
    }
}

public class Main2 {
    public static void main(String[] args) {
       MyRunnable r1  = new MyRunnable();
        Thread t = new Thread(r1);
        t.start();
    }
}