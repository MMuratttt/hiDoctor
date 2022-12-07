package com.hiDoctor.step_definitions;

import com.hiDoctor.pages.MainPage;
import com.hiDoctor.utilities.BrowserUtils;
import com.hiDoctor.utilities.ConfigurationReader;
import com.hiDoctor.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Login_StepDefs {

    MainPage mainPage = new MainPage();
    Random random = new Random();

    @Given("User is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("platformURL"));
    }

    @When("User clicks on Login Register")
    public void user_clicks_on_login_register() {
        mainPage.LOGIN_REGISTER.click();
        BrowserUtils.waitForVisibility(mainPage.LOGIN, 10);
    }

    @Then("Login iFrame is displayed")
    public void login_i_frame_is_displayed() {
        Assert.assertTrue(mainPage.LOGIN.isDisplayed());
    }

    @Then("User clicks on Sign Up")
    public void user_clicks_on_sign_up() {
        mainPage.SIGN_UP.click();
    }

    @Then("User can open, read and accept all acknowledge texts")
    public void user_can_open_read_and_accept_all_acknowledge_texts() throws InterruptedException {
        mainPage.CLARIFICATION_TEXT.click();
        BrowserUtils.waitForVisibility(mainPage.TEXT_CLOSE, 10);
        Assert.assertEquals(mainPage.clarificationTextHeader, "Aydınlatma Metni");
        mainPage.TEXT_CLOSE.click();

        mainPage.APPLICATION_TERMS_OF_USE_TEXT.click();
        BrowserUtils.waitForVisibility(mainPage.ACCEPT_TEXT, 10);
        Assert.assertEquals(mainPage.applicationTermOfUseTextHeader, "Uygulama Kullanım Koşulları");
        mainPage.ACCEPT_TEXT.click();

        mainPage.CONSENT_FOR_PROCESSING_DATA_TEXT.click();
        BrowserUtils.waitForVisibility(mainPage.ACCEPT_TEXT, 10);
        Assert.assertEquals(mainPage.consentForProcessingDataTextHeader, "Sağlık Verilerinin İşlenmesi İzni");
        mainPage.ACCEPT_TEXT.click();

        mainPage.COMMERCIAL_PERMISSION_TEXT.click();
        BrowserUtils.waitForVisibility(mainPage.ACCEPT_TEXT, 10);
        Assert.assertEquals(mainPage.commercialPermissionTextHeader, "Ticari İleti ve Kişiye Özel Pazarlama İzni");
        mainPage.ACCEPT_TEXT.click();
    }

    @Then("Checkboxes should be clickable and user unclick every checboxes")
    public void checkboxes_should_be_clickable_and_user_unclick_every_checboxes() {
        BrowserUtils.waitForClickablility(mainPage.APPLICATION_TERMS_OF_USE_CHECKBOX, 10);
        mainPage.APPLICATION_TERMS_OF_USE_CHECKBOX.click();

        BrowserUtils.waitForClickablility(mainPage.CONSENT_FOR_PROCESSING_DATA_CHECKBOX, 10);
        mainPage.CONSENT_FOR_PROCESSING_DATA_CHECKBOX.click();

        BrowserUtils.waitForClickablility(mainPage.COMMERCIAL_PERMISSION_CHECKBOX, 10);
        mainPage.COMMERCIAL_PERMISSION_CHECKBOX.click();
    }

    @When("User clicks on country code dropdown for select a different country than default")
    public void user_clicks_on_country_code_dropdown_for_select_a_different_country_than_default() {
        mainPage.ENTER_COUNTRY_CODE_BOX.click();
    }

    @When("User selects a random country")
    public void user_selects_a_random_country() {
        List<WebElement> countryList = Driver.getDriver().findElements(By.xpath("//*[@id=\"register\"]/div[1]/div/div[2]/ul/li"));
        int randomCountryCode = random.nextInt(countryList.size());
        WebElement RANDOM_COUNTRY = countryList.get(randomCountryCode);
        BrowserUtils.scrollToElement(RANDOM_COUNTRY);
        RANDOM_COUNTRY.click();
    }

    @When("User selects country {string} that his phone registered")
    public void user_selects_country_that_his_phone_registered(String userCountry) {
        userCountry = ConfigurationReader.getProperty("userCountry");
        mainPage.ENTER_COUNTRY_CODE_BOX.click();
        mainPage.ENTER_COUNTRY.sendKeys(userCountry);
        mainPage.TOP_OF_COUNTRY_LIST.click();
    }

    @When("User clicks on Sign Up inside")
    public void user_clicks_on_sign_up_inside() {
        mainPage.SIGN_UP_INNER_PAGE.click();
    }

    @Then("The phone frame becomes red")
    public void the_phone_frame_becomes_red() {
        Assert.assertTrue(mainPage.RED_FRAME_PHONE.isDisplayed());
    }

    @When("User enters his number {string}")
    public void user_enters_his_number(String userPhone) {
        userPhone = ConfigurationReader.getProperty("userPhoneNumber");
        mainPage.USER_PHONE_NUMBER.sendKeys(userPhone);
    }

    @Then("Mandatory texts become red")
    public void mandatory_texts_become_red() {
        Assert.assertTrue(mainPage.RED_TEXT_ERROR_1.isDisplayed());
        Assert.assertTrue(mainPage.RED_TEXT_ERROR_2.isDisplayed());
    }

    @When("User clicks on mandatory checkboxes")
    public void user_clicks_on_mandatory_checkboxes() {
        mainPage.APPLICATION_TERMS_OF_USE_CHECKBOX.click();
        mainPage.CONSENT_FOR_PROCESSING_DATA_CHECKBOX.click();
    }

    @Then("User should see the counter and popup message OTP code sent successfully")
    public void user_should_see_the_counter_and_popup_message_otp_code_sent_successfully() {
        BrowserUtils.waitForVisibility(mainPage.OTP_COUNTER,10);
        String expectedResult = "Verification code sent to your number successfully";
     //   String actualResult = mainPage.OTP_SENT_POPUP_TEXT.getText();
     //   Assert.assertEquals(expectedResult,actualResult);
    }

    @Then("User should see the exact phone number which already entered")
    public void user_should_see_the_exact_number_which_already_entered() {
        String expectedResult = ConfigurationReader.getProperty("userCountryCode") + ConfigurationReader.getProperty("userPhoneNumber");
        String actualResult = mainPage.FULL_PHONE.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @When("User enters the OTP code")
    public void user_enters_the_otp_code() {

    }

    @Then("User should land on main page as signed in")
    public void user_should_land_on_main_page_as_signed_in() {

    }

    @When("User clicks Edit Mobile Number")
    public void user_clicks_edit_mobile_number() {

    }

    @When("User clicks on Sign in inside")
    public void user_clicks_on_sign_in_inside() {

    }

    @When("User enters a random number")
    public void user_enters_a_random_number() {

    }

    @When("User clicks on all checkboxes")
    public void user_clicks_on_all_checkboxes() {

    }

    @Then("Resend Code should not clickable")
    public void resend_code_should_not_clickable() {

    }

    @Then("User waits until the code has expired")
    public void user_waits_until_the_code_has_expired() {

    }

    @Then("User clicks on Resend Code")
    public void user_clicks_on_resend_code() {

    }


    @When("User selects a random country with entering country code")
    public void user_selects_a_random_country_with_entering_country_code() {

    }

    @When("User tries to enter letters and characters")
    public void user_tries_to_enter_letters_and_characters() {

    }

    @When("User enters a number with more or less than required phone characters")
    public void user_enters_a_number_with_more_or_less_than_required_phone_characters() {

    }

    @When("User clicks on Login")
    public void user_clicks_on_login() {

    }

    @Then("Please enter a valid mobile number error is displayed")
    public void please_enter_a_valid_mobile_number_error_is_displayed() {

    }

    @When("User enters his number <phoneNumber>")
    public void user_enters_his_number_phone_number() {

    }

    @When("User enters an invalid OTP code")
    public void user_enters_an_invalid_otp_code() {

    }

    @Then("The verification code is invalid error message should be displayed")
    public void the_verification_code_is_invalid_error_message_should_be_displayed() {

    }


}
