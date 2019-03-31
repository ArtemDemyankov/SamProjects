package task4;

import java.util.Objects;
import java.util.Set;

public class MyInteger {
    private Integer i;

    public MyInteger(Integer i) {
        this.i = i;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "MyInteger{" +
                "i=" + i +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyInteger myInteger = (MyInteger) o;
        return i == myInteger.i;
    }

    @Override
    public int hashCode() {
        return i;
    }
}
