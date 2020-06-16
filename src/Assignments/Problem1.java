package Assignments;
import java.util.Arrays;
import java.util.List;

public class Problem1 {
	
	// method accepting list of strings.
	// method to count number of numeric and no numeric strings.
	public void printCountOfStringAndNumbers(List<String> list) {
		
		int stringCount = 0; // counter to count number of strings(no numeric) 
		int numberCount = 0; // counter to count number of strings(numeric)
		
		// iterate over list using loop to count numeric and non numeric strings.
				
		for(int i=0; i<list.size(); i++)
		{
			try 
			{ 	Integer.parseInt(list.get(i));
				numberCount++;
			} catch (NumberFormatException e) 
			{
				stringCount++;
			}
		}
		
		/*for(String str : list) {
			
			// Integer.parseInt(str); converts string to number, 
			// if the string does not contain a parsable integer then it throws Throws:NumberFormatException
			try {
				Integer.parseInt(str);
				// If exception is not thrown it means It is parsable integer so we are incrementing numberCount 
				numberCount++;
			}catch(NumberFormatException e) {
				// If Exception is thrown it means , It is non numeric string thats why we are incrementing stringCounter here
				stringCount++;
			}
		}*/
		
		//Here we are printing both the counter values
		System.out.println("Non Numeric Strings: " +  stringCount);
		System.out.println("Numeric Strings: " +  numberCount);
	}

	public static void main(String[] args) {
		
		// Created list of strings.
		// Arrays.asList method returns list of strings.
		List<String> list = Arrays.asList("abcd", "Pune", "623", "Mumbai", "10","abdc12");
		
		// Created object of class 
		Problem1 problem1 = new Problem1();
		
		// object dot instance method by passing list of strings.
		problem1.printCountOfStringAndNumbers(list);
	}

}