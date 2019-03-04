package task1;

public final class BELARUS {
    public static final String FOUNDING_DATE = "19.09.1991";
    public static final String CAPITAL = "Minsk";
    public static final String CURRENCY = "BYN";

    private BELARUS() {
    }

    public static final class LANGUAGES {
        public static final String BY = "Belorussian";
        public static final String RUS = "Russian";

        private LANGUAGES() {
        }
    }

    public static final class DISTRICS {
        public static final String GRODNO = "Grodno";
        public static final String GOMEL = "Gomel";
        public static final String BREST = "Brest";
        public static final String MOGILEV = "Mogilev";
        public static final String MINSK = "Minsk";
        public static final String VITEBSK = "Vitebsk";

        private DISTRICS() {
        }
    }

    public static final class NEIGHBORS {
        public static final String LITHUANIA = "Lithuania";
        public static final String LATVIA = "Latvia";
        public static final String RUSSIA = "Russia";
        public static final String UKRAINE = "Ukraine";
        public static final String POLAND = "Poland";

        private NEIGHBORS() {
        }
    }

    public static final String shortInfo() {
        return "-- Short info --\nFounding date: " + FOUNDING_DATE
                + "\nCapital: " + CAPITAL + "\nCurrency: " + CURRENCY;
    }

    public static final String fullInfo() {
        return "-- Full info --\nFounding date: " + FOUNDING_DATE
                + "\nCapital: " + CAPITAL + "\nCurrency: " + CURRENCY
                + "\nLanguages: " + LANGUAGES.BY + ", " + LANGUAGES.RUS
                + "\nDistricts: " + DISTRICS.BREST + ", " + DISTRICS.GOMEL + ", "
                + DISTRICS.GRODNO + ", " + DISTRICS.MINSK + ", " + DISTRICS.MOGILEV
                + ", " + DISTRICS.VITEBSK
                + "\nNeighbors: " + NEIGHBORS.LATVIA + ", " + NEIGHBORS.LITHUANIA + ", "
                + NEIGHBORS.POLAND + ", " + NEIGHBORS.RUSSIA + ", " + NEIGHBORS.UKRAINE;
    }
}
