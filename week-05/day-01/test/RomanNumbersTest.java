import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumbersTest {

    RomanNumbers romanNumbers;

    @Before
    public void setUp() throws Exception {
        if (romanNumbers == null) {
            romanNumbers = new RomanNumbers();
        }
    }


    @Test
    public void convertToRomanI() throws Exception {
        assertEquals("I", romanNumbers.convertToRoman(1));
    }

    @Test
    public void convertToRomanII() throws Exception {
        assertEquals("II", romanNumbers.convertToRoman(2));
    }

    @Test
    public void convertToRomanIII() throws Exception {
        assertEquals("III", romanNumbers.convertToRoman(3));
    }

    @Test
    public void convertToRomanIV() throws Exception {
        assertEquals("IV", romanNumbers.convertToRoman(4));
    }

    @Test
    public void convertToRomanV() throws Exception {
        assertEquals("V", romanNumbers.convertToRoman(5));
    }

    @Test
    public void convertToRomanVI() throws Exception {
        assertEquals("VI", romanNumbers.convertToRoman(6));
        assertEquals("VII", romanNumbers.convertToRoman(7));
        assertEquals("VIII", romanNumbers.convertToRoman(8));
    }

    @Test
    public void convertToRomanIX() throws Exception {
        assertEquals("IX", romanNumbers.convertToRoman(9));
    }

    @Test
    public void convertToRomanXXXIX() throws Exception {
        assertEquals("XXXIX", romanNumbers.convertToRoman(39));
    }

    @Test
    public void convertToRomanXLIX() throws Exception {
        assertEquals("XLIX", romanNumbers.convertToRoman(49));
    }
}