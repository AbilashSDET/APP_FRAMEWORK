Feature: Login
 	Scenario: Successful logout with valid credentials
    Given User is on logout page
    When User enters valid credentials for logout
    Then User should be redirected to the homepage as expected