import javax.swing.*;

import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {

    public static void mainDraw(Graphics graphics) {
        int[] xStart = {30, 480, 255};
        int[] yStart = {30, 30, 420};
        triangleDraw(graphics, xStart, yStart, 3);

    }

    public static void triangleDraw(Graphics graphics, int[] x, int[] y, int depth) {
//        if (size < 10) {
//            return;
//        }
        graphics.drawPolygon(x, y, 3);
        triangleDraw(graphics, x / 2, y / 2, );

//        int r = 255 - (int) (Math.random() * 255);
//        int g = 255 - (int) (Math.random() * 255);
//        int b = 255 - (int) (Math.random() * 255);

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