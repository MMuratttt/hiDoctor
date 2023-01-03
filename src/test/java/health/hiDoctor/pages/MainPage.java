package health.hiDoctor.pages;

import health.hiDoctor.utilities.BrowserUtils;
import health.hiDoctor.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class MainPage extends BasePage {

    public static Random random = new Random();

    public String title = "HiDoctor: Online Psikolog | Diyetisyen!";
    public String bannerTextAtTheTop = "Sen De Modunu Yakala Diye İlk Psikolog Seansının%25’i Bizden Hediye!";

    @FindBy(xpath = "//img[@alt='Online Psikolog']")
    public WebElement ONLINE_PSYCHOLOGIST;

    @FindBy(xpath = "//img[@alt='Online Diyetisyen']")
    public WebElement ONLINE_DIETITIAN;

    @FindBy(xpath = "//a[@data-testid='sub-header-promotion']/div/div")
    public WebElement BANNER_TEXT_ON_THE_TOP;

    @FindBy(xpath = "//a[@data-testid='sub-header-promotion']/div/div/span[1]")
    public WebElement BANNER_TEXT_PART_1;

    @FindBy(xpath = "//a[@data-testid='sub-header-promotion']/div/div/span[2]")
    public WebElement BANNER_TEXT_PART_2;

    @FindBy(xpath = "//a[@data-testid='sub-header-promotion']/div/div/span[3]")
    public WebElement BANNER_TEXT_PART_3;

    @FindBy(xpath = "//div[contains(@id,'swiper-wrapper-')]/div/div/a")
    public WebElement BANNER_MAIN;

    @FindBy(xpath = "//div[@class='w-full lg:flex-1 lg:my-12']/a")
    public WebElement APPLY_BUTTON;

    @FindBy(xpath = "//h1[@data-testid='service-test-title']")
    public WebElement ONLINE_PSYCHOLOGIST_TEXT_IN_BOX;

    @FindBy(xpath = "(//h2[@data-testid='service-test-title'])[2]")
    public WebElement ONLINE_DIETITIAN_TEXT_IN_BOX;

    @FindBy(xpath = "(//div[@class='space-y-2 md:space-y-6 py-2 md:py-4 flex-1 text-start'])[1]/h2")
    public WebElement WHAT_IS_ONLINE_THERAPY_TEXT;

    @FindBy(xpath = "(//div[@class='space-y-2 md:space-y-6 py-2 md:py-4 flex-1 text-start'])[1]/p")
    public WebElement WHAT_IS_ONLINE_THERAPY_DESC_TEXT;

    @FindBy(xpath = "(//div[@class='space-y-2 md:space-y-6 py-2 md:py-4 flex-1 text-start'])[2]/h2")
    public WebElement WHY_HIDOCTOR_ONLINE_THERAPY_TEXT;

    @FindBy(xpath = "(//div[@class='space-y-2 md:space-y-6 py-2 md:py-4 flex-1 text-start'])[2]/p[1]")
    public WebElement WHY_HIDOCTOR_ONLINE_THERAPY_DESC_TEXT;

    @FindBy(xpath = "(//div[@class='space-y-2 md:space-y-6 py-2 md:py-4 flex-1 text-start'])[2]/p[2]")
    public WebElement WHY_HIDOCTOR_ONLINE_THERAPY_HELPER_TEXT;

    public String onlinePsychologist = "Online Psikolog";
    public String onlineDietitian = "Online Diyetisyen";
    public String whatIsOnlineTherapy = "Online Terapi Hizmeti Nedir?";
    public String whatIsOnlineTherapy_Desc = "Stres, uykusuzluk, ilişki sorunları ve daha birçok psikolojik durumla tek başına mücadele etmek zorunda değilsin! Online terapi hizmeti, web sitesi veya HiDoctor uygulaması aracılığıyla uzman bir psikoloğa dilediğin yerde dilediğin zamanda danışabilmeni sağlar.";
    public String whyHidoctorOnlineTherapy = "Neden HiDoctor Online Terapi?";
    public String whyHidoctorOnlineTherapy_Desc = "HiDoctor, alanında uzman psikologlar ile danışanları buluşturan online bir mecradır. İhtiyacına göre psikologların uzmanlık alanlarını inceleyebilir, sana en uygun uzmanı tercih edebilirsin. Daha mutlu bir yaşama kavuşmak işte bu kadar kolay!";
    public String whyHidoctorOnlineTherapy_HelperText = "*HiDoctor; tanı, teşhis ve tedavi kapsamında olmayan danışmanlık hizmetlerini danışanlarla buluşturan online bir mecradır.";

    @FindBy(xpath = "//h3[@class='text-gray-500 text-xl md:mt-4 md:text-3xl font-semibold text-center pb-6 pt-2']")
    public WebElement WHY_SHOULD_I_CHOOSE_ONLINE_ADVICE_TITLE;

    @FindBy(xpath = "//div[@class='mt-4 grid grid-cols-3 gap-1 md:gap-12 pb-0 md:pb-8']/div[1]/h2")
    public WebElement SECURE_AND_PRIVATE_TITLE;

    @FindBy(xpath = "(//div[@class='mt-4 grid grid-cols-3 gap-1 md:gap-12 pb-0 md:pb-8']/div/p)[1]")
    public WebElement SECURE_AND_PRIVATE_TEXT;

    @FindBy(xpath = "//div[@class='mt-4 grid grid-cols-3 gap-1 md:gap-12 pb-0 md:pb-8']/div[2]/h2")
    public WebElement GUARANTEED_TITLE;

    @FindBy(xpath = "(//div[@class='mt-4 grid grid-cols-3 gap-1 md:gap-12 pb-0 md:pb-8']/div/p)[2]")
    public WebElement GUARANTEED_TEXT;

    @FindBy(xpath = "//div[@class='mt-4 grid grid-cols-3 gap-1 md:gap-12 pb-0 md:pb-8']/div[3]/h2")
    public WebElement EXPERT_CLINICAL_PSYCHOLOGISTS_TITLE;

    @FindBy(xpath = "(//div[@class='mt-4 grid grid-cols-3 gap-1 md:gap-12 pb-0 md:pb-8']/div/p)[3]")
    public WebElement EXPERT_CLINICAL_PSYCHOLOGISTS_TEXT;

    @FindBy(xpath = "//div[@class='mt-4 grid grid-cols-3 gap-1 md:gap-12 pb-0 md:pb-8']/div[4]/h2")
    public WebElement EVIDENCE_BASED_THERAPY_TITLE;

    @FindBy(xpath = "(//div[@class='mt-4 grid grid-cols-3 gap-1 md:gap-12 pb-0 md:pb-8']/div/p)[4]")
    public WebElement EVIDENCE_BASED_THERAPY_TEXT;

    @FindBy(xpath = "//div[@class='mt-4 grid grid-cols-3 gap-1 md:gap-12 pb-0 md:pb-8']/div[5]/h2")
    public WebElement VOICE_AND_VIDEO_CALLS_TITLE;

    @FindBy(xpath = "(//div[@class='mt-4 grid grid-cols-3 gap-1 md:gap-12 pb-0 md:pb-8']/div/p)[5]")
    public WebElement VOICE_AND_VIDEO_CALLS_TEXT;

    @FindBy(xpath = "//div[@class='mt-4 grid grid-cols-3 gap-1 md:gap-12 pb-0 md:pb-8']/div[6]/h2")
    public WebElement ACCESSIBLE_AND_TIMESAVING_TITLE;

    @FindBy(xpath = "(//div[@class='mt-4 grid grid-cols-3 gap-1 md:gap-12 pb-0 md:pb-8']/div/p)[6]")
    public WebElement ACCESSIBLE_AND_TIMESAVING_TEXT;

    public String whyShouldIChooseOnlineAdvice = "Neden Online Danışmanlığı Tercih Etmeliyim?";
    public String secureAndPrivateTitle = "Güvenli ve Gizli";
    public String secureAndPrivateText = "Görüşmelerine HiDoctor veya üçüncü şahıslar erişemez, bilgiler şifrelenerek korunur. Ad-soyad paylaşmadan, sadece telefon numaran ile kayıt olabilir, seansını gerçekleştirebilirsin.";
    public String guaranteedTitle = "Koşulsuz İade";
    public String guaranteedText = "Seans sırasında oluşabilecek herhangi bir aksilik durumunda seans sonrası bizimle iletişime geçebilir, seans ücretinin iadesini talep edebilirsin.";
    public String expertClinicalPsychologistsTitle = "Alanında Uzman Psikologlar";
    public String expertClinicalPsychologistsText = "Yüksek lisansını tamamlamış psikoterapistlerden oluşan deneyimli danışmanlar ile ihtiyacına en uygun psikologları bulabilir, randevunu oluşturabilirsin.";
    public String evidencedBasedTherapyTitle = "Kanıta Dayalı Terapi";
    public String evidencedBasedTherapyText = "Çeşitli kazanımlara sahip, tecrübeli danışmanlarımızın uyguladıkları psikoterapi yaklaşımları, American Psychological Association (APA)’da yer verilen yaklaşımlara dayanmaktadır.";
    public String voiceAndVideoCallsTitle = "Sesli ve Görüntülü Görüşme";
    public String voiceAndVideoCallsText = "Seçtiğin psikolog ile seanslarına sesli veya görüntülü olarak katılabilir, ev konforunda online terapi hizmetinden yararlanabilirsin.";
    public String accessibleAndTimesavingTitle = "Erişilebilir ve Zaman Tasarruflu";
    public String accessibleAndTimesavingText = "Nerede olursan ol, online danışmanına her an her yerden ulaşabilirsin. Seansına bilgisayar, tablet veya HiDoctor uygulaması ile katılabilirsin.";

    @FindBy(xpath = "(//div[contains(@id,'swiper-wrapper-')])[3]/div[1]/div/div")
    public WebElement I_SECURITY_M_S_TEXT;

    @FindBy(xpath = "(//div[contains(@id,'swiper-wrapper-')])[3]/div[2]/div/div")
    public WebElement S_P_I_C_D_TEXT;

    @FindBy(xpath = "(//div[contains(@id,'swiper-wrapper-')])[3]/div[3]/div/div")
    public WebElement I_T_SERVICE_MANAGEMENT_S_TEXT;

    @FindBy(xpath = "(//div[contains(@id,'swiper-wrapper-')])[3]/div[4]/div/div")
    public WebElement I_HEALTH_TOURISM_A_C_TEXT;

    @FindBy(xpath = "(//div[contains(@id,'swiper-wrapper-')])[3]/div[5]/div/div")
    public WebElement E_COMMERCE_I_S_TEXT;

    public String iSecurityMS_Text = "Bilgi Güvenliği Yönetim Sistemi";
    public String sPICD_Text = "(SPICE) Yazılım Süreç Değerlendirme Sistemi";
    public String iTServiceManagementS_Text = "Bilgi Teknolojileri Hizmet Yönetim Sistemi";
    public String iHealthTourismAC_Text = "Uluslararası Sağlık Turizmi Yetki Belgesi";
    public String eCommerceIS_Text = "Elektronik Ticaret Bilgi Sistemi";

    @FindBy(xpath = "//*[contains(@id,'swiper-wrapper-')]/div[1]/div/span")
    public WebElement I_SECURITY_M_S_LOGO;

    @FindBy(xpath = "//*[contains(@id,'swiper-wrapper-')]/div[2]/div/span")
    public WebElement S_P_I_C_D_LOGO;

    @FindBy(xpath = "//*[contains(@id,'swiper-wrapper-')]/div[3]/div/span")
    public WebElement I_T_SERVICE_MANAGEMENT_S_LOGO;

    @FindBy(xpath = "//*[contains(@id,'swiper-wrapper-')]/div[4]/div/span")
    public WebElement I_HEALTH_TOURISM_A_C_LOGO;

    @FindBy(xpath = "//img[@alt='Elektronik Ticaret Bilgi Sistemi']")
    public WebElement E_COMMERCE_I_S_LOGO;

    @FindBy(xpath = "//h2[@class='text-3xl font-semibold text-themeBlack text-center']")
    public WebElement BECOME_A_CONSULTANT_TITLE;

    @FindBy(xpath = "//li[@class='mb-6']")
    public WebElement BECOME_A_CONSULTANT_TEXT;

    public String becomeAConsultantTitle_Text = "Danışman Olun";
    public String becomeAConsultantText_Text = "HiDoctor sistemine katılmak ve online danışmanlık hizmeti vermek için aşağıdaki form üzerinden bizimle iletişime geçebilirsiniz. ";










    public static WebElement randomLanguage() {
        List<WebElement> languagesWE = Driver.getDriver().findElements(By.xpath("//div[@class='absolute top-1 rounded-md text-sm shadow-md w-40 right-0']/a"));
        int randomLangNo = random.nextInt(1, 6);
        return languagesWE.get(randomLangNo);
    }

    public void goToPageAndVerifyTitle(Map<String, String> titles) {

        for (Map.Entry<String, String> each : titles.entrySet()) {

            switch (each.getKey()) {
                case "Online Psychologist":
                    SERVICES.click();
                    ONLINE_PSYCHOLOGIST.click();
                    BrowserUtils.waitFor(2);
                    Assert.assertEquals(Driver.getDriver().getTitle(), each.getValue());
                    BrowserUtils.waitForClickablility(HIDOCTOR_MAINPAGE_ICON, 10);
                    HIDOCTOR_MAINPAGE_ICON.click();
                    break;
                case "Online Dietitian":
                    SERVICES.click();
                    ONLINE_DIETITIAN.click();
                    BrowserUtils.waitFor(2);
                    Assert.assertEquals(Driver.getDriver().getTitle(), each.getValue());
                    BrowserUtils.waitForClickablility(HIDOCTOR_MAINPAGE_ICON, 10);
                    HIDOCTOR_MAINPAGE_ICON.click();
                    break;
                //        case "Blog":
                //  BasePage.BLOG.click();
                //  BrowserUtils.waitFor(2);
                //   Assert.assertEquals(Driver.getDriver().getTitle(),each.getValue());
                //   BasePage.HIDOCTOR_MAINPAGE_ICON.click();
                //            break;
                case "B2B Application":
                    B2B_APPLICATION.click();
                    BrowserUtils.waitFor(2);
                    Assert.assertEquals(Driver.getDriver().getTitle(), each.getValue());
                    BrowserUtils.waitForClickablility(HIDOCTOR_MAINPAGE_ICON, 10);
                    HIDOCTOR_MAINPAGE_ICON.click();
                    break;
                case "About Us":
                    ABOUT_US.click();
                    BrowserUtils.waitFor(2);
                    Assert.assertEquals(Driver.getDriver().getTitle(), each.getValue());
                    BrowserUtils.waitForClickablility(HIDOCTOR_MAINPAGE_ICON, 10);
                    HIDOCTOR_MAINPAGE_ICON.click();
                    break;
                case "Contact Us":
                    CONTACT_US.click();
                    BrowserUtils.waitFor(2);
                    Assert.assertEquals(Driver.getDriver().getTitle(), each.getValue());
                    BrowserUtils.waitForClickablility(HIDOCTOR_MAINPAGE_ICON, 10);
                    HIDOCTOR_MAINPAGE_ICON.click();
                    break;
                case "Become a Consultant":
                    BECOME_A_CONSULTANT.click();
                    BrowserUtils.waitFor(2);
                    Assert.assertEquals(Driver.getDriver().getTitle(), each.getValue());
                    BrowserUtils.waitForClickablility(HIDOCTOR_MAINPAGE_ICON, 10);
                    HIDOCTOR_MAINPAGE_ICON.click();
                    break;
                case "Chat":
                    CHAT.click();
                    BrowserUtils.waitFor(2);
                    Assert.assertEquals(Driver.getDriver().getTitle(), each.getValue());
                    BrowserUtils.waitForClickablility(HIDOCTOR_MAINPAGE_ICON, 10);
                    HIDOCTOR_MAINPAGE_ICON.click();
                    break;
            }

        }

    }


}
