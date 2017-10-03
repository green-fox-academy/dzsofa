public class Floor extends PositionedImage {
    boolean movable = true;

    public Floor(int posX, int posY) {
        super("src/assets/floor.png", posX, posY);
        this.movable = true;

    }

}
