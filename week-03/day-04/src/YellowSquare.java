import javax.swing.*;

import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class YellowSquare {

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(new Color(243, 255, 0));
        graphics.fillRect(0, 0, HEIGHT, WIDTH);
        graphics.setColor(Color.black);
        graphics.drawRect(0, 0, HEIGHT, WIDTH);
        rectangleDraw(graphics, 0, 0, WIDTH);

    }

    public static void rectangleDraw(Graphics graphics, int x, int y, int size) {
        if (size < 5) {
            return;
        }
        graphics.drawRect(x + size / 3, y, size / 3, size / 3);
        graphics.drawRect(x, y + size / 3, size / 3, size / 3);
        graphics.drawRect(x + size / 3, y + (int) (size * 2. / 3.), size / 3, size / 3);
        graphics.drawRect(x + (int) (size * 2. / 3.), y + size / 3, size / 3, size / 3);
        rectangleDraw(graphics, x + size / 3, y, size / 3);
        rectangleDraw(graphics, x, y + size / 3, size / 3);
        rectangleDraw(graphics, x + (int) (size * 2. / 3.), y + size / 3, size / 3);
        rectangleDraw(graphics, x + size / 3, y + (int) (size * 2. / 3.), size / 3);
    }


    //    Don't touch the code below
    static int WIDTH = 729;
    static int HEIGHT = 729;

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