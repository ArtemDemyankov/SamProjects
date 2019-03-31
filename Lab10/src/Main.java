import task1.FileManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            if (str.equals("exit"))
                return;
            FileManager.execCommand(str);
        }
        /*String[] list = {"one", "two", "three"};
        FileManager.touch("myFile.txt", list);*/
    }
}

