package task1;

import java.util.ArrayList;

public class Task1 {
    public static void execute() throws NullPointerException {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("1332");
        arr.add(null);
        arr.add("dsd");
        arr.add("ref");
        arr.add(null);

        for (String val : arr) {
            try {
                System.out.println(val.hashCode());
            } catch (NullPointerException e) {
                System.out.println("Ошибка!");
            }
        }
    }
}
