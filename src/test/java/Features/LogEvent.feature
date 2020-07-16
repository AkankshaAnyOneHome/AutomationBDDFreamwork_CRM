Feature: Log event or tasks for lead

@Regression
Scenario: Verify that user is able to log event for Showing
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123" 
And click on Lead menu and search for "john","Jason" lead with "Inquiry"
Then Select log type "Showing" , "Castro Valley Towers", "Holding", "10", "July", "9:00 a.m.", "10:00 a.m.", "Anyone 11 Unit", "Completed - Interested", "Interested"
Then Verify whether new task "Showing Appointment" sceduled for date "7/10/2020" and time "9:00 AM - 10:00 AM PDT" successfuly

@Regression
Scenario: Verify that user is able to log event for Lease Signing Meeting
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then Select log type "Lease Signing Meeting", "14", "July", "10:30 a.m.", "11:30 a.m.", "Notes"
Then Verify whether new task "Lease Signing Meeting" sceduled for date "7/14/2020" and time "10:30 AM - 11:30 AM PDT" successfuly

@Regression
Scenario: Verify that user is able to log event for event other log type
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then Select log type "Other", "title_1", "9", "July", "9:00 a.m.", "10:00 a.m.", "Notes Other"
Then Verify whether new task "title_1" sceduled for date "7/9/2020" and time "9:00 AM - 10:00 AM PDT" successfuly

@Regression
Scenario: Verify that user is able to log event for task other log type
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then Select log type "Other", "Title_2", "Notes"
Then Verify whether new task "Title_2" sceduled for current date successfuly

@Regression
Scenario: Verify that user is able to log event for task call log type
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
When Click on open to open particular lead
Then Select task "Call", "Answered", "Notes"
Then Verify whether new task "Call" sceduled for current date successfuly

@Regression
Scenario: Verify that user is able to log event for task call log type
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then Select task Inbond "Call", "Answered", "Notes"
Then Verify whether new task "Call" sceduled for current date successfuly