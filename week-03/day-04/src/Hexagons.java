import javax.swing.*;
import java.awt.*;
import static java.lang.Math.PI;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagons {

    public static void mainDraw(Graphics graphics) {
        hexagonDraw(graphics, HEIGHT / 2, HEIGHT / 2, HEIGHT / 4);

    }

    public static void hexagonDraw(Graphics graphics, int x, int y, int size) {
        if (size < 5) {
            return;
        }
        Polygon p = new Polygon();
        for(int i=0; i<6; i++) {
            p.addPoint((int) (x + size*cos(i*2*PI/6)), (int) (y + size*sin(i*2*PI/6)));
            System.out.println(((int) (x + size*cos(i*2*PI/6)) + " - " + (int) (y + size*sin(i*2*PI/6))));
        }
        graphics.drawPolygon(p);
        hexagonDraw(graphics, (int)(x - 38./150.*size), (int)(y - 65./150.*size), size / 2 );
        hexagonDraw(graphics, (int)(x - 38./150.*size), (int)(y + 65./150.*size), size / 2 );
        hexagonDraw(graphics, (int)(x + 2*38./150.*size), y, size / 2 );
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
