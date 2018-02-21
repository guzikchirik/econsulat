package pageobjects;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Select;

/**
 * Created by Anton_Chyrko on 2/21/2018.
 */
public class ConsularSectionTable extends HtmlElement {

  @Name("Country")
  @FindBy(id = "tresc_cbListaKrajow")
  private Select selectCountry;

  @Name("Embassy office")
  @FindBy(id = "tresc_cbListaPlacowek")
  private Select embassyOffice;


  public void selectCountry(){
    selectCountry.selectByValue("6");
  }

  public void selectEmbassy(){
    embassyOffice.selectByValue("95");
  }
}
