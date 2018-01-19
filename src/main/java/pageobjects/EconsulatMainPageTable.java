package pageobjects;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;


@Name("Main table")
@FindBy(id = "tab_indywidualny")
public class EconsulatMainPageTable extends HtmlElement {

  @Name("e-Consulat")
  @FindBy(id = "HL_EKonsulat")
  private Link econsulatLink;

  public Link getEconsulatLink() {
    return econsulatLink;
  }
}
