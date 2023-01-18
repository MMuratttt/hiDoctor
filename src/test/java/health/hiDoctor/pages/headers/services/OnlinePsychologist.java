package health.hiDoctor.pages.headers.services;

import health.hiDoctor.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlinePsychologist extends BasePage {

    public String onlinePsychologistPageTitle = "Online Psikolog ile Online Terapi Ayarla | HiDoctor";

    @FindBy(xpath = "//button[contains(@id,'headlessui-disclosure-button-:r')]/../../h4")
    public WebElement FAQ_TITLE;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[1]")
    public WebElement QUESTION_ONE_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[2]")
    public WebElement QUESTION_TWO_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[3]")
    public WebElement QUESTION_THREE_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[4]")
    public WebElement QUESTION_FOUR_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[5]")
    public WebElement QUESTION_FIVE_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[6]")
    public WebElement QUESTION_SIX_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[7]")
    public WebElement QUESTION_SEVEN_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[8]")
    public WebElement QUESTION_EIGHT_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[9]")
    public WebElement QUESTION_NINE_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[1]/span")
    public WebElement QUESTION_ONE_TEXT;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[2]/span")
    public WebElement QUESTION_TWO_TEXT;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[3]/span")
    public WebElement QUESTION_THREE_TEXT;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[4]/span")
    public WebElement QUESTION_FOUR_TEXT;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[5]/span")
    public WebElement QUESTION_FIVE_TEXT;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[6]/span")
    public WebElement QUESTION_SIX_TEXT;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[7]/span")
    public WebElement QUESTION_SEVEN_TEXT;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[8]/span")
    public WebElement QUESTION_EIGHT_TEXT;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[9]/span")
    public WebElement QUESTION_NINE_TEXT;

    public String FAQ_Title = "Sıkça Sorulan Sorular";
    public String questionOne = "Online Psikologlar hakkında nasıl bilgi alabilirim?";
    public String questionTwo = "Danışmanımı seçtim. Ödemeyi nasıl gerçekleştireceğim?";
    public String questionThree = "18 yaşından küçüğüm. Online danışmanlık hizmetinden yararlanabilir miyim?";
    public String questionFour = "Online Psikolog hizmeti hangi yöntemlerle gerçekleşmektedir?";
    public String questionFive = "Online Psikolog hizmetinden nasıl yararlanabilirim?";
    public String questionSix = "Online Psikolog görüşmelerim kayıt altına alınıyor mu?";
    public String questionSeven = "Online Psikoloğumla hangi saatler içerisinde görüşebilirim?";
    public String questionEight = "HiDoctor Online Psikolog hizmetini hangi durumlarda kullanmamalıyım?";
    public String questionNine = "HiDoctor ile nasıl iletişime geçebilirim?";




}
