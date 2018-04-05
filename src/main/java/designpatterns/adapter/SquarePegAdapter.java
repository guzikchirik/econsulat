package designpatterns.adapter;

/**
 * Created by Anton_Chyrko on 3/29/2018.
 */
public class SquarePegAdapter extends RoundPeg {

  private SquarePeg peg;

  public SquarePegAdapter(SquarePeg peg) {
    this.peg = peg;
  }

  @Override
  public double getRadius() {
    return peg.getRadius()*Math.sqrt(2);
  }
}
