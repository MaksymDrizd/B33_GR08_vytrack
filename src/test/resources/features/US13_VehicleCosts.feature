@US13
Feature: Default

  Background:

    Given the user is on the login page


  @B33G8-168
  Scenario: US013AC01TC01_Verify that users see 3 columns ( TYPE , TOTAL PRICE , DATE )on the Vehicle Costs page
    Given the user logged in as "sales manager"
    Then User hover over Fleet module
    And User click the Vehicle Costs module
    Then User should see the following column options
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |


  @B33G8-169
  Scenario Outline: US013AC02TC01_Verify that users can check the first checkbox to select All Vehicle Costs
    Given the user logged in as "<userType>"
    Then User hover over Fleet module
    And User click the Vehicle Costs module
    Then User can check the first checkbox to select All Vehicle Costs
    Examples:
      | userType      |
      | sales manager |
      | store manager |