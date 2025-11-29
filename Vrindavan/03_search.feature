Feature:Search Functionality
@Smoke
Scenario:To verify Search Functionality

Given User has launched the application
When User has been logged in
When User enters the valid product name in the search box
And User clicks on search button
Then User should see the searched prodcut displayed