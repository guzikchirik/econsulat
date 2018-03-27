package designpatterns.factory;

/**
 * Created by Anton_Chyrko on 3/27/2018.
 */
public class Toyota implements Car {

  @Override
  public void drive() {
    System.out.println("Drive Toyota");
  }
}
