
public class Demo {
    public static void main(String[] args) {
        Figures f;

       
        f = new Cones(5, 6, 10);
        f.calcArea();
        f.calcVol();
        f.dispArea();
        f.dispVol();
        System.out.println();

       
        f = new Sphere(7);
        f.calcArea();
        f.calcVol();
        f.dispArea();
        f.dispVol();
        System.out.println();

        
        f = new Cylinder(4, 8);
        f.calcArea();
        f.calcVol();
        f.dispArea();
        f.dispVol();
    }
}
