package pageobjects.generalconsulateingrodno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Select;
import ru.yandex.qatools.htmlelements.element.Table;
import ru.yandex.qatools.htmlelements.element.TextInput;

/**
 * Created by Anton_Chyrko on 2/26/2018.
 */
public class Questionary extends HtmlElement {

  @Name("Surname")
  @FindBy(id = "cp_f_daneOs_txtNazwisko")
  private TextInput surname;

  @Name("Surname (s) at birth")
  @FindBy(id = "cp_f_daneOs_txtNazwiskoRodowe")
  private TextInput surnameAtBirth;

  @Name("First name")
  @FindBy(id = "cp_f_daneOs_txtImiona")
  private TextInput firstName;

  @Name("Date of birth")
  @FindBy(id = "cp_f_daneOs_txtDataUrodzin")
  private TextInput dateOfBirth;

  @Name("Place of birth")
  @FindBy(id = "cp_f_daneOs_txtMiejsceUrodzenia")
  private TextInput placeOfBirth;

  @Name("Country of birth")
  @FindBy(id = "cp_f_daneOs_cbKrajUrodzenia")
  private Select countryOfBirth;

  @Name("Current nationality/ies")
  @FindBy(id = "cp_f_daneOs_cbObecneObywatelstwo")
  private Select currentNationality;

  @Name("Original nationality/ies")
  @FindBy(id = "cp_f_daneOs_cbPosiadaneObywatelstwo")
  private Select originalNationality;

  @Name("Sex")
  @FindBy(id = "cp_f_daneOs_rbPlec")
  private Table sex;

  @Name("Martial status")
  @FindBy(id = "cp_f_daneOs_rbStanCywilny")
  private Table martialStatus;

  @Name("National identity number")
  @FindBy(id = "cp_f_txt5NumerDowodu")
  private TextInput nationalIdentityNumber;

  public void setSurname(String surname) {
    this.surname.clear();
    this.surname.sendKeys(surname);
  }

  public void setSurnameAtBirth(String surnameAtBirth) {
    this.surnameAtBirth.clear();
    this.surnameAtBirth.sendKeys(surnameAtBirth);
  }

  public void setFirstName(String firstName) {
    this.firstName.clear();
    this.firstName.sendKeys(firstName);
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth.clear();
    this.dateOfBirth.sendKeys(dateOfBirth);
  }

  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth.clear();
    this.placeOfBirth.sendKeys(placeOfBirth);
  }

  public void setCountryOfBirth(String countryOfBirth) {
    this.countryOfBirth.selectByValue(countryOfBirth);
  }

  public void setCurrentNationality(String currentNationality) {
    this.currentNationality.selectByValue(currentNationality);
  }

  public void setOriginalNationality(String originalNationality) {
    this.originalNationality.selectByValue(originalNationality);
  }

  public void setSex(Sex actualSex) {
    for (int i = 0; i < this.sex.getRows().size(); i++) {
      WebElement option = this.sex.getRows().get(i).get(0).findElements(By.cssSelector("input"))
          .get(0);
      if (option.getAttribute("value").equals(actualSex.getValue())) {
        option.click();
      }
    }
  }

  public void setMartialStatus(MartialStatus actualMartialStatus) {
    for (int i = 0; i < this.martialStatus.getRows().size(); i++) {
      WebElement option = this.martialStatus.getRows().get(i).get(0)
          .findElements(By.cssSelector("input"))
          .get(0);
      if (option.getAttribute("value").equals(actualMartialStatus.getValue())) {
        option.click();
      }
    }
  }

  public void setNationalIdentityNumber(String nationalIdentityNumber) {
    this.nationalIdentityNumber.clear();
    this.nationalIdentityNumber.sendKeys(nationalIdentityNumber);
  }








  public enum Sex {
    MALE("M"),
    FEMALE("F");

    private String value;

    Sex(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }
  }

  public enum MartialStatus {
    SINGLE("KP"),
    MARRIED("ZZ"),
    SEPARATED("SP"),
    DIVORCED("RR"),
    WIDOW("WW"),
    OTHER("IN");

    private String value;

    MartialStatus(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }
  }


}
