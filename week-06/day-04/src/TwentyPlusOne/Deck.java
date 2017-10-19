package TwentyPlusOne;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        createDeck();
        shuffleDeck();
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

    private void shuffleDeck() {
        Collections.shuffle(this.deck);
    }

    public Card pullFirst() {
        Card temp = this.deck.get(0);
        this.deck.remove(0);
        return temp;
    }

    public Card pullLast() {
        Card temp = this.deck.get(this.deck.size() - 1);
        this.deck.remove(this.deck.size() - 1);
        return temp;
    }

    public Card pullRandom() {
        int random = (int) (Math.random() * deckSize());
        Card temp = this.deck.get(random);
        this.deck.remove(random);
        return temp;
    }

    public int deckSize() {
        return this.deck.size();
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
