public class Creature extends PositionedImage {
    protected int maxHP, currentHP;
    protected int defendPoint;
    protected int strikePoint;
    protected int level;
    protected int dice = 1 + (int) (Math.random() * ((6 - 1) + 1));
    protected int strikeValue;

    public Creature(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public int getDefendPoint() {
        return defendPoint;
    }

    public void setDefendPoint(int defendPoint) {
        this.defendPoint = defendPoint;
    }

    public int getStrikePoint() {
        return strikePoint;
    }

    public void setStrikePoint(int strikePoint) {
        this.strikePoint = strikePoint;
    }

    public int getStrikeValue() {
        return strikeValue;
    }

    public void setStrikeValue(int strikeValue) {
        this.strikeValue = this.strikePoint + (2 * dice);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean strike(Creature other) {
        if (this.strikeValue > other.defendPoint) {
            other.currentHP -= (this.strikeValue - other.defendPoint);
            return true;
        } else this.currentHP -= (other.strikeValue - this.defendPoint);
        return false;
    }
}
