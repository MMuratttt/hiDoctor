package health.hiDoctor.step_definitions;

import com.github.javafaker.Faker;
import health.hiDoctor.pages.BasePage;
import health.hiDoctor.pages.MainPage;
import health.hiDoctor.pages.SignIn_PopUp;
import health.hiDoctor.pages.SignUp_PopUp;
import health.hiDoctor.utilities.BrowserUtils;
import health.hiDoctor.utilities.ConfigurationReader;
import health.hiDoctor.utilities.Driver;
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
    SignIn_PopUp signIn_popUp = new SignIn_PopUp();
    SignUp_PopUp signUp_popUp = new SignUp_PopUp();
    Random random = new Random();
    Faker faker = new Faker();

    @Given("User is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("platformURL"));
    }

    @When("User clicks on Login Register")
    public void user_clicks_on_login_register() {
        mainPage.LOGIN_REGISTER.click();
        BrowserUtils.waitForVisibility(signIn_popUp.LOGIN, 10);
    }

    @Then("Login iFrame is displayed")
    public void login_i_frame_is_displayed() {
        Assert.assertTrue(signIn_popUp.LOGIN.isDisplayed());
    }

    @Then("User clicks on Sign Up")
    public void user_clicks_on_sign_up() {
        signIn_popUp.SIGN_UP.click();
    }

    @Then("User can open, read and accept all acknowledge texts")
    public void user_can_open_read_and_accept_all_acknowledge_texts() throws InterruptedException {
        signUp_popUp.CLARIFICATION_TEXT.click();
        BrowserUtils.waitForVisibility(signUp_popUp.TEXT_TITLE_FOR_ALL, 10);
        Assert.assertEquals(signUp_popUp.clarificationTextHeader, signUp_popUp.TEXT_TITLE_FOR_ALL.getAttribute("textContent"));  //getAttribute("textContent") //getText()
        signUp_popUp.TEXT_CLOSE.click();

        signUp_popUp.APPLICATION_TERMS_OF_USE_TEXT.click();
        BrowserUtils.waitForVisibility(signUp_popUp.TEXT_TITLE_FOR_ALL, 10);
        Assert.assertEquals(signUp_popUp.applicationTermOfUseTextHeader, signUp_popUp.TEXT_TITLE_FOR_ALL.getAttribute("textContent"));
        signUp_popUp.ACCEPT_TEXT.click();

        signUp_popUp.CONSENT_FOR_PROCESSING_DATA_TEXT.click();
        BrowserUtils.waitForVisibility(signUp_popUp.TEXT_TITLE_FOR_ALL, 10);
        Assert.assertEquals(signUp_popUp.consentForProcessingDataTextHeader, signUp_popUp.TEXT_TITLE_FOR_ALL.getAttribute("textContent"));
        signUp_popUp.ACCEPT_TEXT.click();

        signUp_popUp.COMMERCIAL_PERMISSION_TEXT.click();
        BrowserUtils.waitForVisibility(signUp_popUp.TEXT_TITLE_FOR_ALL, 10);
        Assert.assertEquals(signUp_popUp.commercialPermissionTextHeader, signUp_popUp.TEXT_TITLE_FOR_ALL.getAttribute("textContent"));
        signUp_popUp.ACCEPT_TEXT.click();
    }

    @Then("Checkboxes should be clickable and user unclick every checboxes")
    public void checkboxes_should_be_clickable_and_user_unclick_every_checboxes() {
        BrowserUtils.waitForClickablility(signUp_popUp.APPLICATION_TERMS_OF_USE_CHECKBOX, 10);
        signUp_popUp.APPLICATION_TERMS_OF_USE_CHECKBOX.click();

        BrowserUtils.waitForClickablility(signUp_popUp.CONSENT_FOR_PROCESSING_DATA_CHECKBOX, 10);
        signUp_popUp.CONSENT_FOR_PROCESSING_DATA_CHECKBOX.click();

        BrowserUtils.waitForClickablility(signUp_popUp.COMMERCIAL_PERMISSION_CHECKBOX, 10);
        signUp_popUp.COMMERCIAL_PERMISSION_CHECKBOX.click();
    }

    @When("User clicks on country code dropdown for select a different country than default")
    public void user_clicks_on_country_code_dropdown_for_select_a_different_country_than_default() {
        signUp_popUp.ENTER_COUNTRY_CODE_BOX.click();
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
        signUp_popUp.ENTER_COUNTRY_CODE_BOX.click();
        signUp_popUp.ENTER_COUNTRY.sendKeys(userCountry);
        signUp_popUp.TOP_OF_COUNTRY_LIST.click();
    }

    @When("User clicks on Sign Up inside")
    public void user_clicks_on_sign_up_inside() {
        signUp_popUp.SIGN_UP.click();
    }

    @Then("The phone frame becomes red")
    public void the_phone_frame_becomes_red() {
        Assert.assertTrue(signUp_popUp.RED_FRAME_PHONE.isDisplayed());
    }

    @When("User enters his number {string}")
    public void user_enters_his_number(String userPhone) {
        userPhone = ConfigurationReader.getProperty("userPhoneNumber");
        signUp_popUp.USER_PHONE_NUMBER.sendKeys(userPhone);
    }

    @Then("Mandatory texts become red")
    public void mandatory_texts_become_red() {
        Assert.assertTrue(signUp_popUp.RED_TEXT_ERROR_1.isDisplayed());
        Assert.assertTrue(signUp_popUp.RED_TEXT_ERROR_2.isDisplayed());
    }

    @When("User clicks on mandatory checkboxes")
    public void user_clicks_on_mandatory_checkboxes() {
        signUp_popUp.APPLICATION_TERMS_OF_USE_CHECKBOX.click();
        signUp_popUp.CONSENT_FOR_PROCESSING_DATA_CHECKBOX.click();
    }

    @Then("User should see the counter and popup message OTP code sent successfully")
    public void user_should_see_the_counter_and_popup_message_otp_code_sent_successfully() {
        BrowserUtils.waitForVisibility(signUp_popUp.OTP_COUNTER,10);
        String expectedResult = signUp_popUp.OTPCodeSentSuccessfullyText;
        String actualResult = signUp_popUp.OTP_SENT_POPUP_TEXT.getText();
      //  Assert.assertEquals(expectedResult,actualResult);
    }

    @Then("User should see the exact phone number which already entered")
    public void user_should_see_the_exact_number_which_already_entered() {
        String expectedResult = ConfigurationReader.getProperty("userCountryCode") + ConfigurationReader.getProperty("userPhoneNumber");
        String actualResult = signUp_popUp.FULL_PHONE.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @When("User enters the OTP code")
    public void user_enters_the_otp_code() {

    }

    @Then("User should land on main page as signed in")
    public void user_should_land_on_main_page_as_signed_in() {
    //    Assert.assertTrue(mainPage.PROFILE.isDisplayed());
    }

    @When("User clicks Edit Mobile Number")
    public void user_clicks_edit_mobile_number() {
        signUp_popUp.EDIT_PHONE_NUMBER.click();
    }

    @When("User clicks on Sign in inside")
    public void user_clicks_on_sign_in_inside() {
        signUp_popUp.SIGN_IN_INSIDE.click();
    }

    @When("User enters a random number")
    public void user_enters_a_random_number() {
        signUp_popUp.PHONE_NUMBER.sendKeys(faker.phoneNumber()+"");
    }

    @When("User clicks on all checkboxes")
    public void user_clicks_on_all_checkboxes() {
        signUp_popUp.APPLICATION_TERMS_OF_USE_CHECKBOX.click();
        signUp_popUp.CONSENT_FOR_PROCESSING_DATA_CHECKBOX.click();
        signUp_popUp.COMMERCIAL_PERMISSION_CHECKBOX.click();
    }

    @Then("Resend Code should not clickable")
    public void resend_code_should_not_clickable() {
        Assert.assertFalse(signUp_popUp.RESEND_CODE_BUTTON.isEnabled());
    }

    @Then("User waits until the code has expired")
    public void user_waits_until_the_code_has_expired() throws InterruptedException {
        Thread.sleep(12000);
        Assert.assertTrue(signUp_popUp.RESEND_CODE_BUTTON.isEnabled());
    }

    @Then("User clicks on Resend Code")
    public void user_clicks_on_resend_code() {
        signUp_popUp.RESEND_CODE_BUTTON.click();
    }


    @When("User selects a random country with entering country code")
    public void user_selects_a_random_country_with_entering_country_code() {
        faker.country().countryCode2();
    }

    @When("User tries to enter letters and characters")
    public void user_tries_to_enter_letters_and_characters() {

    }

    @When("User enters a number with more or less than required phone characters")
    public void user_enters_a_number_with_more_or_less_than_required_phone_characters() {

    }

    @When("User clicks on Login")
    public void user_clicks_on_login() {
        signIn_popUp.LOGIN.click();
    }

    @Then("Please enter a valid mobile number error is displayed")
    public void please_enter_a_valid_mobile_number_error_is_displayed() {
        String expectedResult = "Lütfen geçerli bir telefon numarası giriniz.";
    }

    @When("User enters an invalid OTP code")
    public void user_enters_an_invalid_otp_code() {
        signUp_popUp.OTP_DIGIT_1.sendKeys(random.nextInt(9)+"");
        signUp_popUp.OTP_DIGIT_2.sendKeys(random.nextInt(9)+"");
        signUp_popUp.OTP_DIGIT_3.sendKeys(random.nextInt(9)+"");
        signUp_popUp.OTP_DIGIT_4.sendKeys(random.nextInt(9)+"");
        signUp_popUp.OTP_DIGIT_5.sendKeys(random.nextInt(9)+"");
        signUp_popUp.OTP_DIGIT_6.sendKeys(random.nextInt(9)+"");

    }

    @Then("The verification code is invalid error message should be displayed")
    public void the_verification_code_is_invalid_error_message_should_be_displayed() {
        String expectedResult = "Lütfen geçerli bir telefon numarası giriniz.";

    }


}
