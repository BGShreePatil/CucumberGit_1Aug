Feature: Test login Functionality of HirokuApp

  Scenario: Login With valid Credential
    Given User is on home Page
    When User Enters Username and Password
    And Clicks on Login button
    Then User Logged in successfully
