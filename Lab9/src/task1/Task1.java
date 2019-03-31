package task1;

import java.util.*;

public class Task1 {
    public static void execute() {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(10) - 5);
        }
        for (Integer value : arrayList
        ) {
            System.out.print(value + " ");
        }

        System.out.println();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.addAll((arrayList.subList(3, 15)));
        for (Integer value : arrayList2
        ) {
            System.out.print(value + " ");
        }

        Set<Integer> set = new HashSet<Integer>();
        for (Integer value : arrayList2
        ) {
            set.add(value);
        }

        System.out.println();
        for (Integer value : set
        ) {
            System.out.print(value + " ");
        }

        System.out.println();
        for (Integer value : set
        ) {
            int k = 0;
            for (Integer val : arrayList2
            ) {
                if (val == value) {
                    k++;
                }
            }
            System.out.println(value + ": " + k);
        }

        Collections.sort(arrayList2);
        for (Integer value : arrayList2
        ) {
            System.out.print(value + " ");
        }

        System.out.println();
        System.out.println("max: " + arrayList2.get(arrayList2.size() - 1));
        System.out.println("min: " + arrayList2.get(0));

        int sum = 0;
        for (Integer value : arrayList2
        ) {
            sum += value;
        }
        System.out.println("sum: " + sum);

        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
        for (Integer value : arrayList
        ) {
            if (value > 0) {
                arrayList3.add(value);
            }
        }

        for (Integer value : arrayList3
        ) {
            System.out.print(value + " ");
        }

        /*int k = 0;
        for (Integer value : arrayList
        ) {
            if (value % 2 != 0) {
                arrayList.remove(k);
            }
            k++;
        }

        System.out.println();
        for (Integer value : arrayList
        ) {
            System.out.print(value + " ");
        }*/
    }
}
