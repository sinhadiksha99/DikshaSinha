import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Factorial {

    private Main main;


    @Before
    public void setUp() {
        main = new Main();
    }

    @Test
    public void factOne() {
        assertTrue("testcase 1", 120== main.calcfact(5));
        ;
    }

    @Test
    public void factTwo() {
        assertFalse("testcase 2", 120 == main.calcfact(6));
        ;
    }

    @Test(expected = IllegalArgumentException.class)
    public void factNegatve() {
        long f = -1;
        main.calcfact(-1);
    }
}
