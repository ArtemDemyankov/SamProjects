package task1;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] mas = str.split(" ");
        int palindroms = 0;
        for (String word : mas) {
            if (isPalindrome(word)) {
                palindroms++;
            }
        }
        double procent = (double) palindroms / mas.length;

        System.out.println("Kol of palindroms: " + palindroms);
        System.out.println("In procents: " + procent * 100 + "%");
    }

    public static boolean isPalindrome(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
}
