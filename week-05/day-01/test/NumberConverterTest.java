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
        assertEquals("one", converter.convert(1));
    }

}