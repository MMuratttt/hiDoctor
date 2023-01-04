package health.hiDoctor.step_definitions;

import health.hiDoctor.pages.BasePage;
import health.hiDoctor.pages.Footer;
import health.hiDoctor.pages.MainPage;
import health.hiDoctor.utilities.BrowserUtils;
import health.hiDoctor.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Footer_StepDefs {

    MainPage mainPage = new MainPage();
    Footer footer = new Footer();

    @When("User clicks on App Store button")
    public void user_clicks_on_app_store_button() {
        BrowserUtils.scrollToElement(mainPage.ALL_RIGHTS_RESERVED_TEXT);
        BrowserUtils.waitFor(2);
        mainPage.APP_STORE_BTN.click();
    }
    @Then("User should land App Store page")
    public void user_should_land_app_store_page() {
        BrowserUtils.waitFor(2);
        Driver.getDriver().navigate().refresh();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(footer.appStorePageTitle) ||
                Driver.getDriver().getTitle().contains(footer.appStorePageTitleConnecting));
    }
    @Then("Title and texts are correct in Download section")
    public void title_and_texts_are_correct_in_download_section() {
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.scrollToElement(mainPage.ALL_RIGHTS_RESERVED_TEXT);
        Assert.assertEquals(mainPage.download,mainPage.DOWNLOAD_TITLE.getAttribute("textContent"));

        Assert.assertEquals(mainPage.appStoreText,mainPage.APP_STORE_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.googlePlayText,mainPage.GOOGLE_PLAY_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.appGalleryText,mainPage.APP_GALLERY_TEXT.getAttribute("textContent"));
    }

    @When("User clicks on Google Play button")
    public void user_clicks_on_google_play_button() {
        BrowserUtils.scrollToElement(mainPage.ALL_RIGHTS_RESERVED_TEXT);
        BrowserUtils.waitFor(2);
        mainPage.GOOGLE_PLAY_BTN.click();
    }
    @Then("User should land Google Play page")
    public void user_should_land_google_play_page() {
        BrowserUtils.waitForPageToLoad(10);
        Assert.assertEquals(footer.googlePlayPageTitle, Driver.getDriver().getTitle());
    }
    @When("User clicks on App Gallery button")
    public void user_clicks_on_app_gallery_button() {
        BrowserUtils.scrollToElement(mainPage.ALL_RIGHTS_RESERVED_TEXT);
        BrowserUtils.waitFor(2);
        mainPage.APP_GALLERY_BTN.click();
    }
    @Then("User should land App Gallery page")
    public void user_should_land_app_gallery_page() {
        BrowserUtils.waitForPageToLoad(10);
        Assert.assertEquals(footer.appGalleryPageTitle, Driver.getDriver().getTitle());
    }

    @Then("Texts are correct in Socials section")
    public void texts_are_correct_in_socials_section() {
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.scrollToElement(mainPage.ALL_RIGHTS_RESERVED_TEXT);
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
    @When("User navigates back")
    public void user_navigates_back() {
        Driver.getDriver().navigate().back();
    }
}
