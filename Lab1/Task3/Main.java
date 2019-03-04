import java.util.Scanner;

public class Main {

    private static String[] _first;
    private static String[] _second;
    private static String[] _third;

    public static void main(String[] args) {
        _first = new String[]{"cто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        _second = new String[]{"десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        _third = new String[]{"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};

        while (true) {
            System.out.print("Введите число: ");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            try {
                int n = Integer.parseInt(str);

                if (n < 100) {
                    System.out.println("Неправильный формат ввода, попробуйте еще раз!");
                    continue;
                }

                if (str.length() > 3) {
                    System.out.println("Неправильный формат ввода, попробуйте еще раз!");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат ввода, попробуйте еще раз!");
                continue;
            }

            char[] chars = str.toCharArray();

            int i = 0;
            String num = "";

            for (char ch : chars) {
                int n;
                switch (i) {
                    case 0:
                        n = Integer.parseInt(Character.toString(ch)) - 1;
                        if (n >= 0)
                            num += _first[n] + " ";
                        break;
                    case 1:
                        n = Integer.parseInt(Character.toString(ch)) - 1;
                        if (n >= 0)
                            num += _second[n] + " ";
                        break;
                    case 2:
                        n = Integer.parseInt(Character.toString(ch)) - 1;
                        if (n >= 0)
                            num += _third[n] + " ";
                        break;
                }
                i++;
            }
            System.out.println(num);
            break;
        }
    }
}
