package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{

	
	@Test
	public void testEmptyString() throws Exception{
		assertEquals(0, Calculator.add(""));
	}
	
	@Test
	public void testSumOneNumber() throws Exception{
		assertEquals(7, Calculator.add("7"));
	}
	
	@Test
	public void testSumsTwoNumbers() throws Exception{
		assertEquals(7, Calculator.add("3,4"));
	}
	
	@Test
	public void testSumOfMany1() throws Exception{
		assertEquals(25,Calculator.add("10,10,5"));
	}
	
	@Test
	public void testSumOfMany2() throws Exception{
		assertEquals(2000,Calculator.add("1000,500,500"));
	}
	
	@Test
	public void testSumOfMany3() throws Exception{
		assertEquals(695,Calculator.add("54,23,92,521,5"));
	}
	
	@Test
	public void addWithNewLine() throws Exception
	{
		assertEquals(6,Calculator.add("1\n2,3"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void negativeInput() throws Exception
	{
		
		Calculator.add("4,1,10,-542");
	}
	
	@Test
	public void testLargeNumber() throws Exception
	{
		assertEquals(10,Calculator.add("2532,10,5532"));
	}
	
}