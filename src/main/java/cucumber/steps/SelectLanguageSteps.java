package cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pageobjects.EconsulatMainPage;

/**
 * Created by Anton_Chyrko on 3/3/2018.
 */
public class SelectLanguageSteps {
  EconsulatMainPage mainPage = new EconsulatMainPage();

  @Given("^an open browser with ([^\\s]*)$")
  public void navigateToMainPage(String url) {
    System.out.println("url = " + url);
  }

  @When("^user select \"([^\"]*)\" in filter$")
  public void userSelectLanguage(String value) {
    System.out.println("language value = " + value);
    mainPage.selectLanguage(value);
  }

  @And("^repeat")
  public void stub() {
  }

  @Then("^language marker value changing to \"([^\"]*)\"$")
  public void checkLanguageMarker(String languageMarker) {
    Assert.assertTrue(mainPage.isRightLanguageMarker(languageMarker));
  }
}
