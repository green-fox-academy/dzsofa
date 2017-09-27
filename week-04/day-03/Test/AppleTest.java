import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    Apple apple = new Apple();

    @Test
    public void testAppleName() throws Exception {
        assertEquals("apple", apple.getApple());
    }
}