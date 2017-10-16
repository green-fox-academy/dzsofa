import java.util.ArrayList;

public class Game {

    public Game() {
    }

    public String basicCase(Hand hand) {
        String combo = "";
        for (int i = 0; i < hand.player.size(); i++) {
            for (int j = i + 1; j < hand.player.size(); j++) {
                if (hand.player.get(i).toString().substring(0, 1).equals(hand.player.get(j).toString().substring(0, 1))) {
                    combo = "Pairs";
                } else {
                    combo = "Nothing";
                }
            }
        }
        return combo;
    }
}
