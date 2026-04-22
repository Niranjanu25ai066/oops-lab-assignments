import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read a line of text
        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();

        // Step 2: Split the line into words
        String[] words = line.split("\\s+"); // split by spaces

        // Step 3: Capitalize first character of each word
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0))) // uppercase first letter
                      .append(word.substring(1)) // rest of the word
                      .append(" "); // add space
            }
        }

        // Step 4: Print the resulting string
        System.out.println("Resulting string: " + result.toString().trim());

        sc.close();
    }
}