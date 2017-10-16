import java.util.ArrayList;

public class Game {

    public Game() {
    }

    public String basicCase(Hand hand) {
        String combo = "";
        ArrayList<Card> temp = new ArrayList<>();
        for (int i = 0; i < hand.player.size(); i++) {
            for (int j = 0; j < hand.player.size(); j++) {
                if (hand.player.get(i).getValue().equals(hand.player.get(j).getValue())) {
                    temp.add();
                } else if () {
                    combo = "Two pairs";
                }
                else {
                    combo = "Nothing";
                }
            }
        }
        return combo;
    }
}
