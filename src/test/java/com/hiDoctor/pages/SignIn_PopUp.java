package com.hiDoctor.pages;

import com.hiDoctor.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_PopUp extends MainPage{

    public SignIn_PopUp() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"login\"]/div[2]/button")
    public WebElement LOGIN;

    @FindBy(xpath = "//*[@id=\"login\"]/div[3]/a")
    public WebElement SIGN_UP;


}
