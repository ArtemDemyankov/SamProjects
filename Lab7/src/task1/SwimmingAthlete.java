package task1;

public interface SwimmingAthlete extends Athlete {
    void swim();
    static void availableDistances(){
        System.out.println("static availableDistances() in Athlete");
    };
}
