package health.hiDoctor.pages;

import health.hiDoctor.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class Footer extends BasePage {

    public Footer() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
