package designpatterns;

import designpatterns.builder.User;
import designpatterns.decorator.AlloyWheels;
import designpatterns.decorator.BaseConfigurationCar;
import designpatterns.decorator.Car;
import designpatterns.decorator.Leather;

/**
 * Created by Anton_Chyrko on 3/23/2018.
 */
public class Main {

  public static void main(String[] args) {
    User user = new User.UserBuilder("Anton", "Chyrko").age(26).address("Denisovskaya streat")
        .phone("+375297721991").build();
    System.out.println(user.toString());

    Car car = new BaseConfigurationCar();
    System.out.println("Description = " + car.getDescription() + " price = " + car.getPrice());
    car = new AlloyWheels(new Leather(car));
    System.out.println("Description = " + car.getDescription() + " price = " + car.getPrice());
  }
}
