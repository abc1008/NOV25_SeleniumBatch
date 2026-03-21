Feature: Change Password Feature

  Scenario: Verify Change Password valid credentials
		Given user selects change password opion from profile icon
		When user enters valid passwords
		And hits update button
		Then password should be changed successfully