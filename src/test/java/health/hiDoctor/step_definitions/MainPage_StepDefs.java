package health.hiDoctor.step_definitions;

import health.hiDoctor.pages.AllPsychologists;
import health.hiDoctor.pages.BecomeAConsultant;
import health.hiDoctor.pages.MainPage;
import health.hiDoctor.utilities.BrowserUtils;
import health.hiDoctor.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class MainPage_StepDefs {

    MainPage mainPage = new MainPage();
    AllPsychologists allPsychologists = new AllPsychologists();
    BecomeAConsultant becomeAConsultant = new BecomeAConsultant();

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
        Assert.assertEquals(mainPage.BLOG.getText(), mainPage.blogText);
        Assert.assertEquals(mainPage.B2B_APPLICATION.getText(), mainPage.b2bText);
        Assert.assertEquals(mainPage.ABOUT_US.getText(), mainPage.aboutUsText);
        Assert.assertEquals(mainPage.CONTACT_US.getText(), mainPage.contactText);
        Assert.assertEquals(mainPage.BECOME_A_CONSULTANT.getText(), mainPage.becomeAConsultantText);
        Assert.assertEquals(mainPage.SERVICES_HEADER_TEXT.getText(), mainPage.servicesText);
        mainPage.SERVICES.click();
        Assert.assertEquals(mainPage.ONLINE_PSYCHOLOGIST.getText(), mainPage.onlinePsychologistText);
        Assert.assertEquals(mainPage.ONLINE_DIETITIAN.getText(), mainPage.onlineDietitianText);

    }

    @Then("Phone number {string} is correct at the top right of the page")
    public void phone_number_is_correct_at_the_top_right_of_the_page(String companyNumber) {
        String actualResult = mainPage.CX_PHONE.getText();
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
        BrowserUtils.waitForVisibility(mainPage.BANNER_MAIN, 10);
        mainPage.BANNER_MAIN.click();
    }

    @Then("User returns to Main Page")
    public void user_returns_to_main_page() {
        BrowserUtils.waitForClickablility(allPsychologists.HIDOCTOR_MAINPAGE_ICON, 10);
        AllPsychologists.HIDOCTOR_MAINPAGE_ICON.click();
        BrowserUtils.waitForVisibility(mainPage.HIDOCTOR_MAINPAGE_ICON, 10);
    }

    @When("User clicks on Apply button")
    public void user_clicks_on_apply_button() {
        BrowserUtils.scrollToElement(mainPage.APPLY_BUTTON);
        BrowserUtils.waitFor(1);
        mainPage.APPLY_BUTTON.click();
    }

    @Then("User should see Consultant Application Form")
    public void user_should_see_consultant_application_form() {
        BrowserUtils.waitForVisibility(becomeAConsultant.HEADER, 10);
        Assert.assertEquals(becomeAConsultant.header, becomeAConsultant.HEADER.getText());
    }

    @Then("Online Psychologist and Online Dietitian texts are correct")
    public void onlinePsychologistAndOnlineDietitianTextsAreCorrect() {
        BrowserUtils.waitForVisibility(mainPage.ONLINE_DIETITIAN_TEXT_IN_BOX, 10);
        Assert.assertEquals(mainPage.onlinePsychologist, mainPage.ONLINE_PSYCHOLOGIST_TEXT_IN_BOX.getText());
        Assert.assertEquals(mainPage.onlineDietitian, mainPage.ONLINE_DIETITIAN_TEXT_IN_BOX.getText());
    }

    @Then("What and why question texts are correct")
    public void whatAndWhyQuestionTextsAreCorrect() {
        BrowserUtils.scrollToElement(mainPage.WHAT_IS_ONLINE_THERAPY_TEXT);
        Assert.assertEquals(mainPage.whatIsOnlineTherapy, mainPage.WHAT_IS_ONLINE_THERAPY_TEXT.getText());
        Assert.assertEquals(mainPage.whatIsOnlineTherapy_Desc, mainPage.WHAT_IS_ONLINE_THERAPY_DESC_TEXT.getText());
        Assert.assertEquals(mainPage.whyHidoctorOnlineTherapy, mainPage.WHY_HIDOCTOR_ONLINE_THERAPY_TEXT.getText());
        Assert.assertEquals(mainPage.whyHidoctorOnlineTherapy_Desc, mainPage.WHY_HIDOCTOR_ONLINE_THERAPY_DESC_TEXT.getText());
        Assert.assertEquals(mainPage.whyHidoctorOnlineTherapy_HelperText, mainPage.WHY_HIDOCTOR_ONLINE_THERAPY_HELPER_TEXT.getText());

    }

    @Then("Trustworthy texts are correct")
    public void trustworthyTextsAreCorrect() {
        BrowserUtils.scrollToElement(mainPage.WHY_SHOULD_I_CHOOSE_ONLINE_ADVICE_TITLE);
        Assert.assertEquals(mainPage.whyShouldIChooseOnlineAdvice, mainPage.WHY_SHOULD_I_CHOOSE_ONLINE_ADVICE_TITLE.getAttribute("textContent"));
        Assert.assertEquals(mainPage.secureAndPrivateTitle, mainPage.SECURE_AND_PRIVATE_TITLE.getAttribute("textContent"));
        Assert.assertEquals(mainPage.secureAndPrivateText, mainPage.SECURE_AND_PRIVATE_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.guaranteedTitle, mainPage.GUARANTEED_TITLE.getAttribute("textContent"));
        Assert.assertEquals(mainPage.guaranteedText, mainPage.GUARANTEED_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.expertClinicalPsychologistsTitle, mainPage.EXPERT_CLINICAL_PSYCHOLOGISTS_TITLE.getAttribute("textContent"));
        Assert.assertEquals(mainPage.expertClinicalPsychologistsText, mainPage.EXPERT_CLINICAL_PSYCHOLOGISTS_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.evidencedBasedTherapyTitle, mainPage.EVIDENCE_BASED_THERAPY_TITLE.getAttribute("textContent"));
        Assert.assertEquals(mainPage.evidencedBasedTherapyText, mainPage.EVIDENCE_BASED_THERAPY_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.voiceAndVideoCallsTitle, mainPage.VOICE_AND_VIDEO_CALLS_TITLE.getAttribute("textContent"));
        Assert.assertEquals(mainPage.voiceAndVideoCallsText, mainPage.VOICE_AND_VIDEO_CALLS_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.accessibleAndTimesavingTitle, mainPage.ACCESSIBLE_AND_TIMESAVING_TITLE.getAttribute("textContent"));
        Assert.assertEquals(mainPage.accessibleAndTimesavingText, mainPage.ACCESSIBLE_AND_TIMESAVING_TEXT.getAttribute("textContent"));
    }

    @Then("Certificate texts are correct")
    public void certificate_texts_are_correct() {
        BrowserUtils.scrollToElement(mainPage.I_SECURITY_M_S_TEXT);
        Assert.assertEquals(mainPage.iSecurityMS_Text, mainPage.I_SECURITY_M_S_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.sPICD_Text, mainPage.S_P_I_C_D_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.iTServiceManagementS_Text, mainPage.I_T_SERVICE_MANAGEMENT_S_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.iHealthTourismAC_Text, mainPage.I_HEALTH_TOURISM_A_C_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.eCommerceIS_Text, mainPage.E_COMMERCE_I_S_TEXT.getAttribute("textContent"));
    }

    @Then("Certificate icons are proper")
    public void certificate_icons_are_proper() {
        BrowserUtils.waitForVisibility(mainPage.I_SECURITY_M_S_LOGO, 10);
        Assert.assertTrue(mainPage.I_SECURITY_M_S_LOGO.isDisplayed());
        Assert.assertTrue(mainPage.S_P_I_C_D_LOGO.isDisplayed());
        Assert.assertTrue(mainPage.I_T_SERVICE_MANAGEMENT_S_LOGO.isDisplayed());
        Assert.assertTrue(mainPage.I_HEALTH_TOURISM_A_C_LOGO.isDisplayed());
        Assert.assertTrue(mainPage.E_COMMERCE_I_S_LOGO.isDisplayed());
    }

    @Then("Become a consultant texts are correct")
    public void become_a_consultant_texts_are_correct() {
        BrowserUtils.scrollToElement(mainPage.BECOME_A_CONSULTANT_TITLE);
        Assert.assertEquals(mainPage.becomeAConsultantTitle_Text, mainPage.BECOME_A_CONSULTANT_TITLE.getAttribute("textContent"));
        Assert.assertEquals(mainPage.becomeAConsultantText_Text, mainPage.BECOME_A_CONSULTANT_TEXT.getAttribute("textContent"));
    }

    @Then("FAQ title and question texts are correct")
    public void faq_title_and_question_texts_are_correct() {
        BrowserUtils.scrollToElement(mainPage.ALL_RIGHTS_RESERVED_TEXT);
        BrowserUtils.waitForVisibility(mainPage.QUESTION_ONE_BTN, 10);
        Assert.assertEquals(mainPage.FAQ_Title, mainPage.FAQ_TITLE.getAttribute("textContent"));
        Assert.assertEquals(mainPage.questionOne, mainPage.QUESTION_ONE_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.questionTwo, mainPage.QUESTION_TWO_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.questionThree, mainPage.QUESTION_THREE_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.questionFour, mainPage.QUESTION_FOUR_TEXT.getAttribute("textContent"));
    }

    @When("Click on first question")
    public void click_on_first_question() {
        BrowserUtils.waitForClickablility(mainPage.QUESTION_ONE_BTN, 10);
        Assert.assertEquals("false",mainPage.ANSWER_ONE_BTN.getAttribute("aria-expanded"));
        mainPage.QUESTION_ONE_BTN.click();
    }

    @Then("First dropdown should be opened and answer is correct")
    public void first_dropdown_should_be_opened_and_answer_is_correct() {
        Assert.assertEquals(mainPage.answerOne, mainPage.ANSWER_ONE.getAttribute("textContent"));
        mainPage.QUESTION_ONE_BTN.click();
        Assert.assertEquals("false",mainPage.ANSWER_ONE_BTN.getAttribute("aria-expanded"));
    }

    @When("Click on second question")
    public void click_on_second_question() {
        BrowserUtils.waitForClickablility(mainPage.QUESTION_TWO_BTN, 10);
        Assert.assertEquals("false",mainPage.ANSWER_TWO_BTN.getAttribute("aria-expanded"));
        mainPage.QUESTION_TWO_BTN.click();
    }

    @Then("Second dropdown should be opened and answer is correct")
    public void second_dropdown_should_be_opened_and_answer_is_correct() {
        Assert.assertEquals(mainPage.answerTwo, mainPage.ANSWER_TWO.getAttribute("textContent"));
        mainPage.QUESTION_TWO_BTN.click();
        Assert.assertEquals("false",mainPage.ANSWER_TWO_BTN.getAttribute("aria-expanded"));
    }

    @When("Click on third question")
    public void click_on_third_question() {
        BrowserUtils.waitForClickablility(mainPage.QUESTION_THREE_BTN, 10);
        Assert.assertEquals("false",mainPage.ANSWER_THREE_BTN.getAttribute("aria-expanded"));
        mainPage.QUESTION_THREE_BTN.click();
    }

    @Then("Third dropdown should be opened and answer is correct")
    public void third_dropdown_should_be_opened_and_answer_is_correct() {
        Assert.assertEquals(mainPage.answerThree, mainPage.ANSWER_THREE.getAttribute("textContent"));
        mainPage.QUESTION_THREE_BTN.click();
        Assert.assertEquals("false",mainPage.ANSWER_THREE_BTN.getAttribute("aria-expanded"));
    }

    @When("Click on fourth question")
    public void click_on_fourth_question() {
        BrowserUtils.waitForClickablility(mainPage.QUESTION_FOUR_BTN, 10);
        Assert.assertEquals("false",mainPage.ANSWER_FOUR_BTN.getAttribute("aria-expanded"));
        mainPage.QUESTION_FOUR_BTN.click();
    }

    @Then("Fourth dropdown should be opened and answer is correct")
    public void fourth_dropdown_should_be_opened_and_answer_is_correct() {
        Assert.assertEquals(mainPage.answerFour, mainPage.ANSWER_FOUR.getAttribute("textContent"));
        mainPage.QUESTION_FOUR_BTN.click();
        Assert.assertEquals("false",mainPage.ANSWER_FOUR_BTN.getAttribute("aria-expanded"));
    }


}
