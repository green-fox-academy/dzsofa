import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class AnagramTest {

    String string1;
    String string2;

    @Before
    public void setUp() throws Exception {
        string1 = "dOg";
        string2 = "GoD";
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("We are after the test.");
    }

    @Test
    public void isAnagram() throws Exception {
        assertTrue("true", Anagram.isAnagram(string1, string2));
    }

}