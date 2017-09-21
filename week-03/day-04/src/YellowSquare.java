import javax.swing.*;

import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class YellowSquare {

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(new Color(243, 255, 0));
        graphics.fillRect(0, 0, 585, 585);
        graphics.setColor(Color.black);
        graphics.drawRect(0, 0, WIDTH, HEIGHT);
        graphics.drawRect(WIDTH / 3, 0, WIDTH / 3, HEIGHT / 3);
        graphics.drawRect(0, WIDTH / 3, WIDTH / 3, HEIGHT / 3);
        graphics.drawRect( WIDTH / 3, (int) (HEIGHT * 2 / 3), WIDTH / 3, HEIGHT / 3);
        graphics.drawRect((int) (WIDTH * 2 / 3), HEIGHT / 3, WIDTH / 3, HEIGHT / 3);

    }

    //    Don't touch the code below
    static int WIDTH = 585;
    static int HEIGHT = 585;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }
}