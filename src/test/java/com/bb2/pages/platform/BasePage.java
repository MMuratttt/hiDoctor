package com.bb2.pages.platform;

import com.bb2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div/nav/ul/div[1]/p")
    public WebElement DASHBOARD;

    @FindBy(id = "extra-button")
    public WebElement THREE_DOTS;


}
