Feature: Register_Functionality

  Scenario: Verify Register Functionality On DemoWebShop
  
    Given I have navigated to home page of demowebshop
    Then I should click on register link in demoWebShop
    Then I should select my gender
    Then I should enter my FirstName
      | FirstName |
      | Hareesh   |
    Then I should enter my LastName
      | LastName |
      | M        |
    Then I should enter my email
      | Email                |
      | hareesh123@gmail.com |
    Then I should enter my password
      | Password   |
      | hareesh123 |
    Then I should enter CPassword
      | CPassword  |
      | hareesh123 |
    And I should click on register button in demoWebShop
