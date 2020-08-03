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
	
	
	@And("^Enter all mandatory details to create new Lead \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void enter_all_mandatory_details_to_create_new_lead(String FName, String LName, String phoneNo, String Email,
			String ContactType, String fromTime, String ToTime, String propertyName, String floorPlan, String Unit,
			String Origin, String Source, String MoveInDate) throws Throwable {
		
		
		crmDashboardCreateEventPage.createNewLead(FName, LName, phoneNo, Email, ContactType, fromTime, ToTime, propertyName, floorPlan,
				Unit, Origin, Source, MoveInDate);
		
		crmDashboardCreateEventPage.clickOnCreateBtn();
		
		
    }
	
	
	
	
	@Then("^Select option \"([^\"]*)\" to create Lead$")
    public void select_option_to_create_lead(String option) throws Throwable {
		crmDashboardCreateEventPage.clickOnHeaderCreateBtn();
		
    }
	
	@And("^click on profile icon$")
    public void click_on_profile_icon() throws Throwable {
		crmDashboardCreateEventPage.clickOnProfileImageIcon();
		
    }
	
	 @Then("^click on create button$")
	    public void click_on_create_button() throws Throwable {
		 crmDashboardCreateEventPage.clickOnCreateBtn();
		 log.info("Lead created sucessfully ");
	    }
	 
	 @Then("^click on more button$")
	    public void click_on_more_button() throws Throwable {
		 crmDashboardCreateEventPage.clickOnMoreBtn();
		
	    }
	 
	 @Then("^click on next button$")
	    public void click_on_next_button() throws Throwable {
		 crmDashboardCreateEventPage.clickOnCreateBtn();
		 log.info("clicked on next button ");
	    }
	 @Then("^Enter all mandatory details to log showing \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	    public void enter_all_mandatory_details_to_log_showing(String month, String day, String fromTime, String toTime, String showingResult, String note) throws Throwable {
	//Todo
	    }
	 
	 @Then("^Enter all mandatory details to schedule showing \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	    public void enter_all_mandatory_details_to_schedule_showing(String month, String week, String date, String note) throws Throwable {
		 
	    }
	 
	 @Then("^Enter all mandatory details to schedule showing \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" for anather Agent$")
	    public void enter_all_mandatory_details_to_schedule_showing_for_anatherAgent(String agentName, String month, String week, String date, String note) throws Throwable {
		 
	    }
	 
	 @Then("^Enter all details for Guest Desires \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
	    public void enter_all_details_for_guest_desires(String desiredMonthlyRent, String desiredLeaseLength, String occupants, String beds, String bath, String washer) throws Throwable {
		 crmDashboardCreateEventPage.guestDesire(desiredMonthlyRent, desiredLeaseLength, occupants, beds, bath, washer);
		 log.info("Entered all details for Guest Desires");
	 }

}
