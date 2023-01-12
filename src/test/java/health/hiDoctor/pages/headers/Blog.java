package health.hiDoctor.pages.headers;

import health.hiDoctor.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Blog extends BasePage {


    public String blogPageTitle = "HiDoctor Blog: Online Psikolog | Online Diyetisyen | Bilgi ve Sağlık Merkezi";

    @FindBy(xpath = "(//b)[1]")
    public WebElement ONLINE_PSYCHOLOGY_GUIDE_TITLE;


}
