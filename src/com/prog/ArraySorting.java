package com.prog;

public class ArraySorting {

	public static void main(String[] args) {
		

		int arr[]= {10, 2, 5, 4, 6, 17, 11, 22};
		int temp =0;
		
		System.out.println("Original array is ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0; i<arr.length; i++){
			
			for(int j=i+1; j<arr.length; j++){
				
				if(arr[i]>arr[j]){
					
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("\narray of ascending order is");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

}
