package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
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

  @Name("e-Consulat section table")
  @FindBy(id = "tresc_panelIndywidualny")
  private ConsularSectionTable consularSectionTable;

  public ConsularSectionTable getConsularSectionTable() {
    return consularSectionTable;
  }

  public void selectCountry(){
    consularSectionTable.selectCountry();
  }

  public void selectEmbassy(){
    consularSectionTable.selectEmbassy();
  }

  public void selectLanguage() {
    language.selectByValue("17");
  }
}
