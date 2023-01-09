package health.hiDoctor.step_definitions;

import com.github.javafaker.Faker;
import health.hiDoctor.pages.headers.B2bApplication;
import health.hiDoctor.utilities.BrowserUtils;
import health.hiDoctor.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Point;

import java.util.List;

public class B2BApplication_StepDefs {

    B2bApplication b2bApplication = new B2bApplication();
    Point firstLocation;
    Faker faker = new Faker();

    @Given("User clicks on the B2B Application button")
    public void user_clicks_on_the_b2b_application_button() {
        b2bApplication.B2B_APPLICATION.click();
    }

    @Then("User should land on B2B Application page")
    public void user_should_land_on_b2b_application_page() {
        BrowserUtils.waitFor(1);
        Assert.assertEquals("Page Title does not match", b2bApplication.expectedPageTitle, Driver.getDriver().getTitle());
    }

    @Then("Corporate Happiness Package text and button on the image appear properly.")
    public void corporate_happiness_package_text_and_button_on_the_image_appear_properly() {
        Assert.assertTrue(b2bApplication.B2B_BANNER.isDisplayed());
        Assert.assertEquals("Banner Text does not match", b2bApplication.expectedB2bBannerText, b2bApplication.B2B_BANNER_TEXT.getText());
    }

    @When("User clicks on Get Offer For Free button")
    public void user_clicks_on_get_offer_for_free_button() {
        firstLocation = b2bApplication.GET_OFFER_FREE_BUTTON.getLocation();
        b2bApplication.GET_OFFER_FREE_BUTTON.click();
    }

    @Then("User should redirect to the Corporate Application Form")
    public void user_should_redirect_to_the_corporate_application_form() {
        Point formLocation = b2bApplication.CORPORATE_APPLICATION_FORM_HEADER.getLocation();
        Assert.assertTrue(b2bApplication.CORPORATE_APPLICATION_FORM_HEADER.isDisplayed());
        Assert.assertNotEquals("Redirection failed", firstLocation, formLocation);
    }

    @When("User scrolls up the page until Our Partners are visible")
    public void user_scrolls_up_the_page_until_our_partners_are_visible() {
        BrowserUtils.waitFor(1);
        BrowserUtils.scrollToElement(b2bApplication.OUR_PARTNERS);
    }

    @Then("User should see the all Partners")
    public void user_should_see_the_all_partners(List<String> expectedPartners) {
        Assert.assertEquals("Partners does not match", expectedPartners, BrowserUtils.getElementsText(b2bApplication.EVERY_PARTNER));
    }

    @When("User scrolls down the page until Why Should I Get Corporate Services from HiDoctor? are visible")
    public void user_scrolls_down_the_page_until_why_should_i_get_corporate_services_from_hi_doctor_are_visible() {
        BrowserUtils.waitFor(1);
        BrowserUtils.scrollToElement(b2bApplication.WHY_HIDOCTOR);
    }

    @Then("User should see the all answers")
    public void user_should_see_the_all_answers(List<String> expectedAnswers) {
        Assert.assertEquals("Answers does not match", expectedAnswers, BrowserUtils.getElementsText(b2bApplication.WHY_HIDOCTOR_ANSWERS));
    }

    @When("User scrolls down the page until How To Use? are visible")
    public void user_scrolls_down_the_page_until_how_to_use_are_visible() {
        BrowserUtils.waitFor(1);
        BrowserUtils.scrollToElement(b2bApplication.HOW_TO_USE);
    }

    @Then("User should see the all answers of how to use")
    public void user_should_see_the_all_answers_of_how_to_use(List<String> expectedAnswers) {
        Assert.assertEquals("Answers does not match", expectedAnswers, BrowserUtils.getElementsText(b2bApplication.HOW_TO_USE_ANSWERS));
    }

    @When("User scrolls down the page until All Secure and Private are visible")
    public void user_scrolls_down_the_page_until_all_secure_and_private_are_visible() {
        BrowserUtils.waitFor(1);
        BrowserUtils.scrollToElement(b2bApplication.ALL_SECURE_PRIVATE);
    }

    @Then("User should see the all text correctly")
    public void user_should_see_the_all_text_correctly(List<String> expectedAnswers) {
        Assert.assertEquals("Items does not match", expectedAnswers, BrowserUtils.getElementsText(b2bApplication.ALL_SECURE_PRIVATE_TEXT));
    }

    @Then("User enters Your Company Name")
    public void user_enters_your_company_name() {
        b2bApplication.COMPANY.sendKeys(faker.company().name());
    }

    @Then("User enters Authorized Person Name")
    public void user_enters_authorized_person_name() {
        b2bApplication.FIRST_NAME.sendKeys(faker.name().firstName());
    }

    @Then("User enters Authorized Person Surname")
    public void user_enters_authorized_person_surname() {
        b2bApplication.LAST_NAME.sendKeys(faker.name().lastName());
    }

    @Then("User enters Authorized Person Phone Number")
    public void user_enters_authorized_person_phone_number() {
        b2bApplication.PHONE_NUMBER.sendKeys(faker.numerify("+90531#######"));
    }

    @Then("User enters Authorized Person Corporate Email")
    public void user_enters_authorized_person_corporate_email() {
        b2bApplication.EMAIL_ADDRESS.sendKeys(faker.internet().emailAddress());
    }

    @Then("User enters Information about the service you want to receive")
    public void user_enters_information_about_the_service_you_want_to_receive() {
        b2bApplication.DESCRIPTION.sendKeys("Lorem Ipsum");
    }

    @Then("User clicks on apply button")
    public void user_clicks_on_apply_button() {
        BrowserUtils.clickWithJS(b2bApplication.SUBMIT_BUTTON);
    }

    @Then("B2B Application Form should send successfully")
    public void b2b_application_form_should_send_successfully() {
        BrowserUtils.waitFor(1);
        Assert.assertTrue(b2bApplication.SUCCESS_MESSAGE.isDisplayed());
    }
}
