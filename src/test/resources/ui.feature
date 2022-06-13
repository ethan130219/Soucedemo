
Feature: User validation for Login functionality

  Background:
    Given user navigates to SwagLab Login Page

  @run
  Scenario Outline: User should be able to login to SwagLab
    When user enters valid "<username>"
    Then user enters "secret_sauce" as password
    Then user clicks on login button
    Then user should be successfully land on SwagLap Home Page

    Examples:
      | username               |
      | standard_user          |
      | locked_out_user        |
      | problem_user           |
      | performance_glitch_user|


  @run1
  Scenario Outline: User should not be able to login with invalid credentials
    When user enters "<usernameData>" username and "<passwordData>" password
    Then user clicks on login button
    And user should verify "<errorMessageData>" error message


    Examples:
      | usernameData    | passwordData    | errorMessageData                                                          |
      | invalidUsername | invalidPassword | Epic sadface: Username and password do not match any user in this service |
      | standard_user   | invalidPassword | Epic sadface: Username and password do not match any user in this service |
      |                 | secret_sauce    | Epic sadface: Username is required                                        |
      | standard_user   |                 | Epic sadface: Password is required                                        |
      |                 |                 | Epic sadface: Username and Password are required                           |


