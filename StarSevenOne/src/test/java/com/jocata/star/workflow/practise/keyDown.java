package com.jocata.star.workflow.practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class keyDown {

public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver = new FirefoxDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.manage().window().maximize();

    driver.navigate().to("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");

    driver.findElement(By.id("ContentHolder_lbSelectionMode_I")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("ContentHolder_lbSelectionMode_DDD_L_LBI1T0")).click();
    Thread.sleep(3000);

    WebElement OneElement = driver.findElement(By.id("ContentHolder_lbFeatures_LBT"));
    Thread.sleep(3000);
    List<WebElement> options = OneElement.findElements(By.tagName("td"));   
    Thread.sleep(3000);
    
    Actions builder = new Actions(driver);

   builder.keyDown(Keys.SHIFT).click(options.get(2)).click(options.get(4)).click(options.get(6)).build().perform();

   // multipleSelect.perform();

    Thread.sleep(3000);
    
    System.out.println("pass");

   // driver.close();
    
	
}
}
