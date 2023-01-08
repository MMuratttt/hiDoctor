package health.hiDoctor.pages.headers;

import health.hiDoctor.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class B2bApplication extends BasePage {
    public String expectedPageTitle = "Kurumsal Psikolog Paketleri | Psikolog Ücretleri | HiDoctor";
    public String expectedB2bBannerText = "Çalışan Mutluluğu Paketi";

    @FindBy(xpath = "//img[@alt='B2B-Banner-desktop']")
    public WebElement B2B_BANNER;

    @FindBy(xpath = "//h1[@class='text-xl font-bold text-white lg:text-5xl']")
    public WebElement B2B_BANNER_TEXT;

    @FindBy(xpath = "//button[@class='btn btn-white w-48 text-sm font-semibold sm:w-64']")
    public WebElement GET_OFFER_FREE_BUTTON;

    @FindBy(xpath = "//h3[.='Kurumsal İş Birliği Başvuru Formu']")
    public WebElement CORPORATE_APPLICATION_FORM_HEADER;

    @FindBy(xpath = "//h3[@class='pb-2 text-center text-xl font-semibold text-gray-500 md:text-3xl']")
    public WebElement OUR_PARTNERS;

    @FindBy(xpath = "//div[@class='mt-8 pb-8 md:mt-24']/div/div")
    public List<WebElement> EVERY_PARTNER;

    @FindBy(xpath = "//h3[@class='mb-10 text-center text-lg font-medium text-black md:text-4xl']")
    public WebElement WHY_HIDOCTOR;

    @FindBy(xpath = "//div[@class='flex flex-wrap justify-between']/div")
    public List<WebElement> WHY_HIDOCTOR_ANSWERS;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[4]/div[2]/div[1]/h3")
    public WebElement HOW_TO_USE;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[4]/div[2]/div[1]/div/p")
    public List<WebElement> HOW_TO_USE_ANSWERS;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[4]/div[3]/h3")
    public WebElement ALL_SECURE_PRIVATE;

    @FindBy(xpath = "//div[@class='text-sm leading-5 text-gray-500']/p")
    public List<WebElement> ALL_SECURE_PRIVATE_TEXT;

    @FindBy(id = "company")
    public WebElement COMPANY;

    @FindBy(id = "first_name")
    public WebElement FIRST_NAME;

    @FindBy(id = "last_name")
    public WebElement LAST_NAME;

    @FindBy(id = "phone")
    public WebElement PHONE_NUMBER;

    @FindBy(id = "email")
    public WebElement EMAIL_ADDRESS;

    @FindBy(id = "desc")
    public WebElement DESCRIPTION;

    @FindBy(xpath = "//button[@class='btn btn-primary h-12 w-full']")
    public WebElement SUBMIT_BUTTON;

    @FindBy(xpath = "//*[@id=\"1\"]")
    public WebElement SUCCESS_MESSAGE;

    @FindBy(xpath = "//*[@id=\"2\"]")
    public WebElement PHONE_ALREADY_REGISTERED_MESSAGE;

    @FindBy(xpath = "//*[@id=\"3\"]")
    public WebElement INVALID_SUBMIT_MESSAGE;






}
