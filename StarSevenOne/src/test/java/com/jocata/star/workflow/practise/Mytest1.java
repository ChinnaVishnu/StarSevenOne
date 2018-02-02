package com.jocata.star.workflow.practise;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mytest1 {

	WebDriver driver = new FirefoxDriver();
	 
	 @Before
	 public void beforetest() {
	  driver.manage().window().maximize();
	  driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 }
	 
	 //@After
	 public void aftertest() {
	  driver.quit();
	  
	 }
	 
	 @Test
	  public void test () 
	   {  
	    
	    driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("My Name");
	    //Wait for element to be clickable
	    WebDriverWait wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#submitButton")));

	    driver.findElement(By.cssSelector("#submitButton")).click();
	    
	    
	   }
	 public void HighlightMyElement(WebElement element) { 
	  for (int i = 0; i < 10; i++) 
	  { 
	   JavascriptExecutor javascript = (JavascriptExecutor) driver;
	   javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: orange; border: 4px solid orange;");
	   javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: pink; border: 4px solid pink;");
	   javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: yellow; border: 4px solid yellow;");
	   javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, ""); 
	   } 
	  } 	
	
}
