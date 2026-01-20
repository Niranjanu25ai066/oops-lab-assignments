import java.util.Scanner;


public class CreditLimit
{
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("account number");
    int acc=input.nextInt();
    System.out.println("balance at the beginning of the month");
    double bal=input.nextDouble();
    System.out.println("total item charges");
    double charges=input.nextDouble();
    System.out.println("total credit");
    double credit=input.nextDouble();
    System.out.println("enter limit");
    double limit=input.nextDouble();

    double newBal = bal +charges-credit;
    System.out.println("new balance =" +newBal);

    if(newBal>limit)
    {
        System.out.println("credit limit has been exceeded");
    }

     input.close();



    

 }

}