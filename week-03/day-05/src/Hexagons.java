import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagons {

    public static void mainDraw(Graphics graphics) {
        hexagonDraw(graphics, 5, 50, 350, 300);

    }

    public static void hexagonDraw(Graphics graphics, int n, double x, double y, double size) {
        if (n == 0) {
            return;
        }

        //defining coordinates
        double x0 = x;
        double y0 = y;
        double x1 = x0 + size / 2;
        double y1 = y0 - (Math.sqrt(3)) * size / 2;
        double x2 = x0 + size * 1.5;
        double y2 = y0 - (Math.sqrt(3)) * size / 2;
        double x3 = x0 + size * 2;
        double y3 = y0;
        double x4 = x0 + size * 1.5;
        double y4 = y0 + (Math.sqrt(3)) * size / 2;
        double x5 = x0 + size / 2;
        double y5 = y0 + (Math.sqrt(3)) * size / 2;

        //drawing the initial big hexagon
        graphics.drawLine((int) x0, (int) y0, (int) x1, (int) y1);
        graphics.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
        graphics.drawLine((int) x2, (int) y2, (int) x3, (int) y3);
        graphics.drawLine((int) x3, (int) y3, (int) x4, (int) y4);
        graphics.drawLine((int) x4, (int) y4, (int) x5, (int) y5);
        graphics.drawLine((int) x5, (int) y5, (int) x0, (int) y0);


        int r = 255 - (int) (Math.random() * 255);
        int g = 255 - (int) (Math.random() * 255);
        int b = 255 - (int) (Math.random() * 255);

        //recursing the hell out of it
        graphics.setColor(new Color(r, g, b));
        hexagonDraw(graphics, n - 1, x0, y0, size / 3);
        hexagonDraw(graphics, n - 1, x0 + size / 3, y0 - (Math.sqrt(3)) * size / 3, size / 3);
        graphics.setColor(new Color(r, g, b));
        hexagonDraw(graphics, n - 1, x0 + size, y0 - (Math.sqrt(3)) * size / 3, size / 3);
        hexagonDraw(graphics, n - 1, x0 + size / 3 * 4, y0, size / 3);
        graphics.setColor(new Color(r, g, b));
        hexagonDraw(graphics, n - 1, x0 + size / 3, y0 + (Math.sqrt(3)) * size / 3, size / 3);
        hexagonDraw(graphics, n - 1, x0 + size, y0 + (Math.sqrt(3)) * size / 3, size / 3);
    }


    //    Don't touch the code below
    static int WIDTH = 700;
    static int HEIGHT = 700;

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