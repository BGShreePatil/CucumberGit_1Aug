@ProductScenario
Feature: End to End Scenario for TestMeApp
  Login with Linda Acccount and purchase product and complete payment process.

  Background: Login With Valid Credentials
    Given User is on home page
    When User enters username and password and click on Login button
    Then User should be logged in and verified

  @AddToCartandPaymentProcess
  Scenario: Successfull Checkout
    Given Navigate to All categories - electronics and Head phone
    And Add product into shopping cart
    When Proceed to checkout
    And Select bank and credentials
    Then Redirected to Thank you page
