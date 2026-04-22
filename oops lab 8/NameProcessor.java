import java.util.Arrays;
import java.util.Scanner;

public class NameProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];

        // Step 1: Read 10 names from console
        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }

        // Step 2: Delete first 3 characters of each name
        for (int i = 0; i < 10; i++) {
            if (names[i].length() > 3) {
                names[i] = names[i].substring(3); // delete first 3 characters
            } else {
                names[i] = ""; // if name has less than 3 letters, make it empty
            }
        }

        // Step 3: Sort names alphabetically
        Arrays.sort(names);

        // Step 4: Print sorted names
        System.out.println("\nNames after deleting first 3 characters and sorting:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}