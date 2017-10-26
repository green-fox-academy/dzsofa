public class Position {
    private final int[] coordinates;

    public Position(int xCoord, int yCoord) {
        this.coordinates = new int[]{xCoord, yCoord};
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "[" + coordinates[0] + ", " + coordinates[1] + "]";
    }
}
