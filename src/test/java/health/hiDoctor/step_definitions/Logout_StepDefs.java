package health.hiDoctor.step_definitions;

import com.github.javafaker.Faker;
import health.hiDoctor.pages.MainPage;
import health.hiDoctor.pages.SignIn_PopUp;
import health.hiDoctor.pages.SignUp_PopUp;
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
