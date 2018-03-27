package designpatterns;

import designpatterns.abstractfactory.AbstractSquadronFactory;
import designpatterns.abstractfactory.factories.ElfSquadronFactory;
import designpatterns.abstractfactory.factories.HumanSquadronFactory;
import designpatterns.abstractfactory.squadrons.Archer;
import designpatterns.abstractfactory.squadrons.Mage;
import designpatterns.abstractfactory.squadrons.Warrior;
import designpatterns.builder.User;
import designpatterns.decorator.AlloyWheels;
import designpatterns.decorator.BaseConfigurationCar;
import designpatterns.decorator.Car;
import designpatterns.decorator.Leather;
import designpatterns.factorymethod.CreateTransportShip;
import designpatterns.factorymethod.CreateTransportTrain;
import designpatterns.factorymethod.TransportCreator;
import java.util.NoSuchElementException;

/**
 * Created by Anton_Chyrko on 3/23/2018.
 */
public class Main {

  public static void main(String[] args) {
//    //builder pattern
//    User user = new User.UserBuilder("Anton", "Chyrko").age(26).address("Denisovskaya streat")
//        .phone("+375297721991").build();
//    System.out.println(user.toString());

//    //decorator pattern
//    Car car = new BaseConfigurationCar();
//    System.out.println("Description = " + car.getDescription() + " price = " + car.getPrice());
//    car = new AlloyWheels(new Leather(car));
//    System.out.println("Description = " + car.getDescription() + " price = " + car.getPrice());

//    //factory method pattern
//    TransportCreator creator = setTransportByName("train");
//    Transport transport = creator.createTransport();
//    transport.deliver();
//
//    //for factory pattern
//    CarFactory factory = new CarFactory();
//    Car audi = factory.createCar("audi");
//    Car toyota = factory.createCar("toyota");
//    audi.drive();
//    toyota.drive();

//    //abstract factory pattern
//    AbstractSquadronFactory abstractSquadronFactory = setAbstractSquadronFactoryByName("human");
//
//    Archer archer = abstractSquadronFactory.createArcher();
//    Mage mage = abstractSquadronFactory.createMage();
//    Warrior warrior = abstractSquadronFactory.createWarrior();
//
//    archer.shoot();
//    mage.cast();
//    warrior.attack();
  }

  private static TransportCreator setTransportByName(String transportName) {
    if (transportName.equalsIgnoreCase("ship")) {
      return new CreateTransportShip();
    } else if (transportName.equalsIgnoreCase("train")) {
      return new CreateTransportTrain();
    }
    throw new NoSuchElementException("No such transport");
  }

  private static AbstractSquadronFactory setAbstractSquadronFactoryByName(String squadron) {
    if (squadron.equalsIgnoreCase("elf")) {
      return new ElfSquadronFactory();
    } else if (squadron.equalsIgnoreCase("human")) {
      return new HumanSquadronFactory();
    }
    throw new NoSuchElementException("No such squadrons" + squadron);
  }
}
