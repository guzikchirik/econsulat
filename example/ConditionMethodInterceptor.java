package com.infongen.selenium.example;

import com.infongen.selenium.steps.LoginSteps;
import com.infongen.selenium.steps.v3test.V3TestPageSteps;
import java.lang.reflect.Method;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.AbstractTestExecutionListener;

public class ConditionMethodInterceptor extends AbstractTestExecutionListener {

  @Override
  public void afterTestMethod(TestContext testContext){
    Method testMethod = testContext.getTestMethod();
    if (!testMethod.isAnnotationPresent(AfterMethod.class)) {
      return;
    }
    AfterMethod loginTo = testMethod.getAnnotation(AfterMethod.class);
    ApplicationContext applicationContext = testContext.getApplicationContext();

    applicationContext.getBean(V3TestPageSteps.class).logout();
    ConfigurableListableBeanFactory beanFactory =
        ((ConfigurableApplicationContext) applicationContext).getBeanFactory();
    applicationContext
        .getBean(LoginSteps.class)
        .loginToV3Portal(
            beanFactory.resolveEmbeddedValue(loginTo.user()),
            beanFactory.resolveEmbeddedValue(loginTo.password()));
  }
}
