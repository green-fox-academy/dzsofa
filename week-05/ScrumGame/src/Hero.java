public class Hero extends Creature {

    public Hero() {
        super("src/assets/hero-down.png", 0, 0);
        this.setMaxHP(20 + 3 * dice);
        this.setDefendPoint(2 * dice);
        this.setStrikePoint(5 + dice);
        this.setCurrentHP(maxHP);
        System.out.println(getMaxHP());
        System.out.println(getDefendPoint());
        System.out.println(getStrikePoint());
        System.out.println(getCurrentHP());
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

}
