Feature: Lead

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

@todo
Scenario: Verify that status field is editable for every leads in Leads table.
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then Change status to "Showing Completed"
Then Select status in update Prospect Status as "Completed - Interested" and put comments "Interested"
Then Verify status "Completed - Interested" changed sucessfully with notes "changed successfully"

@Regression
Scenario: Verify that user can send mail to respective lead through Send Mail option shows on lead's table.
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
When Send mail to Lead with "AnyOneHome Mail","Hi Greetings from AnyOneHOme." and attachment
Then Verify whether new task "Outbound Email" sceduled for current date successfuly

@Regression
Scenario: Verify that user can send SMS to respective lead through Send SMS option shows on lead's table.
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then Send SMS to Lead with "Hi Greetings from AnyOneHOme."and attachment
Then Verify whether new task "SMS" sceduled for current date successfuly

@Regression
Scenario: Verify that dropdown of OPEN button on lead's table shows options to Log event, Schedule event, Send Email, Send Text, Add Notes and Open in New Tab.
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry"
Then Verify whether open drop down for Lead "Blanche Candelario" contains all menu options


@Todo
Scenario: Verify whether agent is able to add new property of interest for particular Lead 
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "rohan.patil@anyonehome.com" and "@123"
And click on Lead menu and search for "Mishika","Kamat" lead with "Showing Set"
Then Add property of interest for "Nevermore Homes","Allan","Unit 10","Chat","Abc notes text"
Then Verify whether new task "Nevermore Homes / Allan / Unit 10" sceduled for current date successfuly

@todo
Scenario: Verify whether agent is able to add new property of interest for particular Lead 
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "rohan.patil@anyonehome.com" and "@123"
And click on Lead menu and search for "Mishika","Kamat" lead with "Showing Set"
Then Add property of interest for "Nevermore Homes","Allan","Unit 10","Chat","Abc notes text"
Then Verify whether new task "Nevermore Homes / Allan / Unit 10" sceduled for current date successfuly

@todo
Scenario: Verify whether agent is able to add new property of interest for particular Lead 
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "rohan.patil@anyonehome.com" and "@123"
And click on Lead menu and search for "Mishika","Kamat" lead with "Showing Set"
Then Add "Notes abc" to Lead
Then Verify whether new task "Notes" sceduled for current date successfuly

@todo
Scenario: Verify whether agent is able to add new property of interest for particular Lead 
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "rohan.patil@anyonehome.com" and "@123"
And click on Lead menu and search for "Mishika","Kamat" lead with "Showing Set"
Then Add document to Lead
Then Verify whether new task "Notes" sceduled for current date successfuly

@todo
Scenario: Verify Search field to filter respective lead from Lead's Table.
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "rohan.patil@anyonehome.com" and "@123"
And click on Lead menu and search for "Mishika","Kamat" lead with "Showing Set"

@Regression
Scenario: Verify Show Filters button always shows up for all leads when user swich to Leads tabs.
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "rohan.patil@anyonehome.com" and "@123"
And click on Lead menu and search for "Mishika","Kamat" lead with "Inquiry"
Then Verify whether show filter option display

@TestFail
Scenario: Verify Show Filters button always shows up for all leads when user swich to Leads tabs.
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "rohan.patil@anyonehome.com" and "@123"
Then User navigate on Lead page
And user cancel print
Then verify whether user navigate back on Lead Page

@Regression
Scenario: Verify download XLSX via Download Leads from My/All/Unassigned/Unverified Leads.
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "rohan.patil@anyonehome.com" and "@123"
Then User navigate on Lead page
And Download Lead list i7wn "XLSX" format

@Regression
Scenario: Verify download CSV via Download Leads from My/All/Unassigned/Unverified Leads.
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "rohan.patil@anyonehome.com" and "@123"
Then User navigate on Lead page
And Download Lead list in "CSV" format

@Regression
Scenario: Verify download PDF via Download Leads from My/All/Unassigned/Unverified Leads.
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "rohan.patil@anyonehome.com" and "@123"
Then User navigate on Lead page
And Download Lead list in "PDF" format

@todo
Scenario: Verify whether user is able to send rental quote to Lead
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "rohan.patil@anyonehome.com" and "@123"
And click on Lead menu and search for "Antonio","Novoc" lead with "Inquiry"
Then User send rental Quote for Lead
Then Verify whether new task "Quote" sceduled for current date successfuly


@Regression
Scenario: Verify that user is able to add C0-Applicants to the existing lead
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Aaron","Smith" lead with "Inquiry"
Then click on open button
And click on add button in Co-Aplicants enter all the mandatory details to add Co-Applicants "Gary","Kirsten","0011002233" and click on save

@todo
Scenario: Verify that user can add notes for a lead through Add Notes option shows on lead's table.
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Aaron","Smith" lead with "Inquiry"
