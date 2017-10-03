import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wall extends PositionedImage {
    boolean movable = false;


    public Wall(int posX, int posY) {
        super("src/assets/wall.png", posX, posY);
        this.movable = false;
    }

//    public List<Position> initializeCoordinates() {
//        List<Position> coordinates = new ArrayList<>();
//        coordinates.add(new Position(3,0));
//        coordinates.add(new Position(5,0));
//        coordinates.add(new Position(3,1));
//        coordinates.add(new Position(5,1));
//        coordinates.add(new Position(7,1));
//        coordinates.add(new Position(8,1));
//        coordinates.add(new Position(1,2));
//        coordinates.add(new Position(2,2));
//        coordinates.add(new Position(3,2));
//        coordinates.add(new Position(5,2));
//        coordinates.add(new Position(7,2));
//        coordinates.add(new Position(8,2));
//        coordinates.add(new Position(5,3));
//        coordinates.add(new Position(0,4));
//        coordinates.add(new Position(1,4));
//        coordinates.add(new Position(2,4));
//        coordinates.add(new Position(3,4));
//        coordinates.add(new Position(5,4));
//        coordinates.add(new Position(6,4));
//        coordinates.add(new Position(7,4));
//        coordinates.add(new Position(8,4));
//        coordinates.add(new Position(1,5));
//        coordinates.add(new Position(3,5));
//        coordinates.add(new Position(8,5));
//        coordinates.add(new Position(1,6));
//        coordinates.add(new Position(3,6));
//        coordinates.add(new Position(5,6));
//        coordinates.add(new Position(6,6));
//        coordinates.add(new Position(8,6));
//        coordinates.add(new Position(5,7));
//        coordinates.add(new Position(6,7));
//        coordinates.add(new Position(8,7));
//        coordinates.add(new Position(1,8));
//        coordinates.add(new Position(2,8));
//        coordinates.add(new Position(3,8));
//        coordinates.add(new Position(8,8));
//        coordinates.add(new Position(3,9));
//        coordinates.add(new Position(5,9));
//        coordinates.add(new Position(6,9));
//        return coordinates;
//    }


}
