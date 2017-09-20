import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

    public static void mainDraw(Graphics graphics) {
        // reproduce this:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]

        int x1 = 20;
        int y2 = 20;
        for (int i = 0; i < 16; i++) {
            graphics.setColor(new Color(226, 0, 116));
            graphics.drawLine(x1, 5, 315, y2);
            x1 += 20;
            y2 += 20;

        }

        int x2 = 20;
        int y1 = 20;
        for (int i = 0; i < 16; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(5, y1, x2, 338);
            x2 += 20;
            y1 += 20;

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
