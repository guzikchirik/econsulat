package cucumber.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageobjects.EconsulatMainPage;

/**
 * Created by Anton_Chyrko on 3/3/2018.
 */

@CucumberOptions(plugin = {"json:target/cucumber-report.json",
    "html:target/cucumber-report"}, features = "src/main/resources/cucumberfeatures/selectLanguage.feature",
    glue = "")
public class SelectLanguageTest extends AbstractTestNGCucumberTests {

  protected EconsulatMainPage mainPage;
  private WebDriver driver;

  @BeforeClass
  public void setUpMainPage() {
    driver = Driver.getInstance().getDriver();
    driver.get(Driver.getUrl());
    mainPage = new EconsulatMainPage();
  }

  @AfterClass
  public void closeBrowser() {
    Driver.closeInstance();
  }
}
