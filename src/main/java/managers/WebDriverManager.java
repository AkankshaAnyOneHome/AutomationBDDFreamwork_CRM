package managers;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import dataProviders.ConfigFileReader;
import enums.DriverType;


public class WebDriverManager {
	private WebDriver driver;
	private static DriverType driverType;

	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	ConfigFileReader configFileReader;
	public WebDriverManager() {
		configFileReader= new ConfigFileReader();
		driverType = configFileReader.getBrowser();
		
	}

	public WebDriver getDriver() {
		if(driver == null) driver = createDriver();
		return driver;
	}

	

	
	private WebDriver createDriver() {
        switch (driverType) {	    
        case FIREFOX : driver = new FirefoxDriver();
	    	break;
        case CHROME : 
        	System.setProperty(CHROME_DRIVER_PROPERTY, configFileReader.getDriverPath());
        	driver = new ChromeDriver();
    		break;
        case INTERNETEXPLORER : driver = new InternetExplorerDriver();
    		break;
        }

        if(configFileReader.getBrowserWindowSize()) driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		return driver;
	}	

	public void closeDriver() {
		driver.close();
		driver.quit();
	}
}
