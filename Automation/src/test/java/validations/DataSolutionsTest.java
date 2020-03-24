package validations;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.DataSolutionsPage;

public class DataSolutionsTest {
		WebDriver driver;
		DataSolutionsPage ds = null;
		
		@BeforeTest
		public void lauchBrowser() {
			System.setProperty("webdriver.chrome.driver", "D:/RCOM/Automation/resources/chromedriver.exe");
			driver = new ChromeDriver();			 
		}
		
		@BeforeMethod
		public void getURL() {
			driver.get("https://www.rythmos.com");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			driver.manage().window().maximize();   
		}
		
		@Test
		public void goToDataSolutionsPage() {    
			driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
			driver.findElement(By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/a")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			String expected = "https://www.rythmos.com/data-solutions";
			String actual = driver.getCurrentUrl();
			if(expected.equalsIgnoreCase(actual)) {
			System.out.println("URL is matched");}
			else {
				System.out.println("URL did not matched");
			}						              
		}
		
		@Test
		public void validateH8SummaryDataSolutions() throws InterruptedException {
			
			 //Locate element for which you wants to get height and width.
			        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_widget_1491428745026']/div/p/span"));
			        Actions action = new Actions(driver);
			        action.moveToElement(Text).perform();
			        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", Text);
			        //Get width of element.
			        String TextFontSize = Text.getCssValue("font-size");
			        System.out.println("Text size Is "+TextFontSize+" pixels");
			        String actual1 = "24px";
			
					Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions size Failed.");
					String TextFontColor = Text.getCssValue("color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actual2 = "rgba(255, 255, 255, 1)";
			
					Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
					String TextFontFamily = Text.getCssValue("font-family");
			        System.out.println("Font family Is "+TextFontFamily+" pixels");
			        String actual3 = "Lato, sans-serif";
			
					Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
					String TextFontWeight = Text.getCssValue("font-weight");
			        System.out.println("Font family Is "+TextFontWeight+" pixels");
			        String actual4 = "300";
			
			        Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
			 }
        @Test
		public void validateH8OfDataOverview() throws InterruptedException {
				
			
			  //Locate element for which you wants to get height and width.
			        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1487260765840671']/p"));
			        Actions action = new Actions(driver);
			        action.moveToElement(Text);
			        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", Text);
			        //Get width of element.
			        String TextFontSize = Text.getCssValue("font-size");
			        System.out.println("Text size Is "+TextFontSize+" pixels");
			        String actual1 = "30px";
			
					Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
					String TextLineHeight = Text.getCssValue("line-height");
			        System.out.println("Text size Is "+TextLineHeight+" pixels");
			        String actual5 = "40px";
			
					Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions line height Failed.");
					String TextFontColor = Text.getCssValue("color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actual2 = "rgba(78, 87, 87, 1)";
			
					Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
					String TextFontFamily = Text.getCssValue("font-family");
			        System.out.println("Font family Is "+TextFontFamily+" pixels");
			        String actual3 = "Lato, sans-serif";
			
					Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
					String TextFontWeight = Text.getCssValue("font-weight");
			        System.out.println("Font family Is "+TextFontWeight+" pixels");
			        String actual4 = "300";
			
					Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
			 }
		@Test
		public void validateH5OfDWH() throws InterruptedException {
			
		
			
			  //Locate element for which you wants to get height and width.
			        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1489585484893766']/div/div[1]/h4/a"));
			        Actions action = new Actions(driver);
			        action.moveToElement(Text);
			        ((JavascriptExecutor) driver).executeScript(
			                "arguments[0].scrollIntoView();", Text);
			        //Get width of element.
			        String TextFontSize = Text.getCssValue("font-size");
			        System.out.println("Text size Is "+TextFontSize+" pixels");
			        String actual1 = "23px";
			
					Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
					String TextLineHeight = Text.getCssValue("line-height");
			        System.out.println("Text size Is "+TextLineHeight+" pixels");
			        String actual5 = "26px";
			
					Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions line height Failed.");
					String TextFontColor = Text.getCssValue("color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actual2 = "rgba(240, 90, 40, 1)";
			
					Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
					String TextFontFamily = Text.getCssValue("font-family");
			        System.out.println("Font family Is "+TextFontFamily+" pixels");
			        String actual3 = "Lato, sans-serif";
			
					Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
					String TextFontWeight = Text.getCssValue("font-weight");
			        System.out.println("Font family Is "+TextFontWeight+" pixels");
			        String actual4 = "300";
			
					Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
			 }
		
		@Test
		public void validateH5OfAnalytics() throws InterruptedException {
					
			  //Locate element for which you wants to get height and width.
			        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1489585491508769']/div/div[1]/h4/a"));
			        Actions action = new Actions(driver);
			        action.moveToElement(Text);
			        ((JavascriptExecutor) driver).executeScript(
			                "arguments[0].scrollIntoView();", Text);
			        //Get width of element.
			        String TextFontSize = Text.getCssValue("font-size");
			        System.out.println("Text size Is "+TextFontSize+" pixels");
			        String actual1 = "23px";
			
					Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
					String TextLineHeight = Text.getCssValue("line-height");
			        System.out.println("Text size Is "+TextLineHeight+" pixels");
			        String actual5 = "26px";
			
					Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions line height Failed.");
					String TextFontColor = Text.getCssValue("color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actual2 = "rgba(240, 90, 40, 1)";
			
					Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
					String TextFontFamily = Text.getCssValue("font-family");
			        System.out.println("Font family Is "+TextFontFamily+" pixels");
			        String actual3 = "Lato, sans-serif";
			
					Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
					String TextFontWeight = Text.getCssValue("font-weight");
			        System.out.println("Font family Is "+TextFontWeight+" pixels");
			        String actual4 = "300";
			
					Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
			 }
		
		@Test
		public void validateH5OfCloud() throws InterruptedException {
				 
			  //Locate element for which you wants to get height and width.
			        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1489585488830768']/div/div[1]/h4/a"));
			        Actions action = new Actions(driver);
			        action.moveToElement(Text);
			        ((JavascriptExecutor) driver).executeScript(
			                "arguments[0].scrollIntoView();", Text);
			        //Get width of element.
			        String TextFontSize = Text.getCssValue("font-size");
			        System.out.println("Text size Is "+TextFontSize+" pixels");
			        String actual1 = "23px";
			        
					Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
					String TextLineHeight = Text.getCssValue("line-height");
			        System.out.println("Text size Is "+TextLineHeight+" pixels");
			        String actual5 = "26px";
			        
					Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions line height Failed.");
					String TextFontColor = Text.getCssValue("color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actual2 = "rgba(240, 90, 40, 1)";
			        
					Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
					String TextFontFamily = Text.getCssValue("font-family");
			        System.out.println("Font family Is "+TextFontFamily+" pixels");
			        String actual3 = "Lato, sans-serif";
			        
					Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
					String TextFontWeight = Text.getCssValue("font-weight");
			        System.out.println("Font family Is "+TextFontWeight+" pixels");
			        String actual4 = "300";
			        
					Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
			 }
		
		@Test
		public void validateH5OfSupport() throws InterruptedException {
			
			 
			  //Locate element for which you wants to get height and width.
			        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1489585492644770']/div/div[1]/h4/a"));
			        Actions action = new Actions(driver);
			        action.moveToElement(Text);
			        ((JavascriptExecutor) driver).executeScript(
			                "arguments[0].scrollIntoView();", Text);
			        //Get width of element.
			        String TextFontSize = Text.getCssValue("font-size");
			        System.out.println("Text size Is "+TextFontSize+" pixels");
			        String actual1 = "23px";
			        
					Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
					String TextLineHeight = Text.getCssValue("line-height");
			        System.out.println("Text size Is "+TextLineHeight+" pixels");
			        String actual5 = "26px";
			        
					Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions line height Failed.");
					String TextFontColor = Text.getCssValue("color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actual2 = "rgba(240, 90, 40, 1)";
			        
					Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
					String TextFontFamily = Text.getCssValue("font-family");
			        System.out.println("Font family Is "+TextFontFamily+" pixels");
			        String actual3 = "Lato, sans-serif";
			        
					Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
					String TextFontWeight = Text.getCssValue("font-weight");
			        System.out.println("Font family Is "+TextFontWeight+" pixels");
			        String actual4 = "300";
			        
					Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
			 }
		
		@Test
		public void validateH54OfToolExpertise() throws InterruptedException {
						 
			  //Locate element for which you wants to get height and width.
			        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_14871953872791097']/h3/span"));
			        Actions action = new Actions(driver);
			        action.moveToElement(Text);
			        ((JavascriptExecutor) driver).executeScript(
			                "arguments[0].scrollIntoView();", Text);
			        //Get width of element.
			        String TextFontSize = Text.getCssValue("font-size");
			        System.out.println("Text size Is "+TextFontSize+" pixels");
			        String actual1 = "25px";
			        
					Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
					String TextLineHeight = Text.getCssValue("line-height");
			        System.out.println("Text size Is "+TextLineHeight+" pixels");
			        String actual5 = "35px";
			        
					Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions line height Failed.");
					String TextFontColor = Text.getCssValue("color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actual2 = "rgba(241, 89, 50, 1)";
			        
					Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
					String TextFontFamily = Text.getCssValue("font-family");
			        System.out.println("Font family Is "+TextFontFamily+" pixels");
			        String actual3 = "Lato, sans-serif";
			        
					Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
					String TextFontWeight = Text.getCssValue("font-weight");
			        System.out.println("Font family Is "+TextFontWeight+" pixels");
			        String actual4 = "300";
			        
					Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
			 }
		
		@Test
		public void validateIntroOfToolExpertise() throws InterruptedException {
			 
		
			 
			  //Locate element for which you wants to get height and width.
			        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_14871953872791097']/div/span"));
			        Actions action = new Actions(driver);
			        action.moveToElement(Text);
			        ((JavascriptExecutor) driver).executeScript(
			                "arguments[0].scrollIntoView();", Text);
			        //Get width of element.
			        String TextFontSize = Text.getCssValue("font-size");
			        System.out.println("Text size Is "+TextFontSize+" pixels");
			        String actual1 = "20px";
			        
					Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
					String TextLineHeight = Text.getCssValue("line-height");
			        System.out.println("Text size Is "+TextLineHeight+" pixels");
			        String actual5 = "23px";
			        
					Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions line height Failed.");
					String TextFontColor = Text.getCssValue("color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actual2 = "rgba(121, 121, 121, 1)";
			        
					Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
					String TextFontFamily = Text.getCssValue("font-family");
			        System.out.println("Font family Is "+TextFontFamily+" pixels");
			        String actual3 = "Lato, sans-serif";
			        
					Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
					String TextFontWeight = Text.getCssValue("font-weight");
			        System.out.println("Font family Is "+TextFontWeight+" pixels");
			        String actual4 = "300";
			        
					Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
			 }
		
		@Test
		public void validateGetHelpToday() throws InterruptedException {
			 
		
			 
			  //Locate element for which you wants to get height and width.
			        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_14871958508831107']/a"));
			        Actions action = new Actions(driver);
			        action.moveToElement(Text);
			        ((JavascriptExecutor) driver).executeScript(
			                "arguments[0].scrollIntoView();", Text);
			        //Get width of element.
			        String TextFontSize = Text.getCssValue("font-size");
			        System.out.println("Text size Is "+TextFontSize+" pixels");
			        String actual1 = "29px";
			        
					Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
					String TextLineHeight = Text.getCssValue("line-height");
			        System.out.println("Text size Is "+TextLineHeight+" pixels");
			        String actual5 = "23px";
			        
					Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions line height Failed.");
					String TextFontColor = Text.getCssValue("color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actual2 = "rgba(240, 90, 40, 1)";
			        
					Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
					String TextFontFamily = Text.getCssValue("font-family");
			        System.out.println("Font family Is "+TextFontFamily+" pixels");
			        String actual3 = "Lato, sans-serif";
			        
					Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
					String TextFontWeight = Text.getCssValue("font-weight");
			        System.out.println("Font family Is "+TextFontWeight+" pixels");
			        String actual4 = "300";
			        
					Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
			 }
		
		@Test
		public void validateH3PlatFormExpertise() throws InterruptedException {
			 
		
			 
			  //Locate element for which you wants to get height and width.
			        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1489596871484925']/h3/span"));
			        Actions action = new Actions(driver);
			        action.moveToElement(Text);
			        ((JavascriptExecutor) driver).executeScript(
			                "arguments[0].scrollIntoView();", Text);
			        //Get width of element.
			        String TextFontSize = Text.getCssValue("font-size");
			        System.out.println("Text size Is "+TextFontSize+" pixels");
			        String actual1 = "25px";
			        
					Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
					String TextLineHeight = Text.getCssValue("line-height");
			        System.out.println("Text size Is "+TextLineHeight+" pixels");
			        String actual5 = "35px";
			        
					Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions line height Failed.");
					String TextFontColor = Text.getCssValue("color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actual2 = "rgba(241, 89, 50, 1)";
			        
					Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
					String TextFontFamily = Text.getCssValue("font-family");
			        System.out.println("Font family Is "+TextFontFamily+" pixels");
			        String actual3 = "Lato, sans-serif";
			        
					Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
					String TextFontWeight = Text.getCssValue("font-weight");
			        System.out.println("Font family Is "+TextFontWeight+" pixels");
			        String actual4 = "300";
			        
					Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
			 }
		
		@Test
		public void validatePlatFormExpertise() throws InterruptedException {
			 
		
			 
			  //Locate element for which you wants to get height and width.
			        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_14895986248231017']/div/div[1]"));
			        Actions action = new Actions(driver);
			        action.moveToElement(Text);
			        ((JavascriptExecutor) driver).executeScript(
			                "arguments[0].scrollIntoView();", Text);
			        //Get width of element.
			        String TextFontSize = Text.getCssValue("font-size");
			        System.out.println("Text size Is "+TextFontSize+" pixels");
			        String actual1 = "14px";
			        
					Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
					String TextLineHeight = Text.getCssValue("line-height");
			        System.out.println("Text size Is "+TextLineHeight+" pixels");
			        String actual5 = "23px";
			        
					Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions line height Failed.");
					String TextFontColor = Text.getCssValue("color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actual2 = "rgba(255, 255, 255, 1)";
			        
					Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
					String TextFontFamily = Text.getCssValue("font-family");
			        System.out.println("Font family Is "+TextFontFamily+" pixels");
			        String actual3 = "Lato, sans-serif";
			        
					Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
					String TextFontWeight = Text.getCssValue("font-weight");
			        System.out.println("Font family Is "+TextFontWeight+" pixels");
			        String actual4 = "normal";
			        
					Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
			 }
		@Test
		public void validateCloudDWH() throws InterruptedException {
			 
		
			 
			  //Locate element for which you wants to get height and width.
			        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_14895986248231017']/div/div[2]"));
			        Actions action = new Actions(driver);
			        action.moveToElement(Text);
			        ((JavascriptExecutor) driver).executeScript(
			                "arguments[0].scrollIntoView();", Text);
			        //Get width of element.
			        String TextFontSize = Text.getCssValue("font-size");
			        System.out.println("Text size Is "+TextFontSize+" pixels");
			        String actual1 = "16px";
			        
					Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
					String TextLineHeight = Text.getCssValue("line-height");
			        System.out.println("Text size Is "+TextLineHeight+" pixels");
			        String actual5 = "23px";
			        
					Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions line height Failed.");
					String TextFontColor = Text.getCssValue("color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actual2 = "rgba(255, 255, 255, 1)";
			        
					Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
					String TextBgColor = Text.getCssValue("background-color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actualcolor = "rgba(78, 78, 78, 0.498039)";
			        
					Assert.assertEquals(TextBgColor, actualcolor, "Validating Cloud DWH Background color Failed.");
					String TextFontFamily = Text.getCssValue("font-family");
			        System.out.println("Font family Is "+TextFontFamily+" pixels");
			        String actual3 = "Lato, sans-serif";
			        
					Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
					String TextFontWeight = Text.getCssValue("font-weight");
			        System.out.println("Font family Is "+TextFontWeight+" pixels");
			        String actual4 = "normal";
			        
					Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
			 }
		@Test
		public void validateOnPremiseDWH() throws InterruptedException {
			 
		
			 
			  //Locate element for which you wants to get height and width.
			        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_14895986248231017']/div/div[3]"));
			        Actions action = new Actions(driver);
			        action.moveToElement(Text);
			        ((JavascriptExecutor) driver).executeScript(
			                "arguments[0].scrollIntoView();", Text);
			        //Get width of element.
			        String TextFontSize = Text.getCssValue("font-size");
			        System.out.println("Text size Is "+TextFontSize+" pixels");
			        String actual1 = "14px";
			        
					Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
					String TextLineHeight = Text.getCssValue("line-height");
			        System.out.println("Text size Is "+TextLineHeight+" pixels");
			        String actual5 = "23px";
			        
					Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions line height Failed.");
					String TextFontColor = Text.getCssValue("background-color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actual2 = "rgba(48, 48, 48, 0.6)";
			        
					Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
					String TextFontFamily = Text.getCssValue("font-family");
			        System.out.println("Font family Is "+TextFontFamily+" pixels");
			        String actual3 = "Lato, sans-serif";
			        
					Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
					String TextFontWeight = Text.getCssValue("font-weight");
			        System.out.println("Font family Is "+TextFontWeight+" pixels");
			        String actual4 = "normal";
			        
					Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
			 }
		
		@Test
		public void validateAboutRythmos() throws InterruptedException {
	 	
			 
			  //Locate element for which you wants to get height and width.
			        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1487256899243559']/span"));
			        Actions action = new Actions(driver);
			        action.moveToElement(Text);
			        ((JavascriptExecutor) driver).executeScript(
			                "arguments[0].scrollIntoView();", Text);
			        //Get width of element.
			        String TextFontSize = Text.getCssValue("font-size");
			        System.out.println("Text size Is "+TextFontSize+" pixels");
			        String actual1 = "30px";
			        
					Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
					String TextLineHeight = Text.getCssValue("line-height");
			        System.out.println("Text size Is "+TextLineHeight+" pixels");
			        String actual5 = "35px";
			        
					Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions line height Failed.");
					String TextFontColor = Text.getCssValue("color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actual2 = "rgba(121, 121, 121, 1)";
			        
					Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
					String TextFontFamily = Text.getCssValue("font-family");
			        System.out.println("Font family Is "+TextFontFamily+" pixels");
			        String actual3 = "Lato, sans-serif";
			        
					Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
					String TextFontWeight = Text.getCssValue("font-weight");
			        System.out.println("Font family Is "+TextFontWeight+" pixels");
			        String actual4 = "300";
			        
					Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
			 
		}
		@Test
		public void validateVisualization() throws InterruptedException {
			 	
			 
			  //Locate element for which you wants to get height and width.
			        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1487190735025523']/div/div[2]"));
			        Actions action = new Actions(driver);
			        action.moveToElement(Text);
			        ((JavascriptExecutor) driver).executeScript(
			                "arguments[0].scrollIntoView();", Text);
			        //Get width of element.
			        String TextFontSize = Text.getCssValue("font-size");
			        System.out.println("Text size Is "+TextFontSize+" pixels");
			        String actual1 = "14px";
			        
					Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
					String TextLineHeight = Text.getCssValue("line-height");
			        System.out.println("Text size Is "+TextLineHeight+" pixels");
			        String actual5 = "23px";
			        
					Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions line height Failed.");
					String TextFontColor = Text.getCssValue("color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actual2 = "rgba(255, 255, 255, 1)";
			        
					Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
					String TextBgColor = Text.getCssValue("background-color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actualcolor = "rgba(78, 78, 78, 0.8)";
			        
					Assert.assertEquals(TextBgColor, actualcolor, "Validating Cloud DWH Background color Failed.");
					String TextFontFamily = Text.getCssValue("font-family");
			        System.out.println("Font family Is "+TextFontFamily+" pixels");
			        String actual3 = "Lato, sans-serif";
			        
					Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
					String TextFontWeight = Text.getCssValue("font-weight");
			        System.out.println("Font family Is "+TextFontWeight+" pixels");
			        String actual4 = "300";
			       	Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
			 }
		
		@Test
		public void validateEtlAndDataPrep() throws InterruptedException {
			 
		
			 
			  //Locate element for which you wants to get height and width.
			        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1489590650417896']/div/div[1]/img"));
			        Actions action = new Actions(driver);
			        action.moveToElement(Text);
			        ((JavascriptExecutor) driver).executeScript(
			                "arguments[0].scrollIntoView();", Text);
			        //Get width of element.
			        String TextFontSize = Text.getCssValue("font-size");
			        System.out.println("Text size Is "+TextFontSize+" pixels");
			        String actual1 = "14px";
			        
					Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
					String TextLineHeight = Text.getCssValue("line-height");
			        System.out.println("Text size Is "+TextLineHeight+" pixels");
			        String actual5 = "23px";
			        
					Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions line height Failed.");
					String TextFontColor = Text.getCssValue("color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actual2 = "rgba(121, 121, 121, 1)";
			        
					Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
					String TextBgColor = Text.getCssValue("background-color");
			        System.out.println("Text color Is "+TextFontColor+" pixels");
			        String actualcolor = "rgba(78, 78, 78, 0.8)";
			        
					Assert.assertEquals(TextBgColor, actualcolor, "Validating Cloud DWH Background color Failed.");
					String TextFontFamily = Text.getCssValue("font-family");
			        System.out.println("Font family Is "+TextFontFamily+" pixels");
			        String actual3 = "Lato, sans-serif";
			        
					Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
					String TextFontWeight = Text.getCssValue("font-weight");
			        System.out.println("Font family Is "+TextFontWeight+" pixels");
			        String actual4 = "300";
			        Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
			 }

		
		
				
		@AfterMethod
		public void closeBrowser() {
		
		
		}
		
		@AfterTest
		public void quiteBrowser() {
		driver.close();
		System.out.println("Test completed successfully!");
		}		
}


