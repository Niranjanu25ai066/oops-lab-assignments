
class Cones extends Figures {
    double r, s, h;

    Cones(double r, double s, double h) {
        this.r = r;
        this.s = s;
        this.h = h;
    }

 
    public void calcArea() {
        a = (pi * r * s) + (pi * r * r);
    }

  
    public void calcVol() {
        v = (pi * r * r * h) / 3;
    }

    public void dispArea() {
        System.out.println("Cone Area = " + a);
    }


    public void dispVol() {
        System.out.println("Cone Volume = " + v);
    }
}
