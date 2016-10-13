package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{
	
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	
	@Test
	public void testSumOneNumber() {
		assertEquals(7, Calculator.add("7"));
	}
	
	@Test
	public void testSumsTwoNumbers() {
		assertEquals(7, Calculator.add("3,4"));
	}
}