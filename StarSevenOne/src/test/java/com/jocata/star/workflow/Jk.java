package com.jocata.star.workflow;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Jk {

	public static void main(String[] args) throws ParseException {
		
		 //String expectedPattern = "MMdd/yy";
	    SimpleDateFormat formatter = new SimpleDateFormat();

		String cs = "09/10/15";
		 Date date = formatter.parse(cs);
		 
		 
		System.out.println(date);
		
		//SimpleDateFormat
		//Calendar classees
		
	}

}
