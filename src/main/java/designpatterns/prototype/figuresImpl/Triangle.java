package designpatterns.prototype.figuresImpl;

import designpatterns.prototype.Shape;

/**
 * Created by Anton_Chyrko on 3/29/2018.
 */
public class Triangle extends Shape {

  int sideA;
  int sideB;
  int sideC;

  public Triangle(){}

  public Triangle(Triangle target){
    super(target);
    this.sideA = target.sideA;
    this.sideB = target.sideB;
    this.sideC = target.sideC;
  }

  @Override
  public Shape clone() {
    return new Triangle(this);
  }
}
