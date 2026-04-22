import java.io.*;

public class ReplaceHisWithHer {
    public static void main(String[] args) {
        try {
            // Step 1: Create input file sdj.txt with sample text
            BufferedWriter bwInput = new BufferedWriter(new FileWriter("sdj.txt"));
            bwInput.write("This is his book. His story is interesting. History is fun.");
            bwInput.close();

            System.out.println("Input file 'sdj.txt' created with sample content.");

            // Step 2: Read the content of sdj.txt
            BufferedReader br = new BufferedReader(new FileReader("sdj.txt"));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
            br.close();

            // Step 3: Replace all occurrences of "his" with "her"
            String modifiedContent = content.toString().replaceAll("\\bhis\\b", "her");

            // Step 4: Write the modified content to sdj_modified.txt
            BufferedWriter bwOutput = new BufferedWriter(new FileWriter("sdj_modified.txt"));
            bwOutput.write(modifiedContent);
            bwOutput.close();

            System.out.println("All occurrences of 'his' replaced with 'her'.");
            System.out.println("Modified content saved in 'sdj_modified.txt'.");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}