import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSum(){
        int expected = 3;
        int actual = calculator.sum(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract(){
        int expected = -1;
        int actual = calculator.subtract(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply(){
        int expected = 8;
        int actual = calculator.multiply(4, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide(){
        int expected = 2;
        int actual = calculator.divide(4, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsEven(){
        boolean actual = calculator.isEven(4);
        assertTrue(actual);
    }
}
