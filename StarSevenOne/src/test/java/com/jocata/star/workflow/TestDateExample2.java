package com.jocata.star.workflow;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDateExample2 {

	 public static void main(String[] argv) {

	        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
	        Date dt = new Date();
	        Calendar c = Calendar.getInstance();
	        c.setTime(dt); 

	        c.add(Calendar.DATE, 1);

	        String dateInString = "09/10/15";

	        try {

	            Date date = formatter.parse(dateInString);
	            System.out.println(date);
	            System.out.println(formatter.format(date));
	            
	      String datesecond=      formatter.format(date);
	      System.out.println(datesecond);
	            

	        } catch (ParseException e) {
	            e.printStackTrace();
	        }

	    }	
	
}
