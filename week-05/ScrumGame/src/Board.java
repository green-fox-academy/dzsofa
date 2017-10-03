import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Board extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;

    public Board() {
        testBoxX = 300;
        testBoxY = 300;

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
//        graphics.fillRect(testBoxX, testBoxY, 100, 100);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        PositionedImage floorImage = new PositionedImage("src/assets/floor.png", 0, 0);
        floorImage.draw(graphics);

        PositionedImage.floorPositioning(floorImage, 10, graphics);

        PositionedImage wallImage = new PositionedImage("src/assets/wall.png", 0, 0);

        ArrayList<Integer> wallTilesX = new ArrayList<>(Arrays.asList(3, 5, 3, 5, 7, 8, 1, 2, 3, 5, 7, 8, 5, 0, 1, 2, 3, 5, 6, 7, 8, 1, 3, 8, 1, 3, 5, 6, 8, 5, 6, 8, 1, 2, 3, 8, 3, 5, 6));
        ArrayList<Integer> wallTilesY = new ArrayList<>(Arrays.asList(0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9));
        
        for (int i = 0; i < wallTilesX.size(); i++) {
            for (int j = 0; j < wallTilesY.size(); j++) {
                wallImage.posX = wallTilesX.get(i) * 72;
                wallImage.posY = wallTilesY.get(i) * 72;
                wallImage.draw(graphics);
            }
        }
    }

    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        // Here is how you can add a key event listener
        // The board object will be notified when hitting any key
        // with the system calling one of the below 3 methods
        frame.addKeyListener(board);
        // Notice (at the top) that we can only do this
        // because this Board class (the type of the board object) is also a KeyListener
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            testBoxY -= 100;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            testBoxY += 100;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            testBoxX -= 100;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            testBoxX += 100;
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}
