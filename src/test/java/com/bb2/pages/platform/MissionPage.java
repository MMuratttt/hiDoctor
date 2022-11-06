package com.bb2.pages.platform;

import com.bb2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MissionPage {

    public MissionPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div[1]/div[2]/button[2]")
    public WebElement CREATE_MISSION;



}
