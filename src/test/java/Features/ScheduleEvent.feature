Feature: Scedule event or tasks for self/other agent

@Regression
Scenario: Agent Schedule task for himself 
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for himself "Send Thank-You Note","22","July","1:30 AM","YES","Preapare Lease Task"
Then Verify whether new task "Send Thank-You Note" sceduled for date "7/22/2020" and time "1:30 AM PDT" successfuly

@Regression
Scenario: Agent Schedule task for himself 
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for himself "Call","20","July","1:30 AM","YES","Preapare Lease Task"
Then Verify whether new task "Call" sceduled for date "7/20/2020" and time "1:30 AM PDT" successfuly

@Regression
Scenario: Agent Schedule task for himself 
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for himself "Email","20","July","1:30 AM","YES","Preapare Lease Task"
Then Verify whether new task "Email" sceduled for date "7/20/2020" and time "1:30 AM PDT" successfuly


@Regression
Scenario: Agent Schedule task for himself 
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for himself "Send Application","22","July","1:30 AM","YES","Send Application Task"
Then Verify whether new task "Send Application" sceduled for date "7/22/2020" and time "1:30 AM PDT" successfuly

@Regression
Scenario: Agent Schedule task for himself 
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for himself "SMS/Text","22","July","1:30 AM","YES","SMS/Text Task"
Then Verify whether new task "SMS/Text" sceduled for date "7/22/2020" and time "1:30 AM PDT" successfuly

@Regression
Scenario: Agent Schedule task for himself 
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for himself "Lease Renewal","21","July","1:30 AM","YES","Lease Renewal Task"
Then Verify whether new task "Lease Renewal" sceduled for date "7/21/2020" and time "1:30 AM PDT" successfuly

@Regression
Scenario: Agent Schedule task for himself with created date Immdiately for Prepare Lease
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for himself "Prepare Lease","25","July","10:30 AM","YES","Preapare Lease Task"
Then Verify whether new task "Prepare Lease" sceduled for date "7/25/2020" and time "10:30 AM PDT" successfuly

@Regression
Scenario: Agent Schedule task for himself with created date Immdiately for other task
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule other task immediately for himself "Other","OtherTask","25","July","10:30 AM","YES","Other Task"
Then Verify whether new task "OtherTask" sceduled for date "7/25/2020" and time "10:30 AM PDT" successfuly

@Regression
Scenario: Agent Schedule task for himself with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Marion","Christman" lead with "Inquiry"
Then Schedule other event for himself "Other","OtherEvent","25","July","10:00 a.m.","11:00 a.m.","Other Event"
Then Verify whether new task "OtherEvent" sceduled for date "7/25/2020" and time "10:00 AM - 11:00 AM PDT" successfuly

@Regression
Scenario: Agent Schedule task for himself with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Marion","Christman" lead with "Inquiry"
Then Schedule event for Lead "Move-In","25","July","10:00 a.m.","11:00 a.m.","Move-In Event"
Then Verify whether new task "Move-In" sceduled for date "7/25/2020" and time "10:00 AM - 11:00 AM PDT" successfuly

@Regression
Scenario: Agent Schedule task for himself with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Marion","Christman" lead with "Inquiry"
Then Schedule event for Lead "Lease Signing Meeting","25","July","10:00 a.m.","11:00 a.m.","Lease Signing Meeting Event"
Then Verify whether new task "Lease Signing Meeting" sceduled for date "7/25/2020" and time "10:00 AM - 11:00 AM PDT" successfuly

@Regression
Scenario: Agent Schedule task for himself with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Marion","Christman" lead with "Inquiry"
Then Schedule event for Lead "Lease Renewal Meeting","25","July","10:00 a.m.","11:00 a.m.","Lease Renewal Meeting Event"
Then Verify whether new task "Lease Renewal Meeting" sceduled for date "7/25/2020" and time "10:00 AM - 11:00 AM PDT" successfuly

@Test
Scenario: Agent Schedule task for himself with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Marion","Christman" lead with "Inquiry"
Then Schedule event for Lead showing "Showing","","July","10:00 a.m.","11:00 a.m.","Lease Renewal Meeting Event"
Then Verify whether new task "Showing" sceduled for date "7/25/2020" and time "10:00 AM - 11:00 AM PDT" successfuly

@Regression
Scenario Outline: Agent Schedule event for himself
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And Schedule event for himself <First_Name>,<Last Name>,<Event>,<Date>,<From_Time>,<To_Time>,<Notes>

Examples:
|First_Name  |Last Name|Event  |Date|From_Time |To_Time  |Notes         |
|ShashankTest|LeadTest |Move-In|15  |12:30 p.m.|1:00 p.m.|Move -In Event|
|Cindy       |Cindyl   |Move-In|15  |12:30 p.m.|1:00 p.m.|Move -In Event|


@Regression
Scenario: Agent Schedule event move in for other Agent
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry" 
And Schedule event for other Agent "Move-In","20","12:30 p.m.", "2:00 p.m.","Andre","Move -In Event"

@Regression
Scenario: Agent Schedule event move in for other Agent
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry" 
And Schedule event for other Agent "Move-In","20","12:30 p.m.", "2:00 p.m.","Andre","Move -In Event"

