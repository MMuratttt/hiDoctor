package com.hiDoctor.pages;

import com.hiDoctor.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "flex -space-x-2")
    public WebElement PROFILE;

    @FindBy(className = "btn btn-primary text-xs")
    public WebElement LOGIN_REGISTER;

    @FindBy(className = "pt-6 hidden-scrollbar max-h-screen bg-white rounded-xl rounded-b-none md:rounded-b-xl relative")
    public WebElement SIGN_IN_IFRAME;

    @FindBy(className = "flex justify-center items-center cursor-pointer")
    public WebElement COUNTRY_CODE;

    @FindBy(name = "mobile.phoneNumber")
    public WebElement PHONE_NUMBER;

    @FindBy(className = "btn btn-primary btn-lg w-full h-14 text-base font-semibold")
    public WebElement LOGIN;

    @FindBy(className = "px-1 text-base text-primary-500 underline cursor-pointer font-semibold")
    public WebElement SIGN_UP;

    @FindBy(partialLinkText = "Clarification Text")
    public WebElement CLARIFICATION_TEXT;

    @FindBy(id = "headlessui-dialog-panel-:rl:")
    public WebElement TEXT_IFRAME;

    @FindBy(className = "absolute top-1 right-4 md:right-0 inline-block p-1 border border-transparent text-gray-500 hover:text-gray-800 hover:border-gray-500 rounded-full cursor-pointer transition-all ease-out")
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



    @FindBy(className = "text-2xl font-bold mt-2")
    public String USER_PHONE_NUMBER;







}
