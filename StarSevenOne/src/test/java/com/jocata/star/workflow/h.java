package com.jocata.star.workflow;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
		
		DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
		
		
		Calendar c=Calendar.getInstance();
		c.add(Calendar.DATE, 1);
		Date date1=c.getTime();
		String s=String.valueOf(date1);
		String ss[]=s.split("");
		
		Date date2=new Date();
		System.out.println(dateFormat.format(date1)); 
		System.out.println(dateFormat.format(date2));


		
	/*	String sss=dateFormat.format(date1);
		
		System.out.println(sss);
		*/
	}

}
