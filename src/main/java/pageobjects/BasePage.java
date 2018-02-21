package pageobjects;


import driver.Driver;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public abstract class BasePage {

  private final WebDriver driver = Driver.getInstance().getDriver();

  public BasePage() {
    HtmlElementLoader.populatePageObject(this, driver);
  }

  public void refresh() {
    driver.navigate().refresh();
  }

  public WebDriver getDriver() {
    return driver;
  }

}
