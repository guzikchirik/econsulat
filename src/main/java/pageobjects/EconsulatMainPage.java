package pageobjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import pageobjects.generalconsulateingrodno.GeneralConsulateInGrodno;
import pageobjects.generalconsulateingrodno.Questionary;
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

  @Name("Questionary")
  @FindBy(id = "cp_f_panelFormularz")
  private Questionary questionary;

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

  public Questionary getQuestionary() {
    return questionary;
  }
}
