package task1;

public class JumpingAthleteImpl implements JumpingAthlete {
    @Override
    public void highJump() {
        System.out.println("highJump() in JumpingAthleteImpl");
    }

    @Override
    public void longJump() {
        System.out.println("longJump() in JumpingAthleteImpl");
    }

    @Override
    public void trippleJump() {
        System.out.println("trippleJump() in JumpingAthleteImpl");
    }

    @Override
    public void participate() {
        highJump();
        longJump();
        trippleJump();
    }
}
