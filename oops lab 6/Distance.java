import java.util.Scanner;

class Point3D {
  
    int x, y, z;

    // Constructor for origin 
    Point3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    // Constructor for arbitrary point
    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // input coordinates
    void inputCoordinates() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        y = sc.nextInt();
        System.out.print("Enter z coordinate: ");
        z = sc.nextInt();
       
    }

    // Method to output coordinates
    void displayCoordinates() {
        System.out.println("Point coordinates: (" + x + ", " + y + ", " + z + ")");
    }

    //distance
    double distances(Point3D p) {
        int dx = x - p.x;
        int dy = y - p.y;
        int dz = z - p.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);//formula for distance  
    }
}


public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating point using default constructor
        Point3D p1 = new Point3D();
        System.out.println("Enter coordinates for point 1:");
        p1.inputCoordinates();

        // Creating point using parameterized constructor
        System.out.println("Enter coordinates for point 2:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        Point3D p2 = new Point3D(x, y, z);

        // Display points
        p1.displayCoordinates();
        p2.displayCoordinates();

        // Compute distance
        double dist = p1.distances(p2);
        System.out.println("Distance between points: " + dist);

        sc.close();
    }
}