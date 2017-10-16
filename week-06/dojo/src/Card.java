public class Card {
    String value;
    String color;


    public Card(String color, String value) {
        this.value = value;
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.value + this.color;
    }


}
