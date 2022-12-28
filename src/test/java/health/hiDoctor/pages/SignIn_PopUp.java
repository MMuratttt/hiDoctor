package health.hiDoctor.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SignIn_PopUp extends MainPage {

    Random random = new Random();
    Faker faker = new Faker();

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

    @FindBy(xpath = "//div[@id='1']/div/div[2]")
    public WebElement INVALID_PHONE_TEXT;

    @FindBy(xpath = "//div[@id='3']/div/div[2]")
    public WebElement INVALID_OTP_TEXT;

    public String invalidOTPText = "Doğrulama kodu geçersiz";

    public String PHONE_NUMBER_MORE_LESS() {
        List<String> phoneNumberMoreLess = new ArrayList<>();
        phoneNumberMoreLess.add(faker.numerify("######"));
        phoneNumberMoreLess.add(faker.numerify("########"));
        int n = random.nextInt(0, 1);
        return phoneNumberMoreLess.get(n);
    }




}
