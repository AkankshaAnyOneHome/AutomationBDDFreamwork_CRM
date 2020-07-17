package CRMPages;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.inject.Key;


import dataProviders.ConfigFileReader;

public class CRMLeadPage{
	private static Logger log=LogManager.getLogger(CRMLeadPage.class.getName());
	WebDriver driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	//WebDriverWait wait = new WebDriverWait(driver,30);
	@FindBy(xpath = "//span[contains(text(),'Leads')]")
	WebElement MenuLead;
	@FindBy(xpath = "//div[@class='input-group search datagrid-search m-t-small']//input[@placeholder='Search']")
	WebElement SearchField;
	@FindBy(xpath = "//i[@class='fa fa-search']")
	WebElement SearchIcon;	
	@FindBy(xpath = "//i[@class='fa fa-eye']")
	public WebElement OpenEyeIcon;
	@FindBy(xpath = "//a[@id='schedule_contact_button']")
	WebElement btnscheduleEvent;
	@FindBy(xpath = "//button[@class='btn btn-info btn-xs save_schedule_contact_btn']")
	WebElement EventScheduleSaveButton;
	@FindBy(xpath = "//div[@class='col-xs-8']//button[@id='from_time']")
	WebElement btnEventFromTime;
	@FindBy(xpath = "//div[@class='col-xs-8']//button[@id='to_time']")
	WebElement btnEventToTime;
	@FindBy(xpath = "//textarea[@id='schedule_notes']")
	WebElement scheduledNotes;
	@FindBy(xpath = "//button[@class='btn btn-info btn-xs add_log_event_leadview']")
	WebElement btnEventsSave;
	@FindBy(xpath = "//button[@id='save_schedule_contact']")
	WebElement btnEventsSave_Agent;
	@FindBy(xpath = "//button[@class='btn btn-white btn-sm font-normal dropdown-toggle lead_status_change_btn']")
	WebElement btnLeadStatus;
	@FindBy(xpath = "//table[@id='StretchGrid']//tbody//td[4]")
	WebElement actualleadStatus;
	
	
	@FindBy(xpath = "//div[@id='c-slide']//p[contains(@class,'h4 text-center next-silder-title')]")
	List<WebElement> SchedulesListing;
	@FindBy(xpath = "//div[@id='s2id_selected_prop_agent_id']//input")
	WebElement txtScheduleAgentName;
	@FindBy(xpath = "//div//span[@class='select2-match']")
	WebElement SelectScheduleAgentName;
	@FindBy(xpath = "//div[@id='scheduledTime']//button[@class='btn btn-white btn-sm dropdown-toggle']")
	WebElement btnTaskTime;
	@FindBy(xpath = "//ul[@id='select_immediate_time']//a[@name='tab'][contains(text(),'2:30 AM')]")
	WebElement SelectTime;
	@FindBy(xpath = "//a[@id='log_contact_button']")
	WebElement btnLogEvent;
	@FindBy(xpath = "//a[@id='send_mail_button']")
	WebElement btnSendMail;
	@FindBy(xpath = "//a[@id='send_sms_button']")
	WebElement btnSendSms;
	@FindBy(xpath="//div[@class='select2-container selectedTypeDropdown']/a/span[1]")
	WebElement selectedLogType;
	@FindBy(css="a.h4")
	WebElement logActivity;
	@FindBy(xpath = "//table[@id='StretchGrid']//tbody//td[2]")
	List<WebElement> leadTableText;
	@FindBy(xpath = "//li[@id='leads']")
	WebElement menuButton_Lead;
	@FindBy(xpath = "//div[@class='pull-left thumb-small']")
	List<WebElement> contactActivityExpand;
	@FindBy(xpath = "//li[@id='leads']")
	WebElement contactActivityStatus;
	@FindBy(xpath = "//input[@class='form-control datepicker-future input-sm default-cursor']")
	WebElement selectCalender;
	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][14]//div[@class='datepicker-days']//table[@class=' table-condensed']//thead//tr//th/following-sibling::th[@class='switch']")
	WebElement dateMonthSwichCalender14;
	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][13]//div[@class='datepicker-days']//table[@class=' table-condensed']//thead//tr//th/following-sibling::th[@class='switch']")
	WebElement dateMonthSwichCalender13;
	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][16]//div[@class='datepicker-days']//table[@class=' table-condensed']//thead//tr//th/following-sibling::th[@class='switch']")
	WebElement dateMonthSwichCalender16;
	
	
	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][14]//div[@class='datepicker-days']//table[@class=' table-condensed']//thead//tr//th/following-sibling::th[@class='next']")
	WebElement dateNextCalender14;
	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][13]//div[@class='datepicker-days']//table[@class=' table-condensed']//thead//tr//th/following-sibling::th[@class='next']")
	WebElement dateNextCalender13;
	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][13]//div[@class='datepicker-days']//table[@class=' table-condensed']//thead//tr//th/following-sibling::th[@class='next']")
	WebElement dateNextCalender16;
	
	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][14]//div[@class='datepicker-days']//table[@class=' table-condensed']//tbody/tr/td[contains(@class, 'day ')]")
	List<WebElement> selectDate14;
	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][13]//div[@class='datepicker-days']//table[@class=' table-condensed']//tbody/tr/td[contains(@class, 'day ')]")
	List<WebElement> selectDate13;
	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][13]//div[@class='datepicker-days']//table[@class=' table-condensed']//tbody/tr/td[contains(@class, 'day ')]")
	List<WebElement> selectDate16;
	//@FindBy(xpath = "//header//div[contains(@class,'col-lg-3')]")
	//List<WebElement> contactActivityPanelDate;
	/*
	 * @FindBy(xpath =
	 * "//div[contains(text(),'Friday 7/17/2020')]/parent::header/following-sibling::div[1]/article/div/div[3]/a[1]"
	 * ) WebElement taskName;
	 */
	
	@FindBy(xpath = "//button[@class='btn btn-white btn-sm font-normal dropdown-toggle lead_status_change_btn']")
	WebElement StatusDropDwnButton;
	
	@FindBy(xpath = "//td[@class='border-none pull-left ']/div/div")
	WebElement eventTypeDropDwnbutton;
	
	@FindBy(xpath = "//td[@class='border-none pull-left ']/div/div")
	WebElement selectEventName;

	
	@FindBy(xpath = "//label[text()='Property: ']/parent::td//following-sibling::td/div/a")
	WebElement propertyDropDown;
	
	@FindBy(xpath = "//label[text()='Type : ']/parent::td//following-sibling::td/div/div/a")
	WebElement logTypeDropDown;
	@FindBy(xpath = "//label[text()='Source Type: ']/parent::td//following-sibling::td/div/a")
	WebElement sourceTypeDropDown;
	@FindBy(xpath = "//label[text()='Date: ']/parent::td//following-sibling::td/input")
	WebElement dateSelect;
	@FindBy(xpath = "//label[text()='Time: ']/parent::td//following-sibling::td/div[1]/button[@class='btn btn-white btn-sm dropdown-toggle']/span[@class='dropdown-label']")
	WebElement fromTimeDropDown;
	@FindBy(xpath = "//label[text()='Time: ']/parent::td//following-sibling::td/div[2]/button[@class='btn btn-white btn-sm dropdown-toggle']/span[@class='dropdown-label']")
	WebElement toTimeDropDown;
	@FindBy(xpath = "//label[text()='Unit Shown: ']/parent::td//following-sibling::td/div/div")
	WebElement unitShown;
	@FindBy(xpath = "//label[text()='Showing Result: ']/parent::td//following-sibling::td/div/button")
	WebElement showing_Result;
	@FindBy(xpath = "//label[text()='Notes: ']/parent::td//following-sibling::td/textarea")
	WebElement notes;
	@FindBy(xpath = "//label[text()='Title:']/parent::td//following-sibling::td/input")
	WebElement loEvntOtherTitle;
	@FindBy(xpath = "//label[text()='Comments :']/parent::td//following-sibling::td/textarea")
	WebElement comments;
	
	@FindBy(xpath = "//div[text()='Inbound']/following-sibling::ul/li/div[text()='Answered']")
	WebElement selectResultInbound;
	
	@FindBy(xpath = "//label[text()='Result :']/parent::td//following-sibling::td/div[1]/a/span[text()='Select']")
	WebElement resultdropDown;
	
	@FindBy(css = "strong.h4")
	List<WebElement> actualCurrentTime;
	
	@FindBy(xpath = "//form[@id='send_mail_form']/div/div[1]")
	WebElement mailFormHeader;
	
	@FindBy(xpath = "//a[@class='btn btn-ah-green btn-sm dropdown-toggle lead_listing_open_dropdown']")
	WebElement openDropDown;
	
	
	  @FindBy(xpath =
	  "//form[@id='send_mail_form']/div/div[2]/div[5]/div[4]/input") WebElement
	  mailSubject;
	 
	
	
	  @FindBy(xpath =
	  "//form[@id='send_mail_form']/div/div[2]/div[5]/div[6]/div/div/iframe")
	  WebElement mailMessageBody;
	  
	  @FindBy(xpath =
			  "//textarea[@class='form-control sms-required-lead']")
			  WebElement smsBody;
	 
	
	
		/*
		 * @FindBy(xpath =
		 * "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']"
		 * ) WebElement mailMessageBody;
		 * 
		 */
	@FindBy(xpath = "//form[@id='send_mail_form']/div/div[2]/div[5]/p/button")
	WebElement mailAttachButton;
	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm m-b-small composeSMSAttachment']")
	WebElement smsAttachButton;
	
	
	
	@FindBy(xpath = "//form[@id='send_mail_form']/div/div[2]/div[5]/div[9]/section/div/div[4]/div/div")
	WebElement mailUploadButton;
	
	@FindBy(xpath = "//form[@id='send_mail_form']/div/div[3]/button[2]")
	WebElement mailSendButton;
	
	@FindBy(xpath = "//button[@class='btn btn-info btn-sm']")
	WebElement smsSendButton;
	
	@FindBy(xpath = "//input[@id='smsAddPhoto']/parent::div/span")
	WebElement smsUploadButton;
	
	@FindBy(xpath = "//label[(text()='Type:')]/parent::div/div/div/a/span[1]")
	WebElement sceduleTypeDropDown;
	@FindBy(xpath = "//label[(text()='Create Date:')]/parent::div/following-sibling::label/i")
	WebElement immediatelyCheckBox;
	@FindBy(xpath = "//label[(text()='Due Date:')]/parent::div/div[2]/button")
	WebElement dueDate;
	@FindBy(xpath = "//label[(text()='Due Date:')]/parent::div/div/button")
	WebElement dueTime;
	@FindBy(xpath = "//label[(text()='Instructions:')]/parent::div/div/textarea")
	WebElement instructions;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	String[] stringArray = {"Log Event", "Schedule Event", "Send Email", "Send Text", "Add Notes", "Open in New Window"};
	 List<String> expListOpenDropDownMenu = new ArrayList<String>();
	
	 List<String> actListOpenDropDownMenu = new ArrayList<String>();
	
	
	//label[text()='Property: ']/parent::td//following-sibling::td/div/input
	
	
	
	
	JavascriptExecutor js;
	
	
	
	
	
	public CRMLeadPage(WebDriver driver)
	{
		this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	// Method for Search Open lead for further scenario
		public void leadSearchOpen(String FName,String LName) throws InterruptedException {		
			Thread.sleep(4000);
			MenuLead.click();
			Thread.sleep(2000);
			String LeadToSearch = FName + " " + LName;
		//	System.out.println("Lead" +LeadToSearch);
			SearchField.sendKeys(LeadToSearch);
			SearchIcon.click();
			Thread.sleep(1000);
			OpenEyeIcon.click();
			Thread.sleep(1000);
		}
		
		// Method for schedule event for lead 
				public void scheduleEventForLead(String eventType,String duedate,String fromTime,String toTime,String txtEventNotes) throws InterruptedException
				{
					OpenEyeIcon.click();
					Thread.sleep(2000);					
					btnscheduleEvent.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@id='s2id_sel_schedule_type']//input")).sendKeys(eventType);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//span[contains(text(),'"+eventType+"')]")).click();				
					EventScheduleSaveButton.click();					
					/*
					 * driver.findElement(By.
					 * xpath("//div[56]//tr//td[@class='day '][contains(text(),'"+duedate+"')]")).
					 * click(); btnEventFromTime.click(); driver.findElement(By.
					 * xpath("//ul[@class='dropdown-menu select_from_schedule_event']//a[@name='tab'][contains(text(),'"
					 * +fromTime+"')]")).click(); btnEventToTime.click(); driver.findElement(By.
					 * xpath("//ul[@class='dropdown-menu select_to_schedule_event']//a[@name='tab'][contains(text(),'"
					 * +toTime+"')]")).click(); scheduledNotes.sendKeys(txtEventNotes);
					 * btnEventsSave.click();
					 */
					
					
					
				}
				
				// Method for remove Instructions word schedule event label
				
				public String removeInstructionsFromScheduleText(String Scheduletexts) throws InterruptedException
				{
					String[] tokens = Scheduletexts.split("Instructions");
					String finalScheduleLable = tokens[0];
					return finalScheduleLable;
				}
				
				// Method for schedule event validation for lead 
				public void scheduleEventValidation(String eventType,String duedate,String fromTime,String FName) throws InterruptedException
				{
				
					LocalDate currentdate = LocalDate.now();
					int currentDay = currentdate.getDayOfMonth();
					//Month currentMonth = currentdate.getMonth();
					int currentYear = currentdate.getYear();
					Date date = new Date();
					LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
					int month = localDate.getMonthValue();
					String AllScheduleInfos="";
					String expectedScheduleText = "Have you completed your " + eventType + " Event? Due: " + month + "/" + duedate + "/" + currentYear + " @ " + fromTime + " PDT";
					Thread.sleep(1000);
					for (int i = 0; i < SchedulesListing.size(); i++) {
						 AllScheduleInfos = SchedulesListing.get(i).getText();
						//System.out.println(AllScheduleInfos);
						if(AllScheduleInfos.contains("Instructions"))
						{
							AllScheduleInfos=removeInstructionsFromScheduleText(AllScheduleInfos);
						}
						
					}
					//System.out.println(AllScheduleInfos);
					String NewStr = CRMDashboardCreateEventPage.ReplaceAMPM(AllScheduleInfos);
					String FinalSceduleString = NewStr.replace("\n", " ");
					System.out.println("E " +expectedScheduleText);
					System.out.println("A " +FinalSceduleString);
					if (expectedScheduleText.trim().equalsIgnoreCase(FinalSceduleString.trim())) {
						
						log.info("Test Pass-Event " +eventType+" For Lead " + FName + " Is Scheduled Sucessfully On " +duedate);
					}
					else {
						System.out.println("Test Fail");
						}
				}
				
				// Method for schedule event for other agent via lead
				public void scheduleEventForLeadOtherAgent(String eventType,String duedate,String fromTime,String toTime,String agentName,String txtEventNotes) throws InterruptedException
				{
					OpenEyeIcon.click();
					Thread.sleep(2000);
								
					btnscheduleEvent.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@id='s2id_sel_schedule_type']//input")).sendKeys(eventType);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//span[contains(text(),'"+eventType+"')]")).click();	
					Thread.sleep(1000);
					driver.findElement(By.xpath("//div[@id='schedule_agent_sl']//label")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//div[@id='s2id_selected_prop_agent_id_schedule']//input")).sendKeys(agentName);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//span[contains(text(),'"+agentName+"')]")).click();	
					Thread.sleep(1000);
					EventScheduleSaveButton.click();					
					/*
					 * driver.findElement(By.
					 * xpath("//div[56]//tr//td[@class='day '][contains(text(),'"+duedate+"')]")).
					 * click(); btnEventFromTime.click(); driver.findElement(By.
					 * xpath("//ul[@class='dropdown-menu select_from_schedule_event']//a[@name='tab'][contains(text(),'"
					 * +fromTime+"')]")).click(); btnEventToTime.click(); driver.findElement(By.
					 * xpath("//ul[@class='dropdown-menu select_to_schedule_event']//a[@name='tab'][contains(text(),'"
					 * +toTime+"')]")).click(); Thread.sleep(100);
					 * scheduledNotes.sendKeys(txtEventNotes); btnEventsSave.click();
					 */
					
					
					
				}
				// schedule task for self immediately 
				public void scheduleTaskForLead(String eventType,String day, String month,String fromTime, String sendRemainder, String txtEventNotes) throws InterruptedException
				{
					OpenEyeIcon.click();
					Thread.sleep(2000);
					btnscheduleEvent.click();
					Thread.sleep(2000);
					sceduleTypeDropDown.click();
					driver.findElement(By.xpath("//div[text()='"+eventType+"']")).click();
					Thread.sleep(2000);
					immediatelyCheckBox.isSelected();
					
					dueDate.click();
					Thread.sleep(2000);
					selectCalender.click();
					
					while(!dateMonthSwichCalender14.getText().contains(month)) {
						dateNextCalender14.click();
					}
					int countDays = selectDate14.size();
					for(int i=0;i<countDays;i++)
					{
					String getDayname=selectDate14.get(i).getText();
					if(getDayname.equalsIgnoreCase(day))
					{
						selectDate14.get(i).click();
					break;
					}

					}
					dueTime.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//label[(text()='Due Date:')]/parent::div/div[2]/ul/li/a[text()='"+fromTime+"']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//label[(text()='Send Reminder Email?')]/parent::div/div/label[contains(text(),'"+sendRemainder+"')]")).click();
												
					instructions.sendKeys(txtEventNotes);
					EventScheduleSaveButton.click();					
					/*
					 * driver.findElement(By.
					 * xpath("//div[56]//tr//td[@class='day '][contains(text(),'"+duedate+"')]")).
					 * click(); btnTaskTime.click(); driver.findElement(By.xpath(
					 * "//ul[@id='select_immediate_time']//a[@name='tab'][contains(text(),'"+
					 * fromTime+"')]")).click(); scheduledNotes.sendKeys(txtEventNotes);
					 * btnEventsSave_Agent.click();
					 */
					
				}
				
				// schedule task for self by selecting future date 
				public void scheduleTaskForLeadSelectFutureDate(String eventType,String duedate,String fromTime,String txtEventNotes) throws InterruptedException
				{
					OpenEyeIcon.click();
					Thread.sleep(2000);
					
					btnscheduleEvent.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@id='s2id_sel_schedule_type']//input")).sendKeys(eventType);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//span[contains(text(),'"+eventType+"')]")).click();	
					Thread.sleep(1000);									
					EventScheduleSaveButton.click();					
					/*
					 * driver.findElement(By.
					 * xpath("//div[56]//tr//td[@class='day '][contains(text(),'"+duedate+"')]")).
					 * click(); btnTaskTime.click(); driver.findElement(By.xpath(
					 * "//ul[@id='select_immediate_time']//a[@name='tab'][contains(text(),'"+
					 * fromTime+"')]")).click(); scheduledNotes.sendKeys(txtEventNotes);
					 * btnEventsSave_Agent.click();
					 */
					
				}
				
				
				public void scheduleTaskForOtherAgent(String eventType,String day,String month, String fromTime,String txtEventNotes,String agentName) throws InterruptedException
				{
					CRMLeadPage crmLeadPage = new CRMLeadPage(driver);
					OpenEyeIcon.click();
					Thread.sleep(2000);
										
					btnscheduleEvent.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@id='s2id_sel_schedule_type']//input")).sendKeys(eventType);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//span[contains(text(),'"+eventType+"')]")).click();	
					
					crmLeadPage.selectDate(day, month);
					btnTaskTime.click();
					driver.findElement(By.xpath("//ul[@id='select_immediate_time']//a[@name='tab'][contains(text(),'"+fromTime+"')]")).click();
					
				//	dateMonthSwichCalender.getText().contains(date);
					
					//Thread.sleep(1000);
					driver.findElement(By.xpath("//div[@id='schedule_agent_sl']//label")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//div[@id='s2id_selected_prop_agent_id_schedule']//input")).sendKeys(agentName);
					Thread.sleep(2000);
					/*
					 * driver.findElement(By.xpath(
					 * "//div[@id='s2id_selected_prop_agent_id_schedule']//input")).sendKeys(Keys.
					 * DOWN); Thread.sleep(2000); driver.findElement(By.xpath(
					 * "//div[@id='s2id_selected_prop_agent_id_schedule']//input")).sendKeys(Keys.
					 * ENTER);
					 */
					
					driver.findElement(By.xpath("//span[contains(text(),'"+agentName+"')]")).click();
					
					EventScheduleSaveButton.click();					
					/*driver.findElement(By.xpath("//div[56]//tr//td[@class='day '][contains(text(),'"+duedate+"')]")).click();				
					btnTaskTime.click();
					driver.findElement(By.xpath("//ul[@id='select_immediate_time']//a[@name='tab'][contains(text(),'"+fromTime+"')]")).click();
					scheduledNotes.sendKeys(txtEventNotes);
					Thread.sleep(2000);
					btnEventsSave_Agent.click();
				;*/
					
				}
				
				//method for select date from calendar
				public void selectDate(String day,String month){
					selectCalender.click();
					while(!dateMonthSwichCalender14.getText().contains(month)) {
						dateNextCalender14.click();
					}
					int countDays = selectDate14.size();
					for(int i=0;i<countDays;i++)
					{
					String getDayname=selectDate14.get(i).getText();
					if(getDayname.equalsIgnoreCase(day))
					{
						selectDate14.get(i).click();
					break;
					}

					}
					
				}
				
				// Method for schedule task validation for lead 
				public void scheduleTaskValidation(String eventType,String duedate,String fromTime,String FName) throws InterruptedException
				{
					OpenEyeIcon.click();
					Thread.sleep(2000);
					LocalDate currentdate = LocalDate.now();
					int currentDay = currentdate.getDayOfMonth();
					Month currentMonth = currentdate.getMonth();
					int currentYear = currentdate.getYear();
					Date date = new Date();
					LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
					int month = localDate.getMonthValue();
					String AllScheduleInfos="";
					String AllScheduleInfosF="";
					String expectedScheduleText = "Have you completed your " + eventType + " Task? Due: " + month + "/" + duedate + "/" + currentYear + " @ " + fromTime + " PDT";
					Thread.sleep(1000);
					for (int i = 0; i < SchedulesListing.size(); i++) {
						 AllScheduleInfos = SchedulesListing.get(i).getText();
						System.out.println(AllScheduleInfos);
						if(AllScheduleInfos.contains("Instructions"))
						{
							AllScheduleInfosF=removeInstructionsFromScheduleText(AllScheduleInfos);
							//System.out.println(AllScheduleInfos);
						}
						
					}
					System.out.println(AllScheduleInfosF);
					//String NewStr = CRMDashboardCreateEventPage.ReplaceAMPM(AllScheduleInfos);
					String FinalSceduleString = AllScheduleInfosF.replace("\n", " ");
					System.out.println("E " +expectedScheduleText);
					//System.out.println("A " +FinalSceduleString);
					if (expectedScheduleText.trim().equalsIgnoreCase(FinalSceduleString.trim())) {
						log.info("Test Pass-Task " +eventType+" For Lead " + FName + " Is Scheduled Sucessfully On " +duedate);
					}
					else {
						System.out.println("Test Fail");
						}
				}
				
				// Method for log event for lead and it return selected log type
				public void logEventForLead(String eventType,String duedate,String fromTime,String toTime,String txtEventNotes) throws InterruptedException
				{
					OpenEyeIcon.click();
					Thread.sleep(2000);
					btnLogEvent.click();
					Thread.sleep(2000);
					//driver.findElement(By.xpath("//*[text()='Type : ']//ancestor::td//following-sibling::td/div")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@id='s2id_autogen26_search']")).sendKeys(eventType);
					driver.findElement(By.xpath("//input[@id='s2id_autogen26_search']")).sendKeys(Keys.ENTER);
					btnEventsSave.click();
				}
				
				public int getcontactActivityCountBeforeScedule() throws InterruptedException{
					Thread.sleep(1000);		
					 js = (JavascriptExecutor) driver;
					 js.executeScript("window.scrollBy(0,250)", "");
						//size of contact activity before creating new log/event
						int contactActivityList_BeforeLog = contactActivityExpand.size() + 1;
						log.info("count of contact activities before scedule new " + contactActivityList_BeforeLog);
					return contactActivityList_BeforeLog;
					
				}
				
				public int getcontactActivityCountAfterScedule() throws InterruptedException{
					Thread.sleep(1000);		
					 js = (JavascriptExecutor) driver;
					 js.executeScript("window.scrollBy(0,250)", "");
						//size of contact activity before creating new log/event
						int contactActivityList_AfterLog = contactActivityExpand.size();
						log.info("count of contact activities before scedule new " + contactActivityList_AfterLog);
					return contactActivityList_AfterLog;
					
				}
				
				
				  public void validateLog_contactActivity(String logType) throws InterruptedException  { 
					  Thread.sleep(2000);
				  js = (JavascriptExecutor) driver; 
				  js.executeScript("window.scrollBy(0,250)", "");
				  
				 String actualContactactivity = logActivity.getText();
				  
				  Assert.assertEquals(actualContactactivity, logType);
				  
				  
				
				  }
				 
				
				// Method for validation after lead created
				public void leadCreateValidation(String FName, String LName, String leadStatus) throws InterruptedException {
					
					Thread.sleep(2000);
					menuButton_Lead.click();
					String ExpectedLeadToSearch = FName + " " + LName;
					// String expectedLeadStatus="Inquiry";
					SearchField.sendKeys(ExpectedLeadToSearch);
					SearchIcon.click();
					Thread.sleep(1000);
					String allLeadsAfterSearch = "";
					for (int i = 0; i < leadTableText.size(); i++) {
						String LeadNames = leadTableText.get(i).getText();
						allLeadsAfterSearch = allLeadsAfterSearch + LeadNames;
					}
					System.out.println("Lead Name " + allLeadsAfterSearch);
					if (allLeadsAfterSearch.contains(ExpectedLeadToSearch)) {
						
						Thread.sleep(1000);
						String actualStatus = actualleadStatus.getText();
						Assert.assertEquals(leadStatus, actualStatus);
						log.info("Test Pass-Lead Sucessfully Created With Status As " + leadStatus);

					} else {
						log.info("Test Fail-Lead Is not Created");
					}
					
					
					}
				
				// Method for schedule task validation
				public void sheduledTaskValidation(String task, String date, String time) throws InterruptedException {
					Thread.sleep(2000);
					  js = (JavascriptExecutor) driver; 
					  js.executeScript("window.scrollBy(0,250)", "");
					WebElement contactActivityPanelDate =driver.findElement(By.xpath("//div[contains(text(),'"+date+"')]"));
					if(contactActivityPanelDate.isDisplayed()) {
						List<WebElement> contactActivityPanelTask =driver.findElements(By.xpath("//div[contains(text(),'"+date+"')]/parent::header/following-sibling::div/article/div/div[3]/a"));
						List<WebElement> contactActivityPanelActualTime =driver.findElements(By.xpath("//div[contains(text(),'"+date+"')]/parent::header/following-sibling::div/article/div/div[3]/div[1]"));
						for (int i = 0; i < contactActivityPanelTask.size(); i++) {
							String contactActivityActualName = contactActivityPanelTask.get(i).getText();
							if(contactActivityActualName==task) {
							log.info("contact activity display----"+contactActivityActualName);}
							
							for (int j = 0; j < contactActivityPanelActualTime.size(); j++) {
								String contactActivityPanelAcTime = contactActivityPanelTask.get(j).getText();
								if(contactActivityPanelAcTime==time) {
								log.info("contact activity display----"+contactActivityPanelAcTime);}
							
						}
						}
						    }
					
				//	btnscheduleEvent.click();
				
					
					
				}
				
				
				
				public void changeLeadStatus(String leadStatus) {
					StatusDropDwnButton.click();
					WebElement status =driver.findElement(By.xpath("//a[text()='"+leadStatus+"']"));
					status.click();			
				}
				//log event for showing
				public void LogEventForShowing(String logType, String Property, String SourceType, String day, String month, String fromTime, String ToTime, String unit, String showingResult, String note) throws InterruptedException {
					CRMLeadPage crmLeadPage = new CRMLeadPage(driver);
					OpenEyeIcon.click();
					Thread.sleep(2000);
					btnLogEvent.click();
					logTypeDropDown.click();
					driver.findElement(By.xpath("//div[text()='"+logType+"']")).click();
					propertyDropDown.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active'][1]/div/input")).sendKeys(Property);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active'][1]/div/input")).sendKeys(Keys.DOWN);
					driver.findElement(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active'][1]/div/input")).sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					//driver.findElement(By.xpath("//label[text()='Property: ']/parent::td//following-sibling::td/div/a/span[text()='"+Property+"']")).click();
					sourceTypeDropDown.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active'][2]/div/input")).sendKeys(SourceType);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active'][2]/div/input")).sendKeys(Keys.DOWN);
					driver.findElement(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active'][2]/div/input")).sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					
					
					dateSelect.click();
					while(!dateMonthSwichCalender13.getText().contains(month)) {
						dateNextCalender13.click();
					}
					int countDays = selectDate13.size();
					for(int i=0;i<countDays;i++)
					{
					String getDayname=selectDate13.get(i).getText();
					if(getDayname.equalsIgnoreCase(day))
					{
						selectDate13.get(i).click();
					break;
					}

					}
					
					fromTimeDropDown.click();
					//driver.findElement(By.xpath("//label[text()='Time: ']/parent::td//following-sibling::td/div/button/span[@text='"+fromTime+"']")).click();
					
					driver.findElement(By.xpath("//label[text()='Time: ']/parent::td//following-sibling::td/div/ul/li/a[text()='"+fromTime+"']")).click();
					toTimeDropDown.click();
					driver.findElement(By.xpath("//label[text()='Time: ']/parent::td//following-sibling::td/div[2]/ul/li/a[text()='"+ToTime+"']")).click();
					unitShown.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active'][3]/div/input")).sendKeys(unit);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active'][3]/div/input")).sendKeys(Keys.DOWN);
					driver.findElement(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active'][3]/div/input")).sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//label[text()='Unit Shown: ']/parent::td//following-sibling::td/div/div/a/span[text()='"+unit+"']"));
					showing_Result.click();
					driver.findElement(By.xpath("//label[text()='Showing Result: ']/parent::td//following-sibling::td/div/button/span[text()='"+showingResult+"']"));
					
					notes.sendKeys(note);
					btnEventsSave.click();
					
					
					
				}
				//log event for Lease Signing Meeting
				public void LogEventForLeaseSigningMeeting(String logType, String day, String month, String fromTime, String ToTime, String note) throws InterruptedException {
					OpenEyeIcon.click();
					Thread.sleep(2000);
					btnLogEvent.click();
					logTypeDropDown.click();
					driver.findElement(By.xpath("//div[text()='"+logType+"']")).click();
					
						
					dateSelect.click();
					while(!dateMonthSwichCalender13.getText().contains(month)) {
						dateNextCalender13.click();
					}
					int countDays = selectDate13.size();
					for(int i=0;i<countDays;i++)
					{
					String getDayname=selectDate13.get(i).getText();
					if(getDayname.equalsIgnoreCase(day))
					{
						selectDate13.get(i).click();
					break;
					}

					}
					
					fromTimeDropDown.click();
					//driver.findElement(By.xpath("//label[text()='Time: ']/parent::td//following-sibling::td/div/button/span[@text='"+fromTime+"']")).click();
					
					driver.findElement(By.xpath("//label[text()='Time: ']/parent::td//following-sibling::td/div/ul/li/a[text()='"+fromTime+"']")).click();
					toTimeDropDown.click();
					driver.findElement(By.xpath("//label[text()='Time: ']/parent::td//following-sibling::td/div[2]/ul/li/a[text()='"+ToTime+"']")).click();
					
					
					notes.sendKeys(note);
					btnEventsSave.click();
					
				}
				
				//log event for 
				public void LogEventForOtherEvent(String logType, String title, String day, String month, String fromTime, String ToTime, String note) throws InterruptedException {
					OpenEyeIcon.click();
					Thread.sleep(2000);
					btnLogEvent.click();
					logTypeDropDown.click();
					driver.findElement(By.xpath("//div[text()='"+logType+"']")).click();
					loEvntOtherTitle.sendKeys(title);
						
					dateSelect.click();
					while(!dateMonthSwichCalender13.getText().contains(month)) {
						dateNextCalender13.click();
					}
					int countDays = selectDate13.size();
					for(int i=0;i<countDays;i++)
					{
					String getDayname=selectDate13.get(i).getText();
					if(getDayname.equalsIgnoreCase(day))
					{
						selectDate13.get(i).click();
					break;
					}

					}
					
					fromTimeDropDown.click();
					//driver.findElement(By.xpath("//label[text()='Time: ']/parent::td//following-sibling::td/div/button/span[@text='"+fromTime+"']")).click();
					
					driver.findElement(By.xpath("//label[text()='Time: ']/parent::td//following-sibling::td/div/ul/li/a[text()='"+fromTime+"']")).click();
					toTimeDropDown.click();
					driver.findElement(By.xpath("//label[text()='Time: ']/parent::td//following-sibling::td/div[2]/ul/li/a[text()='"+ToTime+"']")).click();
					
					
					notes.sendKeys(note);
					btnEventsSave.click();
					
				}
				//log event for other task
public void LogEventForOtherTask(String logType, String title, String note) throws InterruptedException {
					
					btnLogEvent.click();
					logTypeDropDown.click();
					//Thread.sleep(2000);
					driver.findElement(By.xpath("//div[text()='Task']/following-sibling::ul/li/div[text()='"+logType+"']")).click();
					loEvntOtherTitle.sendKeys(title);
					comments.sendKeys(note);
					btnEventsSave.click();	
					
				}
//verify event created for other task
public void verifylogEvent(String logType) throws InterruptedException {
	
	Thread.sleep(2000);
	  js = (JavascriptExecutor) driver; 
	  js.executeScript("window.scrollBy(0,250)", "");
	  
	  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");  
	  
	  LocalDateTime now = LocalDateTime.now();
	  String currentDate = dtf.format(now);
	  
	  DateTimeFormatter time = DateTimeFormatter.ofPattern("H:MM");
	  LocalDateTime nowtime = LocalDateTime.now();
	  String currentTime = time.format(nowtime);
	  
	WebElement contactActivityPanelDate =driver.findElement(By.xpath("//div[contains(text(),'"+currentDate+"')]"));
	
	
	if(contactActivityPanelDate.isDisplayed()) {
		List<WebElement> contactActivityPanelTask =driver.findElements(By.xpath("//div[contains(text(),'\"+currentDate+\"')]/parent::header/following-sibling::div/article/div/div[3]/a[1]"));
		List<WebElement> contactActivityPanelActualTime =driver.findElements(By.xpath("//div[contains(text(),'"+currentDate+"')]/parent::header/following-sibling::div/article/div/div[3]/div[1]"));
		for (int i = 0; i < contactActivityPanelTask.size(); i++) {
			String contactActivityActualName = contactActivityPanelTask.get(i).getText();
			if(contactActivityActualName==logType) {
			log.info("contact activity display----"+contactActivityActualName);}
			
			for (int j = 0; j < contactActivityPanelActualTime.size(); j++) {
				String contactActivityPanelAcTime = contactActivityPanelTask.get(j).getText();
				if(contactActivityPanelAcTime==currentTime) {
				log.info("contact activity display----"+contactActivityPanelAcTime);}
			
		}
		}
	}
	
	
	
				
}
//log event for call_outbond/message/email
public void LogEventForCommunication(String logType, String result, String note) throws InterruptedException {
	OpenEyeIcon.click();
	Thread.sleep(2000);
	btnLogEvent.click();
	logTypeDropDown.click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Task']/following-sibling::ul/li/div[text()='"+logType+"']")).click();
	resultdropDown.click();

	driver.findElement(By.xpath("//div[text()='Outbound']/following-sibling::ul/li/div[text()='"+result+"']")).click();
	//loEvntOtherTitle.sendKeys(title);
	comments.sendKeys(note);
	btnEventsSave.click();	
	
}

//log event for call_Inbond
public void LogEventForInbondCall(String logType, String result, String note) throws InterruptedException {
	OpenEyeIcon.click();
	Thread.sleep(2000);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='log_contact_button']")));
	btnLogEvent.click();
	logTypeDropDown.click();
	
	driver.findElement(By.xpath("//div[text()='Task']/following-sibling::ul/li/div[text()='"+logType+"']")).click();
	Thread.sleep(2000);
	
	resultdropDown.click();
	driver.findElement(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active']/div/input")).sendKeys(result);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active']/div/input")).sendKeys(Keys.DOWN);
	driver.findElement(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active']/div/input")).sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active']/div/input
	//driver.findElement(By.xpath("//div[text()='Inbound']/following-sibling::ul/li/div[text()='"+result+"']")).click();
	//loEvntOtherTitle.sendKeys(title);
	comments.sendKeys(note);
	btnEventsSave.click();	
	
}

//log event for task send appliation /thank you note/Lease renewal
public void LogEventForTask(String logType,String note) throws InterruptedException {
	OpenEyeIcon.click();
	Thread.sleep(2000);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='log_contact_button']")));
	btnLogEvent.click();
	logTypeDropDown.click();
	
	driver.findElement(By.xpath("//div[text()='Task']/following-sibling::ul/li/div[text()='"+logType+"']")).click();
	Thread.sleep(2000);

	comments.sendKeys(note);
	btnEventsSave.click();	
	
}

//send mail to lead

public void sendMailToLead(String subject,String messageBody) throws InterruptedException, IOException {
	Thread.sleep(2000);
	OpenEyeIcon.click();
	Thread.sleep(2000);
	btnSendMail.click();
	Thread.sleep(2000);
	//wait.until(ExpectedConditions.visibilityOfElementLocated((By) mailFormHeader));
	mailSubject.sendKeys(subject);
	Thread.sleep(2000);
	driver.switchTo().frame(mailMessageBody);
	WebElement editable = driver.switchTo().activeElement();
	editable.sendKeys(messageBody);
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	mailAttachButton.click();
	Thread.sleep(2000);
	mailUploadButton.click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("C:\\Users\\akank\\OneDrive\\Documents\\FileUpload.exe");
	Thread.sleep(2000);
	mailSendButton.click();
}

//send SMS to lead

public void sendSmsToLead(String smsText) throws InterruptedException, IOException {
	configFileReader = new ConfigFileReader();
	Thread.sleep(2000);
	OpenEyeIcon.click();
	Thread.sleep(2000);
	btnSendSms.click();
	Thread.sleep(2000);
	//wait.until(ExpectedConditions.visibilityOfElementLocated((By) mailFormHeader));
	
	smsBody.sendKeys(smsText);
	/*
	 * driver.switchTo().frame(mailMessageBody); WebElement editable =
	 * driver.switchTo().activeElement(); editable.sendKeys(messageBody);
	 * driver.switchTo().defaultContent();
	 */
	Thread.sleep(2000);
	smsAttachButton.click();
	Thread.sleep(2000);
	
	Actions actions = new Actions(driver);
	actions.moveToElement(smsUploadButton).click().perform();
	
	
	/*
	 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement upload =
	 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
	 * "//input[@id='smsAddPhoto']/parent::div/span"))); upload.click();
	 */
	/*
	 * js = (JavascriptExecutor)driver;
	 * js.executeScript("document.getElementById('gbqfb').click();");
	 * js.executeScript("arguments[0].click();", smsUploadButton);
	 */

	Thread.sleep(4000);
	Runtime.getRuntime().exec(configFileReader.getFilePath());
	Thread.sleep(2000);
	smsSendButton.click();
}


public void validateMenu_OpenDropDown(String LeadName) {
	openDropDown.click();
	List<WebElement> menuOptions= driver.findElements(By.xpath("//a[text()='"+LeadName+"']/parent::div/parent::td[1]/following-sibling::td[5]/div/div/ul/li/a"));
	for(int i=0;i<stringArray.length;i++){
		expListOpenDropDownMenu.add(stringArray[i]);
	}
		
		for (int j = 0; j < menuOptions.size(); j++) {
			//String Menu = menuOptions.get(j).getText();
			actListOpenDropDownMenu.add(menuOptions.get(j).getText());
	
			
}
				Assert.assertEquals(actListOpenDropDownMenu, expListOpenDropDownMenu);
}}


