import java.util.Scanner;

public class DailyDrivingCost
 {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);

        // Input values
        System.out.print("Enter total miles driven per day: ");
        double milesPerDay = input.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = input.nextDouble();

        System.out.print("Enter average fees per day: ");
        double averageFees = input.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = input.nextDouble();

        // Calculations
        double fuelCost = (milesPerDay / milesPerGallon) * costPerGallon;//formula for fuel cost
        double totalDailyCost = fuelCost + averageFees + tolls;// formula for total daily cost

        // Output
        System.out.printf("\nFuel cost per day: %.2f\n", fuelCost);
        System.out.printf("Total daily driving cost: %.2f\n", totalDailyCost);

        input.close();
    }
}
 
    

