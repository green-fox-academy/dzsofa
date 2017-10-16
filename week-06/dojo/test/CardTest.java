import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    Card card;

    @Before
    public void setUp() throws Exception {
        card = new Card("H", "2");
    }

    @Test
    public void testCard() throws Exception {
        assertEquals("2", card.value);
    }

    @Test
    public void testCardToString() throws Exception {
        assertEquals("2H", card.toString());
    }

}