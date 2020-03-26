package validations;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.Base;
@Listeners(common.CustomListener.class)
public class AnalyticsTest extends Base{
				
		@BeforeMethod
		public void lauchBrowser() {
			browserInitialization(); 
		}
				
		@Test
		public void goToAnalyticsPage() {    
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/ul/li[2]/a")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			String expected = "https://www.rythmos.com/analytics";
			String actual = driver.getCurrentUrl();
			Assert.assertEquals(actual, expected);						              
		}
		
		@AfterMethod
		public void closeBrowser() {
			driver.quit();
			System.out.println("Analytics page tests completed successfully!");
		}		
}


