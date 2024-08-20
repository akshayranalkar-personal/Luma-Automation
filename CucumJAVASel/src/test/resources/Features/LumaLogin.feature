#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.

Feature: Login into LUMA Website
  
 
  
  Scenario: Login using valid credentials
    Given I am on the LUMA Website
    When I click on the Sign In button
    And I enter a valid username
    And I enter a valid password
    And Click on the Login button
    Then I am able to login into the website successfully
    And Am able to navigate to the My Account Page

  