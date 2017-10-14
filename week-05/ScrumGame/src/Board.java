import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
    int[][] boardMap;
    Hero hero;
    Creature[] enemies;
    boolean gameOver = false;
    int level = 0;

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
        generateNextLevel();


        // set the size of your draw board
        setPreferredSize(new Dimension(720, 780));
        setVisible(true);
    }

    private void generateNextLevel() {
        level++;
        enemies = new Creature[4];
        GeneratePosition generatePosition = new GeneratePosition().invoke();
        enemies[0] = new Skeleton(generatePosition.randX, generatePosition.randY, level, true);
        generatePosition = new GeneratePosition().invoke();
        enemies[1] = new Skeleton(generatePosition.randX, generatePosition.randY, level, false);
        generatePosition = new GeneratePosition().invoke();
        enemies[2] = new Skeleton(generatePosition.randX, generatePosition.randY, level, false);
        generatePosition = new GeneratePosition().invoke();
        enemies[3] = new Boss(generatePosition.randX, generatePosition.randY, level);
        hero.posX = 0;
        hero.posY = 0;
        hero.key = false;
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
        for (int i = 0; i < enemies.length; i++) {
            enemies[i].draw(graphics);
        }
        hero.draw(graphics);

        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 690, 720, 30);
        graphics.setColor(Color.BLACK);
        if (getEnemyID() > -1) {
            graphics.setColor(Color.WHITE);
            graphics.fillRect(300, 690, 250, 30);
            graphics.setColor(Color.BLACK);
            graphics.drawString(enemies[getEnemyID()].showStats(), 400, 707);
        }
        graphics.drawString(hero.showStats(), 10, 707);

        if (gameOver) {
            graphics.setColor(Color.WHITE);
            graphics.fillRect(0, 300, 720, 150);
            graphics.setColor(Color.BLACK);
            graphics.drawString("You lose", 300, 350);
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
        if (e.getKeyCode() == KeyEvent.VK_UP && hero.posY > 0 && boardMap[hero.posY - 1][hero.posX] != 1) {
            hero.walkUp();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN && hero.posY < boardMap.length - 1 && boardMap[hero.posY + 1][hero.posX] != 1) {
            hero.walkDown();
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && hero.posX > 0 && boardMap[hero.posY][hero.posX - 1] != 1) {
            hero.walkLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && hero.posX < boardMap.length - 1 && boardMap[hero.posY][hero.posX + 1] != 1) {
            hero.walkRight();
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            int enemyID = getEnemyID();
            if (enemyID > -1) {
                if (hero.strike(enemies[enemyID]) == false) {
                    this.gameOver = true;
                } else if (enemies[enemyID].key) {
                    hero.key = true;
                }
            }
            if (hero.key && enemies[3].currentHP <= 0) {
                this.generateNextLevel();
            }
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }

    private int getEnemyID() {
        int enemyID = -1;
        for (int i = 0; i < enemies.length; i++) {
            if (enemies[i].posX == hero.posX && enemies[i].posY == hero.posY && enemies[i].currentHP > 0) {
                enemyID = i;
            }
        }
        return enemyID;
    }

    private class GeneratePosition {
        private int randX;
        private int randY;

        public int getRandX() {
            return randX;
        }

        public int getRandY() {
            return randY;
        }

        public GeneratePosition invoke() {
            randX = (int) (Math.random() * 9);
            randY = (int) (Math.random() * 9);
            while (boardMap[randY][randX] == 1) {
                randX = (int) (Math.random() * 9);
                randY = (int) (Math.random() * 9);
            }
            return this;
        }
    }
}
