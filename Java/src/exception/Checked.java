package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Checked {
    static void main() {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
