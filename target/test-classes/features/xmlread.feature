@Regression @sanity
Feature: This feature automates the techlistic application
  Scenario Outline: user enters the data in the techlistic application
    Given user opens the browser "<url>"
    When user enters "<firstname>" firstname
    And user enters "<lastname>" lastname
    And user selects "<gender>" gender
    And user selects "<yearsofexperience>" years

    Examples:
    | url                                                        | firstname | lastname | gender | yearsofexperience |
    | https://www.techlistic.com/p/selenium-practice-form.html   | srikar    |  rao     | Male   |  3                |

  @sanity
  Scenario Outline: Unsuccessful login with invalid credentials
    Given I have entered invalid "<username>" and "<password>"
    Then I should see the error message indicating "<error_message>"

     Examples:
     | username          | password        | error_message                                         |
     | invalid@gmail.com | invalidpassword | Warning: No match for E-mail Address and/or Password. |
     | abcccc            | validpassword   | Warning: No match for E-mail Address and/or Password. |
     | invalid@gmail.com | abcc            | Warning: No match for E-mail Address and/or Password. |


  @sanity
  Scenario Outline: User reads the XML file
    Given user reads the data from xml file "<xmlfile>"

    Examples:
      | xmlfile          |
      | students.xml     |
