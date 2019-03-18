package task5;

public interface LoginSupport {
    default void log(String msg, Object obj){
        System.out.println(msg);
        System.out.println(obj);
    }

    void log();
}
