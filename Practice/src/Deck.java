import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    ArrayList<Card> deck;
    String[] color = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] value = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private Random rand = new Random();
    ArrayList<ArrayList<Card>> cards = new ArrayList<ArrayList<Card>>();

    public Deck(int amount) {
        deck = new ArrayList<>();
        createDeck();
        int count = 0;
        while (count < amount) {
            deck.add(cards.get(count % 4).remove(rand.nextInt(cards.get(count % 4).size())));
            count++;
        }
        shuffle();
    }

    public void createDeck() {
        for (int i = 0; i < color.length; i++) {
            cards.add(new ArrayList<Card>());
            for (int j = 0; j < value.length; j++) {
                cards.get(i).add(new Card(color[i], value[j]));
            }
        }
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
