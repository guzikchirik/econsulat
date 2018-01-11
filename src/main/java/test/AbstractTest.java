package test;

import org.testng.annotations.BeforeClass;

public abstract class AbstractTest {
  @BeforeClass(alwaysRun = true)
  public final void login() {

  }
}
