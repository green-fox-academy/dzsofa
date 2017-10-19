package TwentyPlusOne;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        createDeck();
        shuffle();
    }

    private void createDeck() {
        for (int i = 0; i < Card.Color.values().length; i++) {
            for (int j = 0; j < Card.Suit.values().length; j++) {
                for (int k = 0; k < Card.Rank.values().length; k++) {
                    deck.add(new Card(Card.Color.values()[i], Card.Suit.values()[j], Card.Rank.values()[k]));
                }
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(this.deck);
    }

    public Card pullFirst() {
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : this.deck) {
            sb.append(card.toString() + "\n");
        }
        return sb.toString();
    }
}
