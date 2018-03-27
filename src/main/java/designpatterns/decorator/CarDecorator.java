package designpatterns.decorator;

/**
 * Created by Anton_Chyrko on 3/23/2018.
 */
public abstract class CarDecorator implements Car {

  protected Car car;

  public CarDecorator(Car car){
    this.car = car;
  }


}
