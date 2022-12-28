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
