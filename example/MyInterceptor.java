package com.infongen.selenium.example;

import static java.util.Arrays.asList;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import org.testng.IConfigurationListener2;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class MyInterceptor implements IInvokedMethodListener, IMethodInterceptor,
    IConfigurationListener2 {
  Method afterMethod;
  String className;
  String methodName;

  @Override
  public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {}

  @Override
  public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
    try {
      System.out.println("11111111111111111111111");
      System.out.println("iTestResult = " + iTestResult.getName());
      if (shouldIntercept(iTestResult)) {
        if (iTestResult
            .getMethod()
            .getConstructorOrMethod()
            .getMethod()
            .isAnnotationPresent(Postcondition.class)) {
          System.out.println("55555555555555555555555555555555");
          System.out.println("iInvokedMethod.getTestMethod().getMethodName() = " + iInvokedMethod.getTestMethod().getMethodName());
          Object afterMethodObj = iTestResult.getInstance();
          Method setNameMethod = afterMethodObj.getClass().getMethod(methodName);
          setNameMethod.invoke(afterMethodObj);
          
        }
      }
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
  }

  @Override
  public List<IMethodInstance> intercept(List<IMethodInstance> list, ITestContext context) {
    System.out.println("2222222222222222222222");
    className = list.get(0).getInstance().getClass().getName();
    Method[] allMethod = (list.get(0).getInstance().getClass()).getMethods();
    for (Method m : allMethod) {
      if (m.isAnnotationPresent(AfterMethod.class)) {
        afterMethod = m;
        methodName = afterMethod.getName();
      }
    }
    return list;
  }
  private boolean shouldIntercept(ITestResult result) {
    List<String> listeners = result.getTestContext().getCurrentXmlTest().getSuite().getListeners();
    return listeners.contains(this.getClass().getName())
        || shouldIntercept(result.getTestClass().getRealClass(), this.getClass());
  }

  private boolean shouldIntercept(Class testClass, Class annotation) {
    Listeners listenersAnnotation = getListenersAnnotation(testClass);
    return listenersAnnotation != null && asList(listenersAnnotation.value()).contains(annotation);
  }

  private Listeners getListenersAnnotation(Class testClass) {
    Annotation annotation = testClass.getAnnotation(Listeners.class);
    return annotation != null
        ? (Listeners) annotation
        : testClass.getSuperclass() != null
            ? getListenersAnnotation(testClass.getSuperclass())
            : null;
  }

  @Override
  public void beforeConfiguration(ITestResult iTestResult) {
    System.out.println("33333333333333333333");
    System.out.println("iTestResult.getName() = " + iTestResult.getName());
    


  }

  @Override
  public void onConfigurationSuccess(ITestResult iTestResult) {
    System.out.println("444444444444444444444444444");
    System.out.println("iTestResult.getName(onConfigurationSuccess) = " + iTestResult.getName());
  }

  @Override
  public void onConfigurationFailure(ITestResult iTestResult) {

  }

  @Override
  public void onConfigurationSkip(ITestResult iTestResult) {

  }
}
