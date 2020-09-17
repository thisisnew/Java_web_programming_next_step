package Ch02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	int add(String text) {
		if (text == null || text.isEmpty()) {
			return 0;
		}
		
		return sum(toInts(split(text)));
	}
	
	private int[] toInts(String[] values) {
		int[] numbers = new int[values.length];
		for(int i=0; i<values.length; i++) {
			numbers[i] = toPositive(values[i]);
		}
		
		return numbers;
	}
	
	private int sum(int[] numbers) {
		int sum = 0;
		
		for(int number : numbers) {
			sum += number;
		}
		
		return sum;
	}
	
	private String[] split(String text) {
		
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
		if(m.find()) {
			String customDelimeter = m.group(1);
			return m.group(2).split(customDelimeter);
		}
		
		return text.split(",|:");
	}
	
	private int toPositive(String value) {
		int number = Integer.parseInt(value);
		if(number < 0) {
			throw new RuntimeException();
		}
		return number;
	}
}
