package ArrayList;

import java.util.Arrays;

public class Prob2 {
	
	public void FindLargestNumber(int[] arr){
		
		if(arr.length>=3){
			
			Arrays.sort(arr); 
			
			int element = arr[arr.length-3];
			System.out.println("Third Largest Element from array is: "+ element);		
		}	
	}

	public static void main(String[] args) {
		
		int[] arr= {10, 2, 5, 4, 6, 17, 11, 22};
		
		Prob2 p1 = new Prob2();
		
		 p1.FindLargestNumber(arr);
		
	}

}
