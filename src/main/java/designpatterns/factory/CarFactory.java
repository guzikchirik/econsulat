package designpatterns.factory;

/**
 * Created by Anton_Chyrko on 3/27/2018.
 */
public class CarFactory {

  public Car createCar(String carName) {
    switch (carName) {
      case "audi":
        return new Audi();
      case "toyota":
        return new Toyota();
      default:
        return null;
    }
  }
}
