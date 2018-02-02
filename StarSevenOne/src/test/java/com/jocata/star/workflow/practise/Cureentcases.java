package com.jocata.star.workflow.practise;

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
import com.jocata.star.basescripts.mainbaseLatest;

public class Cureentcases  extends mainbaseLatest{

	
	
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

	// .............................................................customerfieldsthree....................................................................//

	@Test(priority = 3)
	public void login() {

		ExtentTestManager.startTest("  Case Expand :  Actions  ");
            clickDashboard();
	}

	public void clickDashboard() {
		
		sleep(4);

		driver.findElement(By.xpath("//span[text()='Case Files']")).click();

		sleep(4);

		driver.findElement(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();

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

	driver.findElement(By.xpath("//li[2]/span")).click();
	
	sleep(6);	
	driver.findElement(By.xpath("//div[@id='buttonSearch']/a")).click();
	
	
	
}
}
