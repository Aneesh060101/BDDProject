Feature:Registration Functionality
@Smoke
Scenario:To verify Registration Functionality by entering valid credentials 

Given User has opened the browser and launched the application
When User enters valid First Name
And User enters valid Last Name
And User enters valid Email 
And User enters valid Telephone
And User enters valid Password
And User enters valid Password Confirm
And User clicks on radio button no
And User clicks on privacy policy checkbox
And User clicks on continue button
Then User should be Registered Successfully