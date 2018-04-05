package ForWipping;

import ForWipping.classes.Moving;
import ForWipping.classes.Running;
import ForWipping.interfaces.Run;
import ForWipping.interfaces.Walk;

/**
 * Created by Anton_Chyrko on 4/5/2018.
 */
public class Demo {

  public static void main(String[] args) {
// I can send one common interface to different interfaces, which inherited from this common interface.
    Run person1 = new Moving();
    person1.guick(5);
    person1.slow(9);

    Walk person2 = new Moving();
    person2.guick(5);
    person2.slow(9);

    Run person3 = new Running();
    person3.guick(5);
    person3.slow(9);
  }
}
