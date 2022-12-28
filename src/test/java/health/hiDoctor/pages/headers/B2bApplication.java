package health.hiDoctor.pages.headers;

import health.hiDoctor.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class B2bApplication extends BasePage {
    public String expectedPageTitle = "Kurumsal Psikolog Paketleri | Psikolog Ücretleri | HiDoctor";
    public String expectedB2bBannerText = "Çalışan Mutluluğu Paketi";

    @FindBy(xpath = "//img[@alt='B2B-Banner-desktop']")
    public WebElement B2B_BANNER;

    @FindBy(xpath = "//h1[@class='text-white text-xl lg:text-5xl font-bold']")
    public WebElement B2B_BANNER_TEXT;

    @FindBy(xpath = "//button[@class='btn btn-white text-sm font-semibold w-48 sm:w-64']")
    public WebElement GET_OFFER_FREE_BUTTON;

    @FindBy(xpath = "//h3[.='Kurumsal İş Birliği Başvuru Formu']")
    public WebElement CORPORATE_APPLICATION_FORM_HEADER;

    @FindBy(xpath = "//h3[@class='text-gray-500 text-xl md:text-3xl font-semibold text-center pb-2']")
    public WebElement OUR_PARTNERS_TEXT;

    @FindBy(xpath = "//div[@class='mt-8 md:mt-24 pb-8']/div/div")
    public List<WebElement> EVERY_PARTNER;


//div[@class='mt-8 md:mt-24 pb-8']/div/div

}
