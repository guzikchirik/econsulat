package ForWipping.classes;

import ForWipping.interfaces.Move;

/**
 * Created by Anton_Chyrko on 4/5/2018.
 */
public class Moving implements Move {

  @Override
  public void motion(int speed) {
    System.out.println("Moving speed motion= " + speed);
  }

  @Override
  public void slow(int speed) {
    System.out.println("Moving speed slow= " + speed);
  }

  @Override
  public void guick(int speed) {
    System.out.println("Moving speed guick= " + speed);
  }
}
