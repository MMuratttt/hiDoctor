package health.hiDoctor.step_definitions;

import health.hiDoctor.pages.headers.B2bApplication;
import health.hiDoctor.utilities.BrowserUtils;
import health.hiDoctor.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static health.hiDoctor.pages.BasePage.B2B_APPLICATION;

public class B2BApplication_StepDefs {

    B2bApplication b2bApplication = new B2bApplication();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Point firstLocation;

    @Given("User clicks on the B2B Application button")
    public void user_clicks_on_the_b2b_application_button() {
        B2B_APPLICATION.click();
    }
    @Then("User should land on B2B Application page")
    public void user_should_land_on_b2b_application_page() {
        BrowserUtils.waitFor(1);
        Assert.assertEquals("Page Title does not match",b2bApplication.expectedPageTitle, Driver.getDriver().getTitle());
    }
    @Then("Corporate Happiness Package text and button on the image appear properly.")
    public void corporate_happiness_package_text_and_button_on_the_image_appear_properly() {
        Assert.assertTrue(b2bApplication.B2B_BANNER.isDisplayed());
        Assert.assertEquals("Banner Text does not match",b2bApplication.expectedB2bBannerText, b2bApplication.B2B_BANNER_TEXT.getText());
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
        Assert.assertNotEquals(firstLocation, formLocation);
    }
    @When("User scrolls up the page until Our Partners are visible")
    public void user_scrolls_up_the_page_until_our_partners_are_visible() {
        js.executeScript("arguments[0].scrollIntoView(true);", b2bApplication.OUR_PARTNERS_TEXT);
        BrowserUtils.waitFor(2);
    }
    @Then("User should see the all Partners")
    public void user_should_see_the_all_partners(List<String> expectedPartners) {
        List<String> actualPartnersText = new ArrayList<>();

        for (WebElement eachElement : b2bApplication.EVERY_PARTNER) {
            actualPartnersText.add(eachElement.getText());
        }

        Assert.assertEquals("Partners does not match",expectedPartners, actualPartnersText);
    }
    @When("User scrolls down the page until Why Should I Get Corporate Services from HiDoctor? are visible")
    public void user_scrolls_down_the_page_until_why_should_i_get_corporate_services_from_hi_doctor_are_visible() {
        
    }
    @Then("User should see the all answers")
    public void user_should_see_the_all_answers(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @When("User scrolls down the page until How To Use? are visible")
    public void user_scrolls_down_the_page_until_how_to_use_are_visible() {
        
    }
    @When("User scrolls down the page until All Secure and Private are visible")
    public void user_scrolls_down_the_page_until_all_secure_and_private_are_visible() {
        
    }
    @Then("User should see the all text correctly")
    public void user_should_see_the_all_text_correctly(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
}
