package health.hiDoctor.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Promotion extends BasePage{

    @FindBy(xpath = "(//img[@data-testid='promotion-test-img'])[1]")
    public WebElement FIRST_IMAGE_PROMOTION;

}
