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
Scenario: Verify that user is able to log event for Lease Signing Meeting
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then Select log type "Lease Renewal Meeting", "12", "July", "10:30 a.m.", "11:30 a.m.", "Notes"
Then Verify whether new task "Lease Renewal Meeting" sceduled for date "7/12/2020" and time "10:30 AM - 11:30 AM PDT" successfuly


@Regression
Scenario: Verify that user is able to log event for Lease Signing Meeting
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then Select log type "Move-In", "12", "July", "10:30 a.m.", "11:30 a.m.", "Notes"
Then Verify whether new task "Move-In" sceduled for date "7/12/2020" and time "10:30 AM - 11:30 AM PDT" successfuly

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
Then Select task "Call", "Answered", "Notes"
Then Verify whether new task "Call" sceduled for current date successfuly

@Regression
Scenario: Verify that user is able to log event for task call log type
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then Select task Inbond "Call", "Answered", "Notes"
Then Verify whether new task "Call" sceduled for current date successfuly

@Regression
Scenario: Verify that user is able to log event for task call log type
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then Select task Inbond "Email", "Sent", "Notes"
Then Verify whether new task "Email" sceduled for current date successfuly

@Regression
Scenario: Verify that user is able to log event for task call log type
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then Select task Inbond "SMS/Text", "Sent", "Notes"
Then Verify whether new task "SMS/Text" sceduled for current date successfuly

@Regression
Scenario: Verify that user is able to log event for task call log type
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And Enter all mandatory details to create new Lead "Lead", "Marion", "Christman", "9492749825", "MarionTChristman@dyrep.com", "Phone", "8:30","9:00", "Hollister Heights", "1", "1101", "Phone", "News", "2"
And click on Lead menu and search for "Marion","Christman" lead with "Inquiry"
Then Select task "Prepare Lease", "Notes"
Then Verify whether new task "Prepare Lease" sceduled for current date successfuly

@Regression
Scenario: Verify that user is able to log event for task call log type
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then Select task "Send Thank-You Note", "Notes"
Then Verify whether new task "Send Thank-You Note" sceduled for current date successfuly

@Regression
Scenario: Verify that user is able to log event for task call log type
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then Select task "Send Application", "Notes"
Then Verify whether new task "Send Application" sceduled for current date successfuly


@Regression
Scenario: Verify that user is able to log event for task call log type
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then Select task "Lease Renewal", "Notes"
Then Verify whether new task "Lease Renewal" sceduled for current date successfuly






