import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(3, calculator.add(2, 1));
    }

    @Test
    public void testSubtract(){
        assertEquals(2, calculator.subtract(3, 1));
    }

    @Test
    public void testMultiply(){
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide(){
        assertEquals(2, calculator.divide(4.0, 2.0), 0.0);
    }

}
