import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Vector3DTest {

    private Vector3D v;

    @Before
    public void setup() {
        v = new Vector3D(5, 0, 0);
    }

    @Test
    public void testConstructor() {


        assertEquals( 5, v.getX(), 0);
        assertEquals( 0, v.getY(), 0);
        assertEquals( 0, v.getZ(), 0);
    }

    @Test
    public void testAdd() {


        Vector3D ab2 = new Vector3D(0,5,0);
        Vector3D ab3 = new Vector3D(0,0,5);

        assertEquals(90, v.angleBetween(ab2),0);
        assertEquals(90, v.angleBetween(ab3),0);
    }
}