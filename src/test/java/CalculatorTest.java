import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        //calculator.add(1,1);
        assertEquals(2, calculator.add(1,1));
    }
    @Test
    public void testSustract(){
        Calculator calculator = new Calculator();
        //calculator.add(1,1);
        assertEquals(0, calculator.sustract(1,1));
    }
    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator();
        //calculator.add(1,1);
        assertEquals(1, calculator.multiply(1,1));
    }
    @Test
    public void testDivide(){
        Calculator calculator = new Calculator();
        //calculator.add(1,1);
        assertEquals(1, calculator.divide(1,1),0.0);
    }
}
