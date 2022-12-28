package health.hiDoctor.step_definitions;

import com.github.javafaker.Faker;
import health.hiDoctor.pages.MainPage;
import health.hiDoctor.pages.SignIn_PopUp;
import health.hiDoctor.pages.SignUp_PopUp;
import health.hiDoctor.utilities.BrowserUtils;
import health.hiDoctor.utilities.ConfigurationReader;
import health.hiDoctor.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Random;

public class Logout_StepDefs {

    MainPage mainPage = new MainPage();
    SignIn_PopUp signIn_popUp = new SignIn_PopUp();
    SignUp_PopUp signUp_popUp = new SignUp_PopUp();
    Random random = new Random();
    Faker faker = new Faker();

    @Given("User is on the main page as logged in")
    public void user_is_on_the_main_page_as_logged_in() {
        BrowserUtils.login();
    }

    @When("User clicks on Profile Menu")
    public void user_clicks_on_profile_menu() {
        mainPage.X_BUTTON_IN_POPUP.click();
        mainPage.PROFILE.click();
    }

    @Then("User should see the exact number which already entered")
    public void user_should_see_the_exact_number_which_already_entered() {
        String expectedResult = ConfigurationReader.getProperty("userCountryCode") + ConfigurationReader.getProperty("userPhoneNumber");
        String actualResult = mainPage.PHONE_NUMBER.getAttribute("textContent").replaceAll("\\s+", "");
        Assert.assertEquals(expectedResult, actualResult);
    }

    @When("User clicks on Log out")
    public void user_clicks_on_log_out() {
        mainPage.LOGOUT.click();
    }

    @Then("User is on the main page as logging out")
    public void user_is_on_the_main_page_as_logging_out() {
        Assert.assertTrue(mainPage.LOGIN_REGISTER.isDisplayed());
    }


    @When("User closes the tab")
    public void user_closes_the_tab() {
        BrowserUtils.switchToWindow("HiDoctor: Online Psikolog | Diyetisyen!");
        Driver.getDriver().close();
    }

    @Then("User see the are you sure pop up")
    public void user_see_the_are_you_sure_pop_up() {
        BrowserUtils.waitForVisibility(mainPage.ARE_YOU_SURE_LOGOUT_TEXT, 10);
        String expectedResult = mainPage.areYouSureLogout;
        String actualResult = mainPage.ARE_YOU_SURE_LOGOUT_TEXT.getAttribute("textContent");
        Assert.assertEquals(expectedResult, actualResult);
    }

    @When("User clicks on No")
    public void user_clicks_on_no() {
        mainPage.NO.click();
    }

    @Then("User is on the main page and profile dropdown is open")
    public void user_is_on_the_main_page_and_profile_dropdown_is_open() {
        Assert.assertTrue(mainPage.PHONE_NUMBER.isDisplayed());
    }

    @When("User clicks on Yes")
    public void user_clicks_on_yes() {
        mainPage.YES.click();
    }

    @And("Logout")
    public void logout() {
        BrowserUtils.logout();
    }

    @When("User open another tab")
    public void user_Open_Another_Tab() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('" + ConfigurationReader.getProperty("platformURL") + "','_blank');");
    }

    @And("User open a new tab")
    public void userOpenANewTab() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('" + ConfigurationReader.getProperty("platformURL") + "','_blank');");
    }
}
