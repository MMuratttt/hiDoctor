package health.hiDoctor.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BecomeAConsultant extends BasePage {

    @FindBy(xpath = "//div[@id='applicationForm']/h1")
    public WebElement HEADER;

    public String header = "Danışman Başvuru Formu";


}
