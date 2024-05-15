@B33G8-145
Feature: Default

	@B33G8-143
	Scenario Outline: US03AC01TC01- Verify that user can click the “Learn how to use this space” link and sees text
		Given the user logged in as "<userType>"
		    When User clicks the Learn how to use this space link
		    Then User sees How to Use Pinbar and Use the pin icon on the right top corner of page to create fast access link in the pinbar.
		        Examples:
		      | userType      |
		      | driver        |
		      | sales manager |
		      | store manager |	

	
	@B33G8-144 @wip
	Scenario Outline: US03AC02TC01- Verify that user sees an image on the page
		Given the user logged in as "<userType>"
		When User clicks the Learn how to use this space link
			Then User sees an image on the page
			    Examples:
		      | userType      |
		      | driver        |
		      | sales manager |
		      | store manager |