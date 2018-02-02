package com.jocata.star.includeexculde;

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

public class GridModules2 extends mainbaseLatest {

	public void sleep(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(40, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return foo;
	};

	@Test(priority = 40)
	public void clickgridmodules() {
		
		
		try{
		
		ExtentTestManager.startTest("  Manage Role :  Add,Remove permissions with GRID Modules  ");

		/*fluentWait(By.xpath(".//*[@id='flip']/img")).click();

		fluentWait(By.xpath("//div[@id='panel']/fieldset/div")).click();

		fluentWait(By.xpath("//span[text()='Profiles']")).click();*/
		sleep(6);
		fluentWait(By.xpath(".//*[@id='permissionsLink']")).click();
		sleep(2);
		// .............................................Auditlog...............................................................//
		fluentWait(By.xpath("//li[text()='Audit Log']")).click();

		sleep(2);
		fluentWait(By.xpath("//span/span[2]")).click();
		sleep(2);
		fluentWait(By.xpath("//a[4]")).click();
		
		sleep(2);
		
		
		sleep(2);
		fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
		sleep(2);
		sleep(10);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
		
		//............................................CLEAR Configurations.....................................................//
		sleep(2);
		fluentWait(By.xpath("//li[text()='CLEAR Configurations']")).click();
		fluentWait(By.xpath("//span/span[2]")).click();
		sleep(2);
		fluentWait(By.xpath("//a[4]")).click();
		sleep(2);
		
		
		sleep(2);
		fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
		sleep(2);
		sleep(10);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
		
		//.............................................Dashboard...............................................................//
		
		
		ExtentTestManager.getTest().log(LogStatus.INFO,"Grid Modules Including and Excluding permissions performed Sucessfully");
		
		
		}catch(Exception e){
			
			ExtentTestManager.getTest().log(LogStatus.FAIL,"Grid Modules Including and Excluding permissions  not performed ");
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
			.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
			
		}
		
	}

}
