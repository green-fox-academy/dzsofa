import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Hero extends PositionedImage {
    String heroImage;

    public Hero() {
        super("src/assets/hero-down.png", 0, 0);
    }

    public void walkUp() {
        posY--;
        try {
            image = ImageIO.read(new File("src/assets/hero-up.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void walkDown() {
        posY++;
        try {
            image = ImageIO.read(new File("src/assets/hero-down.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void walkLeft() {
        posX--;
        try {
            image = ImageIO.read(new File("src/assets/hero-left.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void walkRight() {
        posX++;
        try {
            image = ImageIO.read(new File("src/assets/hero-right.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
