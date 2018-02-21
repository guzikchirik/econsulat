package test;

import org.testng.annotations.Test;

/**
 * Created by Anton_Chyrko on 2/21/2018.
 */
public class ClickSiteLogoTest extends AbstractTest {

  @Test(description = "1. Click site logo")
  public void clickSiteLogo() {
    page.selectLanguage();
    page.selectCountry();
    page.selectEmbassy();
  }

}
