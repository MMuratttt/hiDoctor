package health.hiDoctor.step_definitions;

import com.github.javafaker.Faker;
import health.hiDoctor.pages.MainPage;
import health.hiDoctor.pages.SignIn_PopUp;
import health.hiDoctor.pages.SignUp_PopUp;
import health.hiDoctor.utilities.BrowserUtils;
import health.hiDoctor.utilities.ConfigurationReader;
import health.hiDoctor.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Random;

public class Logout_StepDefs {

    MainPage mainPage = new MainPage();
    SignIn_PopUp signIn_popUp = new SignIn_PopUp();
    SignUp_PopUp signUp_popUp = new SignUp_PopUp();
    Random random = new Random();
    Faker faker = new Faker();

    @Given("User is on the main page as logged in")
    public void user_is_on_the_main_page_as_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("platformURL"));
        mainPage.LOGIN_REGISTER.click();
        BrowserUtils.waitForVisibility(signIn_popUp.LOGIN, 10);
        signUp_popUp.ENTER_COUNTRY_CODE_BOX.click();
        signUp_popUp.ENTER_COUNTRY.sendKeys(ConfigurationReader.getProperty("userCountry"));
        signUp_popUp.TOP_OF_COUNTRY_LIST.click();
        signUp_popUp.USER_PHONE_NUMBER.clear();
        signUp_popUp.USER_PHONE_NUMBER.sendKeys(ConfigurationReader.getProperty("userPhoneNumber"));
        signIn_popUp.LOGIN.click();
    }
    @When("User clicks on Profile Menu")
    public void user_clicks_on_profile_menu() {

    }
    @Then("User should see the exact number which already entered")
    public void user_should_see_the_exact_number_which_already_entered() {

    }
    @When("User clicks on Log out")
    public void user_clicks_on_log_out() {

    }
    @Then("User is on the main page as logging out")
    public void user_is_on_the_main_page_as_logging_out() {

    }


    @When("User closes the tab")
    public void user_closes_the_tab() {

    }

    @When("User closes the window")
    public void user_closes_the_window() {

    }



}
