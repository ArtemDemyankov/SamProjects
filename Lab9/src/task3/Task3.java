package task3;

import java.util.*;

public class Task3 {
    public static void execute(){
        Random random = new Random();
        Integer[]arr = new Integer[100];
        for (int i = 0;i<100; i++){
            arr[i]= random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        Set<Integer> set = new HashSet<>();
        for(int i =0; i<100; i++){
            set.add(arr[i]);
        }

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println(set.size());

    }
}
