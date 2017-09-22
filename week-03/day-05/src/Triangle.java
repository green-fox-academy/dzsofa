import javax.swing.*;

import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {

    public static void mainDraw(Graphics graphics) {
        triangleDraw(graphics, 10, 35, 60, 540);

    }

    public static void triangleDraw(Graphics graphics, int n, double x, double y, double size) {
        if (n == 0) {
            return;
        }

        double x0 = x;
        double y0 = y;
        double x1 = x0 + size;
        double y1 = y0;
        double x2 = x0 + size / 2;
        double y2 = y0 + (Math.sqrt(3)) * size / 2;

        graphics.drawLine((int)x0, (int)y0, (int)x1, (int)y1);
        graphics.drawLine((int)x0, (int)y0, (int)x2, (int)y2);
        graphics.drawLine((int)x1, (int)y1, (int)x2, (int)y2);

        int r = 255 - (int) (Math.random() * 255);
        int g = 255 - (int) (Math.random() * 255);
        int b = 255 - (int) (Math.random() * 255);

        graphics.setColor(new Color(r, g, b));
        triangleDraw(graphics, n - 1, x0, y0, size / 2);
        graphics.setColor(new Color(r, g, b));
        triangleDraw(graphics, n - 1, (x0 + x1) / 2, (y0 + y1) / 2, size / 2);
        graphics.setColor(new Color(r, g, b));
        triangleDraw(graphics, n - 1, (x0 + x2) / 2, (y0 + y2) / 2, size / 2);

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