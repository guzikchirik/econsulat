package test;


import org.testng.annotations.BeforeClass;

public class FormTest extends AbstractTest{

  @BeforeClass(alwaysRun = true)
  public final void login() {
    this.v3TestPage = performLogin();
  }
}
