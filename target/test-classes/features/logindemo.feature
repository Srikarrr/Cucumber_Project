@Regression @smoke
Feature: Test Login Functionality
  Scenario Outline: Check login is successful with valid credentials
     Given user opens the browser "<url>"
     When user enters "<username>" and "<password>"
     And user clicks on login button

    Examples:
       | username | password    | url                                                                |
       | Admin    |  admin123   | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login |
