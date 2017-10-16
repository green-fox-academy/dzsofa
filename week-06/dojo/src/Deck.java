import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    String[] color = {"S", "H", "D", "C"};
    String[] value = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
    ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }

    public void createDeck() {
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < value.length; j++) {
                deck.add(new Card(color[i], value[j]));
            }
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }


}
