package com.hiDoctor.pages;

import com.github.javafaker.Faker;
import com.hiDoctor.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String clarificationTextHeader = "Aydınlatma Metni";
    public String applicationTermOfUseTextHeader = "Uygulama Kullanım Koşulları";
    public String consentForProcessingDataTextHeader = "Sağlık Verilerinin İşlenmesi İzni";
    public String commercialPermissionTextHeader = "Ticari İleti ve Kişiye Özel Pazarlama İzni";

    public String OTPCodeSentSuccessfullyText = "Doğrulama kodu başarıyla telefonunuza gönderildi";

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

    @FindBy(xpath = "//*[@id=\"headlessui-dialog-panel-:r3:\"]/div/div[1]/span")
    public WebElement TEXT_CLOSE;

    @FindBy(xpath = "//*[@id=\"register\"]/div[2]/div[1]/div/p/a")
    public WebElement CLARIFICATION_TEXT;

    @FindBy(xpath = "//*[@id=\"register\"]/div[2]/div[1]/div/div[1]/label/a")
    public WebElement APPLICATION_TERMS_OF_USE_TEXT;

    @FindBy(xpath = "//*[@id=\"register\"]/div[2]/div[1]/div/div[2]/label/a")
    public WebElement CONSENT_FOR_PROCESSING_DATA_TEXT;

    @FindBy(xpath = "//*[@id=\"register\"]/div[2]/div[1]/div/div[3]/label/a")
    public WebElement COMMERCIAL_PERMISSION_TEXT;

    @FindBy(className = "font-semibold text-primary-500 text-lg")
    public WebElement CLARIFICATION_TEXT_TITLE;

    @FindBy(xpath = "//*[@id=\"headlessui-dialog-panel-:rj:\"]/div/div[1]/div/span")
    public WebElement APPLICATION_TERMS_OF_USE_TEXT_TITLE;

    @FindBy(xpath = "//*[@id=\"headlessui-dialog-panel-:rj:\"]/div/div[1]/div/span")
    public WebElement CONSENT_FOR_PROCESSING_DATA_TEXT_TITLE;

    @FindBy(xpath = "//*[@id=\"headlessui-dialog-panel-:rl:\"]/div/div[1]/div/span")
    public WebElement COMMERCIAL_PERMISSION_TEXT_TITLE;

    @FindBy(xpath = "//button[@class='btn btn-secondary h-14 text-base font-semibold absolute left-4 right-4 bottom-4 ']")
    public WebElement ACCEPT_TEXT;

    @FindBy(id = "agreement-2")
    public WebElement APPLICATION_TERMS_OF_USE_CHECKBOX;

    @FindBy(id = "agreement-3")
    public WebElement CONSENT_FOR_PROCESSING_DATA_CHECKBOX;

    @FindBy(id = "agreement-4")
    public WebElement COMMERCIAL_PERMISSION_CHECKBOX;

    @FindBy(xpath = "//*[@id=\"register\"]/div[1]/div/div/div/div[1]")
    public WebElement ENTER_COUNTRY_CODE_BOX;

    @FindBy(xpath = "//*[@id=\"register\"]/div[1]/div/div[2]/div/div/div[1]/input")
    public WebElement ENTER_COUNTRY;

    @FindBy(xpath = "//*[@id=\"register\"]/div[1]/div/div[2]/ul/li")
    public WebElement TOP_OF_COUNTRY_LIST;

    @FindBy(xpath = "//*[@id=\"register\"]/div[2]/div[2]/button")
    public WebElement SIGN_UP_INNER_PAGE;

    @FindBy(xpath = "//*[@id=\"register\"]/div[1]/div/div")
    public WebElement RED_FRAME_PHONE;

    @FindBy(xpath = "//*[@id=\"1\"]/div[1]") //    //*[@id="1"]/div[1]    //*[@id="1"]/div[1]/div[1]    //*[@id="1"]/div[1]/div[2]
    public WebElement OTP_SENT_POPUP_TEXT;

    @FindBy(xpath = "//*[@id=\"register\"]/div/div[1]/div[3]/div[2]")
    public WebElement OTP_COUNTER;

    @FindBy(name = "mobile.phoneNumber")
    public WebElement USER_PHONE_NUMBER;

    @FindBy(xpath = "//*[@id=\"register\"]/div[2]/div[1]/div/div[1]/label")
    public WebElement RED_TEXT_ERROR_1;

    @FindBy(xpath = "//*[@id=\"register\"]/div[2]/div[1]/div/div[2]/label")
    public WebElement RED_TEXT_ERROR_2;

    @FindBy(xpath = "//*[@id=\"register\"]/div/div[1]/div[2]")
    public WebElement FULL_PHONE;

    @FindBy(xpath = "//input[@aria-label='Please enter verification code. Digit 1']")
    public WebElement OTP_DIGIT_1;

    @FindBy(xpath = "//input[@aria-label='Digit 2']")
    public WebElement OTP_DIGIT_2;

    @FindBy(xpath = "//input[@aria-label='Digit 3']")
    public WebElement OTP_DIGIT_3;

    @FindBy(xpath = "//input[@aria-label='Digit 4']")
    public WebElement OTP_DIGIT_4;

    @FindBy(xpath = "//input[@aria-label='Digit 5']")
    public WebElement OTP_DIGIT_5;

    @FindBy(xpath = "//input[@aria-label='Digit 6']")
    public WebElement OTP_DIGIT_6;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]")
    public WebElement PROFILE;

    @FindBy(xpath = "//*[@id=\"register\"]/div/div[3]/button[1]")
    public WebElement RESEND_CODE_BUTTON;

    @FindBy(xpath = "//*[@id=\"register\"]/div/div[3]/button[2]")
    public WebElement EDIT_PHONE_NUMBER;

    @FindBy(xpath = "//*[@id=\"register\"]/div[2]/div[3]/a")
    public WebElement SIGN_IN_INSIDE;


}
