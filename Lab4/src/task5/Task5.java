package task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String s = "";
        int sum = 0;
        for(int i = 0; i<str.length(); i++)
        {
            boolean flag1 = Character.isDigit(str.charAt(i));
           // boolean flag2 = Character.isDigit(str.charAt(i+1));
            if (flag1){
                s += str.substring(i,i+1);
            }
            if (flag1 == false)
                sum += Integer.parseInt(s);

        }
        System.out.println(sum);
    }
}
