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
        assertTrue("test_case 1", 5.0 == main.calcSqroot(25.0));
        ;
    }

    @Test(expected = IllegalArgumentException.class)
    public void sqrtNegatve() {
        long f = -1;
        main.calcSqroot(-1.0);
    }
}
