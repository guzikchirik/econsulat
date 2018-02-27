package pageobjects.generalconsulateingrodno;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Select;
import ru.yandex.qatools.htmlelements.element.TextInput;

/**
 * Created by Anton_Chyrko on 2/27/2018.
 */
public class EmployersAddressAndPhone extends HtmlElement {

  @Name("Employer")
  @FindBy(id = "cp_f_rbl20_0")
  private TextInput employer;

  @Name("School")
  @FindBy(id = "cp_f_rbl20_1")
  private TextInput school;

  @Name("State")
  @FindBy(id = "cp_f_dd20bPanstwo")
  private Select state;

  @Name("State/province")
  @FindBy(id = "cp_f_txt20cStanProwincja")
  private TextInput stateOrPorvince;

  @Name("Place ")
  @FindBy(id = "cp_f_txt20dMiejscowosc")
  private TextInput place;

  @Name("Postal code")
  @FindBy(id = "cp_f_txt20eKodPocztowy")
  private TextInput postalCode;

  @Name("Address")
  @FindBy(id = "cp_f_txt20fAdres")
  private TextInput address;

  @Name("Phone area code")
  @FindBy(id = "cp_f_txt20gPrefix")
  private TextInput phoneAreaCode;

  @Name("Phone")
  @FindBy(id = "cp_f_txt20hTelefon")
  private TextInput phoneNumber;

  @Name("Name")
  @FindBy(id = "cp_f_txt20Nazwa")
  private TextInput name;

  @Name("Email ")
  @FindBy(id = "cp_f_txt20Email")
  private TextInput email;

  @Name("Fax area code")
  @FindBy(id = "cp_f_txt20PrefiksFax")
  private TextInput faxAreaCode;

  @Name("Number of fax")
  @FindBy(id = "cp_f_txt20NumerFax")
  private TextInput numberOfFax;

  public void setEmployerOrSchool(String value) {
    if (value.equalsIgnoreCase("employer")) {
      employer.click();
    } else {
      school.click();
    }
  }

  public void setState(State state) {
    this.state.selectByValue(state.getValue());
  }

  public void setStateOrPorvince(String stateOrPorvince) {
    this.stateOrPorvince.clear();
    this.stateOrPorvince.sendKeys(stateOrPorvince);
  }

  public void setPlace(String place) {
    this.place.clear();
    this.place.sendKeys(place);
  }

  public void setPostalCode(String postalCode) {
    this.postalCode.clear();
    this.postalCode.sendKeys(postalCode);
  }

  public void setAddress(String address) {
    this.address.clear();
    this.address.sendKeys(address);
  }

  public void setPhoneAreaCode(String phoneAreaCode) {
    this.phoneAreaCode.clear();
    this.phoneAreaCode.sendKeys(phoneAreaCode);
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber.clear();
    this.phoneNumber.sendKeys(phoneNumber);
  }

  public void setName(String name) {
    this.name.clear();
    this.name.sendKeys(name);
  }

  public void setEmail(String email) {
    this.email.clear();
    this.email.sendKeys(email);
  }

  public void setFaxAreaCode(String faxAreaCode) {
    this.faxAreaCode.clear();
    this.faxAreaCode.sendKeys(faxAreaCode);
  }

  public void setNumberOfFax(String numberOfFax) {
    this.numberOfFax.clear();
    this.numberOfFax.sendKeys(numberOfFax);
  }

  public enum State {
    BELARUS("BLR"),
    MARRIED("ZZ"),
    SEPARATED("SP"),
    DIVORCED("RR"),
    WIDOW("WW"),
    OTHER("IN");

    private String value;

    State(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }
  }
}
