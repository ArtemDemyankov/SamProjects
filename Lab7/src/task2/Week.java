package task2;

public enum Week {
    MONDAY("MON"),
    TUESDAY("TUE"),
    WEDNESDAY("WED"),
    THURSDAY("THU"),
    FRIDAY("FRI"),
    SATURDAY("SAT"),
    SUNDAY("SUN");

    private final String abbreviation;

    Week(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation(){
       return abbreviation;
    }

    public String getText(){
        return this.name();
    }

    public boolean isWeekend(){
        if(this == SATURDAY || this == SUNDAY) {
            return true;
        } else
            return false;
    }
}
