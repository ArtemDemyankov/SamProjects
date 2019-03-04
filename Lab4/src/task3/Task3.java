package task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int kol = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);
            char c3 = str.charAt(i + 2);
            if (c1 == c2 && c1 == c3 && c2 == c3)
                kol++;
        }
        System.out.println("Kol-vo troek: " + kol);
    }
}
