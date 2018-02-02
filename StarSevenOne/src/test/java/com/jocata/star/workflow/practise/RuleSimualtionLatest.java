package com.jocata.star.workflow.practise;

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

public class RuleSimualtionLatest  extends mainbaseLatest{
	
	
	public WebElement WaitForElementPresent(String xpathkey) throws Exception {

	    WebElement present = null;
	    int i = 0;
	    while (i <= 10) {
	                Thread.sleep(2000L);
	                present = getObject(xpathkey);
	                if (present != null) {
	                            break;
	                } else {
	                            System.out.println("i is: "+i);
	                            i++;
	                }
	    }
	    return present;
	}




	public WebElement getObject(String xpathkey) throws IOException {
		
	    try {
	    	
	                return  driver.findElement(By.xpath(".//*[@id='frequency']"));
	                
	    } catch (Throwable t) {
	    	
	    	
	                System.out.println("error:\t" + xpathkey);
	                return null;
	    }
	}
	

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
	
	 
	 
	 @Test(priority=30)
	 public void clickRulesimualtes() throws Exception{
	
		// try{
			 
		 
		 ExtentTestManager.startTest("  Rule Simulator : Simulate  "); 	
		 
		 fluentWait(By.xpath("//span[text()='Rules and Patterns']")).click();
		 
		 fluentWait(By.xpath("//a[text()='Rule Simulator']")).click();
		 
		 sleep(7);
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		 
		 
		 
		 fluentWait(By.xpath(".//*[@id='rulesdropdown-inputEl']")).click();
		 
		 fluentWait(By.xpath("//div/ul/li[7]")).click();
		 
		 
		 fluentWait(By.xpath(".//*[@id='benchMarkIdCombo-inputEl']")).click();
		
		 fluentWait(By.xpath("//li[text()='B553']")).click();
		 
		// sleep(12);
		 
		 
		 String xpathkey=".//*[@id='frequency']";
		WaitForElementPresent(xpathkey);
		 fluentWait(By.xpath(".//*[@id='frequency']")).sendKeys("80");

		 fluentWait(By.xpath(".//*[@id='no_of_slices']")).sendKeys("8");
	
	
}
	 }
