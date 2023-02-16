package health.hiDoctor.step_definitions;

import health.hiDoctor.pages.BecomeAConsultant;
import health.hiDoctor.pages.FindOnlinePsychologist;
import health.hiDoctor.pages.MainPage;
import health.hiDoctor.pages.headers.services.OnlinePsychologist;
import health.hiDoctor.utilities.BrowserUtils;
import health.hiDoctor.utilities.ConfigurationReader;
import health.hiDoctor.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import javax.naming.NamingException;

public class OnlinePsychologist_StepDefs {

    MainPage mainPage = new MainPage();
    OnlinePsychologist onlinePsychologist = new OnlinePsychologist();

    @Given("User is on the Online Psychologist page")
    public void user_is_on_the_online_psychologist_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("platformURL"));
        BrowserUtils.waitForVisibility(mainPage.LOGIN_REGISTER, 10);
        mainPage.SERVICES.click();
        mainPage.ONLINE_PSYCHOLOGIST.click();
    }

    @Then("FAQ title and question texts are correct on the Online Psychologist")
    public void faq_title_and_question_texts_are_correct_on_the_online_psychologist() {
        BrowserUtils.waitFor(1);
        BrowserUtils.scrollToElement(onlinePsychologist.QUESTION_NINE_BTN);
        Assert.assertEquals(onlinePsychologist.FAQ_Title, onlinePsychologist.FAQ_TITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.questionOne, onlinePsychologist.QUESTION_ONE_TEXT.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.questionTwo, onlinePsychologist.QUESTION_TWO_TEXT.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.questionThree, onlinePsychologist.QUESTION_THREE_TEXT.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.questionFour, onlinePsychologist.QUESTION_FOUR_TEXT.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.questionFive, onlinePsychologist.QUESTION_FIVE_TEXT.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.questionSix, onlinePsychologist.QUESTION_SIX_TEXT.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.questionSeven, onlinePsychologist.QUESTION_SEVEN_TEXT.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.questionEight, onlinePsychologist.QUESTION_EIGHT_TEXT.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.questionNine, onlinePsychologist.QUESTION_NINE_TEXT.getAttribute("textContent"));
    }

    @When("Click on first question on the Online Psychologist")
    public void click_on_first_question_on_the_online_psychologist() {
        BrowserUtils.scrollToElement(onlinePsychologist.QUESTION_ONE_BTN);
        Assert.assertEquals("false", onlinePsychologist.QUESTION_ONE_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_ONE_BTN.click();
    }

    @Then("First dropdown should be opened and answer is correct on the Online Psychologist")
    public void first_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerOne, onlinePsychologist.ANSWER_ONE.getAttribute("textContent"));
        onlinePsychologist.QUESTION_ONE_BTN.click();
        Assert.assertEquals("false", onlinePsychologist.QUESTION_ONE_BTN.getAttribute("aria-expanded"));
    }

    @When("Click on second question on the Online Psychologist")
    public void click_on_second_question_on_the_online_psychologist() {
        Assert.assertEquals("false", onlinePsychologist.QUESTION_TWO_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_TWO_BTN.click();
    }

    @Then("Second dropdown should be opened and answer is correct on the Online Psychologist")
    public void second_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerTwo, onlinePsychologist.ANSWER_TWO.getAttribute("textContent"));
        onlinePsychologist.QUESTION_TWO_BTN.click();
        Assert.assertEquals("false", onlinePsychologist.QUESTION_TWO_BTN.getAttribute("aria-expanded"));
    }

    @When("Click on third question on the Online Psychologist")
    public void click_on_third_question_on_the_online_psychologist() {
        Assert.assertEquals("false", onlinePsychologist.QUESTION_THREE_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_THREE_BTN.click();
    }

    @Then("Third dropdown should be opened and answer is correct on the Online Psychologist")
    public void third_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerThree, onlinePsychologist.ANSWER_THREE.getAttribute("textContent"));
        onlinePsychologist.QUESTION_THREE_BTN.click();
        Assert.assertEquals("false", onlinePsychologist.QUESTION_THREE_BTN.getAttribute("aria-expanded"));
    }

    @When("Click on fourth question on the Online Psychologist")
    public void click_on_fourth_question_on_the_online_psychologist() {
        Assert.assertEquals("false", onlinePsychologist.QUESTION_FOUR_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_FOUR_BTN.click();
    }

    @Then("Fourth dropdown should be opened and answer is correct on the Online Psychologist")
    public void fourth_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerFour, onlinePsychologist.ANSWER_FOUR.getAttribute("textContent"));
        onlinePsychologist.QUESTION_FOUR_BTN.click();
        Assert.assertEquals("false", onlinePsychologist.QUESTION_FOUR_BTN.getAttribute("aria-expanded"));
    }

    @When("Click on fifth question on the Online Psychologist")
    public void click_on_fifth_question_on_the_online_psychologist() {
        Assert.assertEquals("false", onlinePsychologist.QUESTION_FOUR_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_FIVE_BTN.click();
    }

    @Then("Fifth dropdown should be opened and answer is correct on the Online Psychologist")
    public void fifth_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerFive, onlinePsychologist.ANSWER_FIVE.getAttribute("textContent"));
        onlinePsychologist.QUESTION_FIVE_BTN.click();
        Assert.assertEquals("false", onlinePsychologist.QUESTION_FIVE_BTN.getAttribute("aria-expanded"));
    }

    @When("Click on sixth question on the Online Psychologist")
    public void click_on_sixth_question_on_the_online_psychologist() {
        Assert.assertEquals("false", onlinePsychologist.QUESTION_SIX_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_SIX_BTN.click();
    }

    @Then("Sixth dropdown should be opened and answer is correct on the Online Psychologist")
    public void sixth_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerSix, onlinePsychologist.ANSWER_SIX.getAttribute("textContent"));
        onlinePsychologist.QUESTION_SIX_BTN.click();
        Assert.assertEquals("false", onlinePsychologist.QUESTION_SIX_BTN.getAttribute("aria-expanded"));
    }

    @When("Click on seventh question on the Online Psychologist")
    public void click_on_seventh_question_on_the_online_psychologist() {
        Assert.assertEquals("false", onlinePsychologist.QUESTION_SEVEN_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_SEVEN_BTN.click();
    }

    @Then("Seventh dropdown should be opened and answer is correct on the Online Psychologist")
    public void seventh_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerSeven, onlinePsychologist.ANSWER_SEVEN.getAttribute("textContent"));
        onlinePsychologist.QUESTION_SEVEN_BTN.click();
        Assert.assertEquals("false", onlinePsychologist.QUESTION_SEVEN_BTN.getAttribute("aria-expanded"));
    }

    @When("Click on eighth question on the Online Psychologist")
    public void click_on_eighth_question_on_the_online_psychologist() {
        Assert.assertEquals("false", onlinePsychologist.QUESTION_EIGHT_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_EIGHT_BTN.click();
    }

    @Then("Eighth dropdown should be opened and answer is correct on the Online Psychologist")
    public void eighth_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerEight, onlinePsychologist.ANSWER_EIGHT.getAttribute("textContent"));
        onlinePsychologist.QUESTION_EIGHT_BTN.click();
        Assert.assertEquals("false", onlinePsychologist.QUESTION_EIGHT_BTN.getAttribute("aria-expanded"));
    }

    @When("Click on ninth question on the Online Psychologist")
    public void click_on_ninth_question_on_the_online_psychologist() {
        Assert.assertEquals("false", onlinePsychologist.QUESTION_NINE_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_NINE_BTN.click();
    }

    @Then("Ninth dropdown should be opened and answer is correct on the Online Psychologist")
    public void ninth_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerNine, onlinePsychologist.ANSWER_NINE.getAttribute("textContent"));
        onlinePsychologist.QUESTION_NINE_BTN.click();
        Assert.assertEquals("false", onlinePsychologist.QUESTION_NINE_BTN.getAttribute("aria-expanded"));
    }

    @Then("Download the app image is visible")
    public void download_the_app_image_is_visible() {
        BrowserUtils.waitFor(1);
        BrowserUtils.scrollToElement(onlinePsychologist.QR_CODE);
        Assert.assertTrue(onlinePsychologist.DOWNLOAD_APP_IMAGE.isDisplayed());
    }

    @Then("Download the app QR code is visible")
    public void download_the_app_qr_code_is_visible() {
        Assert.assertTrue(onlinePsychologist.QR_CODE.isDisplayed());
    }

    @Then("Download the app title is correct")
    public void download_the_app_title_is_correct() {
        Assert.assertEquals(onlinePsychologist.downloadAppTitle, onlinePsychologist.DOWNLOAD_APP_TITLE.getAttribute("textContent"));
    }

    @Then("Download the app text is correct")
    public void download_the_app_text_is_correct() {
        Assert.assertEquals(onlinePsychologist.downloadAppText, onlinePsychologist.DOWNLOAD_APP_TEXT.getAttribute("textContent"));
    }

    @When("User clicks on App Store button on Online Psychologist page")
    public void user_clicks_on_app_store_button_on_online_psychologist_page() {
        BrowserUtils.scrollToElement(onlinePsychologist.APP_STORE_TEXT);
        BrowserUtils.waitFor(1);
        onlinePsychologist.APP_STORE_BTN.click();
    }

    @When("User clicks on Google Play button on Online Psychologist page")
    public void user_clicks_on_google_play_button_on_online_psychologist_page() {
        BrowserUtils.scrollToElement(onlinePsychologist.QR_CODE);
        BrowserUtils.waitFor(2);
        onlinePsychologist.GOOGLE_PLAY_BTN.click();
    }

    @When("User clicks on App Gallery button on Online Psychologist page")
    public void user_clicks_on_app_gallery_button_on_online_psychologist_page() {
        BrowserUtils.scrollToElement(onlinePsychologist.QR_CODE);
        BrowserUtils.waitFor(2);
        onlinePsychologist.APP_GALLERY_BTN.click();
    }

    @Then("Markets' texts are correct")
    public void markets_texts_are_correct() {
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.scrollToElement(onlinePsychologist.QR_CODE);

        Assert.assertEquals(mainPage.appStoreText, onlinePsychologist.APP_STORE_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.googlePlayText, onlinePsychologist.GOOGLE_PLAY_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.appGalleryText, onlinePsychologist.APP_GALLERY_TEXT.getAttribute("textContent"));
    }

    @Then("Certificates title is correct on Online Psychologist page")
    public void certificates_title_is_correct_on_online_psychologist_page() {
        BrowserUtils.waitFor(1);
        BrowserUtils.scrollToElement(onlinePsychologist.CERTIFICATES_TITLE);
        Assert.assertEquals(onlinePsychologist.certificatesTitle, onlinePsychologist.CERTIFICATES_TITLE.getAttribute("textContent"));
    }

    @Then("Previous button is disabled next button is enabled in default on Online Psychologist page")
    public void previous_button_is_disabled_next_button_is_enabled_in_default_on_online_psychologist_page() {
        BrowserUtils.waitForClickablility(onlinePsychologist.NEXT_BUTTON_CERTIFICATE, 10);
        Assert.assertEquals("true", onlinePsychologist.PREVIOUS_BUTTON_CERTIFICATE.getAttribute("aria-disabled"));
        Assert.assertEquals("false", onlinePsychologist.NEXT_BUTTON_CERTIFICATE.getAttribute("aria-disabled"));
    }

    @When("User clicks on next button on Online Psychologist page")
    public void user_clicks_on_next_button_on_online_psychologist_page() {
        BrowserUtils.waitFor(2);
        onlinePsychologist.NEXT_BUTTON_CERTIFICATE.click();
    }

    @Then("Previous button is enabled next button is disabled in default on Online Psychologist page")
    public void previous_button_is_enabled_next_button_is_disabled_in_default_on_online_psychologist_page() {
        BrowserUtils.waitForClickablility(onlinePsychologist.PREVIOUS_BUTTON_CERTIFICATE, 10);
        Assert.assertEquals("false", onlinePsychologist.PREVIOUS_BUTTON_CERTIFICATE.getAttribute("aria-disabled"));
        Assert.assertEquals("true", onlinePsychologist.NEXT_BUTTON_CERTIFICATE.getAttribute("aria-disabled"));
    }

    @When("User clicks on previous button on Online Psychologist page")
    public void user_clicks_on_previous_button_on_online_psychologist_page() {
        onlinePsychologist.PREVIOUS_BUTTON_CERTIFICATE.click();
    }

    @Then("Subtitle and text is correct for Health certificate and logo is visible on Online Psychologist page")
    public void subtitle_and_text_is_correct_for_health_certificate_and_logo_is_visible_on_online_psychologist_page() {
        Assert.assertEquals(onlinePsychologist.healthCertificateSubTitle, onlinePsychologist.HEALTH_CERTIFICATE_SUBTITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.healthCertificateText, onlinePsychologist.HEALTH_CERTIFICATE_TEXT.getAttribute("textContent"));
        Assert.assertTrue(onlinePsychologist.HEALTH_CERTIFICATE_LOGO.isDisplayed());
    }

    @Then("Subtitle and text is correct for SPICE and logo is visible on Online Psychologist page")
    public void subtitle_and_text_is_correct_for_spice_and_logo_is_visible_on_online_psychologist_page() {
        Assert.assertEquals(onlinePsychologist.SPICESubTitle, onlinePsychologist.SPICE_SUBTITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.SPICEText, onlinePsychologist.SPICE_TEXT.getAttribute("textContent"));
        Assert.assertTrue(onlinePsychologist.SPICE_LOGO.isDisplayed());
    }

    @Then("Subtitle and text is correct for ISO 45003 and logo is visible on Online Psychologist page")
    public void subtitle_and_text_is_correct_for_iso_45003_and_logo_is_visible_on_online_psychologist_page() {
        Assert.assertEquals(onlinePsychologist.ISO45003SubTitle, onlinePsychologist.ISO_45003_SUBTITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.ISO45003SubText, onlinePsychologist.ISO_45003_TEXT.getAttribute("textContent"));
        Assert.assertTrue(onlinePsychologist.ISO_45003_LOGO.isDisplayed());
    }

    @Then("Subtitle and text is correct for ISO 27001 and logo is visible on Online Psychologist page")
    public void subtitle_and_text_is_correct_for_iso_27001_and_logo_is_visible_on_online_psychologist_page() {
        Assert.assertEquals(onlinePsychologist.ISO27001SubTitle, onlinePsychologist.ISO_27001_SUBTITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.ISO27001SubText, onlinePsychologist.ISO_27001_TEXT.getAttribute("textContent"));
        Assert.assertTrue(onlinePsychologist.ISO_27001_LOGO.isDisplayed());
    }

    @Then("Subtitle and text is correct for ISO 20000 and logo is visible on Online Psychologist page")
    public void subtitle_and_text_is_correct_for_iso_20000_and_logo_is_visible_on_online_psychologist_page() {
        Assert.assertEquals(onlinePsychologist.ISO20000SubTitle, onlinePsychologist.ISO_20000_SUBTITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.ISO20000SubText, onlinePsychologist.ISO_20000_TEXT.getAttribute("textContent"));
        Assert.assertTrue(onlinePsychologist.ISO_20000_LOGO.isDisplayed());
    }

    @Then("Subtitle and text is correct for ETBIS and logo is visible on Online Psychologist page")
    public void subtitle_and_text_is_correct_for_etbis_and_logo_is_visible_on_online_psychologist_page() {
        Assert.assertEquals(onlinePsychologist.ETBISSubTitle, onlinePsychologist.ETBIS_SUBTITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.ETBISText, onlinePsychologist.ETBIS_TEXT.getAttribute("textContent"));
        BrowserUtils.waitFor(1);
        Assert.assertTrue(onlinePsychologist.ETBIS_LOGO.isDisplayed());
    }

    @Then("Analytics are correct on Online Psychologist page")
    public void analyticsAreCorrectOnOnlinePsychologistPage() {
        BrowserUtils.scrollToElement(onlinePsychologist.USER_ANALYTIC);
        BrowserUtils.waitFor(1);

        Assert.assertEquals(mainPage.userAnalytic, onlinePsychologist.USER_ANALYTIC.getAttribute("textContent"));
        Assert.assertEquals(mainPage.userText, onlinePsychologist.USER_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.videoCallAnalytic, onlinePsychologist.VIDEO_CALL_ANALYTIC.getAttribute("textContent"));
        Assert.assertEquals(mainPage.videoCallText, onlinePsychologist.VIDEO_CALL_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.voiceCallAnalytic, onlinePsychologist.VOICE_CALL_ANALYTIC.getAttribute("textContent"));
        Assert.assertEquals(mainPage.voiceCallText, onlinePsychologist.VOICE_CALL_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.consultantAnalytic, onlinePsychologist.CONSULTANT_ANALYTIC.getAttribute("textContent"));
        Assert.assertEquals(mainPage.consultantText, onlinePsychologist.CONSULTANT_TEXT.getAttribute("textContent"));
    }

    @When("Scroll to How to Create an Online Call")
    public void scroll_to_how_to_create_an_online_call() {
        BrowserUtils.scrollToElement(onlinePsychologist.HOW_CREATE_ONLINE_CALL_TITLE);
        BrowserUtils.waitFor(1);
    }

    @Then("Texts are correct on How to Create an Online Call")
    public void texts_are_correct_on_how_to_create_an_online_call() {
        Assert.assertEquals(onlinePsychologist.howCreateOnlineCallTitle, onlinePsychologist.HOW_CREATE_ONLINE_CALL_TITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.howCreateOnlineCallTitleStep1Title, onlinePsychologist.HOW_CREATE_ONLINE_CALL_STEP1_TITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.howCreateOnlineCallTitleStep1Text, onlinePsychologist.HOW_CREATE_ONLINE_CALL_STEP1_TEXT.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.howCreateOnlineCallTitleStep2Title, onlinePsychologist.HOW_CREATE_ONLINE_CALL_STEP2_TITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.howCreateOnlineCallTitleStep2Text, onlinePsychologist.HOW_CREATE_ONLINE_CALL_STEP2_TEXT.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.howCreateOnlineCallTitleStep3Title, onlinePsychologist.HOW_CREATE_ONLINE_CALL_STEP3_TITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.howCreateOnlineCallTitleStep3Text, onlinePsychologist.HOW_CREATE_ONLINE_CALL_STEP3_TEXT.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.howCreateOnlineCallTitleStep4Title, onlinePsychologist.HOW_CREATE_ONLINE_CALL_STEP4_TITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.howCreateOnlineCallTitleStep4Text, onlinePsychologist.HOW_CREATE_ONLINE_CALL_STEP4_TEXT.getAttribute("textContent"));

    }

    @When("Scroll to How do we choose our consultants")
    public void scroll_to_how_do_we_choose_our_consultants() {
        BrowserUtils.scrollToElement(onlinePsychologist.HOW_DO_WE_CHOOSE_CONSULTANTS_TITLE);
        BrowserUtils.waitFor(1);
    }

    @Then("Texts are correct on How do we choose our consultants")
    public void texts_are_correct_on_how_do_we_choose_our_consultants() {
        Assert.assertEquals(onlinePsychologist.howDoWeChooseConsultantsTitle, onlinePsychologist.HOW_DO_WE_CHOOSE_CONSULTANTS_TITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.howDoWeChooseConsultantsFirstParag, onlinePsychologist.HOW_DO_WE_CHOOSE_CONSULTANTS_FIRST_PARAG.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.howDoWeChooseConsultantsSecondParag, onlinePsychologist.HOW_DO_WE_CHOOSE_CONSULTANTS_SECOND_PARAG.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.becomeConsultant, onlinePsychologist.BECOME_CONSULTANT.getAttribute("textContent"));
    }

    @When("User clicks on Become Consultant on Online Psychologist Page")
    public void user_clicks_on_become_consultant_on_online_psychologist_page() {
        onlinePsychologist.BECOME_CONSULTANT.click();
    }

    @Then("User should land Become a Consultant Page")
    public void user_should_land_become_a_consultant_page() {
        BrowserUtils.waitForVisibility(new BecomeAConsultant().HEADER, 10);
        Assert.assertTrue(new BecomeAConsultant().HEADER.isDisplayed());
    }

    @When("Scroll to Why should I choose Hidoctor")
    public void scroll_to_why_should_i_choose_hidoctor() {
        BrowserUtils.scrollToElement(onlinePsychologist.HOW_DO_WE_CHOOSE_CONSULTANTS_TITLE);
        BrowserUtils.waitFor(1);
    }

    @Then("Texts are correct on Why should I choose Hidoctor")
    public void texts_are_correct_on_why_should_i_choose_hidoctor() {
        BrowserUtils.scrollToElement(onlinePsychologist.WHY_SHOULD_I_CHOOSE_TITLE);
        Assert.assertEquals(mainPage.whyShouldIChooseOnlineAdvice, onlinePsychologist.WHY_SHOULD_I_CHOOSE_TITLE.getAttribute("textContent"));
        Assert.assertEquals(mainPage.secureAndPrivateTitle, onlinePsychologist.SECURE_AND_PRIVATE_TITLE.getAttribute("textContent"));
        Assert.assertEquals(mainPage.secureAndPrivateText, onlinePsychologist.SECURE_AND_PRIVATE_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.guaranteedTitle, onlinePsychologist.GUARANTEED_TITLE.getAttribute("textContent"));
        Assert.assertEquals(mainPage.guaranteedText, onlinePsychologist.GUARANTEED_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.expertClinicalPsychologistsTitle, onlinePsychologist.EXPERT_CLINICAL_PSYCHOLOGISTS_TITLE.getAttribute("textContent"));
        Assert.assertEquals(mainPage.expertClinicalPsychologistsText, onlinePsychologist.EXPERT_CLINICAL_PSYCHOLOGISTS_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.evidencedBasedTherapyTitle, onlinePsychologist.EVIDENCE_BASED_THERAPY_TITLE.getAttribute("textContent"));
        Assert.assertEquals(mainPage.evidencedBasedTherapyText, onlinePsychologist.EVIDENCE_BASED_THERAPY_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.voiceAndVideoCallsTitle, onlinePsychologist.VOICE_AND_VIDEO_CALLS_TITLE.getAttribute("textContent"));
        Assert.assertEquals(mainPage.voiceAndVideoCallsText, onlinePsychologist.VOICE_AND_VIDEO_CALLS_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.accessibleAndTimesavingTitle, onlinePsychologist.ACCESSIBLE_AND_TIMESAVING_TITLE.getAttribute("textContent"));
        Assert.assertEquals(mainPage.accessibleAndTimesavingText, onlinePsychologist.ACCESSIBLE_AND_TIMESAVING_TEXT.getAttribute("textContent"));
    }

    @When("User clicks on Home Icon")
    public void user_clicks_on_home_icon() {
        BrowserUtils.waitForVisibility(onlinePsychologist.HOME_ICON, 10);
        onlinePsychologist.HOME_ICON.click();
    }

    @Then("User should land on the Main Page")
    public void user_should_land_on_the_main_page() {
        BrowserUtils.waitForVisibility(mainPage.CONTACT_US, 10);
        Assert.assertEquals(mainPage.title, Driver.getDriver().getTitle());
    }

    @When("Clicks on Online Psychologist")
    public void clicks_on_online_psychologist() {
        BrowserUtils.waitForVisibility(onlinePsychologist.HOME_ICON, 10);
        onlinePsychologist.ONLINE_PSYCHOLOGIST_TITLE.click();
    }

    @Then("User should stay in Online Psychologist page")
    public void user_should_stay_in_online_psychologist_page() {
        Assert.assertEquals(onlinePsychologist.onlinePsychologistPageTitle, Driver.getDriver().getTitle());
    }

    @Then("Title and sub-titles are correct on Banner section in Online Psychologist page")
    public void title_and_sub_titles_are_correct_on_banner_section_in_online_psychologist_page() {
        Assert.assertEquals(onlinePsychologist.onlinePsychologistH1Title, onlinePsychologist.ONLINE_PSYCHOLOGIST_H1_TITLE.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.onlinePsychologistSubtitle1, onlinePsychologist.ONLINE_PSYCHOLOGIST_SUBTITLE1.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.onlinePsychologistSubtitle2, onlinePsychologist.ONLINE_PSYCHOLOGIST_SUBTITLE2.getAttribute("textContent"));
        Assert.assertEquals(onlinePsychologist.onlinePsychologistSubtitle3, onlinePsychologist.ONLINE_PSYCHOLOGIST_SUBTITLE3.getAttribute("textContent"));
    }

    @Then("Horizontal scroll slides automatically")
    public void horizontal_scroll_slides_automatically() {
        String sliderAttribute1 = onlinePsychologist.TEXT_SLIDER.getAttribute("style");
        BrowserUtils.waitFor(3);
        String sliderAttribute2 = onlinePsychologist.TEXT_SLIDER.getAttribute("style");
        BrowserUtils.waitFor(3);
        String sliderAttribute3 = onlinePsychologist.TEXT_SLIDER.getAttribute("style");

        Assert.assertNotEquals(sliderAttribute1, sliderAttribute2);
        Assert.assertNotEquals(sliderAttribute1, sliderAttribute3);
    }

    @Then("Horizontal left scroll is working correctly")
    public void horizontal_left_scroll_is_working_correctly() {
        String centreText1 = onlinePsychologist.CENTRE_TEXT_SLIDER_TEXT_CONTENT.getAttribute("textContent");

        new Actions(Driver.getDriver()).moveToElement(onlinePsychologist.CENTRE_TEXT_SLIDER)
                .clickAndHold()
                .moveToElement(onlinePsychologist.LEFT_TEXT_SLIDER)
                .release()
                .perform();

        String centreText2 = onlinePsychologist.CENTRE_TEXT_SLIDER_TEXT_CONTENT.getAttribute("textContent");

        Assert.assertNotEquals(centreText1, centreText2);
    }

    @Then("Horizontal right scroll is working well")
    public void horizontal_right_scroll_is_working_well() {
        String centreText1 = onlinePsychologist.CENTRE_TEXT_SLIDER_TEXT_CONTENT.getAttribute("textContent");

        new Actions(Driver.getDriver()).moveToElement(onlinePsychologist.CENTRE_TEXT_SLIDER)
                .clickAndHold()
                .moveToElement(onlinePsychologist.RIGHT_TEXT_SLIDER)
                .release()
                .perform();

        String centreText2 = onlinePsychologist.CENTRE_TEXT_SLIDER_TEXT_CONTENT.getAttribute("textContent");

        Assert.assertNotEquals(centreText1, centreText2);
    }

    @When("User clicks on Find My Psychologists")
    public void user_clicks_on_find_my_psychologists() {
        onlinePsychologist.FIND_MY_PSYCHOLOGIST_BTN.click();
    }

    @Then("User should land Find My Psychologists page")
    public void user_should_land_find_my_psychologists_page() {
        BrowserUtils.waitFor(2);
        Assert.assertEquals(new FindOnlinePsychologist().pageTitle,Driver.getDriver().getTitle());
    }

    @When("User clicks on Select Psychologist")
    public void user_clicks_on_select_psychologist() {
        BrowserUtils.waitForVisibility(onlinePsychologist.LIST_ALL_PSYCHOLOGISTS_BTN, 10);
        onlinePsychologist.LIST_ALL_PSYCHOLOGISTS_BTN.click();
    }

    @When("User scrolls to Online Psychologists title over the slider")
    public void user_scrolls_to_online_psychologists_title_over_the_slider() {
        BrowserUtils.scrollToElement(onlinePsychologist.ONLINE_PSYCHOLOGISTS_OVER_SLIDER);
    }
    @Then("Title is correct on Psychologists slider")
    public void title_is_correct_on_psychologists_slider() {
        Assert.assertEquals(onlinePsychologist.onlinePsychologistsTitleOverSlider, onlinePsychologist.ONLINE_PSYCHOLOGISTS_OVER_SLIDER.getAttribute("textContent"));
    }
    @When("User clicks on All Psychologists chip")
    public void user_clicks_on_all_psychologists_chip() {
        BrowserUtils.waitFor(1);
        onlinePsychologist.ONLINE_PSYCHOLOGISTS_CHIP.click();
    }

    @Then("Slider works correctly on Psychologists slider with next")
    public void slider_works_correctly_on_psychologists_slider_with_next() {
        String firstState = onlinePsychologist.FIRST_PSYCHOLOGIST_BOX_IN_SLIDER.getAttribute("class");
        BrowserUtils.waitFor(1);
        onlinePsychologist.NEXT_SLIDE_BUTTON.click();
        BrowserUtils.waitFor(1);
        onlinePsychologist.NEXT_SLIDE_BUTTON.click();
        BrowserUtils.waitFor(1);
        String secondState = onlinePsychologist.FIRST_PSYCHOLOGIST_BOX_IN_SLIDER.getAttribute("class");
        Assert.assertNotEquals(firstState,secondState);
    }
    @Then("Slider works correctly on Psychologists slider with previous")
    public void slider_works_correctly_on_psychologists_slider_with_previous() {
        String firstState = onlinePsychologist.FIRST_PSYCHOLOGIST_BOX_IN_SLIDER.getAttribute("class");
        BrowserUtils.waitFor(1);
        onlinePsychologist.PREVIOUS_SLIDE_BUTTON.click();
        BrowserUtils.waitFor(1);
        onlinePsychologist.PREVIOUS_SLIDE_BUTTON.click();
        BrowserUtils.waitFor(1);
        String secondState = onlinePsychologist.FIRST_PSYCHOLOGIST_BOX_IN_SLIDER.getAttribute("class");
        Assert.assertNotEquals(firstState,secondState);
    }

    @When("The Psychologist is Online")
    public void the_psychologist_is_online() {

    }
    @Then("User should see the status correctly")
    public void user_should_see_the_status_correctly() {

    }
    @When("The Psychologist is offline")
    public void the_psychologist_is_offline() {

    }
    @When("The Psychologist is Busy")
    public void the_psychologist_is_busy() {

    }
    @When("User clicks on thumbnail of the psychologist")
    public void user_clicks_on_thumbnail_of_the_psychologist() {

    }
    @Then("User should land on related Psychologist page")
    public void user_should_land_on_related_psychologist_page() {

    }

    @Then("User should see Start Now button")
    public void user_should_see_start_now_button() {

    }
    @When("User clicks on Start Now button")
    public void user_clicks_on_start_now_button() {

    }

    @Then("Start Now button should be enabled")
    public void start_now_button_should_be_enabled() {

    }
    @Then("The expert info and status should be correct")
    public void the_expert_info_and_status_should_be_correct() {

    }
    @Then("Video and voice call analytics are compatible with each other")
    public void video_and_voice_call_analytics_are_compatible_with_each_other() {

    }

    @Then("User should see Reserve Later button")
    public void user_should_see_reserve_later_button() {

    }
    @When("User clicks on Reserve Later button")
    public void user_clicks_on_reserve_later_button() {

    }
    @Then("Start Now button should be disabled")
    public void start_now_button_should_be_disabled() {

    }

    @When("User clicks on profile picture of the Psychologist")
    public void user_clicks_on_profile_picture_of_the_psychologist() {

    }

    @When("User clicks on stars of the Psychologist")
    public void user_clicks_on_stars_of_the_psychologist() {

    }
    @When("User clicks on name of the Psychologist")
    public void user_clicks_on_name_of_the_psychologist() {

    }
    @When("User clicks on title of the Psychologist")
    public void user_clicks_on_title_of_the_psychologist() {

    }
    @When("User clicks on video call of the Psychologist")
    public void user_clicks_on_video_call_of_the_psychologist() {

    }
    @When("User clicks on voice call of the Psychologist")
    public void user_clicks_on_voice_call_of_the_psychologist() {

    }
    @When("User clicks on language of the Psychologist")
    public void user_clicks_on_language_of_the_psychologist() {

    }
    @When("User clicks on View Educations and Certifications")
    public void user_clicks_on_view_educations_and_certifications() {

    }
    @When("User clicks on Starting Price")
    public void user_clicks_on_starting_price() {

    }
    @When("User clicks on expertise chips")
    public void user_clicks_on_expertise_chips() {

    }
    @Then("User should land on related disease page")
    public void user_should_land_on_related_disease_page() {

    }
    @Then("User should see the expert name in the expertise list")
    public void user_should_see_the_expert_name_in_the_expertise_list() {

    }



}
