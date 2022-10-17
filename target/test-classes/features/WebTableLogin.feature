Feature: User should be able to login using correct credentials

  Background: User is on the login page
    Given User is on the login page of the web table app

  Scenario: Positive login scenario
    When  User enters username "Test"
    And User enters password "Tester"
    And User clicks to login button
    Then User should see url contains orders


  Scenario: Positive login scenario

    When  User enters username "Test" password "Tester" and logins
    Then User should see url contains orders

@wip
  Scenario: User should be able to see all 12 months in months dropdown
    When User enters below credentials
      | username | Test   |
      | password | Tester |
    Then User should see url contains orders