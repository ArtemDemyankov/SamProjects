package task5;

public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    public Time(int seconds) {
        this.hours = seconds / 3600;
        this.minutes = (seconds - this.hours * 3600) / 60;
        this.seconds = seconds - this.hours * 3600 - this.minutes * 60;
    }

    public Time(int hours, int minutes, int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int allSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public void showTime() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
