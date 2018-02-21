package fromYandexHtml;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

@Name("Search form")
@FindBy(xpath = "//form")
public class SearchArrow extends HtmlElement{
  @Name("Search request input")
  @FindBy(xpath = "//*[@id=\"text\"]")
  private TextInput requestInput;

  @Name("Search button")
  @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/eflll/div[5]/div/div[2]/div/div[2]/div/form/div[2]/button")
  private Button searchButton;

  public void search(String request) {
    requestInput.sendKeys(request);
    mouseOverElement(searchButton, Driver.getInstance().getDriver());
    searchButton.click();

  }

  public static void mouseOverElement(WebElement target, WebDriver driver) {
    new Actions(driver).moveToElement(target).build().perform();
  }
}
