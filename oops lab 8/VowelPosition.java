import java.util.Scanner;

public class VowelPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read a line of text
        System.out.print("Enter a line of text: ");
        String text = sc.nextLine();

        // Convert to lowercase for easy comparison
        text = text.toLowerCase();

        System.out.println("Vowels and their positions:");

        // Loop through each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " at position " + i);
            }
        }

        sc.close();
    }
}