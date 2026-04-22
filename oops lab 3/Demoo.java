
import FigPackage.Coness;
import FigPackage.Cylinders;
import FigPackage.Spheres;

public class Demoo {
    public static void main(String[] args) {
      
        Coness cone = new Coness(5, 6, 10);
        cone.calcArea();
        cone.calcVolume();
        cone.dispArea();
        cone.dispVolume();
        System.out.println();

        
        Spheres sphere = new Spheres(7);
        sphere.calcArea();
        sphere.calcVolume();
        sphere.dispArea();
        sphere.dispVolume();
        System.out.println();

       
      Cylinders cylinder = new Cylinders(6, 012);
        cylinder.calcArea();
        cylinder.calcVolume();
        cylinder.dispArea();
        cylinder.dispVolume();
    }
}
