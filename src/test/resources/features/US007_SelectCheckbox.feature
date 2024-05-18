@US07
Feature:
	Background:
		  Given the user is on the login page
		  Given the user logged in as "store manager"
	@B33G8-163
	Scenario: US07AC01Verify that once the users launch on the Vehicles page, the users can see all the checkboxes as unchecked.
	    When user hover over fleet and select Vehicles
		And user can see all the checkboxes as unchecked.

	@B33G8-164
		Scenario: US07AC02 Verify that users can check the first checkbox to select all the cars
		Then user hover over fleet and select Vehicles
		And user can check the first checkbox to select all the cars

	@B33G8-165
	Scenario: US07AC03 Verify that users can check the first checkbox to select all the cars
		When user hover over fleet and select Vehicles
		And user users can select any car