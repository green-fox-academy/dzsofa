import java.util.Random;

public class Car {
    public enum CarType{OPEL, MAZDA, RENAULT, HONDA, PACKARD, CITROEN, HYUNDAI}
    public enum Color{BLUE, SILVER, GRAY, RED, YELLOW}
    Random random = new Random();


    public Car() {
        CarType type = getRandomType();
        Color color = getRandomColor();
    }

    public static CarType getRandomType() {
        return CarType.values()[(int) (Math.random() * CarType.values().length)];
    }

    public static Color getRandomColor() {
        return Color.values()[(int) (Math.random() * Color.values().length)];
    }
}
