package com.jocata.star.existingfuctions;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class AdvancedAddBenchMark extends mainbaseLatest {

	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
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

	@Test(priority = 1)
	public void init() throws HeadlessException, AWTException, IOException {

		// ......................................AddBenchMarkChanges.......................................................................//

		ExtentTestManager.startTest("  Add Benchmark ");

		clickAddbench();
	}

	public void clickAddbench() throws HeadlessException, AWTException, IOException {

		fluentWait(By.xpath("//span[text()='Rules and Patterns']")).click();
		WebElement element = fluentWait(By.xpath("//a[text()='Rule Library']"));

		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
		sleep(3);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		// .........................................Clicking the Search
		// Button.......................................................//

		fluentWait(By.xpath("//table[@id='rulesIdCombo-triggerWrap']")).click();

		List<WebElement> elements = driver.findElements(By.xpath("//ul/li/div"));

		for (WebElement all : elements) {

			System.out.println(all.getAttribute("data-qtip").toString());

			if (all.getAttribute("data-qtip").equals("1104")) {

				if (!all.isSelected()) {

					all.click();
				}

			}

		}

		sleep(4);

		fluentWait(By.xpath("//div[@id='searchRuleButton']/a")).click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By.xpath("//img[@title='Add']")).click();

		sleep(24);

		// ....................................Account
		// Age...............................................................................//
		try {

			fluentWait(By.xpath(".//*[@id='rulesConfValueses1thresholdValue1']")).sendKeys("25");

			fluentWait(By.xpath(".//*[@id='rulesConfValueses1thresholdValue2']")).sendKeys("35");

			// ....................................Account
			// Balance.........................................................................//

			fluentWait(By.xpath(".//*[@id='rulesConfValueses2thresholdValue1']")).sendKeys("36");
			fluentWait(By.xpath(".//*[@id='rulesConfValueses2thresholdValue2']")).sendKeys("78");

			// ......................................Business
			// Unit........................................................................//

			fluentWait(By.xpath("//div/div/div/ul/li/div")).click();

			// ...........................................Customer
			// Type...................................................................//

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//tr[4]/td/div/div/div/span/div/table/tbody/tr/td[2]/div/span/div/div/div/ul/li/div"))
					.click();

			// ......................................Customer
			// Category.....................................................................//

			fluentWait(By.xpath("//tr[5]/td/div/div/div/span/div/table/tbody/tr/td[2]/div/span/div/div/div/ul/li/div"))
					.click();

			// ........................................Product
			// Category:...................................................................//

			fluentWait(By.xpath("//tr[6]/td/div/div/div/span/div/table/tbody/tr/td[2]/div/span/div/div/div/ul/li/div"))
					.click();

			// ....................................Product
			// Code:..........................................................................//

			fluentWait(By.xpath("//tr[7]/td/div/div/div/span/div/table/tbody/tr/td[2]/div/span/div/div/div/ul/li/div"))
					.click();

			// ....................................Cr or
			// Dr:............................................................................//

			fluentWait(By.xpath("//tr[8]/td/div/div/div/span/div/table/tbody/tr/td[2]/div/span/div/div/div/ul/li/div"))
					.click();

			// ........................................Channel
			// Type:.................................................................//

			fluentWait(By.xpath("//tr[9]/td/div/div/div/span/div/table/tbody/tr/td[2]/div/span/div/div/div/ul/li/div"))
					.click();

			// ..................................... Merchant
			// Type:...................................................................//

			fluentWait(By.xpath("//tr[10]/td/div/div/div/span/div/table/tbody/tr/td[2]/div/span/div/div/div/ul/li/div"))
					.click();

			// .................Purpose
			// Code:............................................................................................//

			fluentWait(By.xpath("//tr[11]/td/div/div/div/span/div/table/tbody/tr/td[2]/div/span/div/div/div/ul/li/div"))
					.click();

			// ...............................Tran.
			// Amount..................................................................................///

			fluentWait(By.xpath(".//*[@id='rulesConfValueses12thresholdValue1']")).sendKeys("100");

			fluentWait(By.xpath(".//*[@id='rulesConfValueses12thresholdValue2']")).sendKeys("120");

			// .............................Key Threshold Parameter Tran.
			// Amount.........................................................//

			// fluentWait(By.xpath("//td[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")).click();

			// fluentWait(By.xpath("//div[23]/div/ul/li[3]")).click();

			// ................................Schedule
			// Definition...................................................................//

			fluentWait(By.xpath("//td[3]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")).click();

			fluentWait(By.xpath("//div[24]/div/ul/li[4]")).click();

			fluentWait(By.xpath("//div[@id='ruleEveryForWeekly']/label")).click();

			sleep(8);
			WebElement referenceperiod = fluentWait(By.id("rulePeriod"));
			referenceperiod.sendKeys("24");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			/*
			 * Select selectseond=new Select(referenceperiod);
			 * selectseond.selectByVisibleText("Rolling Months");
			 */

			fluentWait(By.id("rulePeriodType-inputEl")).click();

			fluentWait(By.xpath("//li[text()='Days']")).click();

			fluentWait(By.xpath("//div[@id='addBnchmrkButton']")).click();

			try {
				WebElement elementnn = fluentWait(By.xpath("//div[contains(@id,'-toolbar')]//div//a[3]"));

				// JavascriptExecutor js =(JavascriptExecutor)driver;
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementnn.getLocation().y + ")");
				elementnn.click();

				sleep(8);
				ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
						.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			} catch (org.openqa.selenium.NoSuchElementException e) {

				System.out.println("no element");

			}

			try {
				fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a")).click();

				String Addbench = fluentWait(By.xpath("//tr[@id='gridview-1038-record-ext-record-7']")).getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, " Add Benchmark ");

				ExtentTestManager.getTest().log(LogStatus.PASS, Addbench);

			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("no element");

				ExtentTestManager.getTest().log(LogStatus.SKIP, " MISSING WINDOW POPUP ");

			} catch (org.openqa.selenium.WebDriverException e) {
				System.out.println("hi");

			}

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			System.out.println("This is Create a New Bench Mark");

			sleep(10);

			JavascriptExecutor jseNetworkAn = (JavascriptExecutor) driver;

			jseNetworkAn.executeScript("window.scrollBy(0,-900)", "");

			sleep(10);

			System.out.println("SucessFully created a bench mark");
			
			
			ExtentTestManager.getTest().log(LogStatus.INFO,  " Benchmark Added Successfully ");


			
			sleep(10);
			fluentWait(By.xpath("//img[@title='Edit']")).click();
			sleep(10);
		    fluentWait(By.xpath("//img[@class='x-tool-img x-tool-close']")).click();
		    sleep(10);
			String createdt=driver.findElement(By.xpath("//div[2]/div/table/tbody/tr/td/table/tbody/tr/td[7]/div")).getText();
		System.out.println(createdt);

			// boolean elemetpresent=true;

			/*
			 * WebElement elemetpresent
			 * =driver.findElement(By.xpath("//a[@id='button-1005']"));
			 * 
			 * elemetpresent.click();
			 */

		} catch (Exception e) {

			sleep(19);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.navigate().refresh();

			System.out.println("referesh................");

			ExtentTestManager.getTest().log(LogStatus.FAIL, "Add Bench Mark Missing Mark");

		}

	}
}
