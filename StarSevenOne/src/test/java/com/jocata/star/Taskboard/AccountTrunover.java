package com.jocata.star.Taskboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.basescripts.mainbaseLatest;

public class AccountTrunover extends mainbaseLatest {

	public WebElement fluentWait(final By locator){
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	        .withTimeout(10, TimeUnit.SECONDS)
	        .pollingEvery(5, TimeUnit.SECONDS)
	        .ignoring(NoSuchElementException.class);

	    WebElement foo = wait.until(
	        new Function<WebDriver, WebElement>() {
	            public WebElement apply(WebDriver driver) {
	                return driver.findElement(locator);
	            }
	        }
	    );
	    return foo;
	};
	
	
	
	

	 public void sleep(int seconds){
		   
		   try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	
	
	
	 @Test

	 public void clickcaseid(){
	 	
	 	
	 	
	 	
	 	fluentWait(By.xpath("//span[text()='Case Files']")).click();


	 	
	 	
	 	fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();
	 	
	 //..........................................................Case Type............................................................//
	 	
	 	sleep(6);	
	 	fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();

	 	
	 	fluentWait(By.xpath("//li[text()='Other Cases']")).click();
	 	
	 	
	 //.................................................................Search.......................................................//


	 	sleep(6);	
	 fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();
	 sleep(9);	

		fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();
	 
		sleep(6);	
		
		fluentWait(By.xpath("//div[contains(@id,'graphActivity')]/a")).click();
		
		sleep(6);	
		fluentWait(By.xpath(".//*[@id='startDate-inputEl']")).sendKeys("06 May 2014");
		
		fluentWait(By.xpath(".//*[@id='endDate-inputEl']")).sendKeys("09 May 2017");
		
		fluentWait(By.xpath("//tr[3]/td/div/a")).click();
		

		sleep(9);	
	     fluentWait(By.xpath("//img[@class='x-tool-img x-tool-close']//following::img[1]")).click();
}
}