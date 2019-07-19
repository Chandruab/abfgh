
Feature: Create Account
  
  Scenario: Success
    Given I want to create an account
    When I enter my data
      | name      | password  |
      | name1     | abc       |
      | name2     | def       |
    Then I verify the account 