package com.hiDoctor.step_definitions;

import com.hiDoctor.pages.MainPage;
import com.hiDoctor.utilities.ConfigurationReader;
import com.hiDoctor.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {

    MainPage mainPage = new MainPage();

    @Given("User is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("platformURL"));
    }

    @When("User clicks on Login Register")
    public void user_clicks_on_login_register() {

    }

    @Then("Login iFrame is displayed")
    public void login_i_frame_is_displayed() {
        Driver.getDriver().switchTo().frame(mainPage.SIGN_IN_IFRAME);
    }

    @Then("User clicks on Sign Up")
    public void user_clicks_on_sign_up() {

    }

    @Then("User can open, read and accept all acknowledge texts")
    public void user_can_open_read_and_accept_all_acknowledge_texts() {

    }

    @Then("Checkboxes should be clickable and user unclick every checboxes")
    public void checkboxes_should_be_clickable_and_user_unclick_every_checboxes() {

    }

    @When("User clicks on country code dropdown for select a different country than default")
    public void user_clicks_on_country_code_dropdown_for_select_a_different_country_than_default() {

    }

    @When("User selects a random country")
    public void user_selects_a_random_country() {

    }

    public String userCountryName = ConfigurationReader.getProperty("userCountry");
    public String userCountryCode = ConfigurationReader.getProperty("userCountryCode");

    @When("User selects country {string} that his phone registered")
    public void user_selects_country_that_his_phone_registered(String userCountry) {

    }

    @When("User clicks on Sign Up inside")
    public void user_clicks_on_sign_up_inside() {

    }

    @Then("The phone frame becomes red")
    public void the_phone_frame_becomes_red() {

    }

    public String userPhoneNumber = ConfigurationReader.getProperty("userPhoneNumber");

    @When("User enters his number {string}")
    public void user_enters_his_number(String userPhone) {
    userPhone = userPhoneNumber;

    }

    @Then("Mandatory texts become red")
    public void mandatory_texts_become_red() {

    }

    @When("User clicks on mandatory checkboxes")
    public void user_clicks_on_mandatory_checkboxes() {

    }

    @Then("User should see the counter and popup message OTP code sent successfully")
    public void user_should_see_the_counter_and_popup_message_otp_code_sent_successfully() {
    String expectedResult = "Verification code sent to your number successfully";
    String actualResult = mainPage.OTP_SENT_POPUP_TEXT;  // we need text
    }

    @Then("User should see the exact number which already entered")
    public void user_should_see_the_exact_number_which_already_entered() {

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
