Feature: Login feature
  As a user, I should be able to login with phone number.

  Background: For the scenarios in the feature file, user is expected to be on main page
    Given User is on the main page

  Scenario: Sign Up Happy Path
    When User clicks on Login Register
    Then Login iFrame is displayed
    And User clicks on Sign Up
    Then User can open, read and accept all acknowledge texts
    Then Checkboxes should be clickable and user unclick every checboxes
    When User clicks on country code dropdown for select a different country than default
    And User selects a random country
    And User selects country "<country>" that his phone registered
    And User clicks on Sign Up inside
    Then The phone frame becomes red
    When User enters his number "<phoneNumber>"
    And User clicks on Sign Up inside
    Then Mandatory texts become red
    When User clicks on mandatory checkboxes
    And User clicks on Sign Up inside
    Then User should see the counter and popup message OTP code sent successfully
    Then User should see the exact phone number which already entered
    When User enters the OTP code
    Then User should land on main page as signed in


  Scenario: Sign Up Negative Scenario
    When User clicks on Login Register
    And User clicks on Sign Up
    And User selects country "<country>" that his phone registered
    And User enters his number "<phoneNumber>"
    And User clicks on mandatory checkboxes
    And User clicks on Sign Up inside
    And User clicks Edit Mobile Number
    Then User can open, read and accept all acknowledge texts
    When User clicks on Sign in inside
    Then Login iFrame is displayed
    When User clicks on Sign Up
    And User selects a random country
    And User enters a random number
    And User clicks on all checkboxes
    And User clicks on Sign Up inside
    And User clicks Edit Mobile Number
    When User selects country "<country>" that his phone registered
    And User enters his number "<phoneNumber>"
    And User clicks on mandatory checkboxes
    And User clicks on Sign Up inside
    Then Resend Code should not clickable
    And User waits until the code has expired
    And User clicks on Resend Code
    When User enters the OTP code
    Then User should land on main page as signed in


  Scenario: Sign In
    When User clicks on Login Register
    Then Login iFrame is displayed
    When User selects a random country with entering country code
    And User selects country "<country>" that his phone registered
    And User tries to enter letters and characters
    Then The phone frame becomes red
    When User enters a number with more or less than required phone characters
    And User clicks on Login
    Then Please enter a valid mobile number error is displayed
    When User enters his number <phoneNumber>
    And User clicks on Login
    And User enters an invalid OTP code
    Then The verification code is invalid error message should be displayed
    When User clicks on Resend Code
    And User enters the OTP code
    Then User should land on main page as signed in

