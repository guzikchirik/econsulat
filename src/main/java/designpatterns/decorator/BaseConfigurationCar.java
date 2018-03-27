package designpatterns.decorator;

/**
 * Created by Anton_Chyrko on 3/23/2018.
 */
public class BaseConfigurationCar implements Car{

  @Override
  public int getPrice() {
    return 100;
  }

  @Override
  public String getDescription() {
    return "Base configuration";
  }
}
