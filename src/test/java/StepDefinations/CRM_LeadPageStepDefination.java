package StepDefinations;




import static org.testng.AssertJUnit.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;

import CRMPages.CRMLeadPage;

import cucumber.TestContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import enums.Context;
import io.cucumber.java.en.When;


public class CRM_LeadPageStepDefination {
	TestContext testContext;

	CRMLeadPage crmLeadPage;
	private static Logger log=LogManager.getLogger(CRM_LeadPageStepDefination.class.getName());
	
	public CRM_LeadPageStepDefination(TestContext context) {
		 testContext = context;
		 crmLeadPage = testContext.getPageObjectManager().getCRMLeadPage();
		 }
	
	
	
	@And("^Enter all mandatory details log events \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void enter_all_mandatory_details_log_events(String FName,String LName, String eventType,String duedate,String fromTime,String txtEventNotes,String agentName) throws Throwable {
	
	crmLeadPage.leadSearchOpen(FName,LName);
	crmLeadPage.logEventForLead(eventType,duedate,fromTime,txtEventNotes,agentName);
	
	 
	//
    }
 
	 @And("^Schedule task for other agent \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void Schedule_task_for_other_agent(String FName,String LName,String eventType,String day,String month,String fromTime,String txtEventNotes,String agentName) throws Throwable {
	 
	 crmLeadPage.leadSearchOpen(FName,LName);
	
	 crmLeadPage.scheduleTaskForOtherAgent(eventType,day, month, fromTime,txtEventNotes,agentName);
		log.info("Even Sceduled sucessfully ");

		
	
    }

 
 @Then("^Schedule event for Lead \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void schedule_event_for_himself(String eventType,String day,String month,String fromTime,String toTime,String txtEventNotes) throws Throwable {
	
	
	 crmLeadPage.scheduleEventForLead(eventType,day,month,fromTime,toTime,txtEventNotes);
	 
	
    }
 
 @And("^Schedule event for other Agent \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void schedule_event_for_other_agent(String eventType,String duedate,String fromTime,String toTime,String agentName,String txtEventNotes) throws Throwable {
	
	
	 crmLeadPage.scheduleEventForLeadOtherAgent(eventType,duedate,fromTime,toTime,agentName,txtEventNotes);
	
	
	 
	
    }
 
 @And("^Schedule event for himself (.+),(.+),(.+),(.+),(.+),(.+),(.+)$")
    public void schedule_event_for_himself_Multiple(String FName,String LName,String eventType,String duedate,String fromTime,String toTime,String txtEventNotes) throws Throwable {
	
	 crmLeadPage.leadSearchOpen(FName,LName);
	 crmLeadPage.scheduleEventForLead(eventType,duedate,fromTime,toTime,txtEventNotes, txtEventNotes);
	
	 
    }
 
 @Then("^Verify whether new log event \"([^\"]*)\" created by Agent display in contact activity$")
 public void verify_whether_new_log_event_created_by_agent_display_in_contact_activity(String eventType) throws Throwable {
	 
	 crmLeadPage.getcontactActivityCountAfterScedule();
	 int ActivityCount  = (int)testContext.scenarioContext.getContext(Context.ACTIVITY_LIST);
	 Assert.assertEquals(crmLeadPage.getcontactActivityCountBeforeScedule(), ActivityCount);
	 crmLeadPage.validateLog_contactActivity(eventType);
	 log.info("Log created sucessfully");
 }
 
 @Then("^Verify whether new task \"([^\"]*)\" sceduled for date \"([^\"]*)\" and time \"([^\"]*)\" successfuly$")
 public void verify_whether_new_task_sceduled_successfully(String task, String date, String time) throws Throwable {
	 crmLeadPage.sheduledTaskValidation(task,date,time);
	 
 }
 
 @And("^click on Lead menu and search for \"([^\"]*)\",\"([^\"]*)\" lead with \"([^\"]*)\"$")
 public void click_on_lead_menu_and_search_for_lead(String FName, String LName, String leadStatus) throws Throwable {
	
	 crmLeadPage.leadCreateValidation( FName,  LName,  leadStatus);
	 log.info(FName + LName + "Lead found with status" + leadStatus);
 }
 
 @Then("^Change status to \"([^\"]*)\"$")
 public void change_status(String leadStatus) throws Throwable {
	 crmLeadPage.changeLeadStatus(leadStatus);
 }
 

 

 //log showing
 @Then("^Select log type \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
 public void select_log_type(String logType, String Property, String SourceType, String day, String month, String fromTime, String ToTime, String unit, String showingResult, String note) throws Throwable {
	 crmLeadPage.LogEventForShowing(logType, Property, SourceType, day, month, fromTime, ToTime, unit, showingResult, note);
 }
 
	
 //log other event
 @Then("^Select log type \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
 public void select_log_type(String logType, String title, String day, String month, String fromTime, String ToTime, String note) throws Throwable {
	 crmLeadPage.LogEventForOtherEvent(logType, title, day, month, fromTime, ToTime, note);
 }
 
 @Then("^Select log type \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
 public void select_log_type(String logType, String title, String note) throws Throwable {
	 crmLeadPage.LogEventForOtherTask(logType, title, note);
	 log.info("Log for other task created successfully");
 }
 
 @Then("^Verify whether new task \"([^\"]*)\" sceduled for current date successfuly$")
 public void verify_whether_new_task_something_sceduled_for_current_date_successfuly(String title) throws Throwable {
	 crmLeadPage.verifylogEvent(title);
	 log.info("Log display under contact activity");
 }

 @Then("^Select task \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
 public void select_task(String logType, String result, String note) throws Throwable {
	 crmLeadPage.LogEventForCommunication(logType, result, note);
 }
 
 @Then("^Select log type \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
 public void select_log_type_something_something_something_something_something_something(String logType, String day, String month, String fromTime, String ToTime, String note) throws Throwable {
	 crmLeadPage.LogEventForLeaseSigningMeeting(logType, day, month, fromTime, ToTime, note);
 }
 
 @Then("^Select task Inbond \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
 public void select_task_inbond(String logType, String result, String note) throws Throwable {
	 crmLeadPage.LogEventForInbondCall(logType, result, note);
 }
 
 @Then("^Verify whether open drop down for Lead \"([^\"]*)\" contains all menu options$")
 public void verify_whether_open_drop_down_for_lead_contains_all_menu_options(String LeadName) throws Throwable {
	 crmLeadPage.validateMenu_OpenDropDown(LeadName);
 }
 
 @Then("^Send mail to Lead with \"([^\"]*)\",\"([^\"]*)\" and attachment$")
 public void send_mail_to_lead_with_attachment(String subject, String messageBody) throws Throwable {
	 crmLeadPage.sendMailToLead(subject, messageBody);
 }
 
 
 @Then("^Send SMS to Lead with \"([^\"]*)\"and attachment$")
 public void send_sms_to_lead_with_somethingand_attachment(String messageText) throws Throwable {
	 crmLeadPage.sendSmsToLead(messageText);
 }
 
 @Then("^Select task \"([^\"]*)\", \"([^\"]*)\"$")
 public void select_task(String logType, String note) throws Throwable {
	 crmLeadPage.LogEventForTask(logType,note);
 }
 
 //scedule task
 @Then("^Schedule task immediately for himself \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
 public void schedule_task_for_himself(String eventType,String day, String month,String fromTime, String sendRemainder, String txtEventNotes) throws Throwable {
	 crmLeadPage.scheduleTaskForLead(eventType, day, month, fromTime, sendRemainder, txtEventNotes);
 }
 
 
//schedule task for other 
@Then("^Schedule other task immediately for himself \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void schedule_task_for_himself_other(String eventType,String other, String day, String month,String fromTime, String sendRemainder, String txtEventNotes) throws Throwable {
	 crmLeadPage.scheduleTaskForLead_other(eventType,other, day, month, fromTime, sendRemainder, txtEventNotes);
}

//schedule Event for other 
@Then("^Schedule other event for himself \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void schedule_event_for_himself_other(String eventType,String other, String day, String month,String fromTime, String ToTime,String txtEventNotes) throws Throwable {
	 crmLeadPage.scheduleEventForLead_other(eventType,other, day, month, fromTime, ToTime, txtEventNotes);
}

}
