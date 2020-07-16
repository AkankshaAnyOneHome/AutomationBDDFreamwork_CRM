Feature: Lead
@Regression
Scenario: Create new lead from Dashboard
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And Enter all mandatory details to create new Lead "Lead", "ShashankTest", "LeadTest", "9850025668", "jyotigorde18@gmail.com", "Phone", "8:30","9:00", "Hollister Heights", "1", "1101", "Phone", "News", "2"
And click on Lead menu and search for "ShashankTest","LeadTest" lead with "Inquiry"

@Regression
Scenario: Create new lead from Dashboard
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And Enter all mandatory details to create new Lead "Lead", "Blanche", "Candelario", "9850025699", " 	BlancheHCandelario@armypy.com", "Phone", "8:30","9:00", "Hollister Heights", "1", "1101", "Phone", "News", "2"
And click on Lead menu and search for "ShashankTest","LeadTest" lead with "Inquiry"

@Regression
Scenario: Log new event by lead
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And Schedule task for other agent "ShashankTest","LeadTest","Prepare Lease","17","August","10:30 PM","Preapare Lease Task","Andre"
Then Verify whether new log event "Prepare Lease" created by Agent display in contact activity


@Regression
Scenario: Agent Schedule task for other agent
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And Schedule task for other agent "ShashankTest","LeadTest","Prepare Lease","17","August","10:30 PM","Preapare Lease Task by akanksha","Andre"
Then Verify whether new task "Prepare Lease" sceduled for date "8/17/2020" and time "10:30 PM PDT" successfuly


@Regression
Scenario: Agent Schedule task for himself
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And Schedule task for himself "Cindy","Cindyl","Prepare Lease","15","12:30 PM","Preapare Lease Task"

@Regression
Scenario Outline: Agent Schedule event for himself
Given Initialize the browser with "Chrome" and Navigate to Login page
And Navigate to "url" Site
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And Schedule event for himself <First_Name>,<Last Name>,<Event>,<Date>,<From_Time>,<To_Time>,<Notes>

Examples:
|First_Name  |Last Name|Event  |Date|From_Time |To_Time  |Notes         |
|ShashankTest|LeadTest |Move-In|15  |12:30 p.m.|1:00 p.m.|Move -In Event|
|Cindy       |Cindyl   |Move-In|15  |12:30 p.m.|1:00 p.m.|Move -In Event|

@Regression
Scenario: Agent Schedule event for other Agent
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And Schedule event for other Agent "Uma","Lee","Move-In","20","12:30 p.m.", "2:00 p.m.","Andre","Move -In Event"

@todo
Scenario: Verify that status field is editable for every leads in Leads table.
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then Change status to "Showing Completed"
Then Select status in update Prospect Status as "Completed - Interested" and put comments "Interested"
Then Verify status "Completed - Interested" changed sucessfully with notes "changed successfully"

@todo
Scenario: Verify that user can send mail to respective lead through Send Mail option shows on lead's table.
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then enter details "AnyOneHome_MailSubject", "MailBody", ""
Then Select status in update Prospect Status as "Completed - Interested" and put comments "Interested"
Then Verify status "Completed - Interested" changed sucessfully with notes "changed successfully"


@Regression
Scenario: Verify that dropdown of OPEN button on lead's table shows options to Log event, Schedule event, Send Email, Send Text, Add Notes and Open in New Tab.
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then Verify whether open drop down for Lead "Blanche Candelario" contains all menu options


