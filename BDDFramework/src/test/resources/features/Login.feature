Feature: Login Feature

  Scenario: Verify login with valid credentials
		Given user is on login page
		When user enters valid credentials
		And hits login button
		Then user should be logged in successfully