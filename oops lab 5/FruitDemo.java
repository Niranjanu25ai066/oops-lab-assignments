import java.util.Scanner;

// Class to represent a fruit
class Fruit {
    // Attributes
    String name;
    String type;  // "Single" or "Bunch"
    double price;

    // Constructor to initializ
    public Fruit(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    // Method to display fruit details
    public void displayFruit() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
        System.out.println("-------------------");
    }
}

public class FruitDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create first fruit object
        System.out.println("Enter details for Fruit 1:");
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Type (Single/Bunch): ");
        String type1 = sc.nextLine();
        System.out.print("Price: ");
        double price1 = sc.nextDouble();
       
        Fruit fruit1 = new Fruit(name1, type1, price1);

        // Create second fruit object
        System.out.println("\nEnter details for Fruit 2:");
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Type (Single/Bunch): ");
        String type2 = sc.nextLine();
        System.out.print("Price: ");
        double price2 = sc.nextDouble();

        Fruit fruit2 = new Fruit(name2, type2, price2);

        // Display fruit details
        System.out.println("\nFruit Details:");
        fruit1.displayFruit();
        fruit2.displayFruit();

        sc.close();
    }
}
