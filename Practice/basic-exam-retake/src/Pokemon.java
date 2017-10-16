public class Pokemon {
    int healthPoint;
    protected int strength;

    public Pokemon() {
        healthPoint = 0;
        strength = (int)((Math.random() * 10 + 1));
    }

    public String speak() {
        return "Quack";
    }
}


