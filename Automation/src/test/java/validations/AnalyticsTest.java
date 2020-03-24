package validations;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnalyticsTest {
		WebDriver driver;
		
		@BeforeTest
		public void lauchBrowser() {
			System.setProperty("webdriver.chrome.driver", "D:/RCOM/Automation/resources/chromedriver.exe");
			driver = new ChromeDriver();
			 
		}
		
		@Test
		public void verifyAnalyticsPage() {
	        driver.get("https://www.rythmos.com/analytics");
	        driver.manage().window().maximize();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");      
		}
		
		@AfterTest
		public void closeBrowser() {
			driver.close();
			driver.quit();
			System.out.println("Test completed successfully!");
		}		
}


