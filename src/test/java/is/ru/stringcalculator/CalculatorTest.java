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
	
	@Test
	public void testSumOfMany1() {
		assertEquals(25,Calculator.add("10,10,5"));
	}
	
	@Test
	public void testSumOfMany2() {
		assertEquals(2000,Calculator.add("1000,500,500"));
	}
	
	@Test
	public void testSumOfMany3() {
		assertEquals(695,Calculator.add("54,23,92,521,5"));
	}
	
	@Test
	public void addWithNewLine()
	{
		assertEquals(6,Calculator.add("1\n2,3"));
	}
}