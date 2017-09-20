import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
      // draw four different size and color rectangles.
        graphics.setColor(Color.PINK);
        graphics.fillRect(20, 200, 150, 90);

        graphics.setColor(Color.cyan);
        graphics.fillRect(150, 50, 20, 200);

        graphics.setColor(Color.RED);
        graphics.fillRect(260, 100, 60, 80);

        graphics.setColor(Color.YELLOW);
        graphics.fillRect(230, 280, 60, 40);

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
