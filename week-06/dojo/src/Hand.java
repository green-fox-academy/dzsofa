import java.util.ArrayList;

public class Hand {
    String playerName;
    ArrayList<Card> player;
    Deck deck;

    public Hand(String playerName, Deck deck) {
        this.playerName = playerName;
        player = new ArrayList<>();
        this.deck = deck;
    }

    public void dealCards() {
        player = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            player.add(deck.deck.get(i));
            deck.deck.remove(i);
        }
    }

    @Override
    public String toString() {
        String playerCards = "";
        for (int i = 0; i < player.size(); i++) {
            if (i == player.size() - 1) {
                playerCards += player.get(i);
            } else {
                playerCards += player.get(i) + ", ";
            }
        }
        return this.playerName + "'s cards are: \n" + playerCards;
    }
}
