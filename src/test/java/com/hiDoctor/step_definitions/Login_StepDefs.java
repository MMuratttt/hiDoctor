package com.hiDoctor.step_definitions;

import com.hiDoctor.pages.MainPage;
import com.hiDoctor.utilities.ConfigurationReader;
import com.hiDoctor.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {

    MainPage basePage = new MainPage();

    @Given("User is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("platformURL"));
    }

    @When("User clicks on Login Register")
    public void user_clicks_on_login_register() {

    }
    @Then("Login iFrame is displayed")
    public void login_i_frame_is_displayed() {

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
    @When("User selects country {string} that his phone registered")
    public void user_selects_country_that_his_phone_registered(String string) {

    }
    @When("User clicks on Sign Up inside")
    public void user_clicks_on_sign_up_inside() {

    }
    @Then("The phone frame becomes red")
    public void the_phone_frame_becomes_red() {

    }
    @When("User enters his number {string}")
    public void user_enters_his_number(String string) {

    }
    @Then("Mandatory texts become red")
    public void mandatory_texts_become_red() {

    }
    @When("User clicks on mandatory checkboxes")
    public void user_clicks_on_mandatory_checkboxes() {

    }
    @Then("User should see the counter and popup message OTP code sent successfully")
    public void user_should_see_the_counter_and_popup_message_otp_code_sent_successfully() {

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




}
