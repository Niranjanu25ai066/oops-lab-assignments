class Cone extends figure{
  double h,s;
  //pi value
  final double pi = 3.142;

    public void calcArea() {
        a = (pi * r * s) + (pi * r * r);
    }

    public void calcVolume() {
        v = (pi * r * r * h) / 3;
    }
}



