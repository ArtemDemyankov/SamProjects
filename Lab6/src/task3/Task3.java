package task3;

import java.io.FileInputStream;
import java.io.IOException;

public class Task3 {
    public static void execute() throws IOException{
        String fileName = "file.txt";
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
            int i = -1;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
