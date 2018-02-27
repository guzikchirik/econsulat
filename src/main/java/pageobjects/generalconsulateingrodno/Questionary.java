package pageobjects.generalconsulateingrodno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.CheckBox;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Select;
import ru.yandex.qatools.htmlelements.element.Table;
import ru.yandex.qatools.htmlelements.element.TextInput;

/**
 * Created by Anton_Chyrko on 2/26/2018.
 */
public class Questionary extends HtmlElement {

  @Name("1. Surname (s) (family name(s))")
  @FindBy(id = "cp_f_daneOs_txtNazwisko")
  private TextInput surname;

  @Name("2. Surname (s) at birth (previously used surname (s))")
  @FindBy(id = "cp_f_daneOs_txtNazwiskoRodowe")
  private TextInput surnameAtBirth;

  @Name("3. First name(s) ")
  @FindBy(id = "cp_f_daneOs_txtImiona")
  private TextInput firstName;

  @Name("4. Date of birth (year-month-day)")
  @FindBy(id = "cp_f_daneOs_txtDataUrodzin")
  private TextInput dateOfBirth;

  @Name("5. Place of birth")
  @FindBy(id = "cp_f_daneOs_txtMiejsceUrodzenia")
  private TextInput placeOfBirth;

  @Name("6. Country of birth")
  @FindBy(id = "cp_f_daneOs_cbKrajUrodzenia")
  private Select countryOfBirth;

  @Name("7. Current nationality/ies")
  @FindBy(id = "cp_f_daneOs_cbObecneObywatelstwo")
  private Select currentNationality;

  @Name("Original nationality/ies")
  @FindBy(id = "cp_f_daneOs_cbPosiadaneObywatelstwo")
  private Select originalNationality;

  @Name("8. Sex")
  @FindBy(id = "cp_f_daneOs_rbPlec")
  private Table sex;

  @Name("9. Martial status")
  @FindBy(id = "cp_f_daneOs_rbStanCywilny")
  private Table martialStatus;

  @Name("National identity number")
  @FindBy(id = "cp_f_txt5NumerDowodu")
  private TextInput nationalIdentityNumber;

  @Name("12. Type of travel document")
  @FindBy(id = "cp_f_rbl13")
  private Table typeOfTravelDocument;

  @Name("13. Number of travel document")
  @FindBy(id = "cp_f_txt14NumerPaszportu")
  private TextInput numberOfTravelDocument;

  @Name("14. Date of issue (year-month-day)")
  @FindBy(id = "cp_f_txt16WydanyDnia")
  private TextInput dateOfIssue;

  @Name("15. Valid until (year-month-day)")
  @FindBy(id = "cp_f_txt17WaznyDo")
  private TextInput validUntil;

  @Name("16. Issued by")
  @FindBy(id = "cp_f_txt15WydanyPrzez")
  private TextInput issuedBy;

  @Name("Checkbox does not apply")
  @FindBy(id = "cp_f_opiekunowie_chkNieDotyczy")
  private CheckBox checkboxDoesNotApply;

  @Name("17. Applicant’s home address and e-mail address")
  @FindBy(xpath = ".//span[@id='cp_f_lbl45AdresZamieszkania']/parent::td")
  private ApplicantsHomeAddressAndEmailAddress applicantsHomeAddressAndEmailAddress;

  @Name("18. Residence in a country other than the country of current nationality")
  @FindBy(id = "cp_f_rbl18_0")
  private Select residentOfCountry;

  @Name("19. Current occupation")
  @FindBy(id = "cp_f_ddl19WykonywanyZawod")
  private Select currentOccupation;

  @Name("20. Employer and employer’s address and phone number. For students, name and address of school")
  @FindBy(xpath = ".//table[@id='cp_f_rbl20']/parent::td")
  private EmployersAddressAndPhone employersAddressAndPhone;



  public ApplicantsHomeAddressAndEmailAddress getApplicantsHomeAddressAndEmailAddress() {
    return applicantsHomeAddressAndEmailAddress;
  }

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

  public void setTypeOfTravelDocument(TypeOfTravelDocument actualTypeOfTravelDocument) {
    for (int i = 0; i < this.typeOfTravelDocument.getRows().size(); i++) {
      WebElement option = this.typeOfTravelDocument.getRows().get(i).get(0)
          .findElements(By.cssSelector("input"))
          .get(0);
      if (option.getAttribute("value").equals(actualTypeOfTravelDocument.getValue())) {
        option.click();
      }
    }
  }

  public void setNumberOfTravelDocument(String numberOfTravelDocument) {
    this.numberOfTravelDocument.clear();
    this.numberOfTravelDocument.sendKeys(numberOfTravelDocument);
  }

  public void setDateOfIssue(String dateOfIssue) {
    this.dateOfIssue.clear();
    this.dateOfIssue.sendKeys(dateOfIssue);
  }

  public void setValidUntil(String validUntil) {
    this.validUntil.clear();
    this.validUntil.sendKeys(validUntil);
  }

  public void setIssuedBy(String issuedBy) {
    this.issuedBy.clear();
    this.issuedBy.sendKeys(issuedBy);
  }

  public void setCheckboxDoesNotApply() {
    checkboxDoesNotApply.select();
  }

  public void setNoResidentOfCountry() {
    residentOfCountry.selectByValue("Nie");
  }

  public void setCurrentOccupation(Occupation occupation) {
    this.currentOccupation.selectByValue(occupation.getValue());
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

  public enum TypeOfTravelDocument {
    ORDINARY_PASSPORT("1"),
    DIPLOMATIC_PASSPORT("2"),
    SERVICE_PASSPORT("3"),
    OFFICIAL_PASSPORT("4"),
    SPECIAL_PASSPORT("5"),
    OTHER_TRAVEL_DOCUMENT("6");

    private String value;

    TypeOfTravelDocument(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }
  }

  public enum Occupation {
    ARCHITECT("02"),
    ADMINISTRATIVE_TECHNICAL_AND_SERVICE_STAFF("33"),
    ARTISAN("03"),
    ARTIST("05"),
    BANKER("06"),
    BLUE_COLLAR_WORKER("24"),
    MANAGER("08");

    private String value;

    Occupation(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }
  }
}
