package ForWipping.classes;

import ForWipping.interfaces.Walk;

/**
 * Created by Anton_Chyrko on 4/5/2018.
 */
public class Walking implements Walk {

  @Override
  public void slow(int speed) {
    System.out.println("Walking speed slow= " + (speed+10));
  }

  @Override
  public void guick(int speed) {
    System.out.println("Walking speed guick= " + (speed+25));
  }
}
