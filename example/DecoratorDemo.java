package com.infongen.selenium.example;

interface Fruit {
  double getPrice();
}

class Apple implements Fruit {
  private double price;

  public Apple(double price) {
    this.price = price;
  }

  @Override
  public double getPrice() {
    return price;
  }
}

abstract class DiscountFruit implements Fruit {
  Apple apple;

  public DiscountFruit(Apple apple) {
    this.apple = apple;
  }
}

class TenPerCentDiscount extends DiscountFruit{
  public TenPerCentDiscount(Apple apple) {
    super(apple);
  }

  public double getPrice() {
    return apple.getPrice()-apple.getPrice()*0.1;
  }
}

public class DecoratorDemo {
  public static void main(String[] args) {
    Apple apple = new Apple(5);
    DiscountFruit tenPerCentDiscount = new TenPerCentDiscount(apple);
    System.out.println("tenPerCentDiscount.getPrice() = " + tenPerCentDiscount.getPrice());
  }
}
