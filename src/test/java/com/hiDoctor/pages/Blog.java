package com.hiDoctor.pages;

import com.hiDoctor.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class Blog {

    public Blog() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
