import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testSubtract_shouldSubtractNotAdd() {
        calculator.add(10);
        calculator.subtract(4);
        
        assertEquals(6, calculator.getResult());
    }

    @Test
    public void testMultiply_shouldMultiplyDirectly() {
        calculator.add(3);
        calculator.multiply(4);
        assertEquals(12, calculator.getResult());
    }

    @Test
    public void testExponent_shouldComputePower() {
        calculator.add(2);
        calculator.exponent(3);
        assertEquals(8, calculator.getResult());
    }
}
