package designpatterns.decorator;

public class MainDecaration {
    public static void main(String[] args) {
        Car car = new BaseConfigurationCar();
        System.out.println("Description = " + car.getDescription() + " price = " + car.getPrice());
        car = new AlloyWheels(new Leather(car));
        System.out.println("Description = " + car.getDescription() + " price = " + car.getPrice());
    }
}
