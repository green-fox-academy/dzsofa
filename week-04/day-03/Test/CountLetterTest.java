import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLetterTest {


    @Before
    public void setUp() throws Exception {
        String str = "Reference";
        Map<Character, Integer> charCount = new HashMap<>();
    }

    @Test
    public void countLetter() throws Exception {
        assertEquals("{R=1, r=1, c=1, e=4, f=1, n=1}", CountLetter.countLetter("Reference"));
    }

}