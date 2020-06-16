package ArrayList;

import java.util.Arrays;

public class MoveAllZerosAtEnd {

	public static void main(String[] args) {
		 
		int[] arr = new int[] { 8, 8, 3, 0, 4, 0, 6, 0, 9, 1 };
		int temp =0;
		
		System.out.println("Original array: " + Arrays.toString(arr));

		// Move 0 to end of array
		int j = 0;
		for (int i = 0; i <arr.length; i++)
		{
			if (arr[i] != 0) {
			    temp = arr[j];//temp=0,1
				arr[j] = arr[i];//a[0]=8,8
				arr[i] = temp;//a[0]=8,8
				j++;
			}
		}
		System.out.println("\nMove Zero element at the end: " + Arrays.toString(arr));
		
 
	}
}
