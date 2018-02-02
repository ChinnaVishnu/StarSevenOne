package com.jocata.star.workflow;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;


public class CureentdateTime {

	
	
	
	public static  String getCurrentDate()
	{
	    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
	    Date date = new Date();
	    String date1 = dateFormat.format(date);
	   // System.out.println(date1);
	    
	    return date1;
	}
	
	
	public static void main(String[] args) {
		
		//CureentdateTime .getCurrentDate();
		
		
	     CureentdateTime cc=new CureentdateTime();
	     
	     
	       String cureenttoday= cc.getCurrentDate();
	       System.out.println(cureenttoday);  
		
	}
	
	
}
