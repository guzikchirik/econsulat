package test;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageobjects.EconsulatMainPage;
import pageobjects.generalconsulateingrodno.GeneralConsulateInGrodno;

public abstract class AbstractTest {

  public WebDriver getDriver() {
    return driver;
  }

  private WebDriver driver;
  protected EconsulatMainPage mainPage;
  protected GeneralConsulateInGrodno pageGenConsulatGrodno;

  @BeforeTest(alwaysRun = true)
  public void loadPage() {
    driver = Driver.getInstance().getDriver();
    driver.get(Driver.getUrl());
    mainPage = new EconsulatMainPage();
  }

  @AfterTest(alwaysRun = true)
  public void tearDown() {
    driver.close();
  }


}
