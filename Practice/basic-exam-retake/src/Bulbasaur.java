public class Bulbasaur extends Pokemon{

    public Bulbasaur() {
        super.healthPoint = 10;
        super.type = "Bulbasaur";
    }

    @Override
    public String speak() {
        return "Bulba-saur";
    }
}
