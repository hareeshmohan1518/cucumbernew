Feature: login_Using_tags


@smokeTest
Scenario: Verify valid login in demowebshop
Given I have navigated to loginpage
Then  enter valid email id for login
Then I should enter valid password for login
And Click on loginbutton

@InvalidTest @featureTest
Scenario: Verify invalid login in demowebshop with Invalid email and valid password
Given User navigated to login page of demowebshop for invalid login
Then I should enter Invalid email 
Then I should enter valid password 
And user click on login button
    
@InvalidTest 
Scenario: Verify invalid login in demowebshop with valid email and invalid password
Given Launch to home page of demowebshop for another invalid login
Then I should enter valid email 
Then User entered invalid password
And User should click on login button 

@InvalidTest @featureTest
Scenario: Verify invalid login with blank email and password
Given user should navigated to login page of demo web shop
Then I should enter blank email 
Then I should enter blank password
And click on login button 

