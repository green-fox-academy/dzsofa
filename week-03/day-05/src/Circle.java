import javax.swing.*;

import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circle {

    public static void mainDraw(Graphics graphics) {
        graphics.drawOval(110, 110, 10, 10);
        circleDraw(graphics, 110, 110, 360);


    }

    public static void circleDraw(Graphics graphics, int x, int y, int size) {
        if (size < 100) {
            return;
        }
        graphics.drawOval(x, y, size, size);
        circleDraw(graphics, x + 90, y, size / 2);
        circleDraw(graphics, x + 15, y + 140, size / 2);
        circleDraw(graphics, x + 165, y + 140, size / 2);
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