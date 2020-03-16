import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {
    WaterBottle bottle;
    @Before
    public void before(){
        bottle = new WaterBottle(100);
    }

    @Test
    public void hasValume(){
        assertEquals(100, bottle.volume());
    }

    @Test
    public void willDrink(){
        assertEquals(90, bottle.drink());
    }


    @Test
    public void willEmpty(){
        assertEquals(0, bottle.empty());
    }

    @Test
    public void willFill(){
        assertEquals(100, bottle.fill());
    }

}
