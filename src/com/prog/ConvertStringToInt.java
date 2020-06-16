package com.prog;

public class ConvertStringToInt {

	public static void main(String[] args) {

		String s = "200";
		
		int i = Integer.parseInt(s);
		int j = Integer.valueOf(s);
		System.out.println(i);
		System.out.println(j);
	}

}
