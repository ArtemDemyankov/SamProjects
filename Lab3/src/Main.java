
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static task1.BELARUS.*;
import static task2.Task2.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.print("\nВведите номер задания (0-выход): ");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();
            if (task == 0)
                break;
            switch (task) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                default:
                    System.out.println("Ошибка ввода!");
            }
            continue;
        }
    }

    public static void task1() {
        System.out.println(shortInfo());
        System.out.println();
        System.out.println(fullInfo());
    }

    public static void task2() {
        Scanner scanner;
        System.out.print("Введите число: ");
        scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        System.out.println(formatMoney(money));
        System.out.println();

        System.out.print("Введите год: ");
        scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year));
        System.out.println();

        System.out.print("Введите кол-во строк: ");
        scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.print("Введите кол-во столбцов: ");
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[m][n];
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextInt(10) + 1;
            }
        }
        for (int i = 0; i < a.length; i++, System.out.println()) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println(Arrays.toString(linearize(a)));
    }
}

