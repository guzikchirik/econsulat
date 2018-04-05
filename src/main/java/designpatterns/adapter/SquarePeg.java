package designpatterns.adapter;

/**
 * Created by Anton_Chyrko on 3/29/2018.
 */
public class SquarePeg implements Peg{

  private int radius;

  public SquarePeg(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }
}
