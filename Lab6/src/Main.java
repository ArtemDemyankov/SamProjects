import task1.Task1;
import task2.Task2;
import task3.Task3;
import task4.Task4;
import task5.Task5;
import task7.Task7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
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
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    task5();
                    break;
                case 7:
                    task7();
                    break;
                default:
                    System.out.println("Ошибка ввода!");
            }
        }
    }

    private static void task7() throws URISyntaxException {
        try {
            Task7.execute();
        } catch (NullPointerException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void task5() {
        try {
            Task5.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task4() {
        try {
            Task4.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task3() {
        try {
            Task3.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task2() {
        try {
            Task2.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task1() {
        Task1.execute();
    }
}
