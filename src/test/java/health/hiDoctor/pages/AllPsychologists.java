package health.hiDoctor.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllPsychologists extends BasePage{

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[1]/div/div[2]/span[3]")
    public WebElement ALL_PSYCHOLOGISTS_TITLE;


}
