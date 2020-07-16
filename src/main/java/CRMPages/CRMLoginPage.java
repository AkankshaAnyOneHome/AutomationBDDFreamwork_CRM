package CRMPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import dataProviders.ConfigFileReader;


public class CRMLoginPage{	
	ConfigFileReader configFileReader ;
	private static Logger log=LogManager.getLogger(CRMLoginPage.class.getName());
	
	WebDriver driver;
	//Logger log = TestBase.getLogger(TestBase.class);
		@FindBy(xpath = "//input[@id='inputEmail']")
		WebElement txtEmail;		
		@FindBy(xpath = "//input[@id='inputPassword']")
		WebElement txtPWD;		
		@FindBy(xpath = "//button[@class='btn btn-info showproSignInBtn']")
		WebElement btnSignIn;
		@FindBy(xpath = "//span[@class='thumb-small avatar inline']")
		WebElement icnLogout;
		@FindBy(xpath = "//a[contains(text(),'Logout')]")
		WebElement lblLogout;
		
		
		public CRMLoginPage(WebDriver driver) {
			this.driver = driver;
			 PageFactory.initElements(driver, this);
			 configFileReader= new ConfigFileReader();
			 }
		

		public void testLogin(String uname, String pwd) throws InterruptedException {
			
		configFileReader = new ConfigFileReader();
		Thread.sleep(1000);
		
		//String Uname=prop.getProperty("username");
		System.out.println(uname);
	  //  String PWD=prop.getProperty("password");
	    System.out.println(pwd);
	    Thread.sleep(200);
		txtEmail.sendKeys(uname);
		
		txtPWD.sendKeys(pwd);
		
		btnSignIn.click();
	
		
		
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		}
		
		public void navigateTo_LoginPage() {
			configFileReader= new ConfigFileReader();
			 driver.get(configFileReader.getApplicationUrl());
			 }
		
		public void testLogout() throws InterruptedException
		{
		Thread.sleep(3000);
		icnLogout.click();
		lblLogout.click();
		}		
}
