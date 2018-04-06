package ForWipping.classes;

import ForWipping.interfaces.Playable;
import ForWipping.interfaces.Surfable;
import ForWipping.interfaces.Working;

/**
 * Created by Anton_Chyrko on 4/6/2018.
 */
public class Laptop implements Surfable, Playable, Working {

  public void surf() {
    System.out.println("surfing in the internet by Laptop");
  }

  public void play() {
    System.out.println("Play games on the Laptop");
  }

  public void work() {
    System.out.println("Work on the Laptop");
  }
}
