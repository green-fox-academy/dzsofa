public class Pikachu extends Pokemon {

    public Pikachu() {
        super.healthPoint = 12;
        super.type = "Pikachu";
    }

    @Override
    public String speak() {
        return "Pika-pika";
    }
}
