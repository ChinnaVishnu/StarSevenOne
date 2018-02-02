package com.jocata.star.Mis.Latest;

import java.io.File;

public class HELL4 {

	
	//......................Working Fine............................//
	
	public String strr = null;
	public String clickthridff(){
		File folder = new File("D:\\AUTOMATION REQUIRED DOCS\\MisReportsDownloads");
		File[] listOfFiles = folder.listFiles();

			if (listOfFiles[0].isFile()) {
				File lis = listOfFiles[0];
				 strr = lis.toString();
				 
				 
		
		
	}
			
			return strr;
	}
	
public static void main(String[] args) {
	HELL4 h=new HELL4();

String p=h.clickthridff();
System.out.println(p);
}	
	
}
