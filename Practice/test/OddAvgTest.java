import org.junit.Before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

import static org.junit.Assert.*;

public class OddAvgTest {
    OddAvg avg;
    ArrayList testList;

    @Before
    public void name() throws Exception {
        avg = new OddAvg();
        testList = new ArrayList();
    }

    @org.junit.Test
    public void oddAverage() throws Exception {
        assertEquals(0, avg.oddAverage(testList));
    }

    @org.junit.Test
    public void oddAverage2() throws Exception {
        testList.add(2);
        testList.add(4);
        assertEquals(0, avg.oddAverage(testList));
    }

    @org.junit.Test
    public void oddAverage3() throws Exception {
        testList.add(1);
        testList.add(3);
        testList.add(17);
        testList.add(22);
        assertEquals(7, avg.oddAverage(testList));
    }

}