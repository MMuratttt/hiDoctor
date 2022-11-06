package com.bb2.step_definitions;

import com.bb2.pages.platform.BasePage;
import com.bb2.pages.platform.LoginPage;
import com.bb2.utilities.ConfigurationReader;
import com.bb2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    @Given("User is on the Platform login page")
    public void user_is_on_the_platform_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("platformURL"));
    }

    @When("User enters valid username {string}")
    public void user_enters_valid_username(String username) {
        loginPage.USERNAME.sendKeys(username);
    }

    @When("User enters valid password {string}")
    public void user_enters_valid_password(String password) {
        loginPage.PASSWORD.sendKeys(password);
    }

    @When("User clicks Submit button")
    public void user_clicks_submit_button() {
        loginPage.SUBMIT_BUTTON.click();
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        String actualValue = basePage.DASHBOARD.getText();
        Assert.assertEquals("Dashboard", actualValue);
    }

}
