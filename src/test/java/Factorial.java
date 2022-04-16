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
        assertTrue("test_case 1", 24== main.calcFactorial(4));
        ;
    }

    @Test
    public void factTwo() {
        assertFalse("test_case 2", 24 == main.calcFactorial(7));
        ;
    }

    @Test(expected = IllegalArgumentException.class)
    public void factNegatve() {
        long f = -1;
        main.calcFactorial(-1);
    }
}
