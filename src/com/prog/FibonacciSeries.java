package com.prog;

public class FibonacciSeries {

/* 7!=0, 1, 1, 2, 3, 5, 8 
 *    
 */
	public static void main(String[] args) {
		
		int num1=0, num2=1;
		int count= 7;
		
		for(int i=1; i<=count; i++){
			
			System.out.print(num1+" ");
			
			int sumofPreTwo =num1+num2;
			
			num1= num2;
			num2=sumofPreTwo;
		}
	}
}
