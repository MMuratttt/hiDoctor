Feature: Main page functionalities are working fine
  All WebElements should behave as expected

  Background: For the scenarios in the feature file, user is expected to be on main page as logged in
    Given User is on the main page as logged in

  @wip
  Scenario: All buttons are working fine and functional
    Then The title should be displayed correctly
    Then The banner at the top of the page should display correct text
    When User clicks on the banner at the top of the page
    Then User should land All Psychologist page
    Then User clicks on below buttons, should land related pages.Home button redirect to main page
      | HiDoctor            |
      | Online Psychologist |
      | Online Dietitian    |
      | Blog                |
      | B2B Application     |
      | About Us            |
      | Contact Us          |
      | Become a Consultant |
    Then Texts are correct on the Header segments
    Then Phone number is correct at the top right of the page
    When User clicks on Language
    Then User should see languages
      | TR |
      | EN |
      | ES |
      | DE |
      | AE |
      | RU |
      | UA |





