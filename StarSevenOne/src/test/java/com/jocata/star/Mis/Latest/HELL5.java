package com.jocata.star.Mis.Latest;

import java.io.File;

public class HELL5 {

	
	//......................Working Fine............................//
	
	public String strr = null;
	public String clickthridff(){
		File folder = new File("D:\\AUTOMATION REQUIRED DOCS\\MisReportsDownloads");
		File[] listOfFiles = folder.listFiles();

			if (listOfFiles[1].isFile()) {
				File lis = listOfFiles[1];
				 strr = lis.toString();
				 
				 
		
		
	}
			
			return strr;
	}
	
public static void main(String[] args) {
	HELL5 h=new HELL5();

String p=h.clickthridff();
System.out.println(p);
}	
	
}
