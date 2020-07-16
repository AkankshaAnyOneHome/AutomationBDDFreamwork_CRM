package StepDefinations;




import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import CRMPages.CRMLoginPage;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;



public class CRM_LoginPageStepDefination {
	TestContext testContext;
	
	private static Logger log=LogManager.getLogger(CRM_LoginPageStepDefination.class.getName());
	
	CRMLoginPage crmLoginPage;
	
	
	
	public CRM_LoginPageStepDefination(TestContext context) {
		 testContext = context;
		crmLoginPage = testContext.getPageObjectManager().getCRMLoginPage();
		 }
	
	
	 @SuppressWarnings("deprecation")
	@Given("^Initialize the browser with \"([^\"]*)\" and Navigate to Login page$")
		public void initialize_the_browser_with_chrome_and_Navigate_to_LoginPage(String Chrome) throws Throwable {
			 
		 crmLoginPage.navigateTo_LoginPage();
		 BasicConfigurator.configure();
		 freemarker.log.Logger.selectLoggerLibrary(freemarker.log.Logger.LIBRARY_NONE);
		 log.info("Initialize the browser successfuly");
			
		}
	 
	 @When("^login to application using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_to_application_using_and(String username, String password) throws InterruptedException  {
	    
		
		crmLoginPage.testLogin(username, password);
		log.info("Log in to application successfuly");
		
		
		
	    
	}
	
}
