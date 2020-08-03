package CRMPages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CRMPropertiesPage{
	private static Logger log=LogManager.getLogger(CRMPropertiesPage.class.getName());
	WebDriver driver;
	@FindBy(xpath = "//span[contains(text(),'properties')]")
	WebElement MenuProperties;
	@FindBy(xpath = "//div[@class='input-group search datagrid-search m-t-small']//input[@placeholder='Search']")
	WebElement SearchField;
	@FindBy(xpath = "//i[@class='fa fa-search']")
	WebElement SearchIcon;
	@FindBy(xpath = "//i[@class='fa fa-eye']")
	WebElement OpenEyeIcon;
	@FindBy(xpath = "//div[@id='schedule_property_event']//a[3]")
	WebElement btnServiceRequest;
	@FindBy(xpath = "//div[@id='schedule_property_event']/a[1]/i")
	WebElement btnSheduleShowing;
	
	
	// Page factory initilization
		public CRMPropertiesPage(WebDriver driver) {
			this.driver = driver;
			 PageFactory.initElements(driver, this);
		}
		
	//Open specific property after search
		public void SearchOpenProperty(String propertyName) throws InterruptedException {
			Thread.sleep(2000);
			MenuProperties.click();
			Thread.sleep(2000);
			SearchField.sendKeys(propertyName);
			SearchIcon.click();
			OpenEyeIcon.click();
				
		}
		
		public void clickSR()
		{
			btnServiceRequest.click();
		}
		
		public void clickOnPropertiesMenu() throws InterruptedException {
			
			MenuProperties.click();
			
		}
		
public void clickOnSceduleShowing() throws InterruptedException {
			
	btnSheduleShowing.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		
		
}
