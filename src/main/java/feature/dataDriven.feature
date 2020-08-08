Feature: login DataDriven

Scenario Outline: Verify login functionality

Given I have launch the application
Then I enter username "<username>"
Then I enter password "<password>"
Then I click on login button

Examples:

|username                   |password                 |
|hareesh                    |hareesh123               |
|tom                        |tomjerry                 |