package health.hiDoctor.pages;

import health.hiDoctor.utilities.BrowserUtils;
import health.hiDoctor.utilities.ConfigurationReader;
import health.hiDoctor.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class MainPage extends BasePage{

    public String title = "HiDoctor: Online Psikolog | Diyetisyen!";
    public String bannerTextAtTheTop = "Sen De Modunu Yakala Diye İlk Psikolog Seansının%25’i Bizden Hediye!";

    @FindBy(xpath="//img[@alt='Online Psikolog']")
    public WebElement ONLINE_PSYCHOLOGIST;

    @FindBy(xpath="//img[@alt='Online Diyetisyen']")
    public WebElement ONLINE_DIETITIAN;

    @FindBy(xpath = "//a[@data-testid='sub-header-promotion']/div/div")
    public WebElement BANNER_TEXT_ON_THE_TOP;

    @FindBy(xpath = "//a[@data-testid='sub-header-promotion']/div/div/span[1]")
    public WebElement BANNER_TEXT_PART_1;

    @FindBy(xpath = "//a[@data-testid='sub-header-promotion']/div/div/span[2]")
    public WebElement BANNER_TEXT_PART_2;

    @FindBy(xpath = "//a[@data-testid='sub-header-promotion']/div/div/span[3]")
    public WebElement BANNER_TEXT_PART_3;
    public static void goToPageAndVerifyTitle(Map<String,String> titles){

        for (Map.Entry<String, String> each : titles.entrySet()) {

            switch (each.getKey()){
                case "Online Psychologist":
                    SERVICES.click();
                    BasePage.ONLINE_PSYCHOLOGIST.click();
                    BrowserUtils.waitFor(2);
                    Assert.assertEquals(Driver.getDriver().getTitle(),each.getValue());
                    BrowserUtils.waitForClickablility(BasePage.HIDOCTOR_MAINPAGE_ICON,10);
                    BasePage.HIDOCTOR_MAINPAGE_ICON.click();
                    break;
                case "Online Dietitian":
                    SERVICES.click();
                    BasePage.ONLINE_DIETITIAN.click();
                    BrowserUtils.waitFor(2);
                    Assert.assertEquals(Driver.getDriver().getTitle(),each.getValue());
                    BrowserUtils.waitForClickablility(BasePage.HIDOCTOR_MAINPAGE_ICON,10);
                    BasePage.HIDOCTOR_MAINPAGE_ICON.click();
                    break;
                //        case "Blog":
              //  BasePage.BLOG.click();
              //  BrowserUtils.waitFor(2);
             //   Assert.assertEquals(Driver.getDriver().getTitle(),each.getValue());
             //   BasePage.HIDOCTOR_MAINPAGE_ICON.click();
                //            break;
                case "B2B Application":
                    BasePage.B2B_APPLICATION.click();
                    BrowserUtils.waitFor(2);
                    Assert.assertEquals(Driver.getDriver().getTitle(),each.getValue());
                    BrowserUtils.waitForClickablility(BasePage.HIDOCTOR_MAINPAGE_ICON,10);
                    BasePage.HIDOCTOR_MAINPAGE_ICON.click();
                    break;
                case "About Us":
                    BasePage.ABOUT_US.click();
                    BrowserUtils.waitFor(2);
                    Assert.assertEquals(Driver.getDriver().getTitle(),each.getValue());
                    BrowserUtils.waitForClickablility(BasePage.HIDOCTOR_MAINPAGE_ICON,10);
                    BasePage.HIDOCTOR_MAINPAGE_ICON.click();
                    break;
                case "Contact Us":
                    BasePage.CONTACT_US.click();
                    BrowserUtils.waitFor(2);
                    Assert.assertEquals(Driver.getDriver().getTitle(),each.getValue());
                    BrowserUtils.waitForClickablility(BasePage.HIDOCTOR_MAINPAGE_ICON,10);
                    BasePage.HIDOCTOR_MAINPAGE_ICON.click();
                    break;
                case "Become a Consultant":
                    BasePage.BECOME_A_CONSULTANT.click();
                    BrowserUtils.waitFor(2);
                    Assert.assertEquals(Driver.getDriver().getTitle(),each.getValue());
                    BrowserUtils.waitForClickablility(BasePage.HIDOCTOR_MAINPAGE_ICON,10);
                    BasePage.HIDOCTOR_MAINPAGE_ICON.click();
                    break;
                case "Chat":
                    BasePage.CHAT.click();
                    BrowserUtils.waitFor(2);
                    Assert.assertEquals(Driver.getDriver().getTitle(),each.getValue());
                    BrowserUtils.waitForClickablility(BasePage.HIDOCTOR_MAINPAGE_ICON,10);
                    BasePage.HIDOCTOR_MAINPAGE_ICON.click();
                    break;
            }

        }

    }



}
