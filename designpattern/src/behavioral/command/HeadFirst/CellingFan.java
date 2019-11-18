package behavioral.command.HeadFirst;

public class CellingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public CellingFan() {
        this.speed = OFF;
    }

    public void high() {
        this.speed = HIGH;
    }
    public void medium() {
        this.speed = MEDIUM;
    }
    public void low() {
        this.speed = LOW;
    }
    public void off() {
        this.speed = OFF;
    }
}
