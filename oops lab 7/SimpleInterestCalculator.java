import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        int months;
        double time;
        double interest;
        double balance;

        // Input
        System.out.print("Enter principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        rate = sc.nextDouble();

        System.out.print("Enter number of months: ");
        months = sc.nextInt();

        // Convert rate from percentage to decimal
        rate = rate / 100.0;

        // Convert months to years
        time = months / 12.0;

        // Calculate simple interest
        interest = principal * rate * time;

        // Calculate final balance
        balance = principal + interest;

        // Output
        System.out.printf("Total Interest = %.2f\n", interest);
        System.out.printf("Final Balance = %.2f\n", balance);

        sc.close();
    }
}