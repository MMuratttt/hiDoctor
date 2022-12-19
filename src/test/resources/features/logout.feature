Feature: Logout feature
  As a user, I should be able to logout successfully.

  Background: For the scenarios in the feature file, user is expected to be on main page as logged in
    Given User is on the main page as logged in


  Scenario: Logging out with Logout button
    When User clicks on Profile Menu
    Then User should see the exact number which already entered
    When User clicks on Log out
    Then User see the are you sure pop up
    When User clicks on No
    Then User is on the main page and profile dropdown is open
    When User clicks on Log out
    And User clicks on Yes
    Then User is on the main page as logging out


  Scenario: Logging out with closing the tab
    When User closes the tab
    And User is on the main page
    Then User should land on main page as signed in
    And Logout


  Scenario: Logging out with closing the window
    When User closes the window
    And User is on the main page
    Then User should land on main page as signed in
    And Logout