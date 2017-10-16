import java.util.ArrayList;

public class Hand {
    ArrayList<Card> player;
    Deck deck = new Deck();

    public Hand() {
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
        return playerCards;
    }
}
