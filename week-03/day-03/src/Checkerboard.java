import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static void mainDraw(Graphics graphics) {
        // fill the canvas with a checkerboard pattern.
        int[] startingPoint = {0, 0};

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                startingPoint[0] += 20;
                if (startingPoint[0] % 40 == 0) {
                    graphics.setColor(Color.WHITE);
                    graphics.fillRect(startingPoint[0], startingPoint[1], 20, 20);
                } else {
                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(startingPoint[0], startingPoint[1], 20, 20);
                }
            }
        }
        for (int i = 0; i < 16; i++) {
            startingPoint[1] += 20;
            if (startingPoint[1] % 40 == 0) {
                graphics.setColor(Color.WHITE);
                graphics.fillRect(startingPoint[0], startingPoint[1], 20, 20);
            } else {
                graphics.setColor(Color.BLACK);
                graphics.fillRect(startingPoint[0], startingPoint[1], 20, 20);
            }

        }
    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

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
