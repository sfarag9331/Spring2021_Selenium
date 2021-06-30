Feature: Entering orders.

  Scenario: Verify teacher gets error for invalid item number in SFO.
    Given I am logged in to my Scholastic teacher account using email 'c@c.sf' and password 'c123456'.
    When I enter the ‘Student Flyer Orders’ page.
    And I enter an order for a student of an invalid item number and click 'ADD'.
    Then I verify I get an 'Invalid Item' error message.


  Scenario: Verify your teacher order by flyer jumper.
    Given I am logged in to my Scholastic teacher account using email 'd@d.sf' and password 'd123456'.
    When I enter the 'Your Teacher Order' page.
    And I click on one of the price QTY boxes, verify I got a jumper and close that window.
    Then I click another price QTY box and verify jumper is not displayed.

#Verification not working. I verified using isDisplayed, and since the item was deleted, I get an error "no such element"
  Scenario: Verify user can delete item on cart page.
    Given I am logged in to my Scholastic teacher account using email 'e@e.sf' and password 'e123456'.
    When I enter the ‘Student Flyer Orders’ page.
    And I enter students and their items.
    And I add quantities to added items.
    And I click on REVIEW CART.
    And I remove item 2S8 for Harry.
    Then I verify or Harry, item 2S8 gets deleted.
    And I verify respective amounts and quantities get updated.