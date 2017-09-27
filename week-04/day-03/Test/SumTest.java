import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

    Sum zero = new Sum();
    Sum oneNumber = new Sum();
    Sum multipleNumbers = new Sum();
    Sum empty = new Sum();

    @Before
    public void setUp() throws Exception {
        zero.addNumber(0);
        oneNumber.addNumber(5);
        multipleNumbers.addNumber(1);
        multipleNumbers.addNumber(2);
        multipleNumbers.addNumber(3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sum() throws Exception {
        assertEquals(5, oneNumber.sum());
    }

    @Test
    public void sum2() throws Exception {
        assertEquals(6, multipleNumbers.sum());
    }

    @Test
    public void sum3() throws Exception {
        assertEquals(0, zero.sum());
    }

    @Test
    public void sum4() throws Exception {
        assertEquals(0, empty.sum());
    }
}