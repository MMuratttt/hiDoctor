
Feature: B2B Application page functionalities are working fine
  All WebElements should behave as expected

  Background: For the scenarios in the feature file, user is expected to be on main page as logged in
    Given User is on the main page

  Scenario: Elements that in the B2B application page should work properly
    Given User clicks on the B2B Application button
    Then User should land on B2B Application page
    Then Corporate Happiness Package text and button on the image appear properly.
    When User clicks on Get Offer For Free button
    Then User should redirect to the Corporate Application Form
    When User scrolls up the page until Our Partners are visible
    Then User should see the all Partners
      | Formula 1       |
      | Marriott hotels |
      | Swiss hotel     |
      | Cinemaximum     |
      | Globemeets      |
    When User scrolls down the page until Why Should I Get Corporate Services from HiDoctor? are visible
    Then User should see the all answers
      | İş ortamındaki mutluluk, huzur ve refahı arttırmak                                |
      | Çalışanların iş hayatında yaşadıkları zorluklara çözüm önerilerini sunmak         |
      | İhtiyaç duydukları konulara özel, alanında uzman psikologlarımız ile destek olmak |
      | Bireysel, kurumsal ve toplumsal faydayı en üst noktaya taşımak                    |
    When User scrolls down the page until How To Use? are visible
    Then User should see the all answers of how to use
      | 1 - HiDoctor Kurumsal Talep Başvuru Formu doldurulur.                                   |
      | 2 - Başvuru değerlendirilerek sizinle iletişime geçilir.                                |
      | 3 - Kurumunuz çalışanlarına kişiye özel kod ve link iletilir.                           |
      | 4 - Çalışanlarınız kişiye özel kodunu girer ve üye olur.                                |
      | 5 - Çalışanlarınız HiDoctor Çalışan Mutluluğu Paketi haklarını kullanmaya başlayabilir. |
    When User scrolls down the page until All Secure and Private are visible
    Then User should see the all text correctly
      | HiDoctor olarak en temel prensibimiz gizlilik ve güvenilirliktir.                    |
      | Danışanların terapiye güvenle devam edebilmeleri için;                               |
      | HiDoctor veya psikoloğunuz asla kimlik bilgilerinizi ve görüşme içeriğinizi göremez. |
      | Danışanların destek alırken kişisel veya firma bilgilerini vermelerine gerek yoktur. |

  Scenario: Corporate Application Form function works correctly
    Given User clicks on the B2B Application button
    Then User should land on B2B Application page
    When User clicks on Get Offer For Free button
    Then User should redirect to the Corporate Application Form
    And User enters Your Company Name
    And User enters Authorized Person Name
    And User enters Authorized Person Surname
    And User enters Authorized Person Phone Number
    And User enters Authorized Person Corporate Email
    And User enters Information about the service you want to receive
    And User clicks on apply button
    Then B2B Application Form should send successfully
