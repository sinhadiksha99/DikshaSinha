import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Naturallog {

    private Main main;


    @Before
    public void setUp() {
        main = new Main();
    }

    @Test
    public void log()
    {
        assertTrue("test_case 4", 0.6931471805599453 == main.calcnatlog(2.0));
        ;
    }

    @Test(expected = IllegalArgumentException.class)
    public void logNegatve() {
        long f = -1;
        main.calcnatlog(-1.0);
    }
}