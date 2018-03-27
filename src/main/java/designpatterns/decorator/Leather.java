package designpatterns.decorator;

/**
 * Created by Anton_Chyrko on 3/23/2018.
 */
public class Leather extends CarDecorator {

  public Leather(Car car) {
    super(car);
  }

  @Override
  public int getPrice() {
    return car.getPrice()+10;
  }

  @Override
  public String getDescription() {
    return car.getDescription()+" + кожа";
  }
}
