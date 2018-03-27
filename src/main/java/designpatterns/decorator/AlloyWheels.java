package designpatterns.decorator;

/**
 * Created by Anton_Chyrko on 3/23/2018.
 */
public class AlloyWheels extends CarDecorator {

  public AlloyWheels(Car car) {
    super(car);
  }

  @Override
  public int getPrice() {
    return car.getPrice() + 15;
  }

  @Override
  public String getDescription() {
    return car.getDescription() + " + литые диски";
  }
}
