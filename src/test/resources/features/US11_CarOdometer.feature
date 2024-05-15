@US011
Feature: user should view car odometer info on the Vehicles Odometers page.

	Background:

		User is already in the log in page
		    Given the user is on the login page
		


	@B33G8-148
	Scenario Outline: US011AC01TC01_Verify that Store and Sales managers see the error message “You do not have permission to perform this action.” when they click the Vehicle Odometer module.
		Given the user logged in as "<userType>"
		    Then User hover over Fleet module
		    And User click the Vehicle Odometer module
		    Then User should see the error message “You do not have permission to perform this action.”
		    Examples:
		      | userType      |
		      | sales manager |
		      | store manager |

	@B33G8-150
	Scenario: US011AC02TC01_Verify that Drivers see the default page as 1.
		Given the user logged in with username as "User1" and password as "UserUser123"
		Then User hover over fleet module
		And User click the Vehicle Odometer module
		Then User should see the default page as 1

	@B33G8-151
	Scenario: US011AC03TC01_
		Given the user logged in with username as "User1" and password as "UserUser123"
		Then User hover over fleet module
		And User click the Vehicle Odometer module
		Then User should see the View Per Page as 25 by default