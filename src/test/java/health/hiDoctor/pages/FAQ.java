package health.hiDoctor.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FAQ extends BasePage{

    @FindBy(xpath = "//h1[@class='mb-8 mt-0 text-center text-xl font-semibold text-gray-600 md:mt-8 md:mb-8']")
    public WebElement FAQ_TITLE;

}
