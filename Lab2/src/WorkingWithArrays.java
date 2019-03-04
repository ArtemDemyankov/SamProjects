import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class WorkingWithArrays {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("Параметр: " + arg);
        }
        if (args.length > 0) {
            switch (args[0]) {
                case "1":
                    task1();
                    break;
                case "2":
                    task2();
                    break;
                case "3":
                    task3();
                    break;
                default:
                    System.out.println("Неизвестный параметр");
            }
        }
        //task1();
        //task2();
        //task3();
    }

    private static void task1() {
        int array[] = new int[100];
        for (int number = 13, index = 0; index < 100; number++) {
            if (number % 13 == 0 || number % 17 == 0) {
                array[index] = number;
                index++;
            }
        }
        String arrayString = Arrays.toString(array);
        System.out.println(arrayString);
    }

    private static void task2() {
        System.out.print("Введите количество элементов массива: ");
        Scanner scanner = new Scanner(System.in);
        int kol = scanner.nextInt();
        if (kol < 2) {
            System.out.println("Количество должно быть больше 1!");
            return;
        }
        int array[] = new int[kol];
        for (int i = 0; i < kol; i++) {
            array[i] = (int) (random() * 100);
        }
        String arrayString = Arrays.toString(array);
        System.out.println(arrayString);
        int maxPosition = 0;
        int minPosition = 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxPosition = i;
            }
        }
        System.out.println("Максимальный элемент: " + max);
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minPosition = i;
            }
        }
        System.out.println("Минимальный элемент: " + min);
        int startValue = 0;
        int endValue = 0;
        if (minPosition < maxPosition) {
            startValue = minPosition + 1;
            endValue = maxPosition;
        } else {
            startValue = maxPosition + 1;
            endValue = minPosition;
        }
        int sum = 0;
        for (int i = startValue; i < endValue; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов = " + sum);
    }

    private static void task3(){
        while (true) {
            System.out.print("Введите число (0 - выход из программы): ");
            Scanner scanner = new Scanner(System.in);
            int inputValue = scanner.nextInt();
            if (inputValue == 0)
                return;
            int k = 0;
            if (inputValue > 0) {
                for (int l = 1; l <= inputValue; l++) {
                    if (inputValue % l == 0)
                        k += 1;
                }
            } else {
                System.out.println("Число должно быть больше 0!");
                continue;
            }
            if (k >= 1 && k <= 2)
                System.out.println("Число простое");
            else
                System.out.println("Число не простое");
            continue;
        }
    }
}
