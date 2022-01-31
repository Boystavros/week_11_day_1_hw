import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTests {

    Bottle bottle;

    @Before
    public void before(){
        bottle = new Bottle();
    }

    @Test
    public void testVolumeStarts100(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void testDrink(){
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void testEmpty(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void testFill(){
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }
}
