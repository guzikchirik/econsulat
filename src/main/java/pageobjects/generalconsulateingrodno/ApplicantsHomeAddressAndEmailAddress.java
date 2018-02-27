package pageobjects.generalconsulateingrodno;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Select;
import ru.yandex.qatools.htmlelements.element.TextInput;

/**
 * Created by Anton_Chyrko on 2/27/2018.
 */
public class ApplicantsHomeAddressAndEmailAddress extends HtmlElement {

  @Name("Country")
  @FindBy(id = "cp_f_ddl45Panstwo")
  private Select country;

  @Name("State/province")
  @FindBy(id = "cp_f_txt45StanProwincja")
  private TextInput stateOrPorvince;

  @Name("Place ")
  @FindBy(id = "cp_f_txt45Miejscowosc")
  private TextInput place ;

  @Name("Postal code")
  @FindBy(id = "cp_f_txt45Kod")
  private TextInput postalCode;

  @Name("Address")
  @FindBy(id = "cp_f_txt45Adres")
  private TextInput address;

  @Name("Email ")
  @FindBy(id = "cp_f_txt17Email")
  private TextInput email ;

  @Name("Phone area code")
  @FindBy(id = "cp_f_txt46TelefonPrefiks0")
  private TextInput phoneAreaCode;

  @Name("Phone number")
  @FindBy(id = "cp_f_txt46TelefonNumer0")
  private TextInput phoneNumber;

  public void setCountry(String country) {
    this.country.selectByValue(country);
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

  public void setEmail(String email) {
    this.email.clear();
    this.email.sendKeys(email);
  }

  public void setPhoneAreaCode(String phoneAreaCode) {
    this.phoneAreaCode.clear();
    this.phoneAreaCode.sendKeys(phoneAreaCode);
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber.clear();
    this.phoneNumber.sendKeys(phoneNumber);
  }
}
