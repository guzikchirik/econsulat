package driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

  private final WebDriver driver;
  private static final String PROPERTIES_FILE = "src/main/resources/driver.properties";
  private static Browser currentBrowser;
  private static Driver instance;
  private static int defaultImplicitWaitTimeOut;
  private static int defaultExplicitWaitTimeout;
  private static String url;

  private Driver() {
    driver = setUpDriver();
  }

  public static Driver getInstance(){
    if(instance==null){
      instance = new Driver();
    }
    return instance;
  }

  public static void closeInstance(){
    if (instance.driver != null){
      instance.driver.quit();
    }
    instance = null;
  }

  private WebDriver setUpDriver() {
    WebDriver driver = null;

    initProperties();

    switch (currentBrowser) {
      case CHROME:
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        break;
      default:
        System.setProperty("webdriver.gecko.driver", "src/main/resources/driver/geckodriver.exe");
        driver = new FirefoxDriver();
        break;
    }
    driver.manage().timeouts().implicitlyWait(defaultImplicitWaitTimeOut, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(defaultExplicitWaitTimeout, TimeUnit.SECONDS);

    return driver;
  }

  private void initProperties() {
    Properties properties = null;
    try (FileInputStream fileInputStream = new FileInputStream(PROPERTIES_FILE)) {
      properties = new Properties();
      properties.load(fileInputStream);
      defaultImplicitWaitTimeOut =
          Integer.parseInt(properties.getProperty("defaultImplicitWaitTimeOut"));
      defaultExplicitWaitTimeout =
          Integer.parseInt(properties.getProperty("defaultExplicitWaitTimeout"));
      url = properties.getProperty("url");
      currentBrowser = Browser.valueOf(properties.getProperty("browser").toUpperCase());

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public WebDriver getDriver(){
    return driver;
  }

  public enum Browser {
    CHROME,
    FIREFOX
  }
}
