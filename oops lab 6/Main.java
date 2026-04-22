class WashingMachine {

    // Method to switch on the machine
    void switchOn() {
        System.out.println("Washing Machine is Switched ON");
    }

    // Method to accept clothes 
    int acceptClothes(int noOfClothes) {
        System.out.println(noOfClothes + " clothes accepted");
        return noOfClothes;
    }

    // Method to accept detergent
    void acceptDetergent() {
        System.out.println("Detergent added");
    }

    // Method to switch off the machine
    void switchOff() {
        System.out.println("Washing Machine is Switched OFF");
    }
}


public class Main {
    public static void main(String[] args) {

        WashingMachine w = new WashingMachine();

        w.switchOn();
        int clothes = w.acceptClothes(5);
        w.acceptDetergent();
        w.switchOff();

        System.out.println("Total clothes washed: " + clothes);
    }
}