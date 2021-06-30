Feature: Adding payment methods to payment options.

  Scenario: Verify teacher can add only 3 credit cards under My Credit Cards in My Account.
    Given I am logged in to my Scholastic teacher account using email 'f@f.sf' and password 'f123456'.
    And I am on 'Payment Options' page.
    When I verify I have 3 cards under my payment options.
    And I add a credit card to my Payment Options.
    Then I verify I receive an error message.
