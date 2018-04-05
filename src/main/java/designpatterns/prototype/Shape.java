package designpatterns.prototype;

/**
 * Created by Anton_Chyrko on 3/28/2018.
 */
abstract public class Shape {

  int X;
  int Y;
  String color;

  public int getX() {
    return X;
  }

  public int getY() {
    return Y;
  }

  public String getColor() {
    return color;
  }

  public Shape(){}

  public Shape(Shape target) {
    if (target != null) {
      this.color = target.color;
      this.X = target.X;
      this.Y = target.Y;
    }
  }

  public abstract Shape clone();
}
