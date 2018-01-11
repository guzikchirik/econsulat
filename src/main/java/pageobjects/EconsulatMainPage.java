package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Link;

public class EconsulatMainPage extends BasePage {

  private static final By SITE_LOGO_LOCATOR = By.xpath("//*[@class = 'site-logo']");

  @Name("e-Consulat")
  @FindBy(id = "HL_EKonsulat")
  private Link econsulatLink;

  public Link getEconsulatLink() {
    return econsulatLink;
  }
}
