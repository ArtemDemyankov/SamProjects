package task2;

import java.util.Arrays;

public class Task2 {
    public static String formatMoney(int money){
        char[] firstArray = {'0', '5', '6', '7', '8', '9'};
        char[] secondArray = {'2', '3', '4'};
        String parseMoney = Integer.toString(money);
        char lastIndex = parseMoney.charAt(parseMoney.length()-1);
        for (char symbol : firstArray) {
            if (lastIndex == symbol)
                return parseMoney + " рублей";
        }
        for (char symbol : secondArray) {
            if (lastIndex == symbol)
                return parseMoney + " рубля";
        }
        if (lastIndex == '1') {
            return parseMoney + " рубль";
        }
        else return "Ошибка!";
    }

    public static String isLeapYear (int year){
        if (year < 0)
            return "Ошибка!";
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            return "Год високосный";
        else
            return "Год не високосный";
    }

    public static int[] linearize(int[][] source){
        int size = 0;
        for (int i=0; i<source.length; i++){
            size+=source[i].length;
        }
        int[] ret = Arrays.copyOf(source[0], size);
        int index = source[0].length;
        for (int i=1; i<source.length; i++){
            System.arraycopy(source[i], 0, ret, index,source[i].length);
            index += source[i].length;
        }
        return ret;
    }
}

