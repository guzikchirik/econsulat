package com.infongen.selenium.example;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyInterceptor.class)
public class MethodInterceptorDemo {
String str;

@org.testng.annotations.AfterMethod
public void nativeAfterMethod(){
    System.out.println();
    System.out.println("NATIVE AFTER METHOD!!!");
}

//  @com.infongen.selenium.example.AfterMethod(methodName = "afterTest")
  public void afterTest() {
    System.out.println();
    System.out.println("AFTER TEST");
    System.out.println("str in afterTest = " + str);
    str = "AfterTest";
    System.out.println("afterTest set str = "+str);

  }

  @Postcondition(methodName = "forAfterTest")
  @Test
  public void Ccc() {
    System.out.println();
    System.out.println("Method Ccc set str in null");
    str = null;
    System.out.println("str = " + str);
  }
  @Test(groups = "a")
  public void A() {
    System.out.println();
    System.out.println("Method A");
    System.out.println("str = " + str);
    str = "SET from A";
    System.out.println("A set str = "+str);
  }

  @Test
  public void C() {
    System.out.println();
    System.out.println("Method C");
    System.out.println("str = " + str);
    str = "SET from C";
    System.out.println("C set str = "+str);
  }

  @Test(dependsOnMethods = "A", dependsOnGroups = "a")
  public void B() {
    System.out.println();
    System.out.println("Method B");
    System.out.println("str = " + str);
    str = "SET from B";
    System.out.println("B set str = "+str);
  }
  @Test
  public void D() {
    System.out.println();
    System.out.println("Method D");
    System.out.println("str = " + str);
    str = "SET from D";
    System.out.println("D set str = "+str);
  }

  @Postcondition(methodName = "afterTest")
  @Test
  public void Aaa() {
    System.out.println();
    System.out.println("Method Aaa");
    System.out.println("str = " + str);
  }
}
