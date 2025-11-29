Feature:Login Functionality
@Smoke
Scenario:To verify Login Functionality by entering valid credentials 

Given User has opens the browser and launched the application
When User enters the valid Email address 
And User enters the valid Password
And User clicks on login
Then User should be Logged in Successfully