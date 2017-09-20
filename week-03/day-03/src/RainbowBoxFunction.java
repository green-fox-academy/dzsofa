import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics) {
        // create a square drawing function that takes 2 parameters:
        // the square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // create a loop that fills the canvas with rainbow colored squares.
        Color[] colors = {Color.black, Color.blue, Color.cyan, Color.darkGray,
                Color.green, Color.lightGray, Color.RED, Color.magenta,
                Color.orange, Color.pink, Color.RED, Color.DARK_GRAY};
        rainbow(graphics, colors, 320);

    }

    public static void rainbow(Graphics g, Color[] color, int squareSize) {
//        g.setColor(color);
//        g.fillRect(WIDTH / 2 - squareSize / 2, HEIGHT / 2 - squareSize / 2, squareSize, squareSize);
        for (int i = 0; i < color.length; i++) {
            g.setColor(color[i]);
            g.fillRect(WIDTH / 2 - squareSize / 2, HEIGHT / 2 - squareSize / 2, squareSize, squareSize);
            squareSize -= 20;
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
