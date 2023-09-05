import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Training2Test {

    Training2 t2;

    @Before
    public void setup() {
        t2 = new Training2();
    }

    @Test
    public void test1() {

        assertEquals(321, t2.reverseRedo(123));
    }

    @Test
    public void test2() {

        assertEquals(485, t2.reverseRedo(584));
    }
}