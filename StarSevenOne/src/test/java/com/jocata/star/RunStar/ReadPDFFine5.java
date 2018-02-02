package com.jocata.star.RunStar;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class ReadPDFFine5 {
	public static PDFTextStripper pdfStripper = null;
	public static PDDocument pdDoc = null;
	public static COSDocument cosDoc = null;
	public static String parsedText = null;
	public static String strr;
	
	public static String valid() throws IOException {

		File folder = new File("D:\\AUTOMATION REQUIRED DOCS\\MisReportsDownloads");
		File[] listOfFiles = folder.listFiles();

			if (listOfFiles[3].isFile()) {
				File lis = listOfFiles[3];
				String strr = lis.toString();
				//System.out.println(strr);
				File file = new File(strr);
				PDFParser parser = null;
				try {
					parser = new PDFParser(new FileInputStream(file));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				parser.parse();
				cosDoc = parser.getDocument();
				pdfStripper = new PDFTextStripper();
				pdfStripper.setStartPage(1);
				pdfStripper.setEndPage(3000);

				pdDoc = new PDDocument(cosDoc);
				parsedText = pdfStripper.getText(pdDoc);
				
				 String tezt=parsedText;
				
				

				}
			return parsedText;

		
	}

	public static void main(String[] args) throws IOException {
	String vv=	ReadPDFFine5.valid();
	System.out.println(vv);
	

	}
}