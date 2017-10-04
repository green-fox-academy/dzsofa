import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Hero extends Character {

    public Hero() {
        super("src/assets/hero-down.png", 0, 0);
    }

    public void walkUp() {
        posY--;
        changeImage("src/assets/hero-up.png");
    }

    public void walkDown() {
        posY++;
        changeImage("src/assets/hero-down.png");
    }

    public void walkLeft() {
        posX--;
        changeImage("src/assets/hero-left.png");
    }

    public void walkRight() {
        posX++;
        changeImage("src/assets/hero-right.png");
    }

}
