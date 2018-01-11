package pageobjects;


import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class BasePage {
  private final WebDriver driver;

  public BasePage(){
    driver = Driver.getInstance().getDriver();
  }

  public void refresh(){
    driver.navigate().refresh();
  }

  public WebDriver getDriver() {
    return driver;
  }

}
