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

}
