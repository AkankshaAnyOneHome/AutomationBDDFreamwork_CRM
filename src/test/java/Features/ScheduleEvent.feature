Feature: Scedule event or tasks for self/other agent

@Regression
Scenario: Agent Schedule Send Thank-You Note task for himself with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for himself "Send Thank-You Note","22","July","1:30 AM","YES","Send Thank-You Note Task"
Then Verify whether new task "Send Thank-You Note" sceduled for date "7/22/2020" and time "1:30 AM PDT" successfuly

@todo
Scenario: Agent Schedule Call task for himself with created date future date
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task "25","July","10:30 AM", for himself "Send Thank-You Note","22","July","1:30 AM","YES","Send Thank-You Note Task"
Then Verify whether new task "Send Thank-You Note" sceduled for date "7/22/2020" and time "1:30 AM PDT" successfuly

@todo
Scenario: Agent Schedule Send Thank-You Note task for anather agent with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for anather agent "Send Thank-You Note","22","July","1:30 AM","YES","Alan Myers","Send Thank-You Note Task"
Then Verify whether new task "Send Thank-You Note" sceduled for date "7/22/2020" and time "1:30 AM PDT" successfuly

@Regression
Scenario: Agent Schedule Call task for himself with created date Immdiately 
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for himself "Call","20","July","1:30 AM","YES","call Task"
Then Verify whether new task "Call" sceduled for date "7/20/2020" and time "1:30 AM PDT" successfuly

@todo
Scenario: Agent Schedule Call task for himself with created date future date
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task "25","July","10:30 AM", for himself "Call","20","July","1:30 AM","YES","call Task"
Then Verify whether new task "Call" sceduled for date "7/20/2020" and time "1:30 AM PDT" successfuly

@todo
Scenario: Agent Schedule Call task for anather agent with created date Immdiately 
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for anather agent "Call","20","July","1:30 AM","YES","Alan Myers","call Task"
Then Verify whether new task "Call" sceduled for date "7/20/2020" and time "1:30 AM PDT" successfuly

@Regression
Scenario: Agent Schedule Email task for himself with created date Immdiately 
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for himself "Email","20","July","1:30 AM","YES","Preapare Lease Task"
Then Verify whether new task "Email" sceduled for date "7/20/2020" and time "1:30 AM PDT" successfuly

@todo
Scenario: Agent Schedule Email task for himself with created date future date
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task "25","July","10:30 AM", for himself "Email","20","July","1:30 AM","YES","Preapare Lease Task"
Then Verify whether new task "Email" sceduled for date "7/20/2020" and time "1:30 AM PDT" successfuly

@todo
Scenario: Agent Schedule Email task for anather agent with created date Immdiately 
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for anather agent "Email","20","July","1:30 AM","YES","Alan Myers","Preapare Lease Task"
Then Verify whether new task "Email" sceduled for date "7/20/2020" and time "1:30 AM PDT" successfuly

@Regression
Scenario: Agent Schedule Send Application task for himself with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for himself "Send Application","22","July","1:30 AM","YES","Send Application Task"
Then Verify whether new task "Send Application" sceduled for date "7/22/2020" and time "1:30 AM PDT" successfuly

@todo
Scenario: Agent Schedule Send Application task for with created date future date
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task "25","July","10:30 AM", for himself "Send Application","25","July","10:30 AM","YES","Send Application Task"
Then Verify whether new task "Send Application" sceduled for date "7/22/2020" and time "1:30 AM PDT" successfuly

@todo
Scenario: Agent Schedule Send Application task for for anather agent with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for anather agent "Send Application","22","July","1:30 AM","YES","Alan Myers","Send Application Task"
Then Verify whether new task "Send Application" sceduled for date "7/22/2020" and time "1:30 AM PDT" successfuly

@Regression
Scenario: Agent Schedule SMS/Text task for himself with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for himself "SMS/Text","22","July","1:30 AM","YES","SMS/Text Task"
Then Verify whether new task "SMS/Text" sceduled for date "7/22/2020" and time "1:30 AM PDT" successfuly

@todo
Scenario: Agent Schedule SMS/Text task for himself with created date future date
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task "25","July","10:30 AM", for himself "SMS/Text","25","July","10:30 AM","YES","SMS/Text Task"
Then Verify whether new task "SMS/Text" sceduled for date "7/22/2020" and time "1:30 AM PDT" successfuly

@todo
Scenario: Agent Schedule SMS/Text task for anather agent with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for anather agent "SMS/Text","22","July","1:30 AM","YES","Alan Myers","SMS/Text Task"
Then Verify whether new task "SMS/Text" sceduled for date "7/22/2020" and time "1:30 AM PDT" successfuly

@Regression
Scenario: Agent Schedule Lease Renewal task for himself with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for anather agent "Lease Renewal","21","July","1:30 AM","YES","Alan Myers","Lease Renewal Task"
Then Verify whether new task "Lease Renewal" sceduled for date "7/21/2020" and time "1:30 AM PDT" successfuly

@todo
Scenario: Agent Schedule Lease Renewal task for himself with created date future date
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task "25","July","10:30 AM", for himself "Lease Renewal","25","July","10:30 AM","YES","Lease Renewal Task"
Then Verify whether new task "Lease Renewal" sceduled for date "7/21/2020" and time "1:30 AM PDT" successfuly

@todo
Scenario: Agent Schedule Lease Renewal task for anather agent with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for anather agent "Lease Renewal","21","July","1:30 AM","YES","Alan Myers","Lease Renewal Task"
Then Verify whether new task "Lease Renewal" sceduled for date "7/21/2020" and time "1:30 AM PDT" successfuly

@Regression
Scenario: Agent Schedule Prepare Lease task for himself with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for himself "Prepare Lease","25","July","10:30 AM","YES","Preapare Lease Task"
Then Verify whether new task "Prepare Lease" sceduled for date "7/25/2020" and time "10:30 AM PDT" successfuly

@todo
Scenario: Agent Schedule Prepare Lease task for himself with created date future date
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task "25","July","10:30 AM", for himself "Prepare Lease","25","July","10:30 AM","YES","Preapare Lease Task"
Then Verify whether new task "Prepare Lease" sceduled for date "7/25/2020" and time "10:30 AM PDT" successfuly

@todo
Scenario: Agent Schedule Prepare Lease task for anather agent with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule task immediately for anather agent "Prepare Lease","25","July","10:30 AM","YES","Alan Myers","Preapare Lease Task"
Then Verify whether new task "Prepare Lease" sceduled for date "7/25/2020" and time "10:30 AM PDT" successfuly

@Regression
Scenario: Agent Schedule Other task for himself with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule other task immediately for himself "Other","OtherTask","25","July","10:30 AM","YES","Other Task"
Then Verify whether new task "OtherTask" sceduled for date "7/25/2020" and time "10:30 AM PDT" successfuly

@todo
Scenario: Agent Schedule Other task for himself with created date future date
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule other task "25","July","10:30 AM", for himself "Other","OtherTask","25","July","10:30 AM","YES","Other Task"
Then Verify whether new task "OtherTask" sceduled for date "7/25/2020" and time "10:30 AM PDT" successfuly

@todo
Scenario: Agent Schedule Other task for anather agent with created date Immdiately
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Cindy","Cindyl" lead with "Inquiry"
Then Schedule other task immediately for anather Agent "Other","OtherTask","25","July","10:30 AM","YES","Alan Myers","Other Task"
Then Verify whether new task "OtherTask" sceduled for date "7/25/2020" and time "10:30 AM PDT" successfuly


@Regression
Scenario: Agent Schedule other event for himself
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Marion","Christman" lead with "Inquiry"
Then Schedule other event for himself "Other","OtherEvent","25","July","10:00 a.m.","11:00 a.m.","Other Event"
Then Verify whether new task "OtherEvent" sceduled for date "7/25/2020" and time "10:00 AM - 11:00 AM PDT" successfuly

@todo
Scenario: Agent Schedule other event for anather agent
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Marion","Christman" lead with "Inquiry"
Then Schedule other event for anather agent "Other","OtherEvent","25","July","10:00 a.m.","11:00 a.m.","Pawan Mane","Other Event"
Then Verify whether new task "OtherEvent" sceduled for date "7/25/2020" and time "10:00 AM - 11:00 AM PDT" successfuly

@Regression
Scenario: Agent Schedule Move-In task for himself
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Marion","Christman" lead with "Inquiry"
Then Schedule event for Lead "Move-In","25","July","10:00 a.m.","11:00 a.m.","Move-In Event"
Then Verify whether new task "Move-In" sceduled for date "7/25/2020" and time "10:00 AM - 11:00 AM PDT" successfuly

@todo
Scenario: Agent Schedule Move-In task for anather agent
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Marion","Christman" lead with "Inquiry"
Then Schedule event for anather agent "Move-In","25","July","10:00 a.m.","11:00 a.m.","Pawan Mane","Move-In Event"
Then Verify whether new task "Move-In" sceduled for date "7/25/2020" and time "10:00 AM - 11:00 AM PDT" successfuly

@Regression
Scenario: Agent Schedule Lease Signing Meeting task for himself
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Marion","Christman" lead with "Inquiry"
Then Schedule event for Lead "Lease Signing Meeting","25","July","10:00 a.m.","11:00 a.m.","Lease Signing Meeting Event"
Then Verify whether new task "Lease Signing Meeting" sceduled for date "7/25/2020" and time "10:00 AM - 11:00 AM PDT" successfuly

@todo
Scenario: Agent Schedule Lease Signing Meeting task for anather agent
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Marion","Christman" lead with "Inquiry"
Then Schedule event for anather agent "Lease Signing Meeting","25","July","10:00 a.m.","11:00 a.m.","Pawan Mane","Lease Signing Meeting Event"
Then Verify whether new task "Lease Signing Meeting" sceduled for date "7/25/2020" and time "10:00 AM - 11:00 AM PDT" successfuly

@Regression
Scenario: Agent Schedule Lease Signing Meeting task for himself
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Marion","Christman" lead with "Inquiry"
Then Schedule event for Lead "Lease Renewal Meeting","25","July","10:00 a.m.","11:00 a.m.","Lease Renewal Meeting Event"
Then Verify whether new task "Lease Renewal Meeting" sceduled for date "7/25/2020" and time "10:00 AM - 11:00 AM PDT" successfuly

@todo
Scenario: Agent Schedule Lease Signing Meeting task for anather agent
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Marion","Christman" lead with "Inquiry"
Then Schedule event for anather agent "Lease Renewal Meeting","25","July","10:00 a.m.","11:00 a.m.","Pawan Mane","Lease Renewal Meeting Event"
Then Verify whether new task "Lease Renewal Meeting" sceduled for date "7/25/2020" and time "10:00 AM - 11:00 AM PDT" successfuly

@Regression
Scenario: Agent Schedule Showing task for himself
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "rohan.patil@anyonehome.com" and "@123"
And click on Lead menu and search for "Mishika","Kamat" lead with "Showing Set"
Then Schedule event for Lead showing "Showing","Nevermore Homes","Allan","Unit 10","Chat","Phone","Aug 9","8/12","12","showing sceduled by Admin"
Then Verify whether new task "Showing" sceduled for date "8/12/2020" and time "10:00 AM - 11:00 AM PDT" successfuly

@todo
Scenario: Agent Schedule Showing task for anather agent
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "rohan.patil@anyonehome.com" and "@123"
And click on Lead menu and search for "Mishika","Kamat" lead with "Showing Set"
Then Schedule event showing for anather agent "Showing","Nevermore Homes","Allan","Unit 10","Chat","Phone","Aug 9","8/12","12","","showing sceduled by Admin"
Then Verify whether new task "Showing" sceduled for date "8/12/2020" and time "10:00 AM - 11:00 AM PDT" successfuly

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
Scenario: Agent Schedule Move-In event for other Agent
Given Initialize the browser with "Chrome" and Navigate to Login page
When login to application using "g0gyrozeppeli@ymail.com" and "@123"
And click on Lead menu and search for "Blanche","Candelario" lead with "Inquiry" 
And Schedule event for other Agent "Move-In","20","12:30 p.m.", "2:00 p.m.","Andre","Move -In Event"


