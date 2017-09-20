import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

    public static void mainDraw(Graphics graphics){
      // divide the canvas into 4 parts
      // and repeat this pattern in each quarter:
      // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]


        int x1 = 10;
        int y2 = 10;
        for (int i = 0; i < 16; i++) {
            graphics.setColor(new Color(226, 0, 116));
            graphics.drawLine(x1, 2, 158, y2);
            x1 += 10;
            y2 += 10;
        }
        int x2 = 10;
        int y1 = 10;
        for (int i = 0; i < 16; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(2, y1, x2, 169);
            x2 += 10;
            y1 += 10;

        }

        int x3 = 168;
        int y4 = 10;
        for (int i = 0; i < 16; i++) {
            graphics.setColor(new Color(226, 0, 116));
            graphics.drawLine(x3, 2, 316, y4);
            x3 += 10;
            y4 += 10;
        }
        int x4 = 168;
        int y3 = 10;
        for (int i = 0; i < 16; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(168, y3, x4, 169);
            x4 += 10;
            y3 += 10;

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
