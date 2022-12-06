package com.hiDoctor.pages;

import com.hiDoctor.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[2]/div/div[2]/div/button[2]")
    public WebElement LOGIN_REGISTER;

    @FindBy(xpath = "//*[@id=\"headlessui-dialog-panel-:r3:\"]/div[1]")
    public WebElement SIGN_IN_IFRAME;

    @FindBy(className = "flex justify-center items-center cursor-pointer")
    public WebElement COUNTRY_CODE;

    @FindBy(name = "mobile.phoneNumber")
    public WebElement PHONE_NUMBER;

    @FindBy(xpath = "//*[@id=\"login\"]/div[2]/button")
    public WebElement LOGIN;

    @FindBy(xpath = "//*[@id=\"login\"]/div[3]/a")
    public WebElement SIGN_UP;

    @FindBy(partialLinkText = "Clarification Text")
    public WebElement CLARIFICATION_TEXT;

    @FindBy(id = "headlessui-dialog-panel-:rl:")
    public WebElement TEXT_IFRAME;

    @FindBy(xpath = "//*[@id=\"headlessui-dialog-panel-:r9:\"]/div/div[1]/div/span")
    public WebElement TEXT_TITLE;

    public String clarificationTextHeader= "Aydınlatma Metni";

    @FindBy(xpath = "//*[@id=\"headlessui-dialog-panel-:r5:\"]/div/div[1]/span/svgt")
    public WebElement TEXT_CLOSE;

    @FindBy(partialLinkText = "Application Terms of Use")
    public WebElement APPLICATION_TERMS_OF_USE_TEXT;

    @FindBy(id = "agreement-2")
    public WebElement APPLICATION_TERMS_OF_USE_CHECKBOX;

    @FindBy(className = "btn btn-secondary h-14 text-base font-semibold absolute left-4 right-4 bottom-4 ")
    public WebElement ACCEPT_TEXT;

    @FindBy(partialLinkText = "Consent For Processing Health Data")
    public WebElement CONSENT_FOR_PROCESSING_DATA_TEXT;

    @FindBy(id = "agreement-3")
    public WebElement CONSENT_FOR_PROCESSING_DATA_CHECKBOX;

    @FindBy(partialLinkText = "Commercial Communication and Personal Marketing Permission")
    public WebElement COMMERCIAL_PERMISSION_TEXT;

    @FindBy(id = "agreement-4")
    public WebElement COMMERCIAL_PERMISSION_CHECKBOX;

    public String countryName;  // need country data for random selection

    public String countryCode;  // need country code data for random selection

    @FindBy(xpath = "//*[@id=\"register\"]/div[1]/div/div[2]/div/div/div[1]")
    public String ENTER_COUNTRY_CODE_BOX;

    @FindBy(className = "px-1 text-sm text-gray-600 underline cursor-pointer")
    public String SIGN_IN;

    @FindBy(className = "text-field has-error size-lg")
    public String RED_FRAME_PHONE;  // verify its visibility

    @FindBy(className = "text-xs flex-1 text-error")
    public String RED_TEXT_ERROR;  // verift its visibility

    @FindBy(id = "2")
    public String OTP_SENT_POPUP;

    @FindBy(xpath = "//*[@id=\"2\"]/div[1]/div[2]")
    public String OTP_SENT_POPUP_TEXT;

    @FindBy(className = "font-bold text-xl")
    public String OTP_COUNTER;

    @FindBy(className = "text-2xl font-bold mt-2")
    public String USER_PHONE_NUMBER;

    @FindBy(xpath = "//input[@aria-label='Please enter verification code. Digit 1']")
    public String OTP_DIGIT_1;

    @FindBy(xpath = "//input[@aria-label='Digit 2']")
    public String OTP_DIGIT_2;

    @FindBy(xpath = "//input[@aria-label='Digit 3']")
    public String OTP_DIGIT_3;

    @FindBy(xpath = "//input[@aria-label='Digit 4']")
    public String OTP_DIGIT_4;

    @FindBy(xpath = "//input[@aria-label='Digit 5']")
    public String OTP_DIGIT_5;

    @FindBy(xpath = "//input[@aria-label='Digit 6']")
    public String OTP_DIGIT_6;

    @FindBy(className = "flex -space-x-2")
    public WebElement PROFILE;






}
