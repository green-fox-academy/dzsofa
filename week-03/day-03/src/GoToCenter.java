import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {

    public static void mainDraw(Graphics graphics) {
        // create a line drawing function that takes 2 parameters:
        // the x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.y
        // draw 3 lines with that function.

        graphics.setColor(Color.green);
        int[] startingPoints1 = {40, 90};
        goToCenter(graphics, startingPoints1);

        int[] startingPoints2 = {30, 20};
        goToCenter(graphics, startingPoints2);

        int[] startingPoints3 = {120, 80};
        goToCenter(graphics, startingPoints3);
    }

    public static void goToCenter(Graphics g, int[] startingPoints) {
        g.drawLine(startingPoints[0], startingPoints[1], WIDTH / 2, HEIGHT / 2);

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
