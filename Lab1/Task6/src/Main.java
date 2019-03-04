import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        while (true) {
            System.out.println("Введите шестизначное число: ");
            scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            try {
                double n = Integer.parseInt(str);

                if (n < 100000 || n > 999999) {
                    System.out.println("Неправильный формат ввода, попробуйте еще раз!");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат ввода, попробуйте еще раз!");
                continue;
            }
            char[] ch = str.toCharArray();
            int leftNumber = 0;
            int rightNumber = 0;

            for (int i = 0; i<6; i++){
                if (i<3)
                    leftNumber += Integer.parseInt(Character.toString(ch[i]));
                else
                    rightNumber += Integer.parseInt(Character.toString(ch[i]));
            }
            if (leftNumber == rightNumber)
                System.out.println("У вас счастливый билет: " + leftNumber +" = " + rightNumber);
            else
                System.out.println("У вас не счастливый билет: " + leftNumber +" != " + rightNumber);
            break;
        }
    }
}
