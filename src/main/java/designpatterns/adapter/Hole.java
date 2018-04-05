package designpatterns.adapter;

/**
 * Created by Anton_Chyrko on 3/29/2018.
 */
public class Hole {

  private int radius;

  public Hole(int radius) {
    this.radius = radius;
  }

  public boolean fits(RoundPeg peg) {
    System.out.println("Hole radius = " + this.radius + " Peg radius = " + peg.getRadius());
    return this.radius >= peg.getRadius();
  }
}
