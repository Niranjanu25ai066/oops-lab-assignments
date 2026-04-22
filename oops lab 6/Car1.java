// Abstract class
abstract class Car {

  
    String company = "Car Company";

    // normal  method
    void showCompany() {
        System.out.println("Company: " + company);
    }

    // Abstract methods
    abstract void avg();   // average mileage cover
    abstract void mode();  // model type
}


class Maruti extends Car {

    void avg() {
        System.out.println("Maruti Average: 20 kmpl");
    }

    void mode() {
        System.out.println("Maruti Model: Swift");
    }
}


class Santro extends Car {

    void avg() {
        System.out.println("Santro Average: 18 kmpl");
    }

    void mode() {
        System.out.println("Santro Model: Sportz");
    }
}


public class Car1 {

    public static void main(String[] args) {

        // abstract class(refer)
        Car c;

        //  Maruti object
        c = new Maruti();
        c.showCompany();
        c.avg();
        c.mode();

        System.out.println();

        //  Santro object
        c = new Santro();
        c.showCompany();
        c.avg();
        c.mode();
    }
}