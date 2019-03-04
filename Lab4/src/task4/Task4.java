package task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] mas = str.split(" ");
        for(int i = mas.length-1; i>=0; i--)
            System.out.print(mas[i]+" ");
    }
}
