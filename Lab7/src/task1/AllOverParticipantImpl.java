package task1;

public class AllOverParticipantImpl implements SwimmingAthlete, JumpingAthlete, TeamPlayer{

    @Override
    public void highJump() {
        System.out.println("highJump() in AllOverParticipantImpl");
    }

    @Override
    public void longJump() {
        System.out.println("longJump() in AllOverParticipantImpl");
    }

    @Override
    public void trippleJump() {
        System.out.println("trippleJump() in AllOverParticipantImpl");
    }

    @Override
    public void swim() {
        System.out.println("swim() in AllOverParticipantImpl");
    }

    @Override
    public void playSpor() {
        System.out.println("playSpor() in AllOverParticipantImpl");
    }

    @Override
    public void participate() {
        swim();
        SwimmingAthlete.availableDistances();
        highJump();
        longJump();
        trippleJump();
        playSpor();
        showStatistics();
    }
}
