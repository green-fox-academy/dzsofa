import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void mainDraw(Graphics graphics){
      // create a square drawing function that takes 2 parameters:
      // the x and y coordinates of the square's top left corner
      // and draws a 50x50 square from that point.
      // draw 3 squares with that function.
        int[] firstSquare = {50, 80};
        drawSquare(graphics, firstSquare);

        int[] secondSquare = {200, 250};
        drawSquare(graphics, secondSquare);

        int[] thirdSquare = {260, 100};
        drawSquare(graphics, thirdSquare);

    }
    public static void drawSquare(Graphics g, int[] startingPos) {
        g.drawRect(startingPos[0], startingPos[1], 50, 50);


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
