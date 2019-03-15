package task4;

public enum RGB {
    black(0, 0, 0),
    white(255, 255, 255),
    red(255, 0, 0),
    green(0, 255, 0),
    yellow(255, 255, 0),
    blue(0, 255, 255),
    pink(255, 0, 255),
    gray(102, 102, 102),
    brown(102, 51, 0),
    orange(255, 102, 0),
    purple(51, 0, 102);

    private final int r;
    private final int g;
    private final int b;

    RGB(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String getHexNumber() {
        return '#' + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);
    }

    public RGB getPreviousColor() {
        RGB[] rgb = values();
        if (this.ordinal() == 0)
            return rgb[10];
        else
            return rgb[this.ordinal() - 1];
    }

    public RGB getNextColor() {
        RGB[] rgb = values();
        if (this.ordinal() == 10)
            return rgb[0];
        else
            return rgb[this.ordinal() + 1];
    }
}
