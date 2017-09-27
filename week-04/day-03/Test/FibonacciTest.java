import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fibonacci() throws Exception {
        assertEquals(21, Fibonacci.fibonacci(8));
    }

    @Test
    public void fibonacci0() throws Exception {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    public void fibonacci1() throws Exception {
        assertEquals(1, Fibonacci.fibonacci(1));
    }
}