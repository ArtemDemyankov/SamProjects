import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner;
        while (true) {
            System.out.print("Введите число A: ");
            scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            try {
                a = Integer.parseInt(str);
                if (a <= 0) {
                    System.out.println("Неправильный формат ввода, попробуйте еще раз!");
                    continue;
                } else
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат ввода, попробуйте еще раз!");
                continue;
            }
        }
        while (true) {
            System.out.print("Введите число B: ");
            scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            try {
                b = Integer.parseInt(str);
                if (b <= 0) {
                    System.out.println("Неправильный формат ввода, попробуйте еще раз!");
                    continue;
                }
                if (b <= a) {
                    System.out.println("B должно быть больше A!");
                    continue;
                } else
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат ввода, попробуйте еще раз!");
                continue;
            }
        }

        for (int i = a; i <= b; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

