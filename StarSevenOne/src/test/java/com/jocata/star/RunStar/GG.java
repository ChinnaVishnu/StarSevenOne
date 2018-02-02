package com.jocata.star.RunStar;

import java.util.List;

public class GG {

public static void main(String[] args) {
	PDFTableExtractor extractor = new PDFTableExtractor();
	PDFTableExtractor tables = extractor.setSource("D:\\AUTOMATION REQUIRED DOCS\\UsercasedetailsReport\\l1_user_Rule_Summary_Report_200717_122424_1500533664464_182768.pdf");
	    addPage(0)
	    .addPage(1)
	    .exceptLine(0, null) //the first line in each page
	    .exceptLine(1, null) //the second line in each page
	    .exceptLine(-1, null)//the last line in each page
	    .extract();
	String html = tables.get(0);//table in html format
	String csv = tables.get(0).toString();//table in csv format using semicolon as a delimiter

	
	
}

private static PDFTableExtractor addPage(int i) {
	// TODO Auto-generated method stub
	return null;
}	
	
}
