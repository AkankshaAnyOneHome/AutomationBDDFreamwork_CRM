Feature: Properties functinality

@Todo
Scenario: Verify newly created leads for Scedule Showing event created via Properties for anather agent
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Properties menu and search for "Supreme Pallacio" property
Then click on Shedule Showing button
And Enter all mandatory details to create new Lead "Bcoche", "Wandelario", "9492749825", "BcocheWandelario@armypy.com", "Phone", "8:30","9:00", "Hollister Heights", "1", "1101", "Phone", "News", "2"
Then click on next button
Then Enter all mandatory details to schedule showing "AgentName","month", "week", "date", "note" for anather Agent
Then click on create button
And click on Lead menu and search for "Bcoche","Wandelario" lead with "Inquiry"

@Todo
Scenario: Verify newly created leads for scedule Showing event created via Properties
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Properties menu and search for "Supreme Pallacio" property
Then click on Shedule Showing button
And Enter all mandatory details to create new Lead "Bcoche", "Wandelario", "9492749825", "BcocheWandelario@armypy.com", "Phone", "8:30","9:00", "Hollister Heights", "1", "1101", "Phone", "News", "2"
Then click on next button
Then Enter all mandatory details to schedule showing "month", "week", "date", "note"
Then click on create button
And click on Lead menu and search for "Bcoche","Wandelario" lead with "Inquiry"


@Todo
Scenario: Verify newly created leads for Log Showing event created via Properties
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Properties menu and search for "Supreme Pallacio" property
Then click on Shedule Showing button
Then Select option "Log Showing" to create Lead
And Enter all mandatory details to create new Lead "Bcoche", "Wandelario", "9492749825", "BcocheWandelario@armypy.com", "Phone", "8:30","9:00", "Hollister Heights", "1", "1101", "Phone", "News", "2"
Then click on next button
Then Enter all mandatory details to log showing "month","day","fromTime","toTime","showingResult","note"
Then click on create button
And click on Lead menu and search for "Bcoche","Wandelario" lead with "Inquiry"


@Todo
Scenario: Verify newly created leads created via Properties module.
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Properties menu and search for "Supreme Pallacio" property
Then click on Shedule Showing button
Then Select option "Lead" to create Lead
And Enter all mandatory details to create new Lead "Bcoche", "Wandelario", "9492749825", "BcocheWandelario@armypy.com", "Phone", "8:30","9:00", "Hollister Heights", "1", "1101", "Phone", "News", "2"
Then click on create button
And click on Lead menu and search for "Bcoche","Wandelario" lead with "Inquiry"