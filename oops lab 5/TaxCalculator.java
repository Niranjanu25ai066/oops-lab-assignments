import java.util.Scanner;

public class TaxCalculator {

    // Constant values
    static final double TAX_RATE = 0.15;   // 15% tax
    static final double HOURLY_RATE = 12.0; // $12 per hour

    // Method to calculate tax from gross pay
    public static double calculateTax(double grossPay) {
        return grossPay * TAX_RATE;
    }

    // Method to calculate net pay from hours worked
    public static double calculateNetPay(double hoursWorked) {
        double grossPay = hoursWorked * HOURLY_RATE;
        double tax = calculateTax(grossPay);
        return grossPay - tax;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of hours worked: ");
        double hours = sc.nextDouble();

        double grossPay = hours * HOURLY_RATE;
        double tax = calculateTax(grossPay);
        double netPay = calculateNetPay(hours);

        System.out.println("\nGross Pay: $" + grossPay);
        System.out.println("Tax (15%): $" + tax);
        System.out.println("Net Pay: $" + netPay);

        sc.close();
    }
}
