


public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Z obj = new Z(10, 5);
        System.out.println("Sum: " + obj.finalSum());
        System.out.println("Product: " + obj.findProduct());
        System.out.println("Difference: " + obj.findDifference());
    }
}
