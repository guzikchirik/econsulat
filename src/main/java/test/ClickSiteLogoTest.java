package test;

import org.testng.annotations.Test;
import pageobjects.generalconsulateingrodno.Questionary.MartialStatus;
import pageobjects.generalconsulateingrodno.Questionary.Occupation;
import pageobjects.generalconsulateingrodno.Questionary.Sex;
import pageobjects.generalconsulateingrodno.Questionary.TypeOfTravelDocument;

/**
 * Created by Anton_Chyrko on 2/21/2018.
 */
public class ClickSiteLogoTest extends AbstractTest {

  @Test(description = "1. Click site logo")
  public void clickSiteLogo() {
    mainPage.selectLanguage();
    mainPage.selectCountry();
    mainPage.selectEmbassy();
    mainPage.selectFillBlank();

    mainPage.getQuestionary().setSurname("Chyrko");
    mainPage.getQuestionary().setSurnameAtBirth("Chyrko");
    mainPage.getQuestionary().setFirstName("Anton");
    mainPage.getQuestionary().setDateOfBirth("1991-04-07");
    mainPage.getQuestionary().setPlaceOfBirth("Novoaltaisk");
    mainPage.getQuestionary().setCountryOfBirth("RUS");
    mainPage.getQuestionary().setCurrentNationality("BLR");
    mainPage.getQuestionary().setOriginalNationality("BLR");
    mainPage.getQuestionary().setSex(Sex.MALE);
    mainPage.getQuestionary().setMartialStatus(MartialStatus.MARRIED);
    mainPage.getQuestionary().setNationalIdentityNumber("1234567A123AA1");
    mainPage.getQuestionary().setTypeOfTravelDocument(TypeOfTravelDocument.ORDINARY_PASSPORT);
    mainPage.getQuestionary().setNumberOfTravelDocument("1234567A123AA1");
    mainPage.getQuestionary().setDateOfIssue("1991-04-07");
    mainPage.getQuestionary().setValidUntil("1991-04-07");
    mainPage.getQuestionary().setIssuedBy("Some text");
    mainPage.getQuestionary().setCheckboxDoesNotApply();

    mainPage.getQuestionary().getApplicantsHomeAddressAndEmailAddress().setCountry("BLR");
    mainPage.getQuestionary().getApplicantsHomeAddressAndEmailAddress().setStateOrPorvince("BLR");
    mainPage.getQuestionary().getApplicantsHomeAddressAndEmailAddress().setPlace("BLR");
    mainPage.getQuestionary().getApplicantsHomeAddressAndEmailAddress().setPostalCode("BLR");
    mainPage.getQuestionary().getApplicantsHomeAddressAndEmailAddress().setAddress("BLR");
    mainPage.getQuestionary().getApplicantsHomeAddressAndEmailAddress().setEmail("BLR");
    mainPage.getQuestionary().getApplicantsHomeAddressAndEmailAddress().setPhoneAreaCode("BLR");
    mainPage.getQuestionary().getApplicantsHomeAddressAndEmailAddress().setPhoneNumber("BLR");

    mainPage.getQuestionary().setNoResidentOfCountry();
    mainPage.getQuestionary().setCurrentOccupation(Occupation.MANAGER);

  }

}
