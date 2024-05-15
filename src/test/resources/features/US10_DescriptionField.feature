@descriptionField
Feature:As a user, I want to type into the Description field when I create a calendar
  event.

  Background: User is already in the log in page
    Given the user is on the login page

  @B33G8-139
  Scenario Outline: US010AC01TC01-Verify that users can type messages in to the Description field on the Calendar
  Events page.
    Given the user logged in as "<userType>"
    Then user hover over Activities module and click on Calendar Events
    When users click on the button Create Calendar Event
    Then users should be able to see and type into the Description field
    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |