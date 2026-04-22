import java.util.Scanner;

public class TotalProfit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of attendees: ");
        int attendees = sc.nextInt();
       //customer pays $5 per ticket.
        double income = 5 * attendees;//formula
       // performance costs the theater $20,
       //  plus $.50 per attendee.
        double cost = 20 + (0.5 * attendees);//formula
        double profit = income - cost;

        System.out.println("Total Profit = $" + profit);

        sc.close();
    }
}