import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length;
        int height;
        char outside;
        char inside;
        Scanner scanner;

        while (true) {
            System.out.print("Введите высоту: ");
            scanner = new Scanner(System.in);
            height = scanner.nextInt();
            if (height <= 0) {
                System.out.println("Неправильный формат ввода, попробуйте еще раз!");
                continue;
            } else
                break;
        }

        while (true) {
            System.out.print("Введите длину: ");
            scanner = new Scanner(System.in);
            length = scanner.nextInt();
            if (length <= 0) {
                System.out.println("Неправильный формат ввода, попробуйте еще раз!");
                continue;
            } else
                break;
        }

        System.out.print("Введите символ контура: ");
        scanner = new Scanner(System.in);
        outside = scanner.next().charAt(0);

        System.out.print("Введите символ заливки: ");
        scanner = new Scanner(System.in);
        inside = scanner.next().charAt(0);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (i > 0 && j > 0 && i < height - 1 && j < length - 1)
                    System.out.print(inside);
                else
                    System.out.print(outside);
            }
            System.out.println();
        }
    }
}
