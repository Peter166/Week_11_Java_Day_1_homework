import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    @Before
    public void before(){
        printer = new Printer(10, 7);

    }

    @Test
    public void canPrint(){
        assertEquals(4, printer.print(2,3));
    }
    @Test
    public void decreaseToner(){
        printer.print(2, 3);
        assertEquals(1, printer.getToner());
    }

}
