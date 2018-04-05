package ForWipping.classes;

import ForWipping.interfaces.Creep;

/**
 * Created by Anton_Chyrko on 4/5/2018.
 */
public class Creeping implements Creep {

  @Override
  public void slow(int speed) {
    System.out.println("Creeping speed slow= " + (speed+5));
  }

  @Override
  public void guick(int speed) {
    System.out.println("Creeping speed guick= " + (speed+20));
  }
}
