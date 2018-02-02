package com.jocata.star.RunStar;

import java.util.List;

public class hi {

	public static void main(String[] args) {
		
		PDFTableExtractor extractor = new PDFTableExtractor();
		List<Table> tables = extractor.setSource("D:\\AUTOMATION REQUIRED DOCS\\AadharUpload\\l1_user_User_Case_Details_Report_130717_115839_1499970519894_182704.pdf")
		    .addPage(0)
		    .addPage(1)
		    .extract();
		String html = tables.get(0).toHtml();//table in html format
		String csv = tables.get(0).toString();
		
	}
	
}
