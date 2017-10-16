public class Charmander extends Pokemon {

    public Charmander() {
        super.healthPoint = 10;
        super.type = "Charmander";
    }

    @Override
    public String speak() {
        return "Char-char";
    }
}
