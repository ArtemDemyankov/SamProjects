import java.util.Arrays;
import java.util.Random;
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
                case "5":
                    task5();
                    break;
                case "6":
                    task6();
                    break;
                case "7":
                    task7();
                    break;
                case "8":
                    task8();
                    break;
                case "9":
                    task9();
                    break;
                case "10":
                    task10();
                    break;
                default:
                    System.out.println("Неизвестный параметр");
            }
        }
        //task1();
        //task2();
        //task3();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
        //task10();
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
        int startValue;
        int endValue;
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

    private static void task3() {
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
        }
    }

    private static void task5() {
        int[] mas = new int[4];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 90) + 10;
        }
        System.out.println(Arrays.toString(mas));

        boolean flag = true;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] <= mas[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }

    private static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        char mas[][] = new char[n][n];
        int i, j;

        for (i = 0; i < mas.length / 2 + 1; i++) {
            for (j = 0; j < mas[i].length; j++) {
                if ((j < i) || (j >= (mas[i].length - i)))
                    mas[i][j] = ' ';
                else
                    mas[i][j] = '*';

            }
        }

        for (i = mas.length - 1; i >= mas.length / 2; i--) {
            for (j = 0; j < mas[i].length; j++) {
                if ((j < (mas[i].length - 1 - i)) || (j > i))
                    mas[i][j] = ' ';
                else
                    mas[i][j] = '*';
            }
        }

        for (i = 0; i < mas.length; i++) {
            for (j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j]);
            }
            System.out.println(" ");
        }
    }

    private static void task7() {
        int[] mas = new int[4];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 90) + 10;
        }
        System.out.println(Arrays.toString(mas));

        boolean flag = true;
        int i = 1;
        while (i < mas.length) {
            if (mas[i] <= mas[i - 1]) {
                flag = false;
                break;
            }
            i++;
        }

        if (flag) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }

    private static void task8() {
        int[] mas = new int[4];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (random() * 90) + 10;
        }
        System.out.println(Arrays.toString(mas));

        boolean flag = true;
        int i = 1;
        do {
            if (mas[i] <= mas[i - 1]) {
                flag = false;
                break;
            }
            i++;
        } while (i < mas.length);

        if (flag) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }

    private static void task9() {
        String card[] = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        String suit[] = {"Hearts", "Spades", "Clubs", "Diamonds"};

        int randomCard = (int) (random() * 13);
        int randomSuit = (int) (random() * 4);

        System.out.println("Your card is:");
        System.out.println(card[randomCard] + " of " + suit[randomSuit]);

    }

    private static void task10() {
        String card[] = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        String rank[] = {"Hearts", "Spades", "Clubs", "Diamonds"};

        String allCards[] = new String[52];
        for (int i = 0, k = 0; i < rank.length; i++, k += 13) {
            for (int j = 0; j < card.length; j++) {
                allCards[k + j] = card[j] + " of " + rank[i];
            }
        }

        Random random = new Random();
        for (int i = 0; i < allCards.length; i++) {
            int j = random.nextInt(52);
            String temp = allCards[i];
            allCards[i] = allCards[j];
            allCards[j] = temp;
        }
        for (String s : allCards) {
            System.out.println(s);
        }
    }
}
