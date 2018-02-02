package com.jocata.star.RunStar;

import java.awt.Rectangle;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class JJ {

	public static void main(String[] args) throws IOException {
		
		   PDFTextStripperByArea stripper = new PDFTextStripperByArea();
		   stripper.setSortByPosition( true );
		   Rectangle rect = new Rectangle( 464, 59, 55, 5);
		   stripper.addRegion( "class1", rect );
		   PDPage arg0;
		stripper.extractRegions(arg0);
		   String string = stripper.getTextForRegion( "class1" );

		
	}
	
}
