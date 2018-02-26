package test;

import org.testng.annotations.Test;
import pageobjects.generalconsulateingrodno.Questionary.MartialStatus;
import pageobjects.generalconsulateingrodno.Questionary.Sex;

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
  }

}
