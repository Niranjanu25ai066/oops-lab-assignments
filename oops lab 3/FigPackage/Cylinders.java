
package FigPackage;

public class Cylinders extends Figuress {
    double h;

    public Cylinders(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public void calcArea() {
        a = (2 * pi * r * r) + (2 * pi * r * h);
    }

    @Override
    public void calcVolume() {
        v = pi * r * r * h;
    }

    @Override
    public void dispArea() {
        System.out.println("Cylinder Area = " + a);
    }

    @Override
    public void dispVolume() {
        System.out.println("Cylinder Volume = " + v);
    }
}
