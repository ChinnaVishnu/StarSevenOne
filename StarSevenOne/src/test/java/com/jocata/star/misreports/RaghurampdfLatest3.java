package com.jocata.star.misreports;

import java.io.File;
import java.io.FileInputStream;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class RaghurampdfLatest3 {


	
	
	
	
	public static  String verifyPDFContent(String reqTextInPDF) {
		
		boolean flag = false;
		String resultText;
		PDFTextStripper pdfStripper = null;
		PDDocument pdDoc = null;
		COSDocument cosDoc = null;
		String parsedText = null;

		try {
			File file = new File("D:\\AUTOMATION REQUIRED DOCS\\AadharUpload\\l1_user_User_Case_Details_Report_130717_115839_1499970519894_182704.pdf");

			PDFParser parser = new PDFParser(new FileInputStream(file));
			
			parser.parse();
			cosDoc = parser.getDocument();
			pdfStripper = new PDFTextStripper();
			pdfStripper.setStartPage(1);
			pdfStripper.setEndPage(28278);
			
			pdDoc = new PDDocument(cosDoc);
			parsedText = pdfStripper.getText(pdDoc);
		} catch (NullPointerException e2) {
			System.err.println("URL string could not be parsed "+e2.getMessage());
		} catch (Exception e) {
			System.err.println("Unable to open PDF Parser. " + e.getMessage());
			try {
				if (cosDoc != null)
					cosDoc.close();
				if (pdDoc != null)
					pdDoc.close();
			} catch (Exception e1) {
				e.printStackTrace();
			}
		}
		
		System.out.println("+++++++++++++++++");
		//System.out.println(parsedText);
		System.out.println("+++++++++++++++++");

		if(parsedText.contains(reqTextInPDF)) {
			System.out.println(reqTextInPDF);
			resultText = reqTextInPDF;
			flag=true;
		}
		
		return reqTextInPDF;
	}
	

 
 
	public static void main(String[] args) {
		
	String tt=	RaghurampdfLatest3.verifyPDFContent("S.NO");
	
	System.out.println("this is main : "+tt);
	}
	
	
	
	
}
