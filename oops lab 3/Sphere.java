
class Sphere extends Figures {
    double r;

    Sphere(double r) {
        this.r = r;
    }

    
    public void calcArea() {
        a = 4 * pi * r * r;
    }

    public void calcVol() {
        v = (4 * pi * r * r * r) / 3;
    }

    public void dispArea() {
        System.out.println("Sphere Area = " + a);
    }


    public void dispVol() {
        System.out.println("Sphere Volume = " + v);
    }
}
