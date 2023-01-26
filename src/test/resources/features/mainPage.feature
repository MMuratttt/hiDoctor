Feature: Main page functionalities are working fine
  All WebElements should behave as expected

  Background: For the scenarios in the feature file, user is expected to be on main page as logged in
    Given User is on the main page as logged in


  Scenario: Elements that in the banner which is at the top of the page should work properly
    Then The title should be displayed correctly
    Then The banner at the top of the page should display correct text
    When User clicks on the banner at the top of the page
    Then User should land All Psychologist page
    And Logout

  @needToCheck
  Scenario: All buttons are working fine and functional in the Headers section
    Then User clicks on below buttons, should land related pages.Home button redirect to main page
      | Online Psychologist | Online Psikolog ile Online Terapi Ayarla \| HiDoctor                           |
      | Online Dietitian    | Online Diyetisyen Hizmeti \| HiDoctor                                          |
      | Blog                | HiDoctor Blog: Online Psikolog \| Online Diyetisyen \| Bilgi ve Sağlık Merkezi |
      | B2B Application     | Kurumsal Psikolog Paketleri \| Psikolog Ücretleri \| HiDoctor                  |
      | About Us            | Kurumsal Bilgilerimiz - Hakkımızda \| HiDoctor                                 |
      | Contact Us          | İletişim - Bize Ulaşın \| HiDoctor                                             |
      | Become a Consultant | Danışman Başvuru Formu \| HiDoctor                                             |
      | Chat                |                                                                                |
    Then Texts are correct on the Header segments
    Then Phone number "0 850 700 03 03" is correct at the top right of the page
    When User clicks on Language
    Then User should see languages
      | Türkçe - TR  |
      | English - EN |
      | Español - ES |
      | Deutsch - DE |
      | العربية - AE |
      | русский - RU |
      | Україна - UA |
    When User clicks on any language rather than default
    And User clicks out of the language dropdown
    Then User should see the language that last clicked
    And Logout


  Scenario: All buttons are working fine and functional in the rest of the page
    When User clicks on the banner
    Then User should land All Psychologist page
    And User returns to Main Page
    When User clicks on Apply button
    Then User should see Consultant Application Form
    And Logout

  @wip
  Scenario: Certificates are displayed as intended
    Then Certificates title is correct
    Then Previous button is disabled next button is enabled in default
    When User clicks on next button
    Then Previous button is enabled next button is disabled in default
    When User clicks on previous button
    Then Previous button is disabled next button is enabled in default
    Then Subtitle and text is correct for Health certificate and logo is visible
    Then Subtitle and text is correct for SPICE and logo is visible
    Then Subtitle and text is correct for ISO 45003 and logo is visible
    Then Subtitle and text is correct for ISO 27001 and logo is visible
    Then Subtitle and text is correct for ISO 20000 and logo is visible
    When User clicks on next button
    Then Subtitle and text is correct for ETBIS and logo is visible


  Scenario: All texts are being displayed properly
    Then Online Psychologist and Online Dietitian texts are correct
    Then What and why question texts are correct
    Then Trustworthy texts are correct
    Then Become a consultant texts are correct
    Then FAQ title and question texts are correct
    When Click on first question
    Then First dropdown should be opened and answer is correct
    When Click on second question
    Then Second dropdown should be opened and answer is correct
    When Click on third question
    Then Third dropdown should be opened and answer is correct
    When Click on fourth question
    Then Fourth dropdown should be opened and answer is correct












