package test;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageobjects.EconsulatMainPage;

public abstract class AbstractTest {

  private WebDriver driver;
  protected EconsulatMainPage page;

  @BeforeTest(alwaysRun = true)
  public void loadPage() {
    driver = Driver.getInstance().getDriver();
    driver.get(Driver.getUrl());
    page = new EconsulatMainPage();
  }

  @AfterTest(alwaysRun = true)
  public void tearDown() {
    driver.close();
  }

}
