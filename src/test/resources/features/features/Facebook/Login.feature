Feature: Login

  Scenario: Verify user see "Incorrect email or phone number" error msg when login with no credentials on facebook messenger
    Given I am on Facebook Homepage
    When I click the 'Messenger' button
    And I click the 'Login' button (no credentials were filled in)
    Then I verify that user see "Incorrect credentials" error msg