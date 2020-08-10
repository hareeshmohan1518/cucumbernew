
Feature: Register

  Scenario: Verify Register Functionality
  
    Given I have navigated to application
    Then I should click on register link
    Then I should enter my data
    
    |Hareesh|M|9400687416|hareesh123@gmail.com|Pakideeriyil|Palakkad|Kerala|679516|INDIA|hareesh123|12345|12345|
    
     Then I should click on submit button



