package health.hiDoctor.pages;

import health.hiDoctor.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_PopUp extends MainPage{


    @FindBy(xpath = "//*[@id=\"login\"]/div[2]/button")
    public WebElement LOGIN;

    @FindBy(xpath = "//*[@id=\"login\"]/div[3]/a")
    public WebElement SIGN_UP;


}
