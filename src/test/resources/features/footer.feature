Feature: Footer
  All WebElements should behave as expected

  Background: For the scenarios in the feature file, user is expected to be on main page
    Given User is on the main page


  Scenario: Download the app from stores
    When User clicks on App Store button
    Then User should land App Store page
    When User navigates back
    And User clicks on Google Play button
    Then User should land Google Play page
    When User navigates back
    And User clicks on App Gallery button
    Then User should land App Gallery page
    When User navigates back
    Then Title and texts are correct in Download section


  Scenario: Socials
    Then Texts are correct in Socials section
    When User clicks on Instagram
    Then User should land Instagram page
    When User switch to hiDoctor window
    And User clicks on YouTube
    Then User should land YouTube page
    When User switch to hiDoctor window
    And User clicks on Facebook
    Then User should land Facebook page
    When User switch to hiDoctor window
    And User clicks on Twitter
    Then User should land Twitter page
    When User switch to hiDoctor window
    And User clicks on Linkedin
    Then User should land Linkedin page

  @wip
  Scenario:
