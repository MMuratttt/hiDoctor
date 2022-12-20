package health.hiDoctor.pages;

import health.hiDoctor.utilities.BrowserUtils;
import health.hiDoctor.utilities.ConfigurationReader;
import health.hiDoctor.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    public String title = "HiDoctor: Online Psikolog | Diyetisyen!";
    public String bannerTextAtTheTop = "Sen De Modunu Yakala Diye İlk Psikolog Seansının %25'i Bizden Hediye!";

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



}
