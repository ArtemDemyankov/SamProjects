import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
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
                case "4":
                    task4();
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
                    task8("аадш", "крна", "карандаш");
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
    }

    private static void task1() {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] mas = str.split(" ");
        int palindroms = 0;
        for (String word : mas) {
            if (isPalindrome(word)) {
                palindroms++;
            }
        }
        double procent = (double) palindroms / mas.length;

        System.out.println("Kol of palindroms: " + palindroms);
        System.out.println("In procents: " + procent * 100 + "%");
    }

    private static boolean isPalindrome(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }

    private static void task2() {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2 = str.replaceAll(" ", "").toLowerCase();
        if (isPalindrome(str2))
            System.out.println("Palindrom");
        else
            System.out.println("Not palidrom");
    }

    private static void task3() {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int kol = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);
            char c3 = str.charAt(i + 2);
            if (c1 == c2 && c1 == c3 && c2 == c3)
                kol++;
        }
        System.out.println("Kol-vo troek: " + kol);
    }

    private static void task4() {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] mas = str.split(" ");
        for (int i = mas.length - 1; i >= 0; i--)
            System.out.print(mas[i] + " ");
    }

    private static void task5() {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] intArray = str.split("\\D+");
        int[] sumArray = new int[intArray.length];
        String[] sortArray = new String[intArray.length];
        StringBuilder outputString = new StringBuilder();

        for (int i = 0; i < intArray.length; i++) {
            int temp = 0;
            String[] tempArray = intArray[i].split("");
            for (String value : tempArray) {
                temp += Integer.parseInt(value);
            }
            sumArray[i] = temp;
        }

        Arrays.sort(sumArray);

        for (int i = 0; i < intArray.length; i++) {
            int temp = 0;
            int pos;
            String[] tempArray = intArray[i].split("");
            for (String value : tempArray) {
                temp += Integer.parseInt(value);
            }
            pos = Arrays.binarySearch(sumArray, temp);
            sortArray[pos] = intArray[i];
        }

        for (String value : sortArray)
            outputString.append(value + " ");

        System.out.println(outputString.toString());
    }

    private static void task6() {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] intArray = str.split("\\D+");
        int sum = 0;
        for (String value : intArray)
            sum += Integer.parseInt(value);
        System.out.println("Sum of integers: " + sum);
    }

    private static void task7() {
        System.out.println("Input password:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$");
        Matcher m = p.matcher(str);
        if (m.find())
            System.out.println("Password is correct");
        else
            System.out.println("Password is incorrect!");
    }

    private static boolean task8(String evenSymbols, String oddSymbols, String checkString) {
        int i = 0, j = 0, k = 0;
        int evenLength = evenSymbols.length();
        int oddLength = oddSymbols.length();
        int stringLength = checkString.length();
        if (evenLength + oddLength != stringLength) {
            return false;
        }
        while (k < stringLength) {
            if (i < oddLength && oddSymbols.charAt(i) == checkString.charAt(k)) {
                i++;
            } else {
                return false;
            }
            k++;

            //Здесь была ошибка. Нужно чтобы эта проверка стояла в этом месте, чтобы была возможность закончить цикл.
            if (k == stringLength) {
                break;
            }

            if (j < evenLength && evenSymbols.charAt(j) == checkString.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;

        }

        return (j == evenLength && i == oddLength);
    }

    private static void task9() {
        System.out.println("Input telephone number:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Pattern p = Pattern.compile("^(80|\\+?375)(25|29|33|44)\\d{7}$");
        Matcher m = p.matcher(str);
        if (m.find())
            System.out.println("Phone number located in Belarus");
        else
            System.out.println("Phone number not located in Belarus");
    }

    private static void task10() {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Pattern p = Pattern.compile("(<(/?[^>]+)>)");
        Matcher m = p.matcher(str);
        if (m.find()) {
            System.out.println("String contains HTML");
            System.out.println("String without HTML:");
            System.out.println(str.replaceAll("(<(/?[^>]+)>)", ""));
        } else
            System.out.println("String not contains HTML");
    }
}
