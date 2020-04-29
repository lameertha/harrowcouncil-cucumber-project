$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/uk/co/harrowcouncil/resources/featurefile/login.feature");
formatter.feature({
  "line": 3,
  "name": "Login feature",
  "description": "As a user I want to login into harrow council website",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 13773325700,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should navigate to login page successfully",
  "description": "",
  "id": "login-feature;user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on login and register link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should navigate to login and register page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 138992600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnLoginAndRegisterLink()"
});
formatter.result({
  "duration": 31639033400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iShouldNavigateToLoginAndRegisterPage()"
});
formatter.result({
  "duration": 61018700,
  "status": "passed"
});
formatter.after({
  "duration": 734681800,
  "status": "passed"
});
formatter.before({
  "duration": 12420849700,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User should not login with invalid credentials",
  "description": "",
  "id": "login-feature;user-should-not-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on login and register link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter the below credentials",
  "rows": [
    {
      "cells": [
        "lamee2@gmail.com",
        "lamee1988"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should see the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 32800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnLoginAndRegisterLink()"
});
formatter.result({
  "duration": 31893760800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iEnterTheBelowCredentials(DataTable)"
});
formatter.result({
  "duration": 325870000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 837492700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iShouldSeeTheErrorMessage()"
});
formatter.result({
  "duration": 68596600,
  "status": "passed"
});
formatter.after({
  "duration": 880548700,
  "status": "passed"
});
});