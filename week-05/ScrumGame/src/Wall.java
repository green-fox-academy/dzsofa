import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wall extends PositionedImage {
    boolean movable = false;


    public Wall(int posX, int posY) {
        super("src/assets/wall.png", posX, posY);
        this.movable = false;
    }

}
