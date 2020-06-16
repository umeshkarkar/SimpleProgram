package com.prog;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringToDate {

	public static void main(String[] args) throws ParseException {

		String s = "18/11/2019";
		
		Date sDate1 = new SimpleDateFormat("dd/mm/yyyy").parse(s);
		System.out.println(s+"\t"+sDate1);

	}

}
