package com.jocata.star.RunStar;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import junit.framework.Assert;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReadPDFFine2 {

	public static PDFTextStripper pdfStripper = null;
	public static PDDocument pdDoc = null;
	public static COSDocument cosDoc = null;
	public static String parsedText = null;

	public static String valid() throws IOException {

		File folder = new File("D:\\AUTOMATION REQUIRED DOCS\\UsercasedetailsReport");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				File listoffiles = listOfFiles[i];
				String strr = listoffiles.toString();

				System.out.println(strr);

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
		}

		return parsedText;

	}

	public static void main(String[] args) throws IOException {
	String vv=	ReadPDFFine2.valid();
	//System.out.println(vv);
	 String[] linesArray=vv.split("\\n");
	    String lastLineString= linesArray[linesArray.length-11];
	    String[] str=lastLineString.split(" ");

	    System.out.println(" last line number " + str[0]);

	}
}