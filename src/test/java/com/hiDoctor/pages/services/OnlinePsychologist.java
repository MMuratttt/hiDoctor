package com.hiDoctor.pages.services;

import com.hiDoctor.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class OnlinePsychologist {

    public OnlinePsychologist() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
