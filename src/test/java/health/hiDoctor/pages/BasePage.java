package health.hiDoctor.pages;

import health.hiDoctor.utilities.BrowserUtils;
import health.hiDoctor.utilities.ConfigurationReader;
import health.hiDoctor.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    MainPage mainPage = new MainPage();
    SignIn_PopUp signIn_popUp = new SignIn_PopUp();
    SignUp_PopUp signUp_popUp = new SignUp_PopUp();

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[2]/div/div[2]/div/button")
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

    public String areYouSureLogout = "Çıkış yapmak istediğinizden emin misiniz?";

    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("platformURL"));
        LOGIN_REGISTER.click();
        BrowserUtils.waitForVisibility(signIn_popUp.LOGIN, 10);
        signUp_popUp.ENTER_COUNTRY_CODE_BOX.click();
        signUp_popUp.ENTER_COUNTRY.sendKeys(ConfigurationReader.getProperty("userCountry"));
        signUp_popUp.TOP_OF_COUNTRY_LIST.click();
        signUp_popUp.USER_PHONE_NUMBER.clear();
        signUp_popUp.USER_PHONE_NUMBER.sendKeys(ConfigurationReader.getProperty("userPhoneNumber"));
        signIn_popUp.LOGIN.click();
    }

    public void logout(){
        PROFILE.click();
        LOGOUT.click();
        YES.click();
    }

}
