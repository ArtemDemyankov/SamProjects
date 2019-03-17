package task5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void execute() throws IOException {
        try (FileInputStream fstream = new FileInputStream("file.txt")) {
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
