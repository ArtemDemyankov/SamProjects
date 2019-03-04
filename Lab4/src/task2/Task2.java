package task2;

import java.util.Scanner;

import static task1.Task1.isPalindrome;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2 = str.replaceAll(" ", "").toLowerCase();
        if (isPalindrome(str2))
            System.out.println("Palindrom");
        else
            System.out.println("Not palidrom");
    }
}
