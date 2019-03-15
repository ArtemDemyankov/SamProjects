package task1;

public class TeamPlayerImpl implements TeamPlayer{
    @Override
    public void playSpor() {
        System.out.println("playSpor() in TeamPlayerImpl");
    }

    @Override
    public void participate() {
        playSpor();
        showStatistics();
    }
}
