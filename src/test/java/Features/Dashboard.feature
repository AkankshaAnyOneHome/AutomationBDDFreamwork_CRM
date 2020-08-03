Feature: Dashboard functinality

@Regression
Scenario: Create new lead from Dashboard/ Verify newly created leads for single/multi family property via CREATE button
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "akanksha.barde@anyonehome.com" and "@123"
	Then Select option "Lead" to create Lead
And Enter all mandatory details to create new Lead "ShashankTest", "LeadTest", "9850025668", "jyotigorde18@gmail.com", "Phone", "8:30","9:00", "Hollister Heights", "1", "1101", "Phone", "News", "2"
And click on Lead menu and search for "ShashankTest","LeadTest" lead with "Inquiry"

@Regression
Scenario: Create new lead from Dashboard
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
Then Select option "Lead" to create Lead
And Enter all mandatory details to create new Lead "Bcoche", "Wandelario", "9492749825", "BcocheWandelario@armypy.com", "Phone", "8:30","9:00", "Hollister Heights", "1", "1101", "Phone", "News", "2"
Then click on create button
And click on Lead menu and search for "Bcoche","Wandelario" lead with "Inquiry"

@Todo
Scenario: Create new lead from Dashboard and Log Showing event for the Lead by Agent
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
Then Select option "Log Showing" to create Lead
And Enter all mandatory details to create new Lead "Bcoche", "Wandelario", "9492749825", "BcocheWandelario@armypy.com", "Phone", "8:30","9:00", "Hollister Heights", "1", "1101", "Phone", "News", "2"
Then click on next button
Then Enter all mandatory details to log showing "month","day","fromTime","toTime","showingResult","note"
Then click on create button
And click on Lead menu and search for "Bcoche","Wandelario" lead with "Inquiry"

@Todo
Scenario: Create new lead from Dashboard and schedule Showing event for the Lead by Agent
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
Then Select option "Schedule Showing" to create Lead
And Enter all mandatory details to create new Lead "Bcoche", "Wandelario", "9492749825", "BcocheWandelario@armypy.com", "Phone", "8:30","9:00", "Hollister Heights", "1", "1101", "Phone", "News", "2"
Then click on next button
Then Enter all mandatory details to schedule showing "month", "week", "date", "note"
Then click on create button
And click on Lead menu and search for "Bcoche","Wandelario" lead with "Inquiry"

@Todo
Scenario: Create new lead from Dashboard and schedule Showing event for the Lead by anather Agent
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
Then Select option "Schedule Showing" to create Lead
And Enter all mandatory details to create new Lead "Bcoche", "Wandelario", "9492749825", "BcocheWandelario@armypy.com", "Phone", "8:30","9:00", "Hollister Heights", "1", "1101", "Phone", "News", "2"
Then click on next button
Then Enter all mandatory details to schedule showing "AgentName","month", "week", "date", "note" for anather Agent
Then click on create button
And click on Lead menu and search for "Bcoche","Wandelario" lead with "Inquiry"

@Todo
Scenario: Create new lead from Dashboard with all details and schedule Showing event for the Lead by Agent
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
Then Select option "Schedule Showing" to create Lead
And Enter all mandatory details to create new Lead "Bcoche", "Wandelario", "9492749825", "BcocheWandelario@armypy.com", "Phone", "8:30","9:00", "Hollister Heights", "1", "1101", "Phone", "News", "2"
Then click on next button
Then Enter all mandatory details to schedule showing "month", "week", "date", "note"
Then click on more button
Then Enter all details for Guest Desires "2500","2", "1", "1","1", "In Unit"
Then click on more button
Then Enter additional information "2","2", "Cat", "Persian cat","Better Location & cheap Rent", "Yes","Yes","Yes","sddgfdfg"
Then click on create button
And click on Lead menu and search for "Bcoche","Wandelario" lead with "Inquiry"

@Regression
Scenario: Create new lead from Dashboard from user profile 
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on profile icon
Then Select option "Lead" to create Lead
And Enter all mandatory details to create new Lead "Bcoche", "Wandelario", "9492749825", "BcocheWandelario@armypy.com", "Phone", "8:30","9:00", "Hollister Heights", "1", "1101", "Phone", "News", "2"
Then click on create button
And click on Lead menu and search for "Bcoche","Wandelario" lead with "Inquiry"

@Regression
Scenario: Create new lead from Dashboard and schedule Showing event for the Lead by Agent from user profile
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on profile icon
Then Select option "Schedule Showing" to create Lead
And Enter all mandatory details to create new Lead "Bcoche", "Wandelario", "9492749825", "BcocheWandelario@armypy.com", "Phone", "8:30","9:00", "Hollister Heights", "1", "1101", "Phone", "News", "2"
Then click on next button
Then Enter all mandatory details to schedule showing "month", "week", "date", "note"
Then click on create button
And click on Lead menu and search for "Bcoche","Wandelario" lead with "Inquiry"

@Todo
Scenario: Create new lead from Dashboard and schedule Showing event for the Lead by anather Agent from user profile
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on profile icon
Then Select option "Schedule Showing" to create Lead
And Enter all mandatory details to create new Lead "Bcoche", "Wandelario", "9492749825", "BcocheWandelario@armypy.com", "Phone", "8:30","9:00", "Hollister Heights", "1", "1101", "Phone", "News", "2"
Then click on next button
Then Enter all mandatory details to schedule showing "AgentName","month", "week", "date", "note" for anather Agent
Then click on create button
And click on Lead menu and search for "Bcoche","Wandelario" lead with "Inquiry"



