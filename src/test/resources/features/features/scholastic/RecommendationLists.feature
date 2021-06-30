Feature: Adding a book to recommendation list.

  Scenario: Teacher can add books into recommendations list from using quick look.
    Given I am logged in to my Scholastic teacher account using email 'g@g.sf' and password 'g123456'.
    When I search a book in the search bar, using a keyword.
    And I click on ‘Quick Look’ on a book from results.
    And I click on Recommend.
    And Select ‘Recommendations to Students’ from options.
    Then I verify the item is added in Recommendations to Students Lists under My Lists.