public class Character extends PositionedImage{
    private int maxHP;
    private int currentHP;
    private int defendPoint;
    private int strikePoint;
    private int level;

    public Character(String filename, int posX, int posY, int maxHP, int currentHP, int defendPoint, int strikePoint, int level) {
        super(filename, posX, posY);
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.defendPoint = defendPoint;
        this.strikePoint = strikePoint;
        this.level = level;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
