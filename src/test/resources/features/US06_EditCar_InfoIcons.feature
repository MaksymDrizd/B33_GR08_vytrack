@B33G8-161
Feature: Default

	Background:
		#@B33G8-140
		 Given the user is on the login page
		


	@B33G8-147
	Scenario Outline: Verify user see edit car info icons from the Vehicles page
		Given the user logged in as "<userType>"
		When user hovers over to "Fleet" and selects "Vehicles"
		And user able to see edit car info icons on the Vehicles page table
		Then user can verify “view, edit, delete” options when hover the mouse over the three dots “…”
		    Examples:
		      | userType      |
		      | driver        |
		      | sales manager |
		      | store manager |