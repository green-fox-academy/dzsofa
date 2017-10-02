import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GetIndexTest {
    GetIndex index;
    ArrayList testList;

    @Before
    public void name() throws Exception {
        index = new GetIndex();
        testList = new ArrayList();
    }

    @Test
    public void getIndex() throws Exception {
        assertEquals(0, index.getIndex(1, testList));
    }

    @Test
    public void getIndex2() throws Exception {
        assertEquals(-1, index.getIndex(100, testList));
    }


}