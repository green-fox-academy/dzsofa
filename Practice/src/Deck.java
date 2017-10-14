import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    ArrayList<Card> deck;
    String[] color = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] value = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private Random rand = new Random();

    public Deck(int amount) {
        deck = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < value.length && count < amount; i++) {
            for (int j = 0; j < color.length; j++) {
                deck.add(new Card(color[j], value[rand.nextInt(value.length)]));
                count++;
            }
        }
        Collections.shuffle(deck);
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card draw() {
        Card temp = deck.get(0);
        deck.remove(0);
        return temp;
    }

    public int countColor(String color) {
        int count = 0;
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).color.equals(color)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return deck.size() + " Cards - " + countColor("Spades") + " Spades, " + countColor("Hearts") + " Hearts, " + countColor("Diamonds") + " Diamonds, " + countColor("Clubs") + " Clubs.";
    }
}
