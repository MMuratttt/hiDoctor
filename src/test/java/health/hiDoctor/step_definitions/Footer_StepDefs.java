package health.hiDoctor.step_definitions;

import health.hiDoctor.pages.BasePage;
import health.hiDoctor.pages.MainPage;
import health.hiDoctor.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Footer_StepDefs extends BasePage {

    MainPage mainPage = new MainPage();

    @When("User clicks on App Store button")
    public void user_clicks_on_app_store_button() {
        BrowserUtils.scrollToElement(mainPage.ALL_RIGHTS_RESERVED_TEXT);
    }
    @Then("User should land App Store page")
    public void user_should_land_app_store_page() {

    }
    @Then("Title and texts are correct in Download section")
    public void title_and_texts_are_correct_in_download_section() {

    }

    @When("User clicks on Google Play button")
    public void user_clicks_on_google_play_button() {

    }
    @Then("User should land Google Play page")
    public void user_should_land_google_play_page() {

    }
    @When("User clicks on App Gallery button")
    public void user_clicks_on_app_gallery_button() {

    }
    @Then("User should land App Gallery page")
    public void user_should_land_app_gallery_page() {

    }

    @Then("Texts are correct in Socials section")
    public void texts_are_correct_in_socials_section() {

    }
    @When("User clicks on Instagram")
    public void user_clicks_on_instagram() {

    }
    @Then("User should land Instagram page")
    public void user_should_land_instagram_page() {

    }
    @When("User clicks on YouTube")
    public void user_clicks_on_you_tube() {

    }
    @Then("User should land YouTube page")
    public void user_should_land_you_tube_page() {

    }
    @When("User clicks on Facebook")
    public void user_clicks_on_facebook() {

    }
    @Then("User should land Facebook page")
    public void user_should_land_facebook_page() {

    }
    @When("User clicks on Twitter")
    public void user_clicks_on_twitter() {

    }
    @Then("User should land Twitter page")
    public void user_should_land_twitter_page() {

    }
    @When("User clicks on Linkedin")
    public void user_clicks_on_linkedin() {

    }
    @Then("User should land Linkedin page")
    public void user_should_land_linkedin_page() {

    }





}
