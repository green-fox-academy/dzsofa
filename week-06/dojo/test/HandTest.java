import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HandTest {
    Hand hand;
    Deck deck = new Deck();

    @Before
    public void setUp() throws Exception {
        hand = new Hand("s", deck);
    }

    @Test
    public void handSize() throws Exception {
        assertEquals(5, hand.player.size());
    }


}