import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    Anagram anagram;

    @Before
    public void setUp() throws Exception {
        anagram = new Anagram();
    }

    @Test
    public void checkAnagram() throws Exception {
        assertTrue(anagram.checkAnagram("s", "s"));
    }

//    @Test
//    public void checkAnagram1() throws Exception {
//        assertFalse(anagram.checkAnagram("s", "st"));
//    }

    @Test
    public void checkAnagram2() throws Exception {
        assertTrue(anagram.checkAnagram("ts", "st"));
    }

    @Test
    public void checkAnagram3() throws Exception {
        assertTrue(anagram.checkAnagram("TS", "st"));
    }


}