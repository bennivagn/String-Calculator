package is.ru.stringcalculator;

public class Calculator {
	
	
	public static int add(String text){
		text = filterString(text);
		String[] numbers = text.split(",");
		if (text == "")
		{
			return 0;
		}
		
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
	
	private static int sum(String[] stringarray)
	{
		int totalsum = 0;
		for(int i = 0; i < stringarray.length;i++)
		{
			totalsum += Integer.parseInt(stringarray[i]);
		}
		
		return totalsum;
	}

}