import java.util.Scanner;

class Bank {

    // Deposit method
    double deposit(double amount, double balance) {
        return balance + amount;
    }

    // Withdraw method
    double withdraw(double amount, double balance) {
        if (balance >= amount) {
            return balance - amount;
        } else {
            System.out.println("Insufficient Balance!");
            return 0;
        }
    }
}

public class BankSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        balance = b.deposit(depositAmount, balance);
        System.out.println("Balance after deposit: " + balance);

        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();
        balance = b.withdraw(withdrawAmount, balance);
        System.out.println("Balance after withdrawal: " + balance);

        sc.close();
    }
}