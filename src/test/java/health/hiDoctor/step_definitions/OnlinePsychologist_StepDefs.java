package health.hiDoctor.step_definitions;

import health.hiDoctor.pages.MainPage;
import health.hiDoctor.pages.headers.services.OnlinePsychologist;
import health.hiDoctor.utilities.BrowserUtils;
import health.hiDoctor.utilities.ConfigurationReader;
import health.hiDoctor.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OnlinePsychologist_StepDefs {

    MainPage mainPage = new MainPage();
    OnlinePsychologist onlinePsychologist = new OnlinePsychologist();

    @Given("User is on the Online Psychologist page")
    public void user_is_on_the_online_psychologist_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("platformURL"));
        BrowserUtils.waitForVisibility(mainPage.LOGIN_REGISTER,10);
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
        Assert.assertEquals("false",onlinePsychologist.QUESTION_ONE_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_ONE_BTN.click();
    }
    @Then("First dropdown should be opened and answer is correct on the Online Psychologist")
    public void first_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerOne, onlinePsychologist.ANSWER_ONE.getAttribute("textContent"));
        onlinePsychologist.QUESTION_ONE_BTN.click();
        Assert.assertEquals("false",onlinePsychologist.QUESTION_ONE_BTN.getAttribute("aria-expanded"));
    }

    @When("Click on second question on the Online Psychologist")
    public void click_on_second_question_on_the_online_psychologist() {
        Assert.assertEquals("false",onlinePsychologist.QUESTION_TWO_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_TWO_BTN.click();
    }
    @Then("Second dropdown should be opened and answer is correct on the Online Psychologist")
    public void second_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerTwo, onlinePsychologist.ANSWER_TWO.getAttribute("textContent"));
        onlinePsychologist.QUESTION_TWO_BTN.click();
        Assert.assertEquals("false",onlinePsychologist.QUESTION_TWO_BTN.getAttribute("aria-expanded"));
    }
    @When("Click on third question on the Online Psychologist")
    public void click_on_third_question_on_the_online_psychologist() {
        Assert.assertEquals("false",onlinePsychologist.QUESTION_THREE_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_THREE_BTN.click();
    }
    @Then("Third dropdown should be opened and answer is correct on the Online Psychologist")
    public void third_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerThree, onlinePsychologist.ANSWER_THREE.getAttribute("textContent"));
        onlinePsychologist.QUESTION_THREE_BTN.click();
        Assert.assertEquals("false",onlinePsychologist.QUESTION_THREE_BTN.getAttribute("aria-expanded"));
    }
    @When("Click on fourth question on the Online Psychologist")
    public void click_on_fourth_question_on_the_online_psychologist() {
        Assert.assertEquals("false",onlinePsychologist.QUESTION_FOUR_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_FOUR_BTN.click();
    }
    @Then("Fourth dropdown should be opened and answer is correct on the Online Psychologist")
    public void fourth_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerFour, onlinePsychologist.ANSWER_FOUR.getAttribute("textContent"));
        onlinePsychologist.QUESTION_FOUR_BTN.click();
        Assert.assertEquals("false",onlinePsychologist.QUESTION_FOUR_BTN.getAttribute("aria-expanded"));
    }
    @When("Click on fifth question on the Online Psychologist")
    public void click_on_fifth_question_on_the_online_psychologist() {
        Assert.assertEquals("false",onlinePsychologist.QUESTION_FOUR_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_FIVE_BTN.click();
    }
    @Then("Fifth dropdown should be opened and answer is correct on the Online Psychologist")
    public void fifth_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerFive, onlinePsychologist.ANSWER_FIVE.getAttribute("textContent"));
        onlinePsychologist.QUESTION_FIVE_BTN.click();
        Assert.assertEquals("false",onlinePsychologist.QUESTION_FIVE_BTN.getAttribute("aria-expanded"));
    }
    @When("Click on sixth question on the Online Psychologist")
    public void click_on_sixth_question_on_the_online_psychologist() {
        Assert.assertEquals("false",onlinePsychologist.QUESTION_SIX_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_SIX_BTN.click();
    }
    @Then("Sixth dropdown should be opened and answer is correct on the Online Psychologist")
    public void sixth_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerSix, onlinePsychologist.ANSWER_SIX.getAttribute("textContent"));
        onlinePsychologist.QUESTION_SIX_BTN.click();
        Assert.assertEquals("false",onlinePsychologist.QUESTION_SIX_BTN.getAttribute("aria-expanded"));
    }
    @When("Click on seventh question on the Online Psychologist")
    public void click_on_seventh_question_on_the_online_psychologist() {
        Assert.assertEquals("false",onlinePsychologist.QUESTION_SEVEN_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_SEVEN_BTN.click();
    }
    @Then("Seventh dropdown should be opened and answer is correct on the Online Psychologist")
    public void seventh_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerSeven, onlinePsychologist.ANSWER_SEVEN.getAttribute("textContent"));
        onlinePsychologist.QUESTION_SEVEN_BTN.click();
        Assert.assertEquals("false",onlinePsychologist.QUESTION_SEVEN_BTN.getAttribute("aria-expanded"));
    }
    @When("Click on eighth question on the Online Psychologist")
    public void click_on_eighth_question_on_the_online_psychologist() {
        Assert.assertEquals("false",onlinePsychologist.QUESTION_EIGHT_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_EIGHT_BTN.click();
    }
    @Then("Eighth dropdown should be opened and answer is correct on the Online Psychologist")
    public void eighth_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerEight, onlinePsychologist.ANSWER_EIGHT.getAttribute("textContent"));
        onlinePsychologist.QUESTION_EIGHT_BTN.click();
        Assert.assertEquals("false",onlinePsychologist.QUESTION_EIGHT_BTN.getAttribute("aria-expanded"));
    }
    @When("Click on ninth question on the Online Psychologist")
    public void click_on_ninth_question_on_the_online_psychologist() {
        Assert.assertEquals("false",onlinePsychologist.QUESTION_NINE_BTN.getAttribute("aria-expanded"));
        BrowserUtils.waitFor(2);
        onlinePsychologist.QUESTION_NINE_BTN.click();
    }
    @Then("Ninth dropdown should be opened and answer is correct on the Online Psychologist")
    public void ninth_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {
        Assert.assertEquals(onlinePsychologist.answerNine, onlinePsychologist.ANSWER_NINE.getAttribute("textContent"));
        onlinePsychologist.QUESTION_NINE_BTN.click();
        Assert.assertEquals("false",onlinePsychologist.QUESTION_NINE_BTN.getAttribute("aria-expanded"));
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
        Assert.assertEquals(onlinePsychologist.downloadAppTitle,onlinePsychologist.DOWNLOAD_APP_TITLE.getAttribute("textContent"));
    }
    @Then("Download the app text is correct")
    public void download_the_app_text_is_correct() {
        Assert.assertEquals(onlinePsychologist.downloadAppText,onlinePsychologist.DOWNLOAD_APP_TEXT.getAttribute("textContent"));
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

    }
    @Then("Previous button is disabled next button is enabled in default on Online Psychologist page")
    public void previous_button_is_disabled_next_button_is_enabled_in_default_on_online_psychologist_page() {

    }
    @When("User clicks on next button on Online Psychologist page")
    public void user_clicks_on_next_button_on_online_psychologist_page() {

    }
    @Then("Previous button is enabled next button is disabled in default on Online Psychologist page")
    public void previous_button_is_enabled_next_button_is_disabled_in_default_on_online_psychologist_page() {

    }
    @When("User clicks on previous button on Online Psychologist page")
    public void user_clicks_on_previous_button_on_online_psychologist_page() {

    }
    @Then("Subtitle and text is correct for Health certificate and logo is visible")
    public void subtitle_and_text_is_correct_for_health_certificate_and_logo_is_visible() {

    }
    @Then("Subtitle and text is correct for SPICE and logo is visible")
    public void subtitle_and_text_is_correct_for_spice_and_logo_is_visible() {

    }

    @Then("Subtitle and text is correct for ISO 45003 and logo is visible")
    public void subtitle_and_text_is_correct_for_iso_45003_and_logo_is_visible() {

    }

    @Then("Subtitle and text is correct for ISO 27001 and logo is visible")
    public void subtitle_and_text_is_correct_for_iso_27001_and_logo_is_visible() {

    }
    @Then("Subtitle and text is correct for ISO 20000 and logo is visible")
    public void subtitle_and_text_is_correct_for_iso_20000_and_logo_is_visible() {

    }
    @Then("Subtitle and text is correct for ETBIS and logo is visible")
    public void subtitle_and_text_is_correct_for_etbis_and_logo_is_visible() {

    }





}
