package task1;

import java.util.ArrayList;
import java.util.List;

public class Shifrator {
    static List<Pair> pairs = new ArrayList<>();
    static {
        for (int i =0; i<10; i++){
            pairs.add(new Pair<Integer, Character>(i, (char)(i+'a')));
        }
    }

    public static String shifrator(int a){
        StringBuilder str = new StringBuilder();
        char [] chars = String.valueOf(a).toCharArray();
        for(char intValue : chars){
            for (Pair pairValue : pairs){
                if(pairValue.getFirst().toString().equals(String.valueOf(intValue))){
                    str.append(pairValue.getSecond());
                }
            }
        }
        return str.toString();
    }
}
