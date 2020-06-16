package Assignments;

import java.util.Arrays;

public class Problem2 {
	
	// method accepting int array.
	// method to return 3rd largest element from array.
	public int get3rdLargestElement(int[] arr) {
		
		// check the array containing 3 or more elements then only sort and return 3rd largest
		if(arr.length >= 3) {
			// Using inbuilt library function to sort the array.
			Arrays.sort(arr); // after this array will be {2, 4, 5, 6, 10, 11, 17, 22}
			
			int element = arr[arr.length-3];
			System.out.println("Third Largest Element from array is: "+ element);
			return element;
		}
		// if array contains less than 3 elements then return min value integer using Integer.MIN_VALUE.
		// default value for Integer.MIN_VALUE is -2147483648
		return Integer.MIN_VALUE;
	}

	public static void main(String[] args) {
		// initializing array with 8 elements
		int[] arr = {10, 2, 5, 4, 6, 17, 11, 22};
		
		// creating object of class to invoke instance method
		Problem2 problem2 = new Problem2();
		
		// object dot method by passing array of integers.
		// method is returning integer that will get stored in element variable.
		int element = problem2.get3rdLargestElement(arr);
		if(element == Integer.MIN_VALUE) {
			System.out.println("Array contains less than 3 elements.");
		}else {
			
			System.out.println("Third Largest Element is already printed inside method." + Integer.MIN_VALUE);
		}
	}

}
