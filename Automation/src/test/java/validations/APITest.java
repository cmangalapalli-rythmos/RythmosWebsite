package validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.Base;

@Listeners(common.CustomListener.class)
public class APITest extends Base{
	
	@BeforeMethod
	public void lauchBrowser() {
		browserInitialization(); 
	}
	
	@Test(priority=1)
	public void goToAPIPage() {    
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/ul/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String expected = "https://www.rythmos.com/api";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);						              
	}
	
	@Test(priority=2)
	public void verifyInnerPageSubTitleHeader() {    
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/ul/li[3]/a")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		String expected = "Build and Leverage APIs to Power Integration";
		String actual = driver.findElement(By.xpath("//*[@id='hs_cos_wrapper_widget_1526035305231']/div/div/div[1]/h1")).getText(); 
		Assert.assertEquals(actual, expected);					              
	}
	
	@Test(priority=3)
	public void verifyGetFreeAssessmentIsALink() {    
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/ul/li[3]/a")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
     	WebElement linkName = driver.findElement(By.linkText("Get a Free Assessment"));
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
		System.out.println("APIs page tests completed successfully!");
	}	
}