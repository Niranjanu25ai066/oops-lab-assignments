import java.util.Scanner;

public class Char{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] freq = new int[256]; // ASCII frequency array

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Print characters exceeding n
        System.out.println("Characters with frequency greater than " + n + ":");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > n) {
                System.out.println((char) i + " -> " + freq[i]);
            }
        }

        sc.close();
    }
}
