@CalendarEvents
Feature: Default
#@B33G8-140
  Background:User is already in the log in page
    Given the user is on the login page


  @B33G8-137
  Scenario Outline: US08AC01TC01 - Verify that users see the number “1” by default in the Repeat Every input option.
    Given the user logged in as "<userType>"
    Then User hovers over to Activities module and selects Calendar Events
    And User on Calendar Events page clicks on Create Calendar event
    Then User clicks on Repeat checkbox
    And User can see the number "1" by default in the Repeat Every input option
    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |


  @B33G8-138
  Scenario Outline: US08AC02TC01 - Verify that users see the error message “This value should not be blank.” when the Calendar event Repeat Every field is cleared (delete the number 1).
    Given the user logged in as "<userType>"
    Then User hovers over to Activities module and selects Calendar Events
    And User on Calendar Events page clicks on Create Calendar event
    Then User clicks on Repeat checkbox
    And User can see the number "1" by default in the Repeat Every input option
    Then User delete number 1 from Repeat Every input option
    And User can see the error message "This value should not be blank."
    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |