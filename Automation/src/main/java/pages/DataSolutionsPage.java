package pages;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DataSolutionsPage {
	WebDriver driver;
	
	
	public static final By Solutions_link = By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a");
	public static final By DataSolutions_link = By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/a");
	public static final By DataWarehouse_link = By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/ul/li[1]/a");
	public static final By Analytics_link = By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/ul/li[2]/a");
	public static final By CloudSolutions_link = By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/ul/li[3]/a");
	public static final By DataSupport_link = By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/ul/li[4]/a");
	
	public static final By DataSolutions_H1_Title = By.xpath("//*[@id='hs_cos_wrapper_widget_1525098855444']/div/div/div[1]/h1");
	public static final By VALIDATE_GDPLPage = By.xpath(".//*[@id='hs_cos_wrapper_widget_1491428745026']/div/h1");
	public static final By VALIDATE_DataSolDesc = By.xpath(".//*[@id='hs_cos_wrapper_widget_1491428745026']/div/p/span");
	public static final By DataSolutionsH8_Page = By.xpath(".//*[@id='hs_cos_wrapper_widget_1491428745026']/div/p/span");
	public static final By VALIDATE_DataSolutionsDetails = By.xpath(".//*[@id='hs_cos_wrapper_module_1487260765840671']/p");
	public static final By VALIDATE_DWH_IMAGE = By.xpath(".//*[@id='hs_cos_wrapper_module_1489585484893766']/div/a/img");
	public static final By VALIDATE_ANALYTICS_IMAGE = By.xpath(".//*[@id='hs_cos_wrapper_module_1489585491508769']/div/a/img");
	public static final By VALIDATE_CLOUD_IMAGE = By.xpath(".//*[@id='hs_cos_wrapper_module_1489585488830768']/div/a/img");
	public static final By VALIDATE_SUPPORT_IMAGE = By.xpath(".//*[@id='hs_cos_wrapper_module_1489585492644770']/div/a/img");

	
//	public void clickLinkByHref(String href) {
//	    List<WebElement> anchors = driver.findElements(By.tagName("a"));
//	    Iterator<WebElement> i = anchors.iterator();
//
//	    while(i.hasNext()) {
//	        WebElement anchor = i.next();
//	        if(anchor.getAttribute("href").contains(href)) {
//	            anchor.click();
//	            break;
//	        }
//	    }
//	}
	
	
	public void clickOnSolutions(){		
		driver.findElement(Solutions_link).click();		
	}
	
	public void clickOnDataSolutions(){
		driver.findElement(DataSolutions_link).click();		
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public void clickingOnH8DataSolutions(){
		driver.findElement(DataSolutionsH8_Page).click();		
	}
	
	public void ClickingOnDataWarehouse() {		
		driver.findElement(DataWarehouse_link).click();
	}
	
	public void Analytics() {
		driver.findElement(Analytics_link).click();
	}
	
	public void CloudSolutions() {
		driver.findElement(CloudSolutions_link).click();	
	}
	
	public void DataSupport() {
		driver.findElement(DataSupport_link).click();	
	}
	
	

}
