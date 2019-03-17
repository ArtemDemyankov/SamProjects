package task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2 {
    public static void execute() throws IOException {
        String fileName = "file.txt";
        FileInputStream fis;
        try {
            fis = new FileInputStream(fileName);
            int i = -1;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
