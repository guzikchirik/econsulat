package test;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageobjects.EconsulatMainPage;

public abstract class AbstractTest {

  protected EconsulatMainPage mainPage;
  private WebDriver driver;

  @BeforeTest(alwaysRun = true)
  public void loadPage() {
    driver = Driver.getInstance().getDriver();
    driver.get(Driver.getUrl());
    mainPage = new EconsulatMainPage();
  }

  @AfterTest(alwaysRun = true)
  public void tearDown() {
    mainPage = null;//TODO it is unnecessary action
  }

  public WebDriver getDriver() {
    return driver;
  }
}
