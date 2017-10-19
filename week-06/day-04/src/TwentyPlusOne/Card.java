package TwentyPlusOne;

public class Card {
    public enum Color {BLACK, RED}

    public enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES}

    public enum Rank {
        DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(
                9), TEN(10), JACK(10), QUEEN(10), KING(10), ACE(11);

        private int Rankpoints;

        Rank(int points) {
            this.Rankpoints = points;
        }

        public int getRankpoints() {
            return this.Rankpoints;
        }

    }
    Color color;
    Suit suit;
    Rank rank;

    public Card() {

    }
}
