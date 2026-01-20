
 
public class Invoice
{
   private String partNumber;
   private String partDescription;
   private int quantity;
   private double price;

   public Invoice(String partNumber,String partDescription,int quantity,double price){
   this.partNumber= partNumber;
   this.partDescription=partDescription;
   this.quantity=(quantity>0)?quantity:0;
   this.price=(price>0)?price:0.0;

}
public void setQuantity(int quantity){
    this.quantity=(quantity>0)?quantity:0;
}
public int getQuantity(){
    return quantity;
}
public void setPrice(double price){
    this.price=(price>0)?price:0;
}
public double getPrice() {
    return price;
}
public double getInvoiceAmount(){
    return quantity*price;
}
}