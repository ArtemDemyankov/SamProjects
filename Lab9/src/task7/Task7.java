package task7;

import java.util.List;

public class Task7 {
    public static void doSomethingToAll(List list)
    {
        doSomethingToAll(list, 0);
    }
    private static void doSomethingToAll(List list, int index)
    {
        if (index >= list.size()) return;
        System.out.print(list.get(index) + " ");
        doSomethingToAll(list, index + 1);
    }
}
