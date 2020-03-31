package validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.Base;

@Listeners(common.CustomListener.class)
public class IntegrationSolutionsTest extends Base {
	
	@BeforeMethod
	public void lauchBrowser() {
		browserInitialization();
		 
	}
	
	@Test(priority=1)
	public void goToIntegrationSolutionsPage() {
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String expected = "https://www.rythmos.com/integration-solutions";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
		      
	}
	
	@Test(priority=2)
	public void verifyInnerPageSubTitleHeader() {    
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/a")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		String expected = "Integration Solutions";
		String actual = driver.findElement(By.xpath("//*[@id='hs_cos_wrapper_widget_1526390534483']/div/div/div[1]/h1")).getText();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);					              
	}
	
	@Test(priority=3)
	public void verifyReactiveMicroservicesIsALink() {    
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/a")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
     	WebElement linkName = driver.findElement(By.linkText("Reactive Microservices"));
		if(linkName.isDisplayed())
		{
		  System.out.println("Reactive Microservices link is displayed");
		}
		else
		{
		  System.out.println("Reactive Microservices link is NOT displayed");
		}        					              
	}
	
	@Test(priority=4)
	public void verifySabreIntelligenceExchangeIsALink() {    
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/a")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement linkName = driver.findElement(By.linkText("Sabre Intelligence Exchange"));
		if(linkName.isDisplayed())
		{
		  System.out.println("Sabre Intelligence Exchange link is displayed");
		}
		else
		{
		  System.out.println("Sabre Intelligence Exchange link is NOT displayed");
		}        					              
	}
	
	@Test(priority=5)
	public void verifyAPIsIsALink() {    
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/a")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement linkName = driver.findElement(By.linkText("APIs"));
		if(linkName.isDisplayed())
		{
		  System.out.println("APIs link is displayed");
		}
		else
		{
		  System.out.println("APIs link is NOT displayed");
		}        					              
	}
	
	@Test(priority=6)
	public void verifyUXUIIsALink() {    
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/a")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement linkName = driver.findElement(By.linkText("UX/UI"));
		if(linkName.isDisplayed())
		{
		  System.out.println("UX/UI link is displayed");
		}
		else
		{
		  System.out.println("UX/UI link is NOT displayed");
		}        					              
	}
	
	@Test(priority=7)
	public void verifyModernizeAppswithReactiveMicroservicesIsALink() {    
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/a")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement linkName = driver.findElement(By.linkText("Modernize Apps with Reactive Microservices"));
		if(linkName.isDisplayed())
		{
		  System.out.println("Modernize Apps with Reactive Microservices");
		}
		else
		{
		  System.out.println("Modernize Apps with Reactive Microservices");
		}        					              
	}
	
	@Test(priority=8)
	public void verifyDevelopSabreIntelligenceExchangeIXApplicationsIsALink() {    
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/a")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement linkName = driver.findElement(By.linkText("Develop Sabre Intelligence Exchange (IX) Applications"));
		if(linkName.isDisplayed())
		{
		  System.out.println("Develop Sabre Intelligence Exchange (IX) Applications link is displayed");
		}
		else
		{
		  System.out.println("Develop Sabre Intelligence Exchange (IX) Applications link is NOT displayed");
		}        					              
	}
	
	@Test(priority=9)
	public void verifyBuildAndLeverageAPIstoPowerIntegrationIsALink() {    
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/a")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement linkName = driver.findElement(By.linkText("Build and Leverage APIs to Power Integration"));
		if(linkName.isDisplayed())
		{
		  System.out.println("Build and Leverage APIs to Power Integration link is displayed");
		}
		else
		{
		  System.out.println("Build and Leverage APIs to Power Integration link is NOT displayed");
		}        					              
	}
	
	@Test(priority=10)
	public void verifyMobileAndDesktopApplicationsIsALink() {    
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/a")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement linkName = driver.findElement(By.linkText("Mobile and Desktop Applications"));
		if(linkName.isDisplayed())
		{
		  System.out.println("Mobile and Desktop Applications link is displayed");
		}
		else
		{
		  System.out.println("Mobile and Desktop Applications link is NOT displayed");
		}        					              
	}
	
	@Test(priority=11)
	public void verifyContactUsIsALink() {    
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/a")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
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
	
	@Test(priority=12)
	public void verifyRythmosBlogIsALink() {    
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/a")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);		
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
		driver.close();
		driver.quit();		
	}
}
