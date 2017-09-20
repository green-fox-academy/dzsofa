import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {

    public static void mainDraw(Graphics graphics) {
        // create a line drawing function that takes 2 parameters:
        // the x and y coordinates of the line's starting point
        // and draws a 50 long horizontal line from that point.
        // draw 3 lines with that function.
        int[] myValues = {40, 80};
        horizontalDraw(graphics, myValues);

        int[] myValues02 = {60, 160};
        horizontalDraw(graphics, myValues02);

        int[] myValues03 = {200, 300};
        horizontalDraw(graphics, myValues03);
    }
    public static void horizontalDraw(Graphics g, int[] myValues) {
        g.drawLine(myValues[0], myValues[1], myValues[0] + 50, myValues[1]);
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
