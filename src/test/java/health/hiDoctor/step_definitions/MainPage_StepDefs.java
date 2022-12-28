package health.hiDoctor.step_definitions;

import health.hiDoctor.pages.AllPsychologists;
import health.hiDoctor.pages.BasePage;
import health.hiDoctor.pages.BecomeAConsultant;
import health.hiDoctor.pages.MainPage;
import health.hiDoctor.utilities.BrowserUtils;
import health.hiDoctor.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static health.hiDoctor.pages.BasePage.*;

public class MainPage_StepDefs {

    MainPage mainPage = new MainPage();
    AllPsychologists allPsychologists = new AllPsychologists();
    BecomeAConsultant becomeAConsultant = new BecomeAConsultant();
    Random random = new Random();

    @Then("The title should be displayed correctly")
    public void the_title_should_be_displayed_correctly() {
        String actualResult = Driver.getDriver().getTitle();
        String expectedResult = mainPage.title;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Then("The banner at the top of the page should display correct text")
    public void the_banner_at_the_top_of_the_page_should_display_correct_text() {
        String actualResult = mainPage.BANNER_TEXT_PART_1.getText() +
                mainPage.BANNER_TEXT_PART_2.getText() +
                mainPage.BANNER_TEXT_PART_3.getText();
        String expectedResult = mainPage.bannerTextAtTheTop;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @When("User clicks on the banner at the top of the page")
    public void user_clicks_on_the_banner_at_the_top_of_the_page() {
        mainPage.BANNER_TEXT_ON_THE_TOP.click();
    }

    @Then("User should land All Psychologist page")
    public void user_should_land_all_psychologist_page() {
        BrowserUtils.waitForVisibility(allPsychologists.ALL_PSYCHOLOGISTS_TITLE, 10);
        Assert.assertTrue(allPsychologists.ALL_PSYCHOLOGISTS_TITLE.isDisplayed());
    }

    @Then("User clicks on below buttons, should land related pages.Home button redirect to main page")
    public void user_clicks_on_below_buttons_should_land_related_pages_home_button_redirect_to_main_page(Map<String, String> list) {
        mainPage.goToPageAndVerifyTitle(list);
    }

    @Then("Texts are correct on the Header segments")
    public void texts_are_correct_on_the_header_segments() {
        Assert.assertEquals(BLOG, mainPage.blogText);
        Assert.assertEquals(B2B_APPLICATION, mainPage.b2bText);
        Assert.assertEquals(ABOUT_US, mainPage.aboutUsText);
        Assert.assertEquals(CONTACT_US, mainPage.contactText);
        Assert.assertEquals(BECOME_A_CONSULTANT, mainPage.becomeAConsultantText);
        Assert.assertEquals(SERVICES_HEADER_TEXT.getText(), mainPage.servicesText);
        SERVICES.click();
        Assert.assertEquals(ONLINE_PSYCHOLOGIST.getText(), mainPage.onlinePsychologistText);
        Assert.assertEquals(ONLINE_DIETITIAN.getText(), mainPage.onlineDietitianText);

    }

    @Then("Phone number {string} is correct at the top right of the page")
    public void phone_number_is_correct_at_the_top_right_of_the_page(String companyNumber) {
        String actualResult = CX_PHONE.getText();
        Assert.assertEquals(companyNumber, actualResult);
    }

    @When("User clicks on Language")
    public void user_clicks_on_language() {
        mainPage.LANGUAGE_DROPDOWN.click();
    }

    @Then("User should see languages")
    public void user_should_see_languages(List<String> languages) {
        List<WebElement> languagesWE = Driver.getDriver().findElements((By) mainPage.ALL_LANGUAGES);
        List<String> languageList = BrowserUtils.getElementsText(languagesWE);
        Assert.assertEquals(languages, languageList);

    }

    @When("User clicks on any language rather than default")
    public void userClicksOnAnyLanguageRatherThanDefault() {
        WebElement randomLanguage = mainPage.randomLanguage();
        randomLanguage.click();
    }

    @And("User clicks out of the language dropdown")
    public void userClicksOutOfTheLanguageDropdown() {
        BrowserUtils.clickOutside();
    }

    @Then("User should see the language that last clicked")
    public void userShouldSeeTheLanguageThatLastClicked() {
        Assert.assertNotEquals("Türkçe - TR", mainPage.LANGUAGE_SELECTED.getText());

    }

    @When("User clicks on the banner")
    public void user_clicks_on_the_banner() {
        BrowserUtils.waitForVisibility(mainPage.BANNER_MAIN,10);
        mainPage.BANNER_MAIN.click();
    }

    @Then("User returns to Main Page")
    public void user_returns_to_main_page() {
        BrowserUtils.waitForClickablility(allPsychologists.HIDOCTOR_MAINPAGE_ICON,10);
        AllPsychologists.HIDOCTOR_MAINPAGE_ICON.click();
        BrowserUtils.waitForVisibility(HIDOCTOR_MAINPAGE_ICON, 10);
    }

    @When("User clicks on Apply button")
    public void user_clicks_on_apply_button() {
        mainPage.APPLY_BUTTON.click();
    }

    @Then("User should see Consultant Application Form")
    public void user_should_see_consultant_application_form() {
        Assert.assertEquals(becomeAConsultant.header, becomeAConsultant.HEADER.getText());
    }

    @Then("Online Psychologist and Online Dietitian texts are correct")
    public void onlinePsychologistAndOnlineDietitianTextsAreCorrect() {
        BrowserUtils.waitForVisibility(mainPage.ONLINE_DIETITIAN_TEXT_IN_BOX,10);
        Assert.assertEquals(mainPage.onlinePsychologist,mainPage.ONLINE_PSYCHOLOGIST_TEXT_IN_BOX.getText());
        Assert.assertEquals(mainPage.onlineDietitian,mainPage.ONLINE_DIETITIAN_TEXT_IN_BOX.getText());
    }

    @Then("What and why question texts are correct")
    public void whatAndWhyQuestionTextsAreCorrect() {
        BrowserUtils.scrollToElement(mainPage.WHAT_IS_ONLINE_THERAPY_TEXT);
        Assert.assertEquals(mainPage.whatIsOnlineTherapy,mainPage.WHAT_IS_ONLINE_THERAPY_TEXT.getText());
        Assert.assertEquals(mainPage.whatIsOnlineTherapy_Desc,mainPage.WHAT_IS_ONLINE_THERAPY_DESC_TEXT.getText());
        Assert.assertEquals(mainPage.whyHidoctorOnlineTherapy,mainPage.WHY_HIDOCTOR_ONLINE_THERAPY_TEXT.getText());
        Assert.assertEquals(mainPage.whyHidoctorOnlineTherapy_Desc,mainPage.WHY_HIDOCTOR_ONLINE_THERAPY_DESC_TEXT.getText());
        Assert.assertEquals(mainPage.whyHidoctorOnlineTherapy_HelperText,mainPage.WHY_HIDOCTOR_ONLINE_THERAPY_HELPER_TEXT.getText());

    }
}
