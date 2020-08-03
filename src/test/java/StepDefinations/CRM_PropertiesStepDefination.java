package StepDefinations;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


import CRMPages.CRMPropertiesPage;
import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CRM_PropertiesStepDefination {
	
	TestContext testContext;
	private static Logger log=LogManager.getLogger(CRM_LoginPageStepDefination.class.getName());
	CRMPropertiesPage crmPropertiesPage;

	public CRM_PropertiesStepDefination(TestContext context) {
		 testContext = context;
		 crmPropertiesPage = testContext.getPageObjectManager().getCRMPropertiesPage();
		 }
	
	
	@And("^click on property menu$")
    public void click_on_property_menu() throws Throwable {
		crmPropertiesPage.clickOnPropertiesMenu();
    }
	
	 @And("^click on Properties menu and search for \"([^\"]*)\" property$")
	    public void click_on_properties_menu_and_search_for_property(String propertName) throws Throwable {
	     
	    }
	 
	  @Then("^click on Shedule Showing button$")
	    public void click_on_shedule_showing_button() throws Throwable {
		  crmPropertiesPage.clickOnSceduleShowing();
	    }
}
