import javax.swing.*;

import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

    public static void mainDraw(Graphics graphics){
      // create a line drawing function that takes 2 parameters:
      // the x and y coordinates of the line's starting point
      // and draws a line from that point to the center of the canvas.
      // fill the canvas with lines from the edges, every 20 px, to the center.

        int[] startingPoints = {0, 0};
        drawDiagonals(graphics, startingPoints);
    }
    public static void drawDiagonals(Graphics g, int[] startingPoints) {
        for (int i = 0; i < 17; i++) {
            g.setColor(new Color(226, 0, 116));
            g.drawLine(startingPoints[0], startingPoints[1], WIDTH / 2, HEIGHT / 2);
            startingPoints[0] += 20;
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
