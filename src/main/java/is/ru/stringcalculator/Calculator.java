package is.ru.stringcalculator;

public class Calculator {
	
	
	public static int add(String text){
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
			return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
		}
	}

}