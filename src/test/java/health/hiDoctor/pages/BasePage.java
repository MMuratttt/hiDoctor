package health.hiDoctor.pages;

import health.hiDoctor.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[@class='btn btn-primary text-xs']")
    public WebElement LOGIN_REGISTER;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[2]/div/div[2]/div/div[3]/div[1]")
    public WebElement PROFILE;

    @FindBy(xpath = "//div[@class='text-gray-500 flex justify-start flex-col']/h4")
    public WebElement PHONE_NUMBER;

    @FindBy(xpath = "//div[@class='space-y-1']/button")
    public WebElement LOGOUT;

    @FindBy(xpath = "//div[@class='flex justify-center space-s-2']/button[1]")
    public WebElement YES;

    @FindBy(xpath = "//div[@class='flex justify-center space-s-2']/button[2]")
    public WebElement NO;

    @FindBy(xpath = "//div[@class='flex justify-center']/p")
    public WebElement ARE_YOU_SURE_LOGOUT_TEXT;

    @FindBy(xpath = "//button[@class='Toastify__close-button Toastify__close-button--colored']")
    public WebElement X_BUTTON_IN_POPUP;

    public String areYouSureLogout = "Çıkış yapmak istediğinizden emin misiniz?";

    @FindBy(xpath = "//a[@data-testid='HiDoctor-logo-link-desktop']")
    public WebElement HIDOCTOR_MAINPAGE_ICON;

    @FindBy(xpath = "//ul[@class='mt-2 hidden select-none items-center space-s-1 md:flex']/li[1]")
    public WebElement SERVICES;

    @FindBy(xpath = "//ul[@class='hidden md:flex space-s-1 items-center select-none mt-2']/li[1]/span/span/span")
    public WebElement SERVICES_HEADER_TEXT;

    @FindBy(xpath = "//a[@data-testid='header-menu-layout.online-psychologist']")
    public WebElement ONLINE_PSYCHOLOGIST;

    @FindBy(xpath = "//a[@data-testid='header-menu-layout.online-dietitian']")
    public WebElement ONLINE_DIETITIAN;

    @FindBy(xpath = "//a[@data-testid='header-menu-blog']]")
    public WebElement BLOG;

    @FindBy(xpath = "//a[@data-testid='header-menu-b2b']")
    public WebElement B2B_APPLICATION;

    @FindBy(xpath = "//a[@data-testid='header-menu-about-us']")
    public WebElement ABOUT_US;

    @FindBy(xpath = "//a[@data-testid='header-menu-contact-us']")
    public WebElement CONTACT_US;

    @FindBy(xpath = "//div[@class='md:flex-1 flex justify-end space-x-4 items-center']/div/div/a")
    public WebElement BECOME_A_CONSULTANT;

    @FindBy(xpath = "//img[@alt='HiDoctor-header-chat']//ancestor::span")
    public WebElement CHAT;

    @FindBy(xpath = "//div[@class='flex items-center min-w-fit']/p")
    public WebElement CX_PHONE;

    public String servicesText = "Hizmetler";
    public String onlinePsychologistText = "Online Psikolog";
    public String onlineDietitianText = "Online Diyetisyen";
    public String blogText = "Blog";
    public String b2bText = "Kurumsal";
    public String aboutUsText = "Hakkımızda";
    public String contactText = "Bize Ulaşın";
    public String becomeAConsultantText = "Danışman Başvuru Formu";

    @FindBy(xpath = "h-full language-box")
    public WebElement LANGUAGE_DROPDOWN;

    @FindBy(xpath = "//div[@class='absolute top-1 rounded-md text-sm shadow-md w-40 right-0']/a")
    public WebElement ALL_LANGUAGES;

    @FindBy(xpath = "//div[@class='h-full language-box']/div/span")
    public WebElement LANGUAGE_SELECTED;

    @FindBy(xpath = "//div[@class='absolute top-1 rounded-md text-sm shadow-md w-40 right-0']/a[1]/span/span")
    public WebElement TR_LANG;

    @FindBy(xpath = "//div[@class='absolute top-1 rounded-md text-sm shadow-md w-40 right-0']/a[2]/span/span")
    public WebElement EN_LANG;

    @FindBy(xpath = "//div[@class='absolute top-1 rounded-md text-sm shadow-md w-40 right-0']/a[3]/span/span")
    public WebElement ES_LANG;

    @FindBy(xpath = "//div[@class='absolute top-1 rounded-md text-sm shadow-md w-40 right-0']/a[4]/span/span")
    public WebElement DE_LANG;

    @FindBy(xpath = "//div[@class='absolute top-1 rounded-md text-sm shadow-md w-40 right-0']/a[5]/span/span")
    public WebElement AE_LANG;

    @FindBy(xpath = "//div[@class='absolute top-1 rounded-md text-sm shadow-md w-40 right-0']/a[6]/span/span")
    public WebElement RU_LANG;

    @FindBy(xpath = "//div[@class='absolute top-1 rounded-md text-sm shadow-md w-40 right-0']/a[7]/span/span")
    public WebElement UA_LANG;

    @FindBy(xpath = "//*[@id=\"__next\"]/footer/div[2]/div/div/div[1]/p")
    public WebElement ALL_RIGHTS_RESERVED_TEXT;

    @FindBy(xpath = "//a[@data-testid='download-app-link-App Store']/../h3")
    public WebElement DOWNLOAD_TITLE;

    @FindBy(xpath = "//a[@data-testid='download-app-link-App Store']")
    public WebElement APP_STORE_BTN;

    @FindBy(xpath = "//a[@data-testid='download-app-link-Google Play']")
    public WebElement GOOGLE_PLAY_BTN;

    @FindBy(xpath = "//a[@data-testid='download-app-link-App Gallery']")
    public WebElement APP_GALLERY_BTN;

    @FindBy(xpath = "//a[@data-testid='download-app-link-App Store']/span[2]")
    public WebElement APP_STORE_TEXT;

    @FindBy(xpath = "//a[@data-testid='download-app-link-Google Play']/span[2]")
    public WebElement GOOGLE_PLAY_TEXT;

    @FindBy(xpath = "//a[@data-testid='download-app-link-App Gallery']/span[2]")
    public WebElement APP_GALLERY_TEXT;

    public String download = "Uygulamayı İndir";
    public String appStoreText = "App Store";
    public String googlePlayText = "Google Play";
    public String appGalleryText = "App Gallery";

    public String socialsTitle = "Sosyal Medya";

    @FindBy(xpath = "//a[@data-testid='download-app-link-App Store']/../../div[2]/div[2]/h3[2]")
    public WebElement SOCIALS_TITLE_TEXT;

    @FindBy(xpath = "//div[@class='flex space-s-6 md:block md:space-s-0']/a[1]")
    public WebElement INSTAGRAM;

    @FindBy(xpath = "//div[@class='flex space-s-6 md:block md:space-s-0']/a[2]")
    public WebElement YOUTUBE;

    @FindBy(xpath = "//div[@class='flex space-s-6 md:block md:space-s-0']/a[3]")
    public WebElement FACEBOOK;

    @FindBy(xpath = "//div[@class='flex space-s-6 md:block md:space-s-0']/a[4]")
    public WebElement TWITTER;

    @FindBy(xpath = "//div[@class='flex space-s-6 md:block md:space-s-0']/a[5]")
    public WebElement LINKEDIN;

    @FindBy(xpath = "//div[@class='flex space-s-6 md:block md:space-s-0']/a[1]/p")
    public WebElement INSTAGRAM_TEXT;

    @FindBy(xpath = "//div[@class='flex space-s-6 md:block md:space-s-0']/a[2]/p")
    public WebElement YOUTUBE_TEXT;

    @FindBy(xpath = "//div[@class='flex space-s-6 md:block md:space-s-0']/a[3]/p")
    public WebElement FACEBOOK_TEXT;

    @FindBy(xpath = "//div[@class='flex space-s-6 md:block md:space-s-0']/a[4]/p")
    public WebElement TWITTER_TEXT;

    @FindBy(xpath = "//div[@class='flex space-s-6 md:block md:space-s-0']/a[5]/p")
    public WebElement LINKEDIN_TEXT;

    @FindBy(xpath = "(//h3[@class='mb-1 text-xs font-bold text-white'])[2]")
    public WebElement SERVICES_FOOTER;

    @FindBy(xpath = "//a[@data-testid='services-link-online-psychologist']")
    public WebElement ONLINE_PSYCHOLOGIST_FOOTER;

    @FindBy(xpath = "//a[@data-testid='services-link-online-dietitian']")
    public WebElement ONLINE_DIETITIAN_FOOTER;

    @FindBy(xpath = "(//h3[@class='mb-1 text-xs font-bold text-white'])[1]")
    public WebElement HIDOCTOR_FOOTER;

    @FindBy(xpath = "//div[@data-testid='hidoctor-link-about-us']")
    public WebElement ABOUT_US_FOOTER;

    @FindBy(xpath = "//div[@data-testid='hidoctor-link-faq']")
    public WebElement FAQ_FOOTER;

    @FindBy(xpath = "//div[@data-testid='hidoctor-link-blog']")
    public WebElement BLOG_FOOTER;

    @FindBy(xpath = "//div[@data-testid='hidoctor-link-promotion']")
    public WebElement PROMOTION_FOOTER;

    @FindBy(xpath = "//div[@data-testid='hidoctor-link-tags']")
    public WebElement AREAS_OF_EXPERTISE_FOOTER;

    public String hiDoctorText_Footer = "HiDoctor";
    public String FAQText_Footer = "Sıkça Sorulan Sorular";
    public String promotionText_Footer = "Kampanyalar";
    public String areasOfExpertiseText_Footer = "Uzmanlık Alanları";

    @FindBy(xpath = "//span[@title='footer-hidoctor-logo']")
    public WebElement HIDOCTOR_ICON_FOOTER;

    public String footerTextUnderHiDoctor = "Binlerce danışanımız güvenle ve zahmetsizce online danışmanlık hizmeti aldı, HiDoctor’la daha iyi hissetmeye başladı.";

    @FindBy(xpath = "//div[@class='md:w-96']/p")
    public WebElement FOOTER_TEXT_UNDER_HIDOCTOR;

    @FindBy(xpath = "//a[@data-testid='sub-menu-links-privacy-policy']")
    public WebElement PRIVACY_POLICY_FOOTER;

    @FindBy(xpath = "//a[@data-testid='sub-menu-links-hidoctor-user-agreement']")
    public WebElement USER_AGREEMENT_FOOTER;

    @FindBy(xpath = "//a[@data-testid='sub-menu-links-kvkk-agreement']")
    public WebElement KVKK_AGREEMENT_FOOTER;

    public String privacyPolicyFooter = "Gizlilik Sözleşmesi";
    public String userAgreementFooter = "HiDoctor Kullanıcı Sözleşmesi";
    public String KVKKAgreementFooter = "KVKK Aydınlatma Metni";
    public String allRightsReserved = "© 2022 HiDoctor Tüm Hakları Saklıdır";

    @FindBy(xpath = "//div[@class='container my-12 md:my-28']/h1")
    public WebElement REGULATORY_TEXTS_COMMON_TITLE;





}
