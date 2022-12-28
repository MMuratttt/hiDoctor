Feature: B2B Application page functionalities are working fine
  All WebElements should behave as expected

  Background: For the scenarios in the feature file, user is expected to be on main page as logged in
    Given User is on the main page

  @wip
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
    Then User should see the all answers
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
    When User clicks on "Ücretsiz Fiyat Teklifi Al" button
    Then User should redirect to the "Kurumsal İş Birliği Başvuru Formu"
    And User enters Your Company Name "Test Company"
    And User enters Authorized Person Name "John"
    And User enters Authorized Person Surname "Who"
    And User enters Authorized Person Phone Number "+905325323232"
    And User enters Authorized Person Corporate Email "johnwhotest5@gmail.com"
    And User enters Information about the service you want to receive "Lorem ipsum dolor sit amet"
    And User clicks on apply button
    Then B2B Application Form should send successfully

  ##Scenario: Corporate Application Form field validations





  ## Görsel düzgün görünür.  +++
  ## Görsel üzerindeki "Çalışan Mutluluğu Paketi" yazısı ve buton düzgün görünür. +++
  ## "Ücretsiz Fiyat Teklifi Al" butonu forma yönlendirir.  +++
  ## "İş Ortaklarımız" kısmı düzgün görünür. ++
  ## "Neden HiDoctor’dan Kurumsal Hizmet Almalıyım?" Kısmındaki görsel ve textler düzgündür. ++
  ## "Nasıl Kullanılır?" başlığındaki textler ve görsel düzgündür. ++
  ## "Hepsi Güvenli ve Gizli" başlığındaki textler doğrudur. ++
  ## "Kurumsal İş Birliği Başvuru Formu" ve görsel doğrudur.
  ## "Kurumsal İş Birliği Başvuru Formu"ndaki Başvur butonu çalışır ve düzgün görünür.