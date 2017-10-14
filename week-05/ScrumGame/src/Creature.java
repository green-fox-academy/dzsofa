import java.awt.*;

public class Creature extends PositionedImage {
    protected int maxHP, currentHP;
    protected int defendPoint;
    protected int strikePoint;
    protected int level;
    protected boolean key = false;

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
        return this.strikePoint + rollDice(2);
    }

    public String showStats() {
        return this.getClass().getName() + "(" + level + ")" + "HP: " + getCurrentHP() + "/" + getMaxHP() + " | DP: " + getDefendPoint() + " | SP: " + getStrikePoint() + " | Has key: " + key;
    }

    public int rollDice(int nrOfRolls) {
        int rollValue = 0;
        for (int i = 0; i < nrOfRolls; i++) {
            rollValue += 1 + (int) (Math.random() * ((6 - 1) + 1));
        }
        return rollValue;
    }

    public boolean strike(Creature other) {
        if (this.getStrikeValue() > other.defendPoint) {
            other.currentHP -= (this.getStrikeValue() - other.defendPoint);
            System.out.println(other.currentHP);
        }
        if (other.currentHP > 0) {
            other.strike(this);
        } else {
            if (this.getClass() == Hero.class) {
                ((Hero)this).leveling();
            }
        } if (this.getClass() == Hero.class) {
            return this.currentHP > 0;
        }
        return true;
    }

    @Override
    public void draw(Graphics graphics) {
        if (currentHP > 0) {
            super.draw(graphics);
        }
    }
}
