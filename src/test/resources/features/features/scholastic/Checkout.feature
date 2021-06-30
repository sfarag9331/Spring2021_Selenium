Feature: Checkout order.

  Scenario: Verify zero tax for SFO order in the checkout.
    Given I am logged in to my Scholastic teacher account using email 'h@h.sf' and password 'h123456'.
    When I enter the ‘Student Flyer Orders’ page.
    And I enter 3 different students' orders.
    And I click on REVIEW CART.
    And I click on PROCEED TO CHECKOUT.
    Then I verify zero tax displayed for SFO order.

  Scenario: Verify non-zero tax is present for SFO-YTO orders in the checkout for teacher with tax state school.
    Given I am logged in to my Scholastic teacher account using email 'i@i.sf' and password 'i123456'.
    When I enter the ‘Student Flyer Orders’ page.
    And I add items to SFO order.
    And I click the 'Your Teacher Order' tab.
    And I click on the 'By Flyer' tab.
    And I add quantity in items-box.
    And I click on REVIEW CART.
    And I click on PROCEED TO CHECKOUT.
    Then I verify zero tax for only SFO order.