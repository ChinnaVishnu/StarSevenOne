package com.jocata.star.workflow;

import java.io.IOException;
import java.util.List;
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
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class WorkFLowAndDispActions extends mainbaseLatest {

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

	@Test(priority = 14)
	public void login() throws IOException {

		ExtentTestManager.startTest(" Add - Delete  :   Comments,Evidences,Links ");

		/*
		 * driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(
		 * "l3_user");
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
		 * "Star@123");
		 * driver.findElement(By.xpath("//span[@id='loginButtonExt-btnIconEl']")
		 * ).click();
		 */ clickDashboard();
	}

	public void clickDashboard() throws IOException {
		// driver.findElement(By.xpath("//span[text()='Rules and
		// Patterns']")).click();
		// driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
		try {
			sleep(8);

			fluentWait(By.xpath("//span[text()='Case Files']")).click();
			// sleep(11);

			sleep(8);
			fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();

			// ..........................................................Case
			// Type............................................................//

			//sleep(8);

			//fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();

			sleep(10);
			
			
			WebElement element=	driver.findElement(By.xpath("//td[2]/div"));
			Actions action=new Actions(driver);
			
			action.moveToElement(element).build().perform();
			
			action.click().build().perform();
			
			sleep(6);
			driver.findElement(By.xpath("//td[2]/div")).click();

			sleep(6);	

			//driver.findElement(By.xpath("//li[text()='Other Cases']")).click();

		driver.findElement(By.xpath("//li[3]/span")).click();
		sleep(6);	
			// .................................................................Search.......................................................//

			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(12);

			List<WebElement> jocata = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

			for (WebElement ele : jocata) {

				String text = ele.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, text);

			}

			fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();

			sleep(10);

			// ............................................clicking the
			// workflow...........................................................//

			try {

				//

				fluentWait(By.xpath("//*[contains(@id,'workflowBtn')]")).click();

				sleep(10);

				ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
						.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

				sleep(7);
				fluentWait(By.xpath(".//*[@id='closureCommCombo-inputEl']")).click();

				sleep(7);
				// fluentWait(By.xpath("//div[contains(@id,'boundlist-')][2]//ul/li")).click();
				fluentWait(By.xpath("//li[text()='Comment 1']")).click();
				sleep(7);
				fluentWait(By.xpath("//div[4]/div/div[2]/div/div/a")).click();

				// fluentWait(By.xpath("//span[text()='Add
				// Comments']")).click();
				// sleep(7);
				// fluentWait(By.xpath("//div[@id='toolbar-1772-innerCt']//a")).click();

				sleep(7);
				fluentWait(By.xpath("(//img[@id='deleteDoc'])[2]")).click();

				ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
						.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

				sleep(7);
				fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a[2]")).click();

				ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
						.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

				// ...............................AddEvidence.....................................................//

				sleep(7);
				fluentWait(By.xpath("(//a[contains(text(),'Add New')])[3]")).click();

				sleep(7);
				fluentWait(By.xpath(".//*[@id='upload']")).click();

				sleep(10);

				ProcessBuilder bulidersecond = new ProcessBuilder(
						"D:\\AUTOMATION REQUIRED DOCS\\Autoit\\batch12_upload.exe");
				bulidersecond.start();

				sleep(10);

				fluentWait(By.xpath("//input[@id='fileName']")).sendKeys("RaghuRamYadav");

				ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
						.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

				fluentWait(By.xpath(".//*[@id='fileDesc']")).sendKeys("HiRaghuHowAreYou");

				fluentWait(By.xpath("//div[@id='uploadButton']")).click();

				sleep(10);

				fluentWait(By.xpath("(//img[@id='deleteDoc'])[2]")).click();

				fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a[2]")).click();

				sleep(10);

				fluentWait(By.xpath("(//a[contains(text(),'Add New')])[4]")).click();

				ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
						.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

				fluentWait(By.xpath(".//*[@id='linkaddress-inputEl']"))
						.sendKeys("http://only-testing-blog.blogspot.in/2014/05/login.html");

				fluentWait(By.xpath(".//*[@id='linkname-inputEl']")).sendKeys("Testing");

				fluentWait(By.xpath(".//*[@id='linkdesc-inputEl']")).sendKeys("Testing Automation");

				// fluentWait(By.xpath("//div[@id='toolbar-1791-innerCt']//a")).click();

				fluentWait(By.xpath("//div[2]/span/div/div/div[2]/div/div/a/span/span/span[2]")).click();

				sleep(15);

				fluentWait(By.xpath("(//img[@id='deleteDoc'])[2]")).click();

				sleep(10);

				fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a[2]")).click();

				ExtentTestManager.getTest().log(LogStatus.INFO, "  Workflow and Disposition Actions are Performed");

				sleep(10);
				fluentWait(By
						.xpath("//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//div//img"))
								.click();
				
				
				ExtentTestManager.getTest().log(LogStatus.INFO," Add And Delete Links  Successfully");


			} catch (org.openqa.selenium.NoSuchElementException e) {

				ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
						.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

				fluentWait(By
						.xpath("//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//div//img"))
								.click();

			}
		} catch (Exception e) {

			sleep(19);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.navigate().refresh();

			System.out.println("referesh................");

			ExtentTestManager.getTest().log(LogStatus.FAIL, "	");

		}

	}
}