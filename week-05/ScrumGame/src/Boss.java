public class Boss extends Creature {

    public Boss(int posX, int posY, int level) {
        super("src/assets/boss.png", posX, posY);
        this.setMaxHP(rollDice(level * 2 + 1));
        this.setDefendPoint(rollDice((int) (Math.ceil(level / 2.0))) + (int) Math.ceil(rollDice(1) / 2.0));
        this.setStrikePoint(rollDice(level) + level);
        this.setCurrentHP(maxHP);
        this.level = level;
    }
}
