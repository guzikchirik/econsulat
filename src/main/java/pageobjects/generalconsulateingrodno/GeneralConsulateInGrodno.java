package pageobjects.generalconsulateingrodno;

import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.Table;

/**
 * Created by Anton_Chyrko on 2/23/2018.
 */
public class GeneralConsulateInGrodno extends BasePage {

  private final String VISIBILITY_INDICATOR = "visible";

  @Name("Visa table")
  @FindBy(id = "_6525bbfc59ab0b_tabWewnetrznaMenu")
  private Table visaTable;

  @Name("National visa - fill blank")
  @FindBy(id = "_b5ff6d4140b941_hlWypelnienieKrajowa")
  private Link nationalVisaFillBlankLink;

  public boolean isVisaTablePresent(){
    return visaTable.getAttribute("style").contains(VISIBILITY_INDICATOR);
  }
  public void selectFillBlank(){
    nationalVisaFillBlankLink.click();
  }
}
