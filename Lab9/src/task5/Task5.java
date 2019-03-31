package task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Task5 {
    public static void execute() {
        Random random = new Random(5);
        Map<Integer, ArrayList<Integer>> hashMap = new HashMap<>();
        for (Integer j = 0; j < 10; j++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < random.nextInt(10); i++) {
                arrayList.add(random.nextInt(10));
            }
            hashMap.put(j, arrayList);
        }

        for (Integer key : hashMap.keySet()) {
            System.out.print(key + ": ");
            for (Integer value: hashMap.get(key)){
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}
