package com.jocata.star.workflow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class RiseSTR extends mainbaseLatest {
	
	
	//................................................................................//
	
	
	public void logoutforlevelsecond(){
		
		
		sleep(10);
		driver.findElement(By.xpath(".//*[@id='flip']/img")).click();

		sleep(10);

		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(10);

		driver.findElement(By.xpath("//a[text()='here']")).click();


		
		
	}
	
	
	
	public void clickonsevenoneserver(){
		
		
		//.....switchbcakto 71 sever...........................//
		//String url="http://192.168.0.71:8080/aml/login";
		//driver.get(url);
		
		   impliciteWait(30);
		  driver.get(Repository.getProperty("url"));
		 
		System.out.println("switch back to 71 sever");
	}
	
	
	
	
	

	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
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

	@Test(priority=11)
	public void testforrise() throws InterruptedException {
		latest();
		String user1 = null;
		System.out.println("Switching to Rise Str");

		ExtentTestManager.startTest("  WorkFlow : Rise STR  ");

		sleep(10);

		fluentWait(By.xpath("//span[text()='Case Files']")).click();

		sleep(10);

		fluentWait(By.xpath("//a[text()='Task Board']")).click();

		sleep(8);
		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

		try {

			user1 = fluentWait(By.xpath("//div[3]/div/table/tbody/tr/td/table/tbody/tr/td[2]/div")).getText();

			System.out.println(user1);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		sleep(8);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();

		sleep(8);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By.xpath("//div[3]/div/div/a/span/span/span[2]")).click();

		sleep(10);
		fluentWait(By.xpath(".//*[@id='closureCommCombo-inputEl']")).click();

		sleep(10);
		fluentWait(By.xpath("//li[text()='No Suspicion']")).click();
		sleep(10);
		fluentWait(By.xpath("//div[2]/div/div/a/span/span/span[2]")).click();
		sleep(8);
		fluentWait(By.xpath("//img[@id='tool-1661-toolEl_3']")).click();

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		// try{

		try {

			sleep(12);
			fluentWait(By.xpath("//input[contains(@id,'accTypeCombo')]")).click();
			sleep(12);

			fluentWait(By.xpath("//div[contains(@id,'boundlist')]/following::ul[1]/li[1]")).click();

		} catch (Exception e) {
			sleep(2);
			System.out.println("disble for Accounts  .......second:");

		}

		System.out.println("disble for Accounts: frist");
		sleep(8);
		fluentWait(By.xpath("//div[2]/div/div/span/div/div[2]/div/div/div/div/div[2]/img")).click();
		sleep(8);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By.xpath(".//*[@id='orgnofcaseacc-inputEl']")).sendKeys("cydgchb");
		sleep(8);
		fluentWait(By.xpath(".//*[@id='totalturnover-inputEl']")).sendKeys("bcjhbcjhcb");
		sleep(8);
		fluentWait(By.xpath(".//*[@id='trgrofsuspcn-inputEl']")).sendKeys("hztxf");

		fluentWait(By.xpath(".//*[@id='trnsctnptrndtlobsrvtn-inputEl']")).sendKeys("buycgyut");

		// sleep(8);

		// fluentWait(By.xpath(".//*[@id='saveBtn']")).click();

		sleep(10);
		fluentWait(By.xpath("//div[3]/div[2]/div/div/a/span/span/span[2]")).click();

		sleep(10);
		fluentWait(By.xpath("//div[3]/div/div/a[2]/span/span/span[2]")).click();

		sleep(10);
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();

		sleep(10);
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.scrollBy(0,-450)", "");

		sleep(10);
		fluentWait(By.xpath("//img[@class='x-tool-img x-tool-close']")).click();

		sleep(10);
		driver.findElement(By.xpath(".//*[@id='flip']/img")).click();

		sleep(10);

		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(10);

		driver.findElement(By.xpath("//a[text()='here']")).click();

		sleep(10);
		latestsecondWWW();

		sleep(5);

		fluentWait(By.xpath("//span[text()='Case Files']")).click();
		sleep(5);
		fluentWait(By.xpath("//a[text()='Task Board']")).click();

		sleep(5);

		sleep(5);

		fluentWait(By.xpath(".//*[@id='caseId']")).sendKeys(user1);

		/*
		 * sleep(9);
		 * 
		 * fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();
		 */

		sleep(5);
		fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();

		sleep(9);

		fluentWait(By.xpath("//li[text()='Other Cases']")).click();

		sleep(9);

		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		// .................................................................Search.......................................................//

		sleep(8);
		fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();

		// ....................................clicking WorkFLow
		// .......................................................................//

		sleep(8);
		fluentWait(By.xpath("//div[3]/div/div/a/span/span/span[2]")).click();

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(8);
		fluentWait(By.xpath(".//*[@id='closureCommCombo-inputEl']")).click();
		sleep(8);

		fluentWait(By.xpath("//li[text()='No Suspicion']")).click();
		sleep(8);
		fluentWait(By.xpath("//div[2]/div/div/a/span/span/span[2]")).click();

		// .........clicking the RISE STR

		sleep(8);
		fluentWait(By.xpath("//span[4]/a")).click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(10);
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a[2]")).click();

		/////////////////////////////////////////////////////////

		sleep(88);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By.xpath("//a[contains(@id,'closeBn')]")).click();
		
		sleep(10);
		logoutforlevelsecond();
		sleep(10);
		clickonsevenoneserver();
		

	}

}
