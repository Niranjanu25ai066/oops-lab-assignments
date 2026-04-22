import java.util.Scanner;

// parent  class
class Product {

    int productID;
    String name;
    int categoryID;
    double unitPrice;

    // Constructor
    public Product(int productID, String name, int categoryID, double unitPrice) {
        this.productID = productID;
        this.name = name;
        this.categoryID = categoryID;
        this.unitPrice = unitPrice;
    }

    // Display method
    public void displayProduct() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + name);
        System.out.println("Category ID: " + categoryID);
        System.out.println("Unit Price: $" + unitPrice);
    }
}

// Child class
public class ElectricalProduct extends Product {

    String voltageRange;
    int wattage;

  
    public ElectricalProduct(int productID, String name, int categoryID, double unitPrice, String voltageRange, int wattage) {

        super(productID, name, categoryID, unitPrice);
        this.voltageRange = voltageRange;
        this.wattage = wattage;
    }

    // update wattage and price
    public void updateProduct(int newWattage, double newPrice) {
        this.wattage = newWattage;
        this.unitPrice = newPrice;
    }

    // Display full details
    public void displayElectricalProduct() {
        displayProduct();
        System.out.println("Voltage Range: " + voltageRange);
        System.out.println("Wattage: " + wattage + "W");
    }
}

// Main class
  class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input product details
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Category ID: ");
        int categoryID = sc.nextInt();

        System.out.print("Enter Unit Price: ");
        double price = sc.nextDouble();
        sc.nextLine();  // consume newline

        System.out.print("Enter Voltage Range: ");
        String voltage = sc.nextLine();

        System.out.print("Enter Wattage: ");
        int wattage = sc.nextInt();

        // Create ElectricalProduct object
        ElectricalProduct ep = new ElectricalProduct(id, name, categoryID, price, voltage, wattage);

        System.out.println("\nOriginal Product Details:");
        ep.displayElectricalProduct();

        // Update details
        System.out.println("\nEnter new Wattage: ");
        int newWattage = sc.nextInt();

        System.out.println("Enter new Unit Price: ");
        double newPrice = sc.nextDouble();

        ep.updateProduct(newWattage, newPrice);

        System.out.println("\nUpdated Product Details:");
        ep.displayElectricalProduct();

        sc.close();
    }
}
