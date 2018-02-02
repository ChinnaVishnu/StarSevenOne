package com.jocata.star.misreports.excatpdf;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.RunStar.ReadPDFFine2;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.mainbaseLatest;
import com.jocata.star.reportsdownload.SeleniumDBTest2;
import com.relevantcodes.extentreports.LogStatus;

public class UsercaseDetailsReport3 extends mainbaseLatest {

	//..................not working............................................................................//
	
	public static FirefoxProfile FirefoxDriverProfile() throws Exception {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.download.dir", getDownloadLocation());
		profile.setPreference("browser.helperApps.neverAsk.openFile",
				"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
				"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference("browser.download.manager.focusWhenStarting", false);
		profile.setPreference("browser.download.manager.useWindow", false);
		profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		profile.setPreference("browser.download.manager.closeWhenDone", false);
		return profile;
	}

	public static String getDownloadLocation() {
		String DownloadPath = "D:\\AUTOMATION REQUIRED DOCS\\UsercasedetailsReport";
		return DownloadPath;
	}

	public void validations() throws IOException {

		String vv = ReadPDFFine2.valid();
		// System.out.println(vv);
		String[] linesArray = vv.split("\\n");
		String lastLineString = linesArray[linesArray.length - 17];
		String[] str = lastLineString.split(" ");

		System.out.println(" last line number " + str[0]);
		System.out.println(" No of Reords in PDF file " + str[0]);
		ExtentTestManager.getTest().log(LogStatus.INFO, " No of Reords in PDF file " + str[0]);

		String rr = SeleniumDBTest2.getEmployeesFromDataBase();
		System.out.println(" No of Reords in Database" + rr);
		ExtentTestManager.getTest().log(LogStatus.INFO, " No of Reords in Database" + rr);

		if (str[0].equals(rr)) {
			System.out.println("pass");
			ExtentTestManager.getTest().log(LogStatus.PASS, "Pass");
		} else {
			System.out.println("fail");
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Fail");

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

	public void clickingmisreports() throws Exception {

		ExtentTestManager.startTest(" MIS Reports : User Case Details Report ");

		Thread.sleep(8000);
		fluentWait(By.xpath("//span[text()='CENTRA']")).click();

		fluentWait(By.xpath("//a[text()='MIS Reports']")).click();

		fluentWait(By.xpath("(//img[@title='VIEW'])[1]")).click();

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		Thread.sleep(8000);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"
				+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

		Runtime.getRuntime().exec("D:\\AutoitDownloadsSecond\\batch12_upload.exe");  //open with

		Thread.sleep(15000);

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

		Thread.sleep(20000);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"
				+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

		robot.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_F4);

		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_F4);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_ALT);

		System.out.println("pass from frist Second ");

	}

	@Test
	public void clicusercasedetails() throws Exception {

		clickingmisreports();
		clicklatest();
		Thread.sleep(18000);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));


		driver.findElement(By.xpath("//span[text()='CENTRA']")).click();
		Thread.sleep(18000);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));


		driver.findElement(By.xpath("//a[text()='MIS Reports']")).click();

	}

	public void clicklatest() throws Exception {
		driver = new FirefoxDriver(FirefoxDriverProfile());
		driver.get("http://192.168.0.71:8080/aml/login");

		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='unme']")).sendKeys("l1_user");
		driver.findElement(By.xpath(".//*[@id='pwdt']")).sendKeys("Star@123");
		driver.findElement(By.xpath(".//*[@id='loginButtonExt-btnIconEl']")).click();

		Thread.sleep(8000);
		fluentWait(By.xpath("//span[text()='CENTRA']")).click();
		Thread.sleep(8000);
		fluentWait(By.xpath("//a[text()='MIS Reports']")).click();

		fluentWait(By.xpath("(//img[@title='VIEW'])[1]")).click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		Thread.sleep(8000);

		Runtime.getRuntime().exec("D:\\AUTOMATION REQUIRED DOCS\\WebDriverdownloads\\batch12_upload.exe"); //save file

		Thread.sleep(8000);
		FirefoxDriverProfile();
		Thread.sleep(18000);
		System.out.println("pass from frist one ");

		ExtentTestManager.getTest().log(LogStatus.INFO, "UsercaseDetailsReport downloaded sucessfully");

		validations();

		Thread.sleep(8000);
		
		driver.close();
		
		
	   /* String base = driver.getWindowHandle();

	    Set <String> set = driver.getWindowHandles();

	    set.remove(base);
	    assert set.size()==1;

	    driver.switchTo().window(set.toArray(new String[0]));

	    driver.close();
	    driver.switchTo().window(base);*/
		

		/*String mainhandlekaranataka = driver.getWindowHandle();

		String childhandlekaranataka = "";

		Set<String> handleskaranataka = driver.getWindowHandles();

		for (String handle : handleskaranataka) {

			if (!handle.equals(mainhandlekaranataka)) {

				childhandlekaranataka = handle;

			}

		}

		driver.switchTo().window(childhandlekaranataka);
		driver.close();*/
		//driver.switchTo().window(mainhandlekaranataka);

		// driver.quit();

	}

	
	
//................................................................................................................................//	
	
	
	
	
	
	

}
