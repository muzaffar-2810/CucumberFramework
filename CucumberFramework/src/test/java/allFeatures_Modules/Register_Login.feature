Feature: Register Feature
As a user you need to open an account in ecoders website
  
  Scenario: validate the registration process
    Given The user has to be in register page 
    When the user enters a new username in username text field
    And the user enters a new password in password text field
    And the user clicks on register button
    Then the user should be navigated to the login page of ecoders website


Feature: Login Feature
As a user you need to Login into ecoders application


  Scenario: Checking Login functionality with valid credentials
    Given User should be in login page of the ecoders application
    When the user enters valid username in username Text field
    And the user enters valid password in password text field
    And the user clicks on the sign in button
    Then the user should be navigated to dashboard page of ecoders appication