package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.generalconsulateingrodno.Questionnaire.Country;
import pageobjects.generalconsulateingrodno.Questionnaire.MartialStatus;
import pageobjects.generalconsulateingrodno.Questionnaire.NumberOfEntriesRequested;
import pageobjects.generalconsulateingrodno.Questionnaire.Occupation;
import pageobjects.generalconsulateingrodno.Questionnaire.PurposeOfJourney;
import pageobjects.generalconsulateingrodno.Questionnaire.Sex;
import pageobjects.generalconsulateingrodno.Questionnaire.TypeOfTravelDocument;

/**
 * Created by Anton_Chyrko on 2/21/2018.
 */
public class ClickSiteLogoTest extends AbstractTest {

  @Test(description = "1. Click site logo")
  public void clickSiteLogo() {
    mainPage.selectLanguage("Russian");//TODO Change to enum in the nearest future
    mainPage.selectCountry();
    mainPage.selectEmbassy();
    mainPage.selectFillBlank();

    mainPage.getQuestionnaire().setSurname("Chyrko");
    mainPage.getQuestionnaire().setSurnameAtBirth("Chyrko");
    mainPage.getQuestionnaire().setFirstName("Anton");
    mainPage.getQuestionnaire().setDateOfBirth("1991-04-07");
    mainPage.getQuestionnaire().setPlaceOfBirth("Novoaltaisk");
    mainPage.getQuestionnaire().setCountryOfBirth("RUS");
    mainPage.getQuestionnaire().setCurrentNationality("BLR");
    mainPage.getQuestionnaire().setOriginalNationality("BLR");
    mainPage.getQuestionnaire().setSex(Sex.MALE);
    mainPage.getQuestionnaire().setMartialStatus(MartialStatus.MARRIED);
    mainPage.getQuestionnaire().setNationalIdentityNumber("1234567A123AA1");
    mainPage.getQuestionnaire().setTypeOfTravelDocument(TypeOfTravelDocument.ORDINARY_PASSPORT);
    mainPage.getQuestionnaire().setNumberOfTravelDocument("1234567A123AA1");
    mainPage.getQuestionnaire().setDateOfIssue("1991-04-07");
    mainPage.getQuestionnaire().setValidUntil("1991-04-07");
    mainPage.getQuestionnaire().setIssuedBy("Some text");
    mainPage.getQuestionnaire().setCheckboxDoesNotApply();

    mainPage.getQuestionnaire().getApplicantsHomeAddressAndEmailAddress().setCountry("BLR");
    mainPage.getQuestionnaire().getApplicantsHomeAddressAndEmailAddress().setStateOrPorvince("BLR");
    mainPage.getQuestionnaire().getApplicantsHomeAddressAndEmailAddress().setPlace("BLR");
    mainPage.getQuestionnaire().getApplicantsHomeAddressAndEmailAddress().setPostalCode("BLR");
    mainPage.getQuestionnaire().getApplicantsHomeAddressAndEmailAddress().setAddress("BLR");
    mainPage.getQuestionnaire().getApplicantsHomeAddressAndEmailAddress().setEmail("BLR");
    mainPage.getQuestionnaire().getApplicantsHomeAddressAndEmailAddress().setPhoneAreaCode("BLR");
    mainPage.getQuestionnaire().getApplicantsHomeAddressAndEmailAddress().setPhoneNumber("BLR");

    mainPage.getQuestionnaire().setNoResidentOfCountry();
    mainPage.getQuestionnaire().setCurrentOccupation(Occupation.MANAGER);
    mainPage.getQuestionnaire().setMainPurposeOfJourney(PurposeOfJourney.TOURISM);
    mainPage.getQuestionnaire().setStateOfFirstEntry(Country.POLAND);
    mainPage.getQuestionnaire().setNumberOfEntriesRequested(
        NumberOfEntriesRequested.MULTIPLE_ENTRIES);
    mainPage.getQuestionnaire().setDurationOfStay("360");

  }

}
