import java.util.Scanner;

public class CircleApp 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int rad = sc.nextInt();

       // double pi = 3.14159;

        double diameter = 2 * rad;
        double circumference = 2 * Math.PI * rad;
        double area = Math.PI * rad * rad;

        System.out.println("Diameter = " + diameter);
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);
    }
}
