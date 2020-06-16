package com.prog;

public class PrintEveryLetterTwice {
	
	public static void main(String[] args) {
		
		String str = "karkar";
		//StringBuilder str2 = new StringBuilder("");
		
		for(int i=0; i<str.length(); i++)
		{
			System.out.print(str.charAt(i)+""+str.charAt(i));
			//str2.append(str.charAt(i)).append(str.charAt(i));
		}
		//System.out.println(str2);
	}

}
