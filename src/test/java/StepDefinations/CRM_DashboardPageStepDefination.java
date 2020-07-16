package StepDefinations;








import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import CRMPages.CRMDashboardCreateEventPage;


import cucumber.TestContext;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

//import org.apache.logging.log4j.*;
public class CRM_DashboardPageStepDefination{
	TestContext testContext;
	
	CRMDashboardCreateEventPage crmDashboardCreateEventPage;
	//private static Logger log =LogManager.getLogger(CRM_DashboardPageStepDefination.class.getName());
	
	
	
	private static Logger log=LogManager.getLogger(CRM_DashboardPageStepDefination.class.getName());
	//Logger log = (Logger) TestBase.getLogger(TestBase.class);
	
	public CRM_DashboardPageStepDefination(TestContext context) {
		 testContext = context;
		 crmDashboardCreateEventPage = testContext.getPageObjectManager().getCRMDashboardCreateEventPage();
		 
		 
		 }
	


	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@And("^Enter all mandatory details to create new Lead \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void enter_all_mandatory_details_to_create_new_lead(String EType, String FName, String LName, String phoneNo, String Email,
			String ContactType, String fromTime, String ToTime, String propertyName, String floorPlan, String Unit,
			String Origin, String Source, String MoveInDate) throws Throwable {
		
		crmDashboardCreateEventPage.clickOnHeaderCreateBtn();
		crmDashboardCreateEventPage.createNewLead(EType, FName, LName, phoneNo, Email, ContactType, fromTime, ToTime, propertyName, floorPlan,
				Unit, Origin, Source, MoveInDate);
		crmDashboardCreateEventPage.clickOnCreateBtn();
		
		log.info("Lead created sucessfully ");
    }
	
	
	
	@Then("^select lead to create a new lead$")
	public void select_lead_to_create_a_new_lead() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("^Enter all mandatory details to create new Lead$")
    public void details_to_create_lead_frtname_and_lstname_and_phone_and_property_and_origine()  {
        
    }
	 
	
	
}
