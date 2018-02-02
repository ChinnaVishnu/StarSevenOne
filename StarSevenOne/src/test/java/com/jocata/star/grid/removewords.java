package com.jocata.star.grid;

public class removewords {

	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		 
		//String s = "Error in sending email. User has been added successfully. Please note system generated password is urbwrqg!t2Lfu";
		  String s = "Error in sending email. User has been added successfully. Please note system generated password is ifgxuim3igU!";
  
		
		int indexOfLast = s.lastIndexOf(".");
		  String newString = s;
		  if(indexOfLast >= 0) newString = s.substring(24, indexOfLast);
		  System.out.println(newString); // prints "message.txt"
		 }	
	
}
