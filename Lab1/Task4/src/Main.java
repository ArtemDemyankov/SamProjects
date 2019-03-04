import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        double deposit;
        double rate;
        while (true) {
            System.out.println("Введите начальный вклад в банке:");
            scanner = new Scanner(System.in);
            deposit = scanner.nextDouble();
            if (deposit <= 0) {
                System.out.println("Неправильный формат ввода, попробуйте еще раз!");
                continue;
            } else
                break;
        }
        while (true) {
            System.out.println("Введите процентную ставку в %:");
            scanner = new Scanner(System.in);
            rate = scanner.nextDouble() / 100;
            if (rate <= 0) {
                System.out.println("Неправильный формат ввода, попробуйте еще раз!");
                continue;
            } else
                break;
        }
        double percent = 1 + rate;
        int count = 0;
        double result = 0;
        while (result <= deposit * 2) {
            double proc = pow(percent, (count + 1));
            result = deposit * proc;
            count++;
        }
        System.out.println("Количество месяцев: " + count);
        System.out.println("Итоговый размер вклада: " + result);
    }
}
