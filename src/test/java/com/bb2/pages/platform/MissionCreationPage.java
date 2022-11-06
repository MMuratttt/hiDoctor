package com.bb2.pages.platform;

import com.bb2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MissionCreationPage {

    public MissionCreationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "title")
    public WebElement TITLE;

    @FindBy(name = "goal")
    public WebElement SUMMARY;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[4]/div/div/div[2]/div/div/div[3]/button")
    public WebElement ADD_REWARD_BLOCK;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[4]/div/div/div[2]/div/div/div[3]/div/div/div[4]/button")
    public WebElement ADD_ACTION;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[2]/div[6]/div/button")
    public WebElement GENERAL_TEXT;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/div[2]/div[2]/div[2]/button")
    public WebElement ADD_ACTION_2;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[3]/div[2]/button[2]")
    public WebElement PUBLISH;




}
