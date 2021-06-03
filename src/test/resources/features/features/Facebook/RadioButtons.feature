Feature: Radio button selected

  Scenario: Verify no gender-radio button is selected on Facebook sign up form
    Given I am on Facebook Homepage
    When I click the 'Create New Account' button
    Then I verify that no gender-radio button is selected

