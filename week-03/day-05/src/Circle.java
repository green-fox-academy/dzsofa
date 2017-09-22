import javax.swing.*;

import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circle {

    public static void mainDraw(Graphics graphics) {
//        graphics.drawOval(110, 110, 10, 10);
        circleDraw(graphics, WIDTH / 8, HEIGHT / 8, 450);

    }

    public static void circleDraw(Graphics graphics, int x, int y, int size) {
        if (size < 10) {
            return;
        }
        int r = 255 - (int) (Math.random() * 255);
        int g = 255 - (int) (Math.random() * 255);
        int b = 255 - (int) (Math.random() * 255);
        graphics.drawOval(x, y, size, size);
        graphics.setColor(new Color(r, g, b));
        circleDraw(graphics, x + size / 4, y, size / 2);
        graphics.setColor(new Color(r, g, b));
        circleDraw(graphics, x + size / 24, (int)(y + size / 2.57), size / 2);
        graphics.setColor(new Color(r, g, b));
        circleDraw(graphics, (int)(x + size / 2.18), (int)(y + size / 2.57), size / 2);
    }


    //    Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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