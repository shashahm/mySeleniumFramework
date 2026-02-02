@login @regression

Feature: Webdriver University -  Login

  Background:
  Given I access the webdriver university login page


  Scenario Outline: Validate Successful and Unsuccesful Login
    When  I enter username "<username>"
    And I enter password <password>
    And I click on Login button
    Then I should be presented with a login validation message "<validation message>"

    Examples:
    |username|password|validation message|
    |webdriver|webdriver123|validation succeeded|
    |webdriver|webdriver1234|validation failed|
    |webdriver|webdriver1235|validation failed|


