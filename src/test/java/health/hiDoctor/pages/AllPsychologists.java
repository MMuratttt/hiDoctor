package health.hiDoctor.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllPsychologists extends BasePage{

    @FindBy(xpath = "//div[@class=' flex items-center py-3 ']/span[3]")
    public WebElement ALL_PSYCHOLOGISTS_TITLE;

    @FindBy(xpath = "//a[contains(@data-testid,'HiDoctor-logo-link-')]")
    public static WebElement HIDOCTOR_MAINPAGE_ICON;


}
