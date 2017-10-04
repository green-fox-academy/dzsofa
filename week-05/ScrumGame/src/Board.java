import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
    int[][] boardMap;
    Hero hero;
    Skeleton skeleton;
    Skeleton skeleton2;
    Skeleton skeleton3;

    public Board() {
        boardMap = new int[][]{
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
                {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
                {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 1, 1, 0, 0, 0},
        };
        hero = new Hero();
        skeleton = new Skeleton(0, 6);
        skeleton2 = new Skeleton(5, 8);
        skeleton3 = new Skeleton(6, 2);


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

        drawBoard(graphics);
    }

    private void drawBoard(Graphics graphics) {
        for (int i = 0; i < boardMap.length; i++) {
            for (int j = 0; j < boardMap.length; j++) {
                if (boardMap[i][j] == 0) {
                    Floor floor = new Floor(j, i);
                    floor.draw(graphics);
                } else {
                    Wall wall = new Wall(j, i);
                    wall.draw(graphics);
                }
            }
        }
        skeleton.draw(graphics);
        skeleton2.draw(graphics);
        skeleton3.draw(graphics);
        hero.draw(graphics);
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
        if (e.getKeyCode() == KeyEvent.VK_UP && hero.posY > 0 && boardMap[hero.posY - 1][hero.posX] != 1) {
            hero.walkUp();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN && hero.posY < boardMap.length - 1 && boardMap[hero.posY + 1][hero.posX] != 1) {
            hero.walkDown();
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && hero.posX > 0 && boardMap[hero.posY][hero.posX - 1] != 1) {
            hero.walkLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && hero.posX < boardMap.length - 1 && boardMap[hero.posY][hero.posX + 1] != 1) {
            hero.walkRight();
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}
