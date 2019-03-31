package task6;

import java.util.Arrays;

public class Task6 {
    public static void execute(){
        int [] rndArr = new int[11];
        rndArr[rndArr.length - 1] = 1;
        rndArr[rndArr.length - 2] = 1;
        for (int i = 0; i < rndArr.length - 2; i++)
            rndArr[i] = 2 + (int) (Math.random() * 20);
        for (int i = rndArr.length - 2; i < rndArr.length; i++){
            int tmp = rndArr[i];
            int rndInd = (int) (Math.random() * i);
            rndArr[i] = rndArr[rndInd];
            rndArr[rndInd] = tmp;
        }
        System.out.println(Arrays.toString(rndArr));
    }
}
