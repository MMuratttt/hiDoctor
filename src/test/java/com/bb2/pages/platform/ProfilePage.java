package com.bb2.pages.platform;

import com.bb2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    public ProfilePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "mui-6")
    public WebElement EMAIL;

}
