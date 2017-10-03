import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class PositionedImage {

    BufferedImage image;
    int posX, posY;

    public PositionedImage(String filename, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public PositionedImage() {

    }

    public static void floorPositioning(PositionedImage image, int value, Graphics graphics) {
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                image.posX = i * 72;
                image.posY = j * 72;
                image.draw(graphics);
            }
        }
    }

    public static void wallPositioning(PositionedImage image, ArrayList<Integer> Xcoord, ArrayList<Integer> Ycoord, Graphics graphics) {
        for (int i = 0; i < Xcoord.size(); i++) {
            image.posX = Xcoord.get(i) * 72;
            image.posY = Ycoord.get(i) * 72;
            image.draw(graphics);
        }
    }

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX, posY, null);
        }
    }
}
