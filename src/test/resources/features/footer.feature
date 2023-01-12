Feature: Footer
  All WebElements should behave as expected

  Background: For the scenarios in the feature file, user is expected to be on main page
    Given User is on the main page


  Scenario: Download the app from stores is correct
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


  Scenario: Socials are correct
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


  Scenario: Services Title is correct
    Then Texts are correct in Services Section
    When User clicks on Online Psychologist
    Then User should land Online Psychologist page
    When User navigates back
    And User clicks on Online Dietitian page
    Then User should land Online Dietitian page


  Scenario: HiDoctor Title is correct
    Then Texts are correct in Hidoctor Section
    When User clicks on About Us
    Then User should land About Us page
    When User navigates back
    When User clicks on FAQ
    Then User should land FAQ page
    When User navigates back
    When User clicks on Blog
    Then User should land Blog page
    When User navigates back
    When User clicks on Promotion
    Then User should land Promotion page
    When User navigates back
    When User clicks on Areas of Expertise
    Then User should land tags page


  Scenario: Regulatory texts and other fields in the footer is correct
    Then Hidoctor icon is displayed in footer
    Then Text under the hiDoctor icon in the footer is correct
    Then Regulatory texts are correct
    Then All rights reserved text is correct
    When User clicks on Privacy Policy
    Then User should land privacy policy page
    When User navigates back
    And User clicks on User Agreement
    Then User should land user agreement page
    When User navigates back
    And User clicks on KVKK Agreement
    Then User should land KVKK agreement page
