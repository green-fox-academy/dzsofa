import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberConverterTest {
    NumberConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new NumberConverter();
    }

    @Test
    public void convert() throws Exception {
        assertEquals("one ", converter.convert(1));
    }

    @Test
    public void convert2() throws Exception {
        assertEquals("two ", converter.convert(2));
    }

    @Test
    public void convert3() throws Exception {
        assertEquals("twenty one ", converter.convert(21));
    }

    @Test
    public void convert91() throws Exception {
        assertEquals("ninety nine ", converter.convert(99));
    }

}