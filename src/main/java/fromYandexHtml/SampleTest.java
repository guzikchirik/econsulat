package fromYandexHtml;

import driver.Driver;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {

  private WebDriver driver;
  private SearchPage searchPage;

  @BeforeTest(alwaysRun = true)
  public void loadPage() {
    driver =  Driver.getInstance().getDriver();
    driver.get("http://www.yandex.com");
    searchPage= new SearchPage(driver);
  }

  @Test
  public void sampleTest() throws InterruptedException {
    searchPage.search("yandex");
    // Some assertion here
  }

  @AfterTest(alwaysRun = true)
  public void closeDriver() {
    driver.close();
  }


}
