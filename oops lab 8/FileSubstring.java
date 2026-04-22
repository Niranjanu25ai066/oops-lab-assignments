import java.io.*;

public class FileSubstring {
    public static void main(String[] args) {
        try {
            // Step 1: Create and write to input file
            BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
            bw.write("the dog runs in the park near the river");
            bw.close();

            // Step 2: Read from file
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String text = br.readLine();
            br.close();

            // Step 3: Find first and last occurrence of "the"
            int first = text.indexOf("the");
            int last = text.lastIndexOf("the");

            // Step 4: Process result
            if (first == -1 || last == -1 || first == last) {
                System.out.println("The string 'the' does not occur at least twice.");
            } else {
                String result = text.substring(first + 3, last);

                System.out.println("First occurrence position: " + first);
                System.out.println("Last occurrence position: " + last);
                System.out.println("Substring between them: " + result);

                // Step 5: Write output to file
                BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
                out.write("First occurrence: " + first + "\n");
                out.write("Last occurrence: " + last + "\n");
                out.write("Substring: " + result);
                out.close();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}