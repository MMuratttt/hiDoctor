package com.bb2.pages.mobile;

import com.bb2.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageM {

    public LoginPageM() {
        PageFactory.initElements(Driver.getMobileDriver(),this);
    }



}
