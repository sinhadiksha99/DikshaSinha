
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
        assertTrue("test_case 3", 9.0 == main.calcPower(3, 2));
        ;
    }
}