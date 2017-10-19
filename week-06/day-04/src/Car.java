import java.util.Random;

public class Car {
    public enum CarType{OPEL, MAZDA, RENAULT, HONDA, PACKARD, CITROEN, HYUNDAI}
    public enum Color{BLUE, SILVER, GRAY, RED, YELLOW}
    CarType type;
    Color color;

    public Car() {
        this.type = getRandomType();
        this.color = getRandomColor();
    }

    public static CarType getRandomType() {
        return CarType.values()[(int) (Math.random() * CarType.values().length)];
    }

    public static Color getRandomColor() {
        return Color.values()[(int) (Math.random() * Color.values().length)];
    }

    public String getType() {
        return this.type.toString();
    }

    public String getColor() {
        return this.color.toString();
    }

    @Override
    public String toString() {
        return getColor() + " " + getType();

    }
}
