public class Skeleton extends Creature {

    public Skeleton(int posX, int posY, int level, boolean hasKey) {
        super("src/assets/skeleton.png", posX, posY);
        this.setMaxHP(rollDice(level * 2));
        this.setDefendPoint(rollDice((int)(Math.ceil(level / 2.0))));
        this.setStrikePoint(rollDice(level));
        this.setCurrentHP(maxHP);
        this.level = level;
        this.key = hasKey;
    }
}
