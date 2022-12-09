package com.hiDoctor.pages.headers;

import com.hiDoctor.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class B2bApplication {

    public B2bApplication() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
