package fromYandexHtml;

import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class SearchPage {
//  private String hello;
  private SearchArrow searchArrow;
  // Other blocks and elements here ...

  public SearchPage(WebDriver driver) {
    HtmlElementLoader.populatePageObject(this, driver);
  }

  public void search(String request) {
    searchArrow.search(request);
  }

  // Other methods here ...
}
