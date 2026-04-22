class Vehicle {
    String brand;
    String model;

    // Constructor of Vehicle
    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Method (can be overridden)
    void maxSpeed() {


    }
}

// Car subclass
class Car extends Vehicle {
    int speed;

    Car(String brand, String model, int speed) {
        super(brand, model);  // calling parent constructor
        this.speed = speed;
    }

    void maxSpeed() {
        System.out.println("Car (" + brand + " " + model + ") Max Speed: " + speed + " km/h");
    }
}

// Bicycle subclass
class Bicycle extends Vehicle {
    int speed;

    Bicycle(String brand, String model, int speed) {
        super(brand, model);
        this.speed = speed;
    }

    void maxSpeed() {
        System.out.println("Bicycle (" + brand + " " + model + ") Max Speed: " + speed + " km/h");
    }
}

// Scooter subclass
class Scooter extends Vehicle {
    int speed;

    Scooter(String brand, String model, int speed) {
        super(brand, model);
        this.speed = speed;
    }

    void maxSpeed() {
        System.out.println("Scooter (" + brand + " " + model + ") Max Speed: " + speed + " km/h");
    }
}

// Main class
public class Mains {
    public static void main(String[] args) {

        Car car = new Car("Honda", "City", 180);
        Bicycle bicycle = new Bicycle("Hero", "Sprint", 40);
        Scooter scooter = new Scooter("TVS", "Jupiter", 90);

        car.maxSpeed();
        bicycle.maxSpeed();
        scooter.maxSpeed();
    }
}