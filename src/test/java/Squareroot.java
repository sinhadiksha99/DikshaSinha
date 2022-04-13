import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Squareroot {

    private Main main;


    @Before
    public void setUp() {
        main = new Main();
    }

    @Test
    public void sqrt()
    {
        assertTrue("testcase 1", 4.0 == main.calcsqroot(16.0));
        ;
    }

    @Test(expected = IllegalArgumentException.class)
    public void sqrtNegatve() {
        long f = -1;
        main.calcsqroot(-1.0);
    }
}
