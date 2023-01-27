package health.hiDoctor.step_definitions;

import health.hiDoctor.pages.AllPsychologists;
import health.hiDoctor.pages.BecomeAConsultant;
import health.hiDoctor.pages.MainPage;
import health.hiDoctor.pages.headers.services.OnlinePsychologist;
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
    OnlinePsychologist onlinePsychologist = new OnlinePsychologist();

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
        Assert.assertEquals("false",mainPage.ANSWER_ONE_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
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
        Assert.assertEquals("false",mainPage.ANSWER_TWO_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
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
        Assert.assertEquals("false",mainPage.ANSWER_THREE_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
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
        Assert.assertEquals("false",mainPage.ANSWER_FOUR_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        mainPage.QUESTION_FOUR_BTN.click();
    }

    @Then("Fourth dropdown should be opened and answer is correct")
    public void fourth_dropdown_should_be_opened_and_answer_is_correct() {
        Assert.assertEquals(mainPage.answerFour, mainPage.ANSWER_FOUR.getAttribute("textContent"));
        mainPage.QUESTION_FOUR_BTN.click();
        Assert.assertEquals("false",mainPage.ANSWER_FOUR_BTN.getAttribute("aria-expanded"));
    }

    @Then("Certificates title is correct")
    public void certificates_title_is_correct() {
        BrowserUtils.waitFor(1);
        BrowserUtils.scrollToElement(mainPage.CERTIFICATES_TITLE);
        Assert.assertEquals(onlinePsychologist.certificatesTitle, mainPage.CERTIFICATES_TITLE.getAttribute("textContent"));
    }
    @Then("Previous button is disabled next button is enabled in default")
    public void previous_button_is_disabled_next_button_is_enabled_in_default() {
        BrowserUtils.waitForClickablility(mainPage.NEXT_BUTTON_CERTIFICATE,10);
        Assert.assertEquals("true",mainPage.PREVIOUS_BUTTON_CERTIFICATE.getAttribute("aria-disabled"));
        Assert.assertEquals("false",mainPage.NEXT_BUTTON_CERTIFICATE.getAttribute("aria-disabled"));
    }
    @When("User clicks on next button")
    public void user_clicks_on_next_button() {
        BrowserUtils.waitFor(2);
        mainPage.NEXT_BUTTON_CERTIFICATE.click();
    }
    @Then("Previous button is enabled next button is disabled in default")
    public void previous_button_is_enabled_next_button_is_disabled_in_default() {
        BrowserUtils.waitForClickablility(mainPage.PREVIOUS_BUTTON_CERTIFICATE,10);
        Assert.assertEquals("false",mainPage.PREVIOUS_BUTTON_CERTIFICATE.getAttribute("aria-disabled"));
        Assert.assertEquals("true",mainPage.NEXT_BUTTON_CERTIFICATE.getAttribute("aria-disabled"));
    }
    @When("User clicks on previous button")
    public void user_clicks_on_previous_button() {
        mainPage.PREVIOUS_BUTTON_CERTIFICATE.click();
    }
    @Then("Subtitle and text is correct for Health certificate and logo is visible")
    public void subtitle_and_text_is_correct_for_health_certificate_and_logo_is_visible() {
        Assert.assertEquals(onlinePsychologist.healthCertificateSubTitle, mainPage.HEALTH_CERTIFICATE_SUBTITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.healthCertificateText, mainPage.HEALTH_CERTIFICATE_TEXT.getAttribute("textContent"));
        Assert.assertTrue(mainPage.HEALTH_CERTIFICATE_LOGO.isDisplayed());
    }
    @Then("Subtitle and text is correct for SPICE and logo is visible")
    public void subtitle_and_text_is_correct_for_spice_and_logo_is_visible() {
        Assert.assertEquals(onlinePsychologist.SPICESubTitle, mainPage.SPICE_SUBTITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.SPICEText, mainPage.SPICE_TEXT.getAttribute("textContent"));
        Assert.assertTrue(mainPage.SPICE_LOGO.isDisplayed());
    }
    @Then("Subtitle and text is correct for ISO 45003 and logo is visible")
    public void subtitle_and_text_is_correct_for_iso_45003_and_logo_is_visible() {
        Assert.assertEquals(onlinePsychologist.ISO45003SubTitle, mainPage.ISO_45003_SUBTITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.ISO45003SubText, mainPage.ISO_45003_TEXT.getAttribute("textContent"));
        Assert.assertTrue(mainPage.ISO_45003_LOGO.isDisplayed());
    }

    @Then("Subtitle and text is correct for ISO 27001 and logo is visible")
    public void subtitle_and_text_is_correct_for_iso_27001_and_logo_is_visible() {
        Assert.assertEquals(onlinePsychologist.ISO27001SubTitle, mainPage.ISO_27001_SUBTITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.ISO27001SubText, mainPage.ISO_27001_TEXT.getAttribute("textContent"));
        Assert.assertTrue(mainPage.ISO_27001_LOGO.isDisplayed());
    }

    @Then("Subtitle and text is correct for ISO 20000 and logo is visible")
    public void subtitle_and_text_is_correct_for_iso_20000_and_logo_is_visible() {
        Assert.assertEquals(onlinePsychologist.ISO20000SubTitle, mainPage.ISO_20000_SUBTITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.ISO20000SubText, mainPage.ISO_20000_TEXT.getAttribute("textContent"));
        Assert.assertTrue(mainPage.ISO_20000_LOGO.isDisplayed());
    }

    @Then("Subtitle and text is correct for ETBIS and logo is visible")
    public void subtitle_and_text_is_correct_for_etbis_and_logo_is_visible() {
        Assert.assertEquals(onlinePsychologist.ETBISSubTitle, mainPage.ETBIS_SUBTITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.ETBISText, mainPage.ETBIS_TEXT.getAttribute("textContent"));
        Assert.assertTrue(mainPage.ETBIS_LOGO.isDisplayed());
    }


    @Then("Analytics are correct")
    public void analyticsAreCorrect() {
        BrowserUtils.scrollToElement(mainPage.USER_ANALYTIC);
        BrowserUtils.waitFor(1);

        Assert.assertEquals(mainPage.userAnalytic,mainPage.USER_ANALYTIC.getAttribute("textContent"));
        Assert.assertEquals(mainPage.userText,mainPage.USER_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.videoCallAnalytic,mainPage.VIDEO_CALL_ANALYTIC.getAttribute("textContent"));
        Assert.assertEquals(mainPage.videoCallText,mainPage.VIDEO_CALL_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.voiceCallAnalytic,mainPage.VOICE_CALL_ANALYTIC.getAttribute("textContent"));
        Assert.assertEquals(mainPage.voiceCallText,mainPage.VOICE_CALL_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.consultantAnalytic,mainPage.CONSULTANT_ANALYTIC.getAttribute("textContent"));
        Assert.assertEquals(mainPage.consultantText,mainPage.CONSULTANT_TEXT.getAttribute("textContent"));
    }
}
