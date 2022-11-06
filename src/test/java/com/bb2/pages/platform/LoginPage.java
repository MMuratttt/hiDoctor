package com.bb2.pages.platform;

import com.bb2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "email")
    public WebElement USERNAME;

    @FindBy(name = "password")
    public WebElement PASSWORD;

    @FindBy(xpath = "//button[@data-testid='login-submit-button']")
    public WebElement SUBMIT_BUTTON;



}
