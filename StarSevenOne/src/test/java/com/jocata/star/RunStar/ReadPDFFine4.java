package com.jocata.star.RunStar;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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

public class ReadPDFFine4 {

	public static PDFTextStripper pdfStripper = null;
	public static PDDocument pdDoc = null;
	public static COSDocument cosDoc = null;
	public static String parsedText = null;

	public static String valid() throws IOException {

		File folder = new File("D:\\AUTOMATION REQUIRED DOCS\\MisReportsDownloads");
		File[] listOfFiles = folder.listFiles();

		//for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[3].isFile()) {
				File lis = listOfFiles[3];
				String strr = lis.toString();

				System.out.println(strr);
				//System.out.println(li.get(0));

			/*	File file = new File(strr);
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
				
				 String tezt=parsedText;*/
				    
			

			//}
		}

		return parsedText;

	}

	public static void main(String[] args) throws IOException {
	String vv=	ReadPDFFine4.valid();
	//System.out.println(vv);
	

	}
}