Feature: Google Browser Search

  Scenario: Google Browser Search
    Given The browser is open
    And User is on google search page
    When user enters search text in the box
    And Hits Enter
    Then User is directed to the search page
