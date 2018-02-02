package com.jocata.star.exportexcels;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.GetScreenshortAAAA;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class CustomerPeerProfile extends mainbaseLatest {

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

	@Test(priority = 34)
	public void login() throws HeadlessException, IOException, AWTException {

		clickDashboard();
	}

	public void clickDashboard() throws IOException, HeadlessException, AWTException {

		try {

			ExtentTestManager.startTest(" Task Board – Peer Profile -Activity Graph ");
			sleep(6);

			fluentWait(By.xpath("//span[text()='Case Files']")).click();

			sleep(6);

			fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();

			// ..........................................................Case
			// Type............................................................//
			
			
			sleep(6);

			WebElement element=	driver.findElement(By.xpath("//td[2]/div"));
			Actions action=new Actions(driver);
			
			action.moveToElement(element).build().perform();
			
			action.click().build().perform();
			
			sleep(6);
			driver.findElement(By.xpath("//td[2]/div")).click();

			sleep(6);	

			//driver.findElement(By.xpath("//li[text()='Other Cases']")).click();

		   driver.findElement(By.xpath("//li[3]/span")).click();
			
			/*sleep(9);

			fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();

			sleep(14);
			fluentWait(By.xpath("//li[text()='Other Cases']")).click();*/

			// .................................................................Search.......................................................//

			sleep(9);

			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

			fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();

			sleep(12);

			// .................................clicking the customer and peer
			// groups............................................//

			// driver.findElement(By.xpath("//img[@id='tool-1378-toolEl']")).click();

			fluentWait(By.xpath("//div[starts-with(@id,'peerPanel')]//div[5]")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(9);

			String peer = driver.findElement(By.xpath("//span[contains(@id,'peerPane')]")).getText();
			;

			ExtentTestManager.getTest().log(LogStatus.INFO, peer);

			fluentWait(By.xpath("//div[starts-with(@id,'messagebox-')]//img")).click();

			sleep(12);

			fluentWait(By.xpath("//div[contains(@id,'peerPanel')]//div[4]")).click();

			// fluentWait(By.xpath("//div[@id='peerPanel24210_header']//div[4]")).click();
			// fluentWait(By.xpath("//div[@id='peerPanel24203_header-targetEl']/div[4]")).click();

			sleep(12);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

			Runtime.getRuntime().exec("D:\\AUTOMATION REQUIRED DOCS\\WebDriverdownloads\\batch12_upload.exe");

			sleep(12);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

			System.out.println("pass");

			ExtentTestManager.getTest().log(LogStatus.INFO,"  Customer and Peer Group Profiles  exported successfully ");

			
			sleep(12);
			fluentWait(By.xpath("//div[contains(@id,'graphActivity')]//div[contains(@id,'tool-')]")).click();

			sleep(12);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.testrobot("ScreenshortForExtentReport")));

			// ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow
			// :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.test("ScreenshortForExtentReport")));

			// sleep(13);

			// robot();

			System.out.println("pass");

			sleep(8);

			Runtime.getRuntime().exec("D:\\AUTOMATION REQUIRED DOCS\\WebDriverdownloads\\batch12_upload.exe");

			// robot();

			sleep(12);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.testrobot("ScreenshortForExtentReport")));

			sleep(4);

			System.out.println("pass");
			
			ExtentTestManager.getTest().log(LogStatus.INFO,"  Activity Graph   exported successfully ");


		} catch (Exception e) {

			sleep(19);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.navigate().refresh();

			System.out.println("referesh................");

			ExtentTestManager.getTest().log(LogStatus.FAIL, "Missing Modules ");

		}

	}
}
