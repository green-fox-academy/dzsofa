public class Pokemon implements Comparable<Pokemon> {
    int healthPoint;
    protected int strength;
    protected String type;

    public Pokemon() {
        healthPoint = 0;
        strength = (int)((Math.random() * 10 + 1));
        type = "Pokemon";
    }

    public String getType() {
        return type;
    }

    public String speak() {
        return "Quack";
    }

    @Override
    public int compareTo(Pokemon comparesTo) {
        int compareStrength = comparesTo.strength;
        return strength - compareStrength;
    }

    @Override
    public String toString() {
        return "Pokemon type: " + getType() + ", HP: " + healthPoint + ", strength: " + strength;
    }
}


