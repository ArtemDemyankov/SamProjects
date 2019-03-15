package task1;

public class SwimmingAthleteImpl implements SwimmingAthlete {

    @Override
    public void swim() {
        System.out.println("swim() in SwimmingAthleteImpl");
    }

    @Override
    public void participate() {
        swim();
        SwimmingAthlete.availableDistances();
    }
}
