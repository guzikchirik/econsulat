package ForWipping.classes;


import ForWipping.interfaces.Callable;
import ForWipping.interfaces.Playable;
import ForWipping.interfaces.Surfable;

/**
 * Created by Anton_Chyrko on 4/6/2018.
 */
public class SmartPhone implements Callable, Surfable, Playable {

  public void call() {
    System.out.println("Phone call");
  }

  public void surf() {
    System.out.println("Surf internet by Phone");
  }

  public void play() {
    System.out.println("Play games on phone");
  }
}
