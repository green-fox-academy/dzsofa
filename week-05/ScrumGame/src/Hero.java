public class Hero extends Creature {

    public Hero() {
        super("src/assets/hero-down.png", 0, 0);
        this.setMaxHP(20 + rollDice(3));
        this.setDefendPoint(rollDice(2));
        this.setStrikePoint(5 + rollDice(1));
        this.setCurrentHP(maxHP);
        this.level = 1;
    }

    public void walkUp() {
        posY--;
        changeImage("src/assets/hero-up.png");
    }

    public void walkDown() {
        posY++;
        changeImage("src/assets/hero-down.png");
    }

    public void walkLeft() {
        posX--;
        changeImage("src/assets/hero-left.png");
    }

    public void walkRight() {
        posX++;
        changeImage("src/assets/hero-right.png");
    }

    public void leveling() {
        this.maxHP += rollDice(1);
        this.defendPoint += rollDice(1);
        this.strikePoint += rollDice(1);
        level++;
    }
}
