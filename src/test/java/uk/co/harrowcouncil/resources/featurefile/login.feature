@login

Feature: Login feature
  As a user I want to login into harrow council website

  Scenario: User should navigate to login page successfully
    Given I am on home page
    When I click on login and register link
    Then I should navigate to login and register page

  Scenario: User should not login with invalid credentials
    Given I am on home page
    When I click on login and register link
    And I enter the below credentials
    |lamee2@gmail.com|lamee1988|
    And I click on login button
    Then I should see the error message