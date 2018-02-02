package com.jocata.star.misreports;

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
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class Misreports2 extends mainbaseLatest {

	//...........Working fine...........................................//
	
	public void sleep(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(69, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return foo;
	};
	
	@Test(priority = 36)
	public void clickingmisreports() throws InterruptedException, IOException, HeadlessException, AWTException {

		ExtentTestManager.startTest(" MIS Reports :  Report on current Cases  ");


		fluentWait(By.xpath("//span[text()='CENTRA']")).click();


		fluentWait(By.xpath("//a[text()='MIS Reports']")).click();


		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));


		fluentWait(By.xpath("(//img[@title='VIEW'])[1]")).click();

		Thread.sleep(10000);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"
				+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

		Runtime.getRuntime().exec("D:\\AutoitDownloadsSecond\\batch12_upload.exe");

		//Runtime.getRuntime().exec("D:\\AUTOMATION REQUIRED DOCS\\WebDriverdownloads\\batch12_upload.exe");
		
		
		Thread.sleep(10000);
		
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
		
		
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"
					+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));


		
		 Thread.sleep(15000);		
		 
		robot.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_F4);
		
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_F4);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_ALT);
		
		System.out.println("pass");
		
		
		ExtentTestManager.getTest().log(LogStatus.INFO,"Report on current Cases downloaded sucessfully");
		
}
}
