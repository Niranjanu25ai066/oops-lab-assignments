class Account {
    int balance = 600;

    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " Balance: " + balance);
        notify();
    }

    synchronized void withdraw(int amount) {
        while (balance < amount) {
            try { wait(); } catch(Exception e) {}
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " Balance: " + balance);
    }
}

class Father extends Thread {
    Account acc;

    Father(Account acc) {
        this.acc = acc;
    }

    public void run() {
        while (true) {
            int amount = (int)(Math.random() * 200) + 1;
            acc.deposit(amount);
            try { Thread.sleep(200); } catch(Exception e) {}
        }
    }
}

class Son extends Thread {
    Account acc;

    Son(Account acc) {
        this.acc = acc;
    }

    public void run() {
        while (true) {
            int amount = (int)(Math.random() * 150) + 1;
            acc.withdraw(amount);
            try { Thread.sleep(300); } catch(Exception e) {}
        }
    }
}

public class Main7 {
    public static void main(String[] args) {
        Account acc = new Account();
        new Father(acc).start();
        new Son(acc).start();
    }
}