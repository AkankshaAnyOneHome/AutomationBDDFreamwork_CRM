Feature: Scedule event or tasks for self/other agent

@Regression
Scenario: Agent Schedule task for himself 
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
And Schedule task for himself "Prepare Lease","15","12:30 PM","Preapare Lease Task"
Then Verify whether new task "Move-In" sceduled for date "7/22/2020" and time "10:30 AM - 11:30 AM PDT" successfuly

@Regression
Scenario: Agent Schedule task for himself with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task for himself "Prepare Lease","25","July","10:30 AM","YES","Preapare Lease Task"
Then Verify whether new task "Prepare Lease" sceduled for date "7/25/2020" and time "10:30 AM PDT" successfuly

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

