import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class DeckTest {
    Deck deck;

    @Before
    public void setUp() throws Exception {
        deck = new Deck();
    }

    @Test
    public void generateDeck() throws Exception {
        assertEquals(52, deck.deck.size());
    }

}