package com.prog;

public class ConvertIntToString {

	public static void main(String[] args) {

		int i = 200;
		
		//String s = String.valueOf(i);
		//String s = Integer.toString(i);
		String s = String.format("%d", i);
		System.out.println(i+100);
		System.out.println(s+100);
	}

}
