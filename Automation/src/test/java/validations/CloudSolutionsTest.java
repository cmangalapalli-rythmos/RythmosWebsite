package validations;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.Base;

@Listeners(common.CustomListener.class)
public class CloudSolutionsTest extends Base{		
		
		@BeforeMethod
		public void lauchBrowser() {
			browserInitialization();
		}
		
		@Test(priority=1)
		public void goToCloudSolutionsPage() {
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/ul/li[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			String expected = "https://www.rythmos.com/cloud";
			String actual = driver.getCurrentUrl();
			Assert.assertEquals(actual, expected);
			
		}
		
		@Test(priority=2)
		public void verifyGetFreeAssessmentIsALink() {    
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[3]/a")).click();
			WebDriverWait wait=new WebDriverWait(driver, 20);
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
		
		@AfterMethod
		public void closeBrowser() {
		driver.quit();
		System.out.println("cloud solution page test completed successfully!");
		}		
}


