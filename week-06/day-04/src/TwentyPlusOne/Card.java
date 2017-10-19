package TwentyPlusOne;

import javafx.scene.media.SubtitleTrack;

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

    private Color color;
    private Suit suit;
    private Rank rank;

    public Card() {
        this.color = randomColor();
        this.suit = randomSuit();
        this.rank = randomRank();
    }

    public Color randomColor() {
        return Color.values()[(int) Math.random() * Color.values().length];
    }

    public Suit randomSuit() {
        return Suit.values()[(int) Math.random() * Suit.values().length];
    }

    private Rank randomRank() {
        return Rank.values()[(int) Math.random() * Rank.values().length];
    }

    public Color getColor() {
        return this.color;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    @Override
    public String toString() {
        return "Card of color: " + this.getColor().toString().toLowerCase() + ", suit: " + this.getSuit().toString().toLowerCase() + ", rank: " + this.getRank().toString().toLowerCase() + ", having value of: " + this.getRank().Rankpoints;
    }
}
