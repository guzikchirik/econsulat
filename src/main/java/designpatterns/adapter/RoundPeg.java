package designpatterns.adapter;

/**
 * Created by Anton_Chyrko on 3/29/2018.
 */
public class RoundPeg implements Peg {

  private int radius;

  public RoundPeg(){}

  public RoundPeg(int radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }
}
