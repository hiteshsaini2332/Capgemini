package iostream.upperandlower;

import java.io.*;

public class UpperToLowerCase {

    public static void main(String[] args) {

        String sourceFile = "file1.txt";
        String destinationFile = "file2.txt";

        // Try-with-resources ensures proper closing of streams
        try (
                FileReader fr = new FileReader(sourceFile);
                BufferedReader br = new BufferedReader(fr);

                FileWriter fw = new FileWriter(destinationFile);
                BufferedWriter bw = new BufferedWriter(fw);
        ) {

            int ch;
            while ((ch = br.read()) != -1) {
                char character = (char) ch;

                // Convert uppercase to lowercase
                if (Character.isUpperCase(character)) {
                    character = Character.toLowerCase(character);
                }

                bw.write(character);
            }

            System.out.println("File converted successfully.");

        } catch (IOException e) {
            System.out.println("Error reading or writing the file.");
        }
    }
}

