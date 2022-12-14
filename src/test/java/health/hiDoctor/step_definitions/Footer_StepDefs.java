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
        Assert.assertEquals(mainPage.download, mainPage.DOWNLOAD_TITLE.getAttribute("textContent"));

        Assert.assertEquals(mainPage.appStoreText, mainPage.APP_STORE_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.googlePlayText, mainPage.GOOGLE_PLAY_TEXT.getAttribute("textContent"));
        Assert.assertEquals(mainPage.appGalleryText, mainPage.APP_GALLERY_TEXT.getAttribute("textContent"));
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
        BrowserUtils.waitFor(1);
        Assert.assertEquals(mainPage.socialsTitle, mainPage.SOCIALS_TITLE_TEXT.getAttribute("textContent"));

        Assert.assertEquals("Instagram", mainPage.INSTAGRAM_TEXT.getAttribute("textContent"));
        Assert.assertEquals("YouTube", mainPage.YOUTUBE_TEXT.getAttribute("textContent"));
        Assert.assertEquals("Facebook", mainPage.FACEBOOK_TEXT.getAttribute("textContent"));
        Assert.assertEquals("Twitter", mainPage.TWITTER_TEXT.getAttribute("textContent"));
        Assert.assertEquals("Linkedin", mainPage.LINKEDIN_TEXT.getAttribute("textContent"));
    }

    @When("User clicks on Instagram")
    public void user_clicks_on_instagram() {
        mainPage.INSTAGRAM.click();
        BrowserUtils.waitFor(1);
    }

    @Then("User should land Instagram page")
    public void user_should_land_instagram_page() {
        BrowserUtils.switchToWindow(footer.instagramPageTitle);
        Assert.assertEquals(footer.instagramPageTitle, Driver.getDriver().getTitle());
    }

    @When("User clicks on YouTube")
    public void user_clicks_on_you_tube() {
        mainPage.YOUTUBE.click();
        BrowserUtils.waitFor(1);
    }

    @Then("User should land YouTube page")
    public void user_should_land_you_tube_page() {
        BrowserUtils.switchToWindow(footer.youtubePageTitle);
        Assert.assertEquals(footer.youtubePageTitle, Driver.getDriver().getTitle());
    }

    @When("User clicks on Facebook")
    public void user_clicks_on_facebook() {
        mainPage.FACEBOOK.click();
        BrowserUtils.waitFor(1);
    }

    @Then("User should land Facebook page")
    public void user_should_land_facebook_page() {
        BrowserUtils.switchToWindow(footer.facebookPageTitle);
        Assert.assertEquals(footer.facebookPageTitle, Driver.getDriver().getTitle());
    }

    @When("User clicks on Twitter")
    public void user_clicks_on_twitter() {
        mainPage.TWITTER.click();
        BrowserUtils.waitFor(1);
    }

    @Then("User should land Twitter page")
    public void user_should_land_twitter_page() {
        BrowserUtils.switchToWindow(footer.twitterPageTitle);
        BrowserUtils.waitFor(2);
        Assert.assertEquals(footer.twitterPageTitle, Driver.getDriver().getTitle());
    }

    @When("User clicks on Linkedin")
    public void user_clicks_on_linkedin() {
        mainPage.LINKEDIN.click();
        BrowserUtils.waitFor(1);
    }

    @Then("User should land Linkedin page")
    public void user_should_land_linkedin_page() {
        BrowserUtils.switchToWindow(footer.linkedinPageTitle);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(footer.linkedinPageTitle.equals(Driver.getDriver().getTitle()) ||
                footer.linkedinPageTitleLogOut.equals(Driver.getDriver().getTitle()));
    }

    @When("User navigates back")
    public void user_navigates_back() {
        Driver.getDriver().navigate().back();
    }

    @When("User switch to hiDoctor window")
    public void userSwitchToHiDoctorWindow() {
        BrowserUtils.switchToWindow(mainPage.title);
        BrowserUtils.waitFor(1);
    }

    @Then("Texts are correct in Services Section")
    public void texts_are_correct_in_services_section() {

    }
    @When("User clicks on Online Psychologist")
    public void user_clicks_on_online_psychologist() {

    }
    @Then("User should land Online Psychologist page")
    public void user_should_land_online_psychologist_page() {

    }
    @When("User clicks on Online Dietitian page")
    public void user_clicks_on_online_dietitian_page() {

    }
    @Then("User should land Online Dietitian page")
    public void user_should_land_online_dietitian_page() {

    }

    @Then("Texts are correct in Hidoctor Section")
    public void texts_are_correct_in_hidoctor_section() {

    }
    @When("User clicks on About Us")
    public void user_clicks_on_about_us() {

    }
    @Then("User should land About Us page")
    public void user_should_land_about_us_page() {

    }
    @When("User clicks on FAQ")
    public void user_clicks_on_faq() {

    }
    @Then("User should land FAQ page")
    public void user_should_land_faq_page() {

    }
    @When("User clicks on Blog")
    public void user_clicks_on_blog() {

    }
    @Then("User should land Blog page")
    public void user_should_land_blog_page() {

    }
    @When("User clicks on Promotion")
    public void user_clicks_on_promotion() {

    }
    @Then("User should land Promotion page")
    public void user_should_land_promotion_page() {

    }
    @When("User clicks on Areas of Expertise")
    public void user_clicks_on_areas_of_expertise() {

    }
    @Then("User should land tags page")
    public void user_should_land_tags_page() {

    }
    @Then("Text in the footer is correct")
    public void text_in_the_footer_is_correct() {

    }
    @Then("Regulatory texts are correct")
    public void regulatory_texts_are_correct() {

    }
    @Then("All rights reserved text is correct")
    public void all_rights_reserved_text_is_correct() {

    }
    @When("User clicks on Privacy Policy")
    public void user_clicks_on_privacy_policy() {

    }
    @Then("User should land privacy policy page")
    public void user_should_land_privacy_policy_page() {

    }
    @When("User clicks on User Agreement")
    public void user_clicks_on_user_agreement() {

    }
    @Then("User should land user agreement page")
    public void user_should_land_user_agreement_page() {

    }
    @When("User clicks on KVKK Agreement")
    public void user_clicks_on_kvkk_agreement() {

    }
    @Then("User should land KVKK agreement page")
    public void user_should_land_kvkk_agreement_page() {

    }


}
