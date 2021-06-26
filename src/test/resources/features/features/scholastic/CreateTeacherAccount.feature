Feature: Creating a teach account

  Scenario Outline: Verify user can create a new teacher account in taxable state using School Search
    Given I am on Scholastic Homepage.
    When I create a new teacher account using email '<email>' and password '<password>'.
    And I make the account for a taxable state using School Search.
    Then I verify there is a CLASS CODE allocated to the teacher, present on Home-Page and MyAccount-Page.
    And I verify same teacher name is present on My Accounts.
    And I verify same school address is present as selected while creating the account.
    Examples:
      | email | password |
      | a@a.sf | a123456 |
      | b@a.sf | a123456 |
      | c@a.sf | a123456 |
      | d@a.sf | a123456 |




  Scenario Outline: Verify user can create a new teacher account in non-taxable state using Zip Code
    Given I am on Scholastic Homepage.
    When I create a new teacher account using email '<email>' and password '<password>'.
    And I make the account for a non-taxable state using Zip Code.
    Then I verify there is a CLASS CODE allocated to the teacher, present on Home-Page and MyAccount-Page.
    And I verify same teacher name is present on My Accounts.
    And I verify same school address is present as selected while creating the account.
    Examples:
      | email | password |
      | a@b.sf | b123456 |
      | b@b.sf | b123456 |
      | c@b.sf | b123456 |
      | d@b.sf | b123456 |



  Scenario Outline: Verify user can create a new teacher account in taxable state using Zip Code
    Given I am on Scholastic Homepage.
    When I create a new teacher account using email '<email>' and password '<password>'.
    And I make the account for a taxable state using Zip Code.
    Then I verify there is a CLASS CODE allocated to the teacher, present on Home-Page and MyAccount-Page.
    And I verify same teacher name is present on My Accounts.
    And I verify same school address is present as selected while creating the account.
    Examples:
      | email | password |
      | a@c.sf | c123456 |
      | b@c.sf | c123456 |
      | c@c.sf | c123456 |
      | d@c.sf | c123456 |