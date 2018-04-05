package ForWipping.classes;

import ForWipping.interfaces.Run;

/**
 * Created by Anton_Chyrko on 4/5/2018.
 */
public class Running implements Run {

  @Override
  public void slow(int speed) {
    System.out.println("Running speed slow= " + (speed+15));
  }

  @Override
  public void guick(int speed) {
    System.out.println("Running speed guick = " + (speed+30));
  }
}
