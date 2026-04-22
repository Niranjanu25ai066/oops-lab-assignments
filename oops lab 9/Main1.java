class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running using Thread class");
    }
}

public class Main1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}