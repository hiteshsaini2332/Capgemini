package iostream.filereading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFile {
    static void main() {
        String source = "file1.txt";
        String destination = "file2.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(source);
            fos = new FileOutputStream(destination);

            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }
            System.out.println("File Copied");
        } catch (IOException e) {
            System.out.println("Source File does not exist");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null)
                    fos.close();

            } catch (IOException e) {
                System.out.println("Error closing files.");
            }
        }
    }
}

