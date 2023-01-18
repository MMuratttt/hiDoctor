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

    }
    @Then("First dropdown should be opened and answer is correct on the Online Psychologist")
    public void first_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {

    }
    @When("Click on second question on the Online Psychologist")
    public void click_on_second_question_on_the_online_psychologist() {

    }
    @Then("Second dropdown should be opened and answer is correct on the Online Psychologist")
    public void second_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {

    }
    @When("Click on third question on the Online Psychologist")
    public void click_on_third_question_on_the_online_psychologist() {

    }
    @Then("Third dropdown should be opened and answer is correct on the Online Psychologist")
    public void third_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {

    }
    @When("Click on fourth question on the Online Psychologist")
    public void click_on_fourth_question_on_the_online_psychologist() {

    }
    @Then("Fourth dropdown should be opened and answer is correct on the Online Psychologist")
    public void fourth_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {

    }
    @When("Click on fifth question on the Online Psychologist")
    public void click_on_fifth_question_on_the_online_psychologist() {

    }
    @Then("Fifth dropdown should be opened and answer is correct on the Online Psychologist")
    public void fifth_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {

    }
    @When("Click on sixth question on the Online Psychologist")
    public void click_on_sixth_question_on_the_online_psychologist() {

    }
    @Then("Sixth dropdown should be opened and answer is correct on the Online Psychologist")
    public void sixth_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {

    }
    @When("Click on seventh question on the Online Psychologist")
    public void click_on_seventh_question_on_the_online_psychologist() {

    }
    @Then("Seventh dropdown should be opened and answer is correct on the Online Psychologist")
    public void seventh_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {

    }
    @When("Click on eighth question on the Online Psychologist")
    public void click_on_eighth_question_on_the_online_psychologist() {

    }
    @Then("Eighth dropdown should be opened and answer is correct on the Online Psychologist")
    public void eighth_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {

    }
    @When("Click on ninth question on the Online Psychologist")
    public void click_on_ninth_question_on_the_online_psychologist() {

    }
    @Then("Ninth dropdown should be opened and answer is correct on the Online Psychologist")
    public void ninth_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {

    }





}
