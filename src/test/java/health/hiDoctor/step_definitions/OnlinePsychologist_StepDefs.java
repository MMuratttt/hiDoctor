package health.hiDoctor.step_definitions;

import health.hiDoctor.pages.MainPage;
import health.hiDoctor.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OnlinePsychologist_StepDefs {

    MainPage mainPage = new MainPage();

    @Given("User is on the Online Psychologist page as logged in")
    public void user_is_on_the_online_psychologist_page_as_logged_in() {
        BrowserUtils.login();
        BrowserUtils.waitForVisibility(mainPage.PROFILE,10);
        mainPage.SERVICES.click();
        mainPage.ONLINE_PSYCHOLOGIST.click();
    }
    @Then("FAQ title and question texts are correct on the Online Psychologist")
    public void faq_title_and_question_texts_are_correct_on_the_online_psychologist() {
     /*   BrowserUtils.scrollToElement(mainPage.ALL_RIGHTS_RESERVED_TEXT);
        BrowserUtils.waitForVisibility(mainPage.QUESTION_ONE_BTN, 10);
        Assert.assertEquals(mainPage.FAQ_Title, mainPage.FAQ_TITLE.getAttribute("textContent"));
        Assert.assertEquals(mainPage.questionOne, mainPage.QUESTION_ONE_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.questionTwo, mainPage.QUESTION_TWO_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.questionThree, mainPage.QUESTION_THREE_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.questionFour, mainPage.QUESTION_FOUR_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.questionFour, mainPage.QUESTION_FOUR_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.questionFour, mainPage.QUESTION_FOUR_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.questionFour, mainPage.QUESTION_FOUR_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.questionFour, mainPage.QUESTION_FOUR_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.questionFour, mainPage.QUESTION_FOUR_TEXT.getAttribute("textContent")); */
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
    @Then("ninth dropdown should be opened and answer is correct on the Online Psychologist")
    public void ninth_dropdown_should_be_opened_and_answer_is_correct_on_the_online_psychologist() {

    }





}
