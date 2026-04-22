import java.util.Scanner;

public class PatternInRange {

    static int countPattern(int a, int b, String pattern) {

        int count = 0;

        for (int i = a; i <= b; i++) {
            if (String.valueOf(i).contains(pattern)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter pattern: ");
        String pattern = sc.next();

        int result = countPattern(a, b, pattern);
        System.out.println("Number of times " + pattern +
                " occurred between " + a + " and " + b + ": " + result);

        sc.close();
    }
}
