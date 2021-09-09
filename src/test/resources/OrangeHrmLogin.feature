@smokeTest @regressionTest @jenkinsTest
Feature: Verify login feature in Orange HRM website 
#Class 12 Day Time is 1:16H 
Scenario: User able to successfully login to Orange HRM site 
	Given user go to Orange Hrm home page 
	When user enter valid username and password 
	And user click on the log in button 
	Then user navigate to the welcome page 
	And user verify the page title as "OrangeHRM" 
	And user verify user name is displays at top right
	Then user log out
	And user close browser