package com.jocata.star.misreports.Extraction;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class CaseDetailsReportExtraction extends mainbaseLatest {

	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return foo;
	};

	public void sleep(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=5)
	public void  clickcaseetails() throws HeadlessException, AWTException, IOException, InterruptedException{
		
		
		
		ExtentTestManager.startTest(" MIS Reports :  Case details Report    ");

		fluentWait(By.xpath("//span[text()='CENTRA']")).click();

		fluentWait(By.xpath("//a[text()='MIS Reports']")).click();

		// ...................................UserCaseReportBenchMarkReport........................................................//

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By.xpath("(//img[@title='VIEW'])[5]")).click();
		
		 try{
		WebElement elementuser=driver.findElement(By.xpath("//div[text()='Generating report, please wait...']"));
		
		if(elementuser!=null){
		      WebDriverWait waitse = new WebDriverWait(driver, 10000);
		      waitse.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[text()='Generating report, please wait...']")));
		                 
		}
		 }catch(Exception e){
			 System.out.println("no element");
		 }

		 //Thread.sleep(8000);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"
				+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));
		
		Runtime.getRuntime().exec("D:\\AutoitDownloadsSecond\\batch12_upload.exe");
		
		Thread.sleep(12000);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"
				+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);

		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_END);

		Thread.sleep(3000);

		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(3000);

		robot.keyRelease(KeyEvent.VK_END);

		Thread.sleep(18000);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"
				+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

		robot.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_F4);

		Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_F4);
		Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_ALT);

		System.out.println("pass from frist Second ");

		ExtentTestManager.getTest().log(LogStatus.INFO, "caseDetails Report downloaded sucessfully");

		
	}
	
	
}
