package health.hiDoctor.step_definitions;

import health.hiDoctor.pages.AllPsychologists;
import health.hiDoctor.pages.MainPage;
import health.hiDoctor.utilities.BrowserUtils;
import health.hiDoctor.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static health.hiDoctor.pages.BasePage.CX_PHONE;

public class MainPage_StepDefs {

    MainPage mainPage = new MainPage();
    AllPsychologists allPsychologists = new AllPsychologists();
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
        BrowserUtils.waitForVisibility(allPsychologists.ALL_PSYCHOLOGISTS_TITLE,10);
        Assert.assertTrue(allPsychologists.ALL_PSYCHOLOGISTS_TITLE.isDisplayed());
    }
    @Then("User clicks on below buttons, should land related pages.Home button redirect to main page")
    public void user_clicks_on_below_buttons_should_land_related_pages_home_button_redirect_to_main_page(Map<String,String> list) {
        mainPage.goToPageAndVerifyTitle(list);
    }
    @Then("Texts are correct on the Header segments")
    public void texts_are_correct_on_the_header_segments() {

    }
    @Then("Phone number {string} is correct at the top right of the page")
    public void phone_number_is_correct_at_the_top_right_of_the_page(String companyNumber) {
        String actualResult = CX_PHONE.getText();
        Assert.assertEquals(companyNumber,actualResult);
    }
    @When("User clicks on Language")
    public void user_clicks_on_language() {
        mainPage.LANGUAGE_DROPDOWN.click();
    }
    @Then("User should see languages")
    public void user_should_see_languages(List<String> languages) {
        List<WebElement> languagesWE = Driver.getDriver().findElements((By) mainPage.ALL_LANGUAGES);
        List<String> languageList = new ArrayList<>();
        for (WebElement each: languagesWE) {
            languageList.add(each.getText());
        }
        Assert.assertEquals(languages,languageList);

    }
}
