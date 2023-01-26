Feature: Online Psychologist Page
  All WebElements should behave as expected

  Background: For the scenarios in the feature file, user is expected to be on the Online Psychologist page
    Given User is on the Online Psychologist page


  Scenario: FAQ section
    Then FAQ title and question texts are correct on the Online Psychologist
    When Click on first question on the Online Psychologist
    Then First dropdown should be opened and answer is correct on the Online Psychologist
    When Click on second question on the Online Psychologist
    Then Second dropdown should be opened and answer is correct on the Online Psychologist
    When Click on third question on the Online Psychologist
    Then Third dropdown should be opened and answer is correct on the Online Psychologist
    When Click on fourth question on the Online Psychologist
    Then Fourth dropdown should be opened and answer is correct on the Online Psychologist
    When Click on fifth question on the Online Psychologist
    Then Fifth dropdown should be opened and answer is correct on the Online Psychologist
    When Click on sixth question on the Online Psychologist
    Then Sixth dropdown should be opened and answer is correct on the Online Psychologist
    When Click on seventh question on the Online Psychologist
    Then Seventh dropdown should be opened and answer is correct on the Online Psychologist
    When Click on eighth question on the Online Psychologist
    Then Eighth dropdown should be opened and answer is correct on the Online Psychologist
    When Click on ninth question on the Online Psychologist
    Then Ninth dropdown should be opened and answer is correct on the Online Psychologist


  Scenario: Download the app
    Then Download the app image is visible
    Then Download the app QR code is visible
    Then Download the app title is correct
    Then Download the app text is correct
    When User clicks on App Store button on Online Psychologist page
    Then User should land App Store page
    When User navigates back
    And User clicks on Google Play button on Online Psychologist page
    Then User should land Google Play page
    When User navigates back
    And User clicks on App Gallery button on Online Psychologist page
    Then User should land App Gallery page
    When User navigates back
    Then Markets' texts are correct

  @wip
  Scenario: Certificates
    Then Certificates title is correct on Online Psychologist page
    Then Previous button is disabled next button is enabled in default on Online Psychologist page
    When User clicks on next button on Online Psychologist page
    Then Previous button is enabled next button is disabled in default on Online Psychologist page
    When User clicks on previous button on Online Psychologist page
    Then Previous button is disabled next button is enabled in default on Online Psychologist page
    Then Subtitle and text is correct for Health certificate and logo is visible
    Then Subtitle and text is correct for SPICE and logo is visible
    Then Subtitle and text is correct for ISO 45003 and logo is visible
    Then Subtitle and text is correct for ISO 27001 and logo is visible
    Then Subtitle and text is correct for ISO 20000 and logo is visible
    When User clicks on next button on Online Psychologist page
    Then Subtitle and text is correct for ETBIS and logo is visible



