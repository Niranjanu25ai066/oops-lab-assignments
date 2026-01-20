import java.util.Scanner;
public class InvoiceTest
{
    public static void main(String[] args) {
        Invoice test=new Invoice("Z55", "coffee", 5, 1000);
        System.out.println("invoice amount="+ test.getInvoiceAmount());
        Scanner sc = new Scanner(System.in);
        int  y=sc.nextInt();
        test.setQuantity(y);
        System.out.println("invoice amount="+test.getInvoiceAmount());
        sc.close();
    }
}
