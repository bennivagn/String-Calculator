package is.ru.stringcalculator;

public class Calculator {
	
	
	public static int add(String text) throws Exception
	{
		text = filterString(text);
		String[] numbers = text.split(",");
		
		if (text == "")
		{
			return 0;
		}
		
		validatenumbers(numbers);
		if(text.length() == 1)
		{
			return Integer.parseInt(text);
		}
		
		else
		{
			return sum(numbers);
		}
	}
	
	private static String filterString(String text)
	{
		text = text.replace("\n", ",");
		return text;
	}
	
	private static void validatenumbers(String[] numbers) throws Exception
	{
		for(int i = 0; i < numbers.length;i++)
		{
			if(Integer.parseInt(numbers[i]) < 0)
			{
				throw new IllegalArgumentException("Negatives not allowed");
			}

		}

	}
	
	private static int sum(String[] stringarray) throws Exception
	{
		int totalsum = 0;
		for(int i = 0; i < stringarray.length;i++)
		{
			totalsum += Integer.parseInt(stringarray[i]);
		}
		
		return totalsum;
	}

}