import calculator.operations;
import java.util.Scanner;

public class ArithmeticApp 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        operations op = new operations();

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("Sum = " + op.sum(a,b));
        System.out.println("Difference = " + op.difference(a,b));
        System.out.println("Product = " + op.product(a,b));
        System.out.println("Quotient = " + op.quotient(a,b));
    }
}
