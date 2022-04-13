
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Power {

    private Main main;


    @Before
    public void setUp() {
        main = new Main();
    }

    @Test
    public void power() {
        assertTrue("testcase 3", 16.0 == main.calcpower(4, 2));
        ;
    }
}