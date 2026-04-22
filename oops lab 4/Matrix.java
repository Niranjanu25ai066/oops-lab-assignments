public class Matrix {

    static final int X = 3;
    static final int Y = 5;
    static final int Z = 6;


    

    /* Set value in 3D matrix stored as 1D array */
    static void set(int value, int indexX, int indexY, int indexZ, int[] oneDArray) {
        
         int index = indexX * (Y * Z) + indexY * Z + indexZ;
        oneDArray[index] = value;
    }

    /* Get value from 3D matrix stored as 1D array */
    static int get(int indexX, int indexY, int indexZ, int[] oneDArray) {
        int   index = indexX * (Y * Z) + indexY * Z + indexZ;
        return oneDArray[index];
    }

    public static void main(String[] args) {

        int[] oneDArray = new int[X * Y * Z];

        // Setting values
        set(10, 0, 0, 0, oneDArray);
        set(20, 1, 2, 1, oneDArray);
        set(30, 2, 1, 2, oneDArray);

        // Getting values
        System.out.println("Value at (0,0,0): " + get(0, 0, 0, oneDArray));
        System.out.println("Value at (1,2,1): " + get(1, 2, 1, oneDArray));
        System.out.println("Value at (2,1,2): " + get(2, 1, 2, oneDArray));
    }
}
