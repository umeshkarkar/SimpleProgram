package ArrayList;

import java.util.Arrays;
import java.util.List;

public class Prob1 {

	public void CountStringAndNumbers(List<String> list){
		
		int stringCount = 0;
		int numberCount=0;
		
		for(int i=0; i<list.size(); i++){
			
			try {
				Integer.parseInt(list.get(i));
				numberCount++;
			} catch (NumberFormatException e) {
				stringCount++;
			}		
		}
		
		System.out.println("Non Numeric Strings: " +  stringCount);
		System.out.println("Numeric Strings: " +  numberCount);
	}
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("abcd", "Pune", "623", "Mumbai", "10");
		
		Prob1 p = new Prob1();
		
		p.CountStringAndNumbers(list);
		

	}

}
