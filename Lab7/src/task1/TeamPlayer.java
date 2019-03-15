package task1;

public interface TeamPlayer extends Athlete {
    void playSpor();
    default void showStatistics(){
        System.out.println("default showStatistics() in TeamPlayer");
    }
}
