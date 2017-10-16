public class Card {
    String value;
    String color;


    public Card(String color, String value) {
        this.value = value;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.value + this.color;
    }
}
