@US02AC01
Feature:

	Background:
		 Given the user is on the login page

	@B33G8-146
	Scenario Outline: US2ZC01 Verify  that user, should access to the Oroinc Documentation page.
		Given the user logged in as "<userType>"
				Then user click on the question mark icon
				And user should access to the Oroinc Documentation page

				Examples:
				|userType|
				|driver|
				|sales manager|
				|store manager|