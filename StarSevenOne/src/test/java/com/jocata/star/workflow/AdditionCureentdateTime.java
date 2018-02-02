package com.jocata.star.workflow;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AdditionCureentdateTime {
	
	

	public static  String getCurrentDate()
	{
		
		DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
		
		
		Calendar c=Calendar.getInstance();
		c.add(Calendar.DATE, 1);
		Date date=c.getTime();
		String s=String.valueOf(date);
		String ss[]=s.split("");
		System.out.println(dateFormat.format(date));

		
		
		return dateFormat.format(date);
	
		
		
		
	}
	

	
	public static void main(String[] args) {
		

		AdditionCureentdateTime.getCurrentDate();
		
		
		
		
	}
	
}
