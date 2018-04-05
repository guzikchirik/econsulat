package designpatterns.prototype.figuresImpl;

import designpatterns.prototype.Shape;

/**
 * Created by Anton_Chyrko on 3/28/2018.
 */
public class Circle extends Shape {

  private int radius;

  public Circle(){}

  public Circle(Circle circle){
//    super(circle);
    this.radius = circle.getRadius();

  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  @Override
  public Circle clone() {
    return new Circle(this);
  }
}
