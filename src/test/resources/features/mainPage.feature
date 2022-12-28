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
    And User returns to Main Page


  Scenario: All texts are being displayed properly
    Then Online Psychologist and Online Dietitian texts are correct
    Then What and why question texts are correct











