package StepDefinations;




import static org.testng.AssertJUnit.assertArrayEquals;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import CRMPages.CRMLeadPage;

import cucumber.TestContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
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
	
	 
	
    }
 
	 @And("^Schedule task for other agent \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void Schedule_task_for_other_agent(String FName,String LName,String eventType,String day,String month,String fromTime,String txtEventNotes,String agentName) throws Throwable {
	 
	 crmLeadPage.leadSearchOpen(FName,LName);
	
	 crmLeadPage.scheduleTaskForOtherAgent(eventType,day, month, fromTime,txtEventNotes,agentName);
		log.info("Task Scheduled successfully for other Agent ");

		
	
    }

 @Then("^Schedule event for Lead \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void schedule_event_for_himself(String eventType,String day,String month,String fromTime,String toTime,String txtEventNotes) throws Throwable {
	
	
	 crmLeadPage.scheduleEventForLead(eventType,day,month,fromTime,toTime,txtEventNotes);
	 
	
    }
 
 @And("^Schedule event for other Agent \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void schedule_event_for_other_agent(String eventType,String duedate,String fromTime,String toTime,String agentName,String txtEventNotes) throws Throwable {
	
	
	 crmLeadPage.scheduleEventForLeadOtherAgent(eventType,duedate,fromTime,toTime,agentName,txtEventNotes);
	
	 log.info("Event Scheduled successfully for other Agent ");
	 
	
    }
 
 @And("^Schedule event for himself (.+),(.+),(.+),(.+),(.+),(.+),(.+)$")
    public void schedule_event_for_himself_Multiple(String FName,String LName,String eventType,String duedate,String fromTime,String toTime,String txtEventNotes) throws Throwable {
	
	 crmLeadPage.leadSearchOpen(FName,LName);
	 crmLeadPage.scheduleEventForLead(eventType,duedate,fromTime,toTime,txtEventNotes, txtEventNotes);
	 log.info("Event Scheduled successfully");
	 log.info("Log Event created successfully for:" +eventType);
    }
 
 @Then("^Verify whether new log event \"([^\"]*)\" created by Agent display in contact activity$")
 public void verify_whether_new_log_event_created_by_agent_display_in_contact_activity(String eventType) throws Throwable {
	 
	 crmLeadPage.getcontactActivityCountAfterScedule();
	 int ActivityCount  = (int)testContext.scenarioContext.getContext(Context.ACTIVITY_LIST);
	 Assert.assertEquals(crmLeadPage.getcontactActivityCountBeforeScedule(), ActivityCount);
	 crmLeadPage.validateLog_contactActivity(eventType);
	 log.info("Log Event created successfully for:" +eventType);
 }
 
 @Then("^Verify whether new task \"([^\"]*)\" sceduled for date \"([^\"]*)\" and time \"([^\"]*)\" successfuly$")
 public void verify_whether_new_task_sceduled_successfully(String task, String date, String time) throws Throwable {
	 crmLeadPage.sheduledTaskValidation(task,date,time);
	 log.info("Log task created successfully for:" +task);
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
	 log.info("Log Event created successfully for:" +logType);
 }
 
	
 //log other event
 @Then("^Select log type \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
 public void select_log_type(String logType, String title, String day, String month, String fromTime, String ToTime, String note) throws Throwable {
	 crmLeadPage.LogEventForOtherEvent(logType, title, day, month, fromTime, ToTime, note);
	 log.info("Log other Event created successfully for:" +logType);
 }
 
 @Then("^Select log type \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
 public void select_log_type(String logType, String title, String note) throws Throwable {
	 crmLeadPage.LogEventForOtherTask(logType, title, note);
	 log.info("Log Event created successfully for:" +logType);
 }
 
 @Then("^Verify whether new task \"([^\"]*)\" sceduled for current date successfuly$")
 public void verify_whether_new_task_something_sceduled_for_current_date_successfuly(String title) throws Throwable {
	 crmLeadPage.verifylogEvent(title);
	 log.info("Log display under contact activity");
 }

 @Then("^Select task \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
 public void select_task(String logType, String result, String note) throws Throwable {
	 crmLeadPage.LogEventForCommunication(logType, result, note);
	 log.info("Log Event created successfully for:" +logType);
	 
 }
 
 @Then("^Select log type \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
 public void select_log_type_something_something_something_something_something_something(String logType, String day, String month, String fromTime, String ToTime, String note) throws Throwable {
	 crmLeadPage.LogEventForLeaseSigningMeeting(logType, day, month, fromTime, ToTime, note);
	 log.info("Log Event created successfully for:" +logType);
 }
 
 @Then("^Select task Inbond \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
 public void select_task_inbond(String logType, String result, String note) throws Throwable {
	 crmLeadPage.LogEventForInbondCall(logType, result, note);
	 log.info("Log Event created successfully for:" +logType);
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
 
 @Then("^Schedule event for Lead showing \"([^\"]*)\",\"([^\"]*)\",\"([^\\\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
 public void schedule_event_for_lead_showing(String logType, String Property, String FloorPlan,String unit, String SourceType,String origin,String month, String week,String date, String note) throws Throwable {
	 crmLeadPage.scheduleEventForShowing(logType, Property,FloorPlan, unit, SourceType, origin,  month, week, date, note);
	 log.info("schedule Event created successfully for:" +logType);
 }
 
 //scedule task
 @Then("^Schedule task immediately for himself \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
 public void schedule_task_for_himself(String eventType,String day, String month,String fromTime, String sendRemainder, String txtEventNotes) throws Throwable {
	 crmLeadPage.scheduleTaskForLead(eventType, day, month, fromTime, sendRemainder, txtEventNotes);
 
	 log.info("schedule Event created successfully for:" +eventType);
 }
 
 
//schedule task for other 
@Then("^Schedule other task immediately for himself \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void schedule_task_for_himself_other(String eventType,String other, String day, String month,String fromTime, String sendRemainder, String txtEventNotes) throws Throwable {
	 crmLeadPage.scheduleTaskForLead_other(eventType,other, day, month, fromTime, sendRemainder, txtEventNotes);
	 log.info("Schedule other task immediately for:" +eventType);
}

//schedule Event for other 
@Then("^Schedule other event for himself \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void schedule_event_for_himself_other(String eventType,String other, String day, String month,String fromTime, String ToTime,String txtEventNotes) throws Throwable {
	 crmLeadPage.scheduleEventForLead_other(eventType,other, day, month, fromTime, ToTime, txtEventNotes);
	 log.info("Schedule other task immediately for:" +eventType);
}

@Then("^Add property of interest for \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void add_property_of_interest_for(String property, String floorPlan, String unit, String originr, String note) throws Throwable {
	log.info("Added property of interest for:" +property);
}

//add notes
@Then("^Add \"([^\"]*)\" to Lead$")
public void add_notes_to_lead(String note) throws Throwable {
	crmLeadPage.addNotes(note);
	log.info("Added notes successfully");
}

@Then("^Add document to Lead$")
public void add_document_to_lead() throws Throwable {
	crmLeadPage.addDocument();
	log.info("Added document successfully");
}

@Then("^Schedule other task \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", for himself \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void schedule_other_task_for_other_himself_futuredate(String createmonth, String createDate, String createTime, String eventType,String other, String day, String month,String fromTime, String sendRemainder, String txtEventNotes) throws Throwable {
	 log.info("Schedule other task future date for:" +eventType);
}

@Then("^Schedule task \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", for himself \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void schedule_task_for_himself_futuredate(String createmonth, String createDate, String createTime,String eventType,String day, String month,String fromTime, String sendRemainder, String txtEventNotes) throws Throwable {
	log.info("Schedule other task future date for:" +eventType);
}

@Then("^Schedule other task immediately for anather Agent \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void schedule_other_task_immediately_for_anather_agent(String createmonth, String createDate, String createTime, String eventType,String other, String day, String month,String fromTime, String sendRemainder,String AgentName, String txtEventNotes) throws Throwable {
	log.info("Schedule other task immediately for anather Agent for:" +eventType);
}

@Then("^Schedule task immediately for anather agent \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void schedule_task_immediately_for_anather_agent(String createmonth, String createDate, String createTime, String eventType,String other, String day, String month,String fromTime, String sendRemainder,String AgentName, String txtEventNotes) throws Throwable {
	log.info("Schedule task immediately for anather agent for:" +eventType);
}
//schedule event for other agent

@Then("^Schedule other event for anather agent \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void schedule_other_event_for_anather_agent(String eventType,String other, String day, String month,String fromTime, String ToTime,String agentname,String txtEventNotes) throws Throwable {
	log.info("Schedule other event for anather agent for:" +eventType);
}

@Then("^Schedule event for anather agent \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void schedule_event_for_anather_agent(String eventType,String day,String month,String fromTime,String toTime,String agentName,String txtEventNotes) throws Throwable {
	log.info("Schedule event for anather agent for:" +eventType);
}
@Then("^Schedule event showing for anather agent \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void schedule_event_showing_for_anather_agent(String logType, String Property, String FloorPlan,String unit, String SourceType,String origin,String month, String week,String date,String AgentName,String note) throws Throwable {
	log.info("Schedule event showing for anather agent:" +logType);
}

@Then("^Verify whether show filter option display$")
public void verify_whether_show_filter_option_display() throws Throwable {
	crmLeadPage.showfilterOption.isDisplayed();
	Thread.sleep(2000);
}

@Then("^User navigate on Lead page$")
public void user_navigate_on_lead_page() throws Throwable {
	crmLeadPage.menuButton_Lead.click();
	log.info("User navigated to Lead Page ");
	//crmLeadPage.printButton.click();
}

@And("^user cancel print$")
public void user_cancel_print() throws Throwable {
	crmLeadPage.cancelPrint();
	log.info("cancel print successfully ");
	
	
	
}

@Then("^verify whether user navigate back on Lead Page$")
public void verify_whether_user_navigate_back_on_lead_page() throws Throwable {
	crmLeadPage.validateleadPageNavigation();
	log.info("User navigate back on Lead page successfully ");
}

@And("^Download Lead list in \"([^\"]*)\" format$")
public void download_lead_list_in_something_format(String format) throws Throwable {
	crmLeadPage.downloadLeads(format);
	log.info("Downloaded Lead List successfully in format" +format);
}

@Then("^click on open button$")
public void click_on_open_button() throws Throwable {
	crmLeadPage.clickOnOpenButtonOnLead();
	log.info("clicked on open button ");
}


@And("^click on add button in Co-Aplicants enter all the mandatory details to add Co-Applicants \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and click on save$")
public void click_on_add_button_in_coaplicants_enter_all_the_mandatory_details_to_add_coapplicants_and_click_on_save(String FirstName, String LastName, String MobileNo) throws Throwable {
	crmLeadPage.add_CoApplicants(FirstName, LastName, MobileNo);
}


}
