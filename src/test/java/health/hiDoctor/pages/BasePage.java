package health.hiDoctor.pages;

import health.hiDoctor.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[2]/div/div[2]/div/button")
    public WebElement LOGIN_REGISTER;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[2]/div/div[2]/div/div[3]/div[1]")
    public WebElement PROFILE;

}
