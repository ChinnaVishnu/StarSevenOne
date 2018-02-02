package com.jocata.star.workflow;

import java.io.IOException;
import java.util.List;
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

public class WorkFLowFalsePositive extends mainbaseLatest {

	public static void scrollTo(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}

	// ..............Forward.......................................................................................................//
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

	@Test(priority = 10)
	public void login() throws IOException {

		ExtentTestManager.startTest("  Taskboard  :   Case - False Positive  ");

		clickDashboard();
	}

	public void clickDashboard() throws IOException {
		try {
			sleep(8);
			// sleep(14);
			fluentWait(By.xpath("//span[text()='Case Files']")).click();
			// sleep(11);

			sleep(8);

			fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();

			// ..........................................................Case
			// Type............................................................//

			sleep(8);
			fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();

			sleep(8);

			// .................................................................Search.......................................................//

			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(10);

			List<WebElement> jocata = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

			for (WebElement ele : jocata) {

				String text = ele.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, text);

			}

			fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();

			sleep(14);

			// ............................................clicking the
			// workflow...........................................................//

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			//

			fluentWait(By.xpath("//*[contains(@id,'workflowBtn')]")).click();

			sleep(10);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath(".//*[@id='closureCommCombo-inputEl']")).click();

			// fluentWait(By.xpath("//div[contains(@id,'boundlist-')][2]//ul/li")).click();

			fluentWait(By.xpath("//li[text()='Comment 1']")).click();

			fluentWait(By.xpath("//div[2]/div/div/a/span/span/span[2]")).click();

			sleep(8);

			fluentWait(By.xpath("//span[3]/a/span/span/span")).click();

			sleep(3);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath(".//*[@id='period1']")).click();

			fluentWait(By.xpath("//div[@class='daterangepicker dropdown-menu opensright']//li[1]")).click();

			fluentWait(By.xpath("//div[2]/div[2]/div/a/span/span/span[2]")).click();

			fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a")).click();

			sleep(3);

			JavascriptExecutor jse = (JavascriptExecutor) driver;

			jse.executeScript("window.scrollBy(0,-450)", "");

			ExtentTestManager.getTest().log(LogStatus.INFO, " False Positive   Added  Successfully ");

		} catch (Exception e) {

			sleep(19);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.navigate().refresh();

			System.out.println("referesh................");

			ExtentTestManager.getTest().log(LogStatus.FAIL, "Changeing the WorkFlow Modules");

		}

	}
}