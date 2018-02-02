package com.jocata.star.Mis.Latest;

import java.io.File;

public class HELL3 {

	
	//......................Working Fine............................//
	
	public String strr = null;
	public String clickthrid(){
		File folder = new File("D:\\AUTOMATION REQUIRED DOCS\\MisReportsDownloads");
		File[] listOfFiles = folder.listFiles();

			if (listOfFiles[0].isFile()) {
				File lis = listOfFiles[0];
				 strr = lis.toString();
				 
				 
		
		
	}
			
			return strr;
	}
	
public static void main(String[] args) {
	HELL3 h=new HELL3();

String p=h.clickthrid();
System.out.println(p);
}	
	
}
