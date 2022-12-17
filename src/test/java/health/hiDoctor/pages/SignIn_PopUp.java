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

    @FindBy(xpath = "//*[@id=\"login\"]/div[1]/div/div/div/div[1]")
    public WebElement ENTER_COUNTRY_CODE_BOX;

    @FindBy(xpath = "//*[@id=\"login\"]/div[1]/div/div[2]/div/div/div[1]/input")
    public WebElement ENTER_COUNTRY;

    @FindBy(xpath = "//*[@id=\"login\"]/div[1]/div/div[2]/ul/li[1]")
    public WebElement TOP_OF_COUNTRY_LIST;

}
