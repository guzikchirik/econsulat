package pageobjects;

import org.openqa.selenium.support.FindBy;
import pageobjects.generalconsulateingrodno.Questionnaire;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.Select;

public class EconsulatMainPage extends BasePage{

//  private final WebDriver driver;
//
//  public EconsulatMainPage(WebDriver driver){
//    this.driver = driver;
//  }

  public EconsulatMainPage(){
    super();
  }

  @Name("Language")
  @FindBy(id = "ddlWersjeJezykowe")
  private Select language;

  @Name("Country")
  @FindBy(id = "tresc_cbListaKrajow")
  private Select selectCountry;

  @Name("Embassy office")
  @FindBy(id = "tresc_cbListaPlacowek")
  private Select embassyOffice;

  @Name("National visa - fill blank")
  @FindBy(xpath = ".//*[contains(@id, 'hlWypelnienieKrajowa')]")
  private Link nationalVisaFillBlankLink;

  @Name("Questionnaire")
  @FindBy(id = "cp_f_panelFormularz")
  private Questionnaire questionnaire;

  public void selectCountry(){
    selectCountry.selectByValue("6");
  }

  public void selectEmbassy(){
    embassyOffice.selectByValue("95");
  }

  public void selectLanguage() {
    language.selectByValue("17");
  }

  public void selectFillBlank(){
    nationalVisaFillBlankLink.click();
  }

  public Questionnaire getQuestionnaire() {
    return questionnaire;
  }
}
