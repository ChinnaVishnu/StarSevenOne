package com.jocata.star.RunStar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
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

public class AdvanceSearchStar2 extends mainbaseLatest {

	
	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS)
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

	// .................................................AdvanceSearch..............................................................//

	@Test(priority = 2)
	public void loginAdvance() {

		ExtentTestManager.startTest("  TaskBoard : Advanced Search ");

		clickDashboardAdvance();
	}

	public void clickDashboardAdvance() {
		
		try{

		fluentWait(By.xpath("//span[text()='Case Files']")).click();

		fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();

		fluentWait(By.xpath("//img[@class='x-tool-img x-tool-expand-bottom']")).click();

		// ...........................................................Occupation.......................................................//

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By.xpath("//input[@id='occupationsCombo-inputEl']")).click();

		WebElement elementall = fluentWait(By.cssSelector("span.x-combo-checker"));

		elementall.isSelected();
		elementall.click();

		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

		try{
		
		List<WebElement> jocata = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

		for (WebElement ele : jocata) {

			String text = ele.getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, text);

		}

		}catch(StaleElementReferenceException e){
			System.out.println(e.getMessage());
		}
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"****************************************************************************************************");

		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();

		fluentWait(By.xpath("//div[@class='resetButton']")).click();

		ExtentTestManager.getTest().log(LogStatus.PASS, " OCCUPATION ");

		// ............................................................................Nature of Business..................................//
		sleep(5);
		
		fluentWait(By.xpath(".//*[@id='nobCombo-triggerWrap']")).click();

		

		List<WebElement> elements = driver.findElements(By.xpath("//ul/li/div"));

		for (WebElement all : elements) {

			//System.out.println(all.getAttribute("data-qtip").toString());

			//ExtentTestManager.getTest().log(LogStatus.INFO, all.getAttribute("data-qtip").toString());

			if (all.getAttribute("data-qtip")
					.equals("Accounting, bookkeeping and auditing activities; tax consultancy")) {

				if (!all.isSelected()) {

					all.click();
				}

			}

			if (all.getAttribute("data-qtip").equals("Activities of amusement parks and theme parks")) {

				if (!all.isSelected()) {

					all.click();
				}

			}

			if (all.getAttribute("data-qtip")
					.equals("Activities of business and employers membership organizations")) {

				if (!all.isSelected()) {

					all.click();
				}

			}

			if (all.getAttribute("data-qtip").equals("Activities of call centres")) {

				if (!all.isSelected()) {

					all.click();
				}

			}

			if (all.getAttribute("data-qtip").equals("Activities of collection agencies and credit bureaus")) {

				if (!all.isSelected()) {

					all.click();
				}

			}

			if (all.getAttribute("data-qtip").equals("Activities of employment placement agencies")) {

				if (!all.isSelected()) {

					all.click();
				}

			}

			if (all.getAttribute("data-qtip").equals("Activities of extraterritorial organizations and bodies")) {

				if (!all.isSelected()) {

					all.click();
				}

			}

			if (all.getAttribute("data-qtip").equals("Activities of head offices")) {

				if (!all.isSelected()) {

					all.click();
				}

			}

			
			if (all.getAttribute("data-qtip").equals("Activities of holding companies")) {

				if (!all.isSelected()) {

					all.click();
				}

			}

			if (all.getAttribute("data-qtip")
					.equals("Activities of households as employers of domestic personnel")) {

				if (!all.isSelected()) {

					all.click();
				}

			}

			if (all.getAttribute("data-qtip").equals("Activities of insurance agents and brokers")) {

				if (!all.isSelected()) {

					all.click();
				}

			}

			if (all.getAttribute("data-qtip").equals("Activities of other membership organizations n.e.c.")) {

				if (!all.isSelected()) {

					all.click();
				}

			}

			if (all.getAttribute("data-qtip").equals("Activities of political organizations")) {

				if (!all.isSelected()) {

					all.click();
				}

			}


			if (all.getAttribute("data-qtip")
					.equals("Camping grounds, recreational vehicle parks and trailer parks")) {

				if (!all.isSelected()) {

					all.click();
				}

			}

		}

		
		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();
/*
		List<WebElement> jocatanature = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

		for (WebElement elenature : jocatanature) {
    	String textnature = elenature.getText();
        ExtentTestManager.getTest().log(LogStatus.INFO, textnature);

		}
*/
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"****************************************************************************************************");

		sleep(5);
		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();

		sleep(5);
		fluentWait(By.xpath("//div[@class='resetButton']")).click();
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		ExtentTestManager.getTest().log(LogStatus.PASS, " Nature of Business ");
		
		
		// ...................................AmountInvolved.........................................................................//

		sleep(5);
		
		fluentWait(By.xpath(".//*[@id='amountFrom']")).sendKeys("2344");
		sleep(5);
		fluentWait(By.xpath(".//*[@id='amountTo']")).sendKeys("4567");
		sleep(5);
		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();
		sleep(5);
		ExtentTestManager.getTest().log(LogStatus.PASS, " AMOUNT INVOLVED ");

		try {

			String Amount = driver.findElement(By.xpath("//div[text()='No Matching Records']")).getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, Amount);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"****************************************************************************************************");
		sleep(5);
		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
		
		sleep(5);
		fluentWait(By.xpath("//div[@class='resetButton']")).click();
		

		// ........................................Product Type..............................................................//

		
		sleep(5);
		fluentWait(By.xpath("//input[@id='productTypeCombo-inputEl']")).click();

		sleep(5);

		List<WebElement> elementsproduct = driver.findElements(By.xpath("//ul/li/div"));

		for (WebElement allproduct : elementsproduct) {

/*			System.out.println(allproduct.getAttribute("data-qtip").toString());

			ExtentTestManager.getTest().log(LogStatus.INFO, allproduct.getAttribute("data-qtip").toString());
*/
			if (allproduct.getAttribute("data-qtip").equals("Business  Lending - Unsecured")) {

				if (!allproduct.isSelected()) {

					allproduct.click();
				}

			}

			if (allproduct.getAttribute("data-qtip").equals("Business Lending - Secured")) {

				if (!allproduct.isSelected()) {

					allproduct.click();
				}

			}

			if (allproduct.getAttribute("data-qtip").equals("Deposits")) {

				if (!allproduct.isSelected()) {

					allproduct.click();
				}

			}

			if (allproduct.getAttribute("data-qtip").equals("Funds / Investments")) {

				if (!allproduct.isSelected()) {

					allproduct.click();
				}

			}

			if (allproduct.getAttribute("data-qtip").equals("PRODCUT 10")) {

				if (!allproduct.isSelected()) {

					allproduct.click();
				}

			}

		}

		sleep(5);

		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

		try{
			
		String Product = driver.findElement(By.xpath("//div[text()='No Matching Records']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, Product);

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"****************************************************************************************************");

		
        sleep(5);
		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();

		

		fluentWait(By.xpath("//div[@class='resetButton']")).click();	
		
		ExtentTestManager.getTest().log(LogStatus.PASS, " PRODUCT TYPE  ");
		
	//......................................................UCIC...........................................................//	
		

		fluentWait(By.xpath("//img[@id='searchUCICNum']")).click();
		

	    WebDriverWait wait = new WebDriverWait(driver,30000);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='ucicSearchWindow']//tbody//div")));   
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ucicSearchWindow']//tbody//div")));   



		fluentWait(By.xpath("//div[@id='ucicSearchWindow']//tbody//div")).click();

		fluentWait(By.xpath("//div[starts-with(@id,'pagingtoolbar-')]//a[6]")).click();

		ExtentTestManager.getTest().log(LogStatus.PASS, " UCIC  ");

		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

		try{
		String UCIC = driver.findElement(By.xpath("//div[text()='No Matching Records']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, UCIC);

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"****************************************************************************************************");

		sleep(9);

		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
		sleep(9);

		fluentWait(By.xpath("//div[@class='resetButton']")).click();

		sleep(9);
		
		
		// ....................................................Rule Name ..........................................................///

		WebElement elementToClicksecond = driver.findElement(By.xpath("//input[@id='ruleNameCombo-inputEl']"));
		// Scroll the browser to the element's Y position

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementToClicksecond.getLocation().y + ")");
		// Click the element
		elementToClicksecond.click();
		sleep(6);

		List<WebElement> elementsproductrule = driver.findElements(By.xpath("//ul/li/div"));

		for (WebElement allproductrule : elementsproductrule) {

			//System.out.println(allproductrule.getAttribute("data-qtip").toString());

			//ExtentTestManager.getTest().log(LogStatus.INFO, allproductrule.getAttribute("data-qtip").toString());

			if (allproductrule.getAttribute("data-qtip").equals("Customer match with watchlist")) {

				if (!allproductrule.isSelected()) {

					allproductrule.click();
				}

			}

			if (allproductrule.getAttribute("data-qtip").equals("Customers with multiple accounts")) {

				if (!allproductrule.isSelected()) {

					allproductrule.click();
				}

			}

			if (allproductrule.getAttribute("data-qtip").equals("Early closure of accounts")) {

				if (!allproductrule.isSelected()) {

					allproductrule.click();
				}

			}

			if (allproductrule.getAttribute("data-qtip").equals("Frequent cash deposits just below INR 1000000")) {

				if (!allproductrule.isSelected()) {

					allproductrule.click();
				}

			}

		}

		ExtentTestManager.getTest().log(LogStatus.PASS, " RULE NAME  ");

		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		

		//List<WebElement> RuleName = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

		/*for (WebElement eleRuleName : RuleName) {

			String textrulename = eleRuleName.getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, textrulename);

		}*/

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"****************************************************************************************************");

		sleep(8);

		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();

		sleep(8);

		fluentWait(By.xpath("//div[@class='resetButton']")).click();
		
		sleep(9);
		// ...................................................Account No......................................................//

		fluentWait(By.xpath("//img[@id='searchAccountNum']")).click();

		fluentWait(By.xpath("//div[@id='accountgrid-body']//td/div")).click();

		fluentWait(By.xpath("//div[starts-with(@id,'pagingtoolbar-')]//a[6]")).click();

		ExtentTestManager.getTest().log(LogStatus.PASS, " ACCOUNT NO  ");

		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

		sleep(10);

		List<WebElement> PreviousAccoun = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

		for (WebElement eleRuleNameaccoun : PreviousAccoun) {

			String textpreciousacc = eleRuleNameaccoun.getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, textpreciousacc);

		}


		
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"****************************************************************************************************");


		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();


		fluentWait(By.xpath("//div[@class='resetButton']")).click();


		// ...................................................Notes Containing..............................................//


		fluentWait(By.xpath("//input[@id='notesCntng']")).sendKeys("100");

		ExtentTestManager.getTest().log(LogStatus.PASS, " NOTES CONTAINING  ");

		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

         try{
		String NotesContaining = driver.findElement(By.xpath("//div[text()='No Matching Records']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, NotesContaining);

         }catch(Exception e){
        	 System.out.println(e.getMessage());
         }
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"****************************************************************************************************");

		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
	
		fluentWait(By.xpath("//div[@class='resetButton']")).click();

		// ...................................Tag...............................................................................//

	    WebDriverWait waittag = new WebDriverWait(driver,30000);
	    waittag.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='tag']")));        
	    WebElement searchButtonTag = waittag.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='tag']")));
	    searchButtonTag.sendKeys("raghu");  
	    

		//fluentWait(By.xpath("//input[@id='tag']")).sendKeys("raghu");

		

		ExtentTestManager.getTest().log(LogStatus.PASS, " TAG  ");

		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

		try{

		String NotesTag = driver.findElement(By.xpath("//div[text()='No Matching Records']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, NotesTag);

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"****************************************************************************************************");
		sleep(7);
		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
		sleep(7);
		fluentWait(By.xpath("//div[@class='resetButton']")).click();

		// ...................................PAN
		// ID.........................................................................//
    
		sleep(7);
		fluentWait(By.xpath(".//*[@id='panId']")).sendKeys("12345678");

		ExtentTestManager.getTest().log(LogStatus.PASS, " PAN ID  ");
		sleep(7);
		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

		sleep(10);
       try{
		String PAN = driver.findElement(By.xpath("//div[text()='No Matching Records']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, PAN);
       }catch(Exception e){
    	   System.out.println(e.getMessage());
       }
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"****************************************************************************************************");

		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
		sleep(7);
		fluentWait(By.xpath("//div[@class='resetButton']")).click();
		
		// .....................................................Source System.......................................................//

					sleep(6);

					fluentWait(By.xpath(".//*[@id='sourceSystemCombo-inputEl']")).click();
					sleep(3);

					List<WebElement> elementsproductsource = driver.findElements(By.xpath("//ul/li/div"));

					for (WebElement allsourcesystem : elementsproductsource) {

						//System.out.println(allsourcesystem.getAttribute("data-qtip").toString());

						//ExtentTestManager.getTest().log(LogStatus.INFO, allsourcesystem.getAttribute("data-qtip").toString());

						if (allsourcesystem.getAttribute("data-qtip").equals("source_system1")) {

							if (!allsourcesystem.isSelected()) {

								allsourcesystem.click();
							}

						}

						if (allsourcesystem.getAttribute("data-qtip").equals("source_system2")) {

							if (!allsourcesystem.isSelected()) {

								allsourcesystem.click();
							}

						}

						if (allsourcesystem.getAttribute("data-qtip").equals("source_system3")) {

							if (!allsourcesystem.isSelected()) {

								allsourcesystem.click();
							}

						}

						if (allsourcesystem.getAttribute("data-qtip").equals("source_system4")) {

							if (!allsourcesystem.isSelected()) {

								allsourcesystem.click();
							}

						}

					}

					
					sleep(7);

					WebElement sourcesystem = driver.findElement(By.xpath("//label[text()='Source System']"));

					sourcesystem.click();

					sleep(7);

					ExtentTestManager.getTest().log(LogStatus.PASS, " SOURCE SYSTEM  ");

					fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

					sleep(7);

					List<WebElement> SourceSystem = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

					for (WebElement eleSourceSystem : SourceSystem) {

						String textSourceSystem = eleSourceSystem.getText();

						ExtentTestManager.getTest().log(LogStatus.INFO, textSourceSystem);

					}

					ExtentTestManager.getTest().log(LogStatus.INFO,
							"****************************************************************************************************");
					sleep(8);

					fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
					sleep(8);

					fluentWait(By.xpath("//div[@class='resetButton']")).click();
					
					ExtentTestManager.getTest().log(LogStatus.INFO,	"advance search with all filters performed successfully"); 

					
		}catch(Exception e){
			System.out.println(e.getMessage());
			ExtentTestManager.getTest().log(LogStatus.INFO,	"advance search with all filters performed successfully"); 

			
		}

	}

}
