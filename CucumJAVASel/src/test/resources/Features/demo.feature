#Author - Akshay Ranalkar
#Date - 21/07/2024
#Description - My first feature file.
Feature: Test the login Functionality

@SmokeTest
  Scenario: Test if the user is able to login successfully
    Given user is on the login page
    When the user enters username and password
    And clicks the login button
    Then user is navigated to the home page
