package ParkingLot;

public class Car {
    public enum Type {OPEL, MAZDA, RENAULT, HONDA, PACKARD, CITROEN, HYUNDAI}

    public enum Color {BLUE, SILVER, GRAY, RED, YELLOW}

    Type type;
    Color color;

    public Car() {
        this.type = getRandomType();
        this.color = getRandomColor();
    }

    public static Type getRandomType() {
        return Type.values()[(int) (Math.random() * Type.values().length)];
    }

    public static Color getRandomColor() {
        return Color.values()[(int) (Math.random() * Color.values().length)];
    }

    public Type getType() {
        return this.type;
    }

    public Color getColor() {
        return this.color;
    }


    @Override
    public String toString() {
        return getColor().toString() + " " + getType().toString();

    }
}
