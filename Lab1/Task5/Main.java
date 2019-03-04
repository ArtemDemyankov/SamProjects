import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = -1;
        double sum = 0;
        Scanner scanner;
        while (true) {
            System.out.println("Введите число (0-конец ввода): ");
            scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            try {
                double n = Double.parseDouble(str);
                count++;
                sum += n;
                if (n == 0)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат ввода, попробуйте еще раз!");
                continue;
            }
        }
        if (count == 0) {
            System.out.println("Чисел нет!");
            return;
        }
        System.out.println("Количество чисел: " + count);
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Среднее арифметическое: " + sum / count);
    }
}
