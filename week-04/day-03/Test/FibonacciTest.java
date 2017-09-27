import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fibonacci() throws Exception {
        assertEquals(21, Fibonacci.fibonacci(8));
    }

}