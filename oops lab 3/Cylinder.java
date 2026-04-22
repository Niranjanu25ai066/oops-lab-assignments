
class Cylinder extends Figures {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }


    public void calcArea() {
        a = (2 * pi * r * r) + (2 * pi * r * h);
    }

    public void calcVol() {
        v = pi * r * r * h;
    }

    public void dispArea() {
        System.out.println("Cylinder Area = " + a);
    }

    public void dispVol() {
        System.out.println("Cylinder Volume = " + v);
    }
}
