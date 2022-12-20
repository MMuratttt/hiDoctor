package health.hiDoctor.step_definitions;

import health.hiDoctor.pages.MainPage;
import health.hiDoctor.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MainPage_StepDefs {

    MainPage mainPage = new MainPage();
    @Then("The title should be displayed correctly")
    public void the_title_should_be_displayed_correctly() {
        String actualResult = Driver.getDriver().getTitle();
        String expectedResult = mainPage.title;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Then("The banner at the top of the page should display correct text")
    public void the_banner_at_the_top_of_the_page_should_display_correct_text() {
        String actualResult = mainPage.BANNER_TEXT_PART_1.getText() +
                    mainPage.BANNER_TEXT_PART_2.getText() +
                    mainPage.BANNER_TEXT_PART_3.getText();
        String expectedResult = mainPage.bannerTextAtTheTop;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @When("User clicks on the banner at the top of the page")
    public void user_clicks_on_the_banner_at_the_top_of_the_page() {
        mainPage.BANNER_TEXT_ON_THE_TOP.click();
    }
    @Then("User should land All Psychologist page")
    public void user_should_land_all_psychologist_page() {

    }
    @Then("User clicks on below buttons, should land related pages.Home button redirect to main page")
    public void user_clicks_on_below_buttons_should_land_related_pages_home_button_redirect_to_main_page(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }
    @Then("Texts are correct on the Header segments")
    public void texts_are_correct_on_the_header_segments() {

    }
    @Then("Phone number is correct at the top right of the page")
    public void phone_number_is_correct_at_the_top_right_of_the_page() {

    }
    @When("User clicks on Language")
    public void user_clicks_on_language() {

    }
    @Then("User should see languages")
    public void user_should_see_languages(io.cucumber.datatable.DataTable dataTable) {

    }


}
