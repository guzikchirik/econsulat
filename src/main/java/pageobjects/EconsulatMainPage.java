package pageobjects;

import java.util.Arrays;
import java.util.NoSuchElementException;
import org.openqa.selenium.support.FindBy;
import pageobjects.generalconsulateingrodno.Questionnaire;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.Select;

public class EconsulatMainPage extends BasePage {

//  private final WebDriver driver;
//
//  public EconsulatMainPage(WebDriver driver){
//    this.driver = driver;
//  }

  public EconsulatMainPage() {
    super();
  }

  @Name("Language")
  @FindBy(id = "ddlWersjeJezykowe")
  private Select language;

  @Name("Language marker")
  @FindBy(id = "EKONSULAT_Etykieta1")
  private Select languageMarker;

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

  public void selectCountry() {
    selectCountry.selectByValue("6");
  }

  public void selectEmbassy() {
    embassyOffice.selectByValue("95");
  }

  public void selectLanguage(String language) {
    Language lang = Arrays.stream(Language.values())
        .filter(s -> s.name().equalsIgnoreCase(language)).findFirst()
        .orElseThrow(() -> new NoSuchElementException("There is no such language " + language));
    this.language.selectByValue(lang.getValue());
  }

  public boolean isRightCountry(String country) {
    return selectCountry.getFirstSelectedOption().getText().equalsIgnoreCase(country);
  }

  public boolean isRightLanguageMarker(String languageMarker) {
    return this.languageMarker.getText().equalsIgnoreCase(languageMarker);
  }

  public void selectFillBlank() {
    nationalVisaFillBlankLink.click();
  }

  public Questionnaire getQuestionnaire() {
    return questionnaire;
  }

  public enum Language {
    POLSKA("1"),
    ENGLISH("2"),
    RUSSIAN("17");

    private String value;

    Language(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }
  }
}
