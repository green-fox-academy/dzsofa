import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

    Sum numbers = new Sum();


    @Before
    public void setUp() throws Exception {
        numbers.addNumber(15);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sum() throws Exception {
        assertEquals(15, numbers.sum());

    }

}