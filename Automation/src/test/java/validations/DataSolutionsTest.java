package validations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.Base;

@Listeners(common.CustomListener.class)
public class DataSolutionsTest extends Base{		
		
		@BeforeMethod
		public void launchBrowser() {
			browserInitialization();
		}
		
		@Test
		public void goToDataSolutionsPage() {    
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/a")).click();			
			String expected = "https://www.rythmos.com/data-solutions";
			String actual = driver.getCurrentUrl();
			Assert.assertEquals(actual, expected);				              
		}	
		
		@Test
		public void verifyInnerPageSubTitleHeader() {    
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/a")).click();
			String expected = "Data Solutions";
			String actual = driver.findElement(By.xpath("//*[@id='hs_cos_wrapper_widget_1525098855444']/div/div/div[1]/h1")).getText(); 
			Assert.assertEquals(actual, expected);					              
		}
		
		@Test
		public void verifyDataWareHouseIsALink() {    
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/a")).click();
	     	WebElement linkName = driver.findElement(By.linkText("Data Warehouse"));
			if(linkName.isDisplayed())
			{
			  System.out.println("Datawarehouse link is displayed");
			}
			else
			{
			  System.out.println("Datwarehouse link is NOT displayed");
			}        					              
		}
		
		@Test
		public void verifyBuildOrEnhanceDataWarehouseIsALink() {    
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/a")).click();
	     	WebElement linkName = driver.findElement(By.linkText("Build or Enhance a Data Warehouse"));
			if(linkName.isDisplayed())
			{
			  System.out.println("Build or Enhance a Data Warehouse link is displayed");
			}
			else
			{
			  System.out.println("Build or Enhance a Data Warehouse link is NOT displayed");
			}        					              
		}
		
		@Test
		public void verifyAnalyticsIsALink() {    
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/a")).click();
	     	WebElement linkName = driver.findElement(By.linkText("Analytics"));
			if(linkName.isDisplayed())
			{
			  System.out.println("Analytics link is displayed");
			}
			else
			{
			  System.out.println("Analytics link is NOT displayed");
			}        					              
		}
		
		@Test
		public void verifyBuildOrEnhanceAnalyticsSystemsIsALink() {    
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/a")).click();
	     	WebElement linkName = driver.findElement(By.linkText("Build or Enhance Analytics Systems"));
			if(linkName.isDisplayed())
			{
			  System.out.println("Build or Enhance Analytics Systems link is displayed");
			}
			else
			{
			  System.out.println("Build or Enhance Analytics Systems link is NOT displayed");
			}        					              
		}
		
		@Test
		public void verifyCloudIsALink() {    
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/a")).click();
	     	WebElement linkName = driver.findElement(By.linkText("Cloud"));
			if(linkName.isDisplayed())
			{
			  System.out.println("Cloud link is displayed");
			}
			else
			{
			  System.out.println("Cloud link is NOT displayed");
			}        					              
		}
		
		@Test
		public void verifyLiftAndShiftADataWarehousetoCloudIsALink() {    
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/a")).click();
	     	WebElement linkName = driver.findElement(By.linkText("Lift and Shift a Data Warehouse to Cloud"));
			if(linkName.isDisplayed())
			{
			  System.out.println("Lift and Shift a Data Warehouse to Cloud link is displayed");
			}
			else
			{
			  System.out.println("Lift and Shift a Data Warehouse to Cloud link is NOT displayed");
			}        					              
		}
		
		@Test
		public void verifySupportIsALink() {    
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/a")).click();
	     	WebElement linkName = driver.findElement(By.linkText("Support"));
			if(linkName.isDisplayed())
			{
			  System.out.println("Support link is displayed");
			}
			else
			{
			  System.out.println("Support link is NOT displayed");
			}        					              
		}
		
		@Test
		public void verifySupportAndEvolveADataWarehouseSolutionIsALink() {    
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/a")).click();
	     	WebElement linkName = driver.findElement(By.linkText("Support and Evolve a Data Warehouse Solution"));
			if(linkName.isDisplayed())
			{
			  System.out.println("Support and Evolve a Data Warehouse Solution link is displayed");
			}
			else
			{
			  System.out.println("Support and Evolve a Data Warehouse Solution link is NOT displayed");
			}        					              
		}
		
		
		@Test
		public void verifyGetHelpTodayIsALink() {    
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/a")).click();
	     	WebElement linkName = driver.findElement(By.linkText("Get Help Today!"));
			if(linkName.isDisplayed())
			{
			  System.out.println("Get Help Today! link is displayed");
			}
			else
			{
			  System.out.println("Get Help Today! link is NOT displayed");
			}        					              
		}
		
		@Test
		public void verifyGetFreeAssessmentIsALink() {    
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/a")).click();
	     	WebElement linkName = driver.findElement(By.linkText("Get Free Assessment"));
			if(linkName.isDisplayed())
			{
			  System.out.println("Get Free Assessment link is displayed");
			}
			else
			{
			  System.out.println("Get Free Assessment link is NOT displayed");
			}        					              
		}
		
		@Test
		public void verifyContactUsIsALink() {    
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/a")).click();
	     	WebElement linkName = driver.findElement(By.linkText("Contact Us"));
			if(linkName.isDisplayed())
			{
			  System.out.println("Contact Us link is displayed");
			}
			else
			{
			  System.out.println("Contact Us link is NOT displayed");
			}        					              
		}
		
		@Test
		public void verifyRythmosBlogIsALink() {    
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/a")).click();
	     	WebElement linkName = driver.findElement(By.linkText("Rythmos Blog"));
			if(linkName.isDisplayed())
			{
			  System.out.println("Rythmos Blog link is displayed");
			}
			else
			{
			  System.out.println("Rythmos Blog link is NOT displayed");
			}        					              
		}
		
		
		@AfterMethod
		public void closeBrowser() {
			driver.quit();
			System.out.println("Data solutions page tests completed successfully!");
		}	
}


