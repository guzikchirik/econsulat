package designpatterns.adapter;

/**
 * Created by Anton_Chyrko on 3/29/2018.
 */
public class Main {
  public static void main(String[] args) {
    boolean result;

    Hole hole = new Hole(5);
    RoundPeg roundPeg = new RoundPeg(4);
    result = hole.fits(roundPeg);
    System.out.println("roundPeg to Hole= " + result);

    SquarePeg smallSquarePeg = new SquarePeg(2);
    SquarePeg hugeSquarePeg = new SquarePeg(20);

    SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
    SquarePegAdapter hugeSquarePegAdapter = new SquarePegAdapter(hugeSquarePeg);

    result = hole.fits(smallSquarePegAdapter);
    System.out.println("smallSquarePegAdapter to Hole= " + result);

    result = hole.fits(hugeSquarePegAdapter);
    System.out.println("hugeSquarePegAdapter to Hole= " + result);
  }
}
