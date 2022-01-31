import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTests {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void testGetRemainingSheets(){
        assertEquals(100, printer.getRemainingSheets());
    }

    @Test
    public void testPrint(){
        printer.print(5, 10);
        assertEquals(50, printer.getRemainingSheets());
    }

    @Test
    public void testPrintWithToner(){
        printer.print(5, 5);
        assertEquals(75, printer.getRemainingSheets());
        assertEquals(75, printer.getRemainingToner());
    }


}
