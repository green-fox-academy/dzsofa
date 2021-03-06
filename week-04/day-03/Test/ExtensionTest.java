import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ExtensionTest {
    Extension extension = new Extension();

    @Test
    void testAdd_2and3is5() {
        assertEquals(6, extension.add(2, 4));
    }

    @Test
    void testAdd_1and4is5() {
        assertEquals(6, extension.add(1, 5));
    }

    @Test
    void testMaxOfThree_first() {
        assertEquals(4, extension.maxOfThree(3, 4, 3));
    }

    @Test
    void testMaxOfThree_third() {
        assertEquals(4, extension.maxOfThree(3, 4, 3));
    }

    @Test
    void testMedian_four() {
        assertEquals(4, extension.median(Arrays.asList(7,3,3,5)));
    }

    @Test
    void testMedian_five() {
        assertEquals((double)4, extension.median(Arrays.asList(1,2,6,4,5)));
    }

    @Test
    void testIsVowel_a() {
        assertTrue(extension.isVowel('a'));
    }

    @Test
    void testIsVowel_u() {
        assertTrue(extension.isVowel('u'));
    }

    @Test
    void testTranslate_bemutatkozik() {
        assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
    }

    @Test
    void testTranslate_kolbice() {
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
    }

}