import java.util.Scanner;

public class PasswordCheck{

    static boolean isValidPassword(String pwd) {

        int len = pwd.length();
        if (len < 5 || len > 12)
            return false;

        boolean hasLower = false;
        boolean hasDigit = false;

        // Check characters
        for (int i = 0; i < len; i++) {
            char ch = pwd.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                return false;

            if (!((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')))
                return false;

            if (ch >= 'a' && ch <= 'z')
                hasLower = true;

            if (ch >= '0' && ch <= '9')
                hasDigit = true;
        }

        if (!hasLower || !hasDigit)
            return false;

        // Check immediate repeated patterns
        for (int size = 1; size <= len / 2; size++) {
            for (int i = 0; i + 2 * size <= len; i++) {
                String s1 = pwd.substring(i, i + size);
                String s2 = pwd.substring(i + size, i + 2 * size);
                if (s1.equals(s2))
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pwd = sc.nextLine();

        if (isValidPassword(pwd))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");

        sc.close();
    }
}
