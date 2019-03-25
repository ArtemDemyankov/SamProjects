package task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompanyList<T extends Company> implements Iterator<T> {
    private List<T> list;
    private int current;

    public CompanyList() {
        this.list = new ArrayList<>();
        current = 0;
    }

    public void addNewElement(T elem) {
        list.add(elem);
    }

    @Override
    public boolean hasNext() {
        return current < list.size();
    }

    @Override
    public T next() {
        T result = list.get(current);
        if (!hasNext()) throw new IndexOutOfBoundsException("End of list.");
        current++;
        return result;
    }
}
