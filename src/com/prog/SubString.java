package com.prog;

public class SubString {

	public static void main(String[] args) {
		
		String s = "UmeshKarkar";
		
		//System.out.println(s.substring(0,5));
		//System.out.println(s.substring(5));

		//System.out.println(s.startsWith("Um"));
		//System.out.println(s.endsWith("ar"));
		
		System.out.println(s.length());
		
		for(int i=0; i<s.length(); i++){
		System.out.print(s.charAt(i)+""+s.charAt(i));
		}
		
	}

}
