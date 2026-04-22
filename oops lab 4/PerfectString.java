import java.util.Scanner;

public class PerfectString {

    static boolean isPerfect(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        if (isPerfect(str))
            System.out.println("Perfect String");
        else
            System.out.println("Not a Perfect String");

        sc.close();
    }
}
