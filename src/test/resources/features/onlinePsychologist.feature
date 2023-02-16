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


  Scenario: Analytics and Certificates
    Then Analytics are correct on Online Psychologist page
    Then Certificates title is correct on Online Psychologist page
    Then Previous button is disabled next button is enabled in default on Online Psychologist page
    When User clicks on next button on Online Psychologist page
    Then Previous button is enabled next button is disabled in default on Online Psychologist page
    When User clicks on previous button on Online Psychologist page
    Then Previous button is disabled next button is enabled in default on Online Psychologist page
    Then Subtitle and text is correct for Health certificate and logo is visible on Online Psychologist page
    Then Subtitle and text is correct for SPICE and logo is visible on Online Psychologist page
    Then Subtitle and text is correct for ISO 45003 and logo is visible on Online Psychologist page
    Then Subtitle and text is correct for ISO 27001 and logo is visible on Online Psychologist page
    Then Subtitle and text is correct for ISO 20000 and logo is visible on Online Psychologist page
    When User clicks on next button on Online Psychologist page
    Then Subtitle and text is correct for ETBIS and logo is visible on Online Psychologist page


  Scenario: Texts are correct on the page
    When Scroll to How to Create an Online Call
    Then Texts are correct on How to Create an Online Call
    When Scroll to How do we choose our consultants
    Then Texts are correct on How do we choose our consultants
    When User clicks on Become Consultant on Online Psychologist Page
    Then User should land Become a Consultant Page
    When User navigates back
    When Scroll to Why should I choose Hidoctor
    Then Texts are correct on Why should I choose Hidoctor


  Scenario: Banner section in Online Psychologist page
    When User clicks on Home Icon
    Then User should land on the Main Page
    When User navigates back
    And Clicks on Online Psychologist
    Then User should stay in Online Psychologist page
    Then Title and sub-titles are correct on Banner section in Online Psychologist page
    Then Horizontal scroll slides automatically
    Then Horizontal left scroll is working correctly
    Then Horizontal right scroll is working well
    When User clicks on Find My Psychologists
    Then User should land Find My Psychologists page
    When User navigates back
    And User clicks on Select Psychologist
    Then User should land All Psychologist page


  Scenario: Online Psychologists Slider section texts and functions are working correctly
    When User scrolls to Online Psychologists title over the slider
    Then Title is correct on Psychologists slider
    When User clicks on All Psychologists chip
    Then User should land All Psychologist page
    When User navigates back
    And User scrolls to Online Psychologists title over the slider
    Then Slider works correctly on Psychologists slider with next
    Then Slider works correctly on Psychologists slider with previous

  @wip
  Scenario: Online Psychologists thumbnails are correct
    When The Psychologist is Online
    Then User should see the status correctly
    When The Psychologist is offline
    Then User should see the status correctly
    When The Psychologist is Busy
    Then User should see the status correctly
    When User clicks on thumbnail of the psychologist
    Then User should land on related Psychologist page


  Scenario: Online, offline and Busy psychologists are displayed correctly
    When The Psychologist is Online
    Then User should see Start Now button
    When User clicks on Start Now button
    Then User should land on related Psychologist page
    And Start Now button should be enabled
    And The expert info and status should be correct
    And Video and voice call analytics are compatible with each other
    When User navigates back
    And The Psychologist is offline
    Then User should see Reserve Later button
    When User clicks on Reserve Later button
    Then User should land on related Psychologist page
    And Start Now button should be disabled
    And The expert info and status should be correct
    And Video and voice call analytics are compatible with each other
    When User navigates back
    And The Psychologist is Busy
    Then User should see Reserve Later button
    When User clicks on Reserve Later button
    Then User should land on related Psychologist page
    And Start Now button should be disabled
    And The expert info and status should be correct
    And Video and voice call analytics are compatible with each other


  Scenario: Expert box behave as expected
    When User clicks on profile picture of the Psychologist
    Then User should land on related Psychologist page
    When User navigates back
    And User clicks on stars of the Psychologist
    Then User should land on related Psychologist page
    When User navigates back
    And User clicks on name of the Psychologist
    Then User should land on related Psychologist page
    When User navigates back
    And User clicks on title of the Psychologist
    Then User should land on related Psychologist page
    When User navigates back
    And User clicks on video call of the Psychologist
    Then User should land on related Psychologist page
    When User navigates back
    And User clicks on voice call of the Psychologist
    Then User should land on related Psychologist page
    When User navigates back
    And User clicks on language of the Psychologist
    Then User should land on related Psychologist page
    When User navigates back
    And User clicks on View Educations and Certifications
    Then User should land on related Psychologist page
    When User navigates back
    And User clicks on Starting Price
    Then User should land on related Psychologist page
    When User navigates back
    And User clicks on expertise chips
    Then User should land on related disease page
    And User should see the expert name in the expertise list


