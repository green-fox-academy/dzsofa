import javax.swing.*;

import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {

    public static void mainDraw(Graphics graphics) {


    }

    public static void triangleDraw(Graphics graphics, int x, int y, int size) {
        if (size < 10) {
            return;
        }

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