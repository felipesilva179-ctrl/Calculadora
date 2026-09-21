package calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
	
	   @Test
	    void testSubtract() {
	        assertEquals(2, Calculator.subtract(5, 3));
	    }

    @Test
    public void testAdd() {
        assertEquals(4, Calculator.add(2, 2));
    }
}