package validations;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.Base;
@Listeners(common.CustomListener.class)
public class DataSupportTest extends Base {
				
		@BeforeMethod
		public void lauchBrowser() {
				 
		}
		
		@Test
		public void goToDataSupportPage() {
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/ul/li[4]/a")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			String expected = "https://www.rythmos.com/data-support";
			String actual = driver.getCurrentUrl();
			Assert.assertEquals(actual, expected);
			
			
	    }
		
		@AfterMethod
		public void closeBrowser() {
			driver.quit();
			System.out.println("Data support page test completed successfully!");
		}		
}


