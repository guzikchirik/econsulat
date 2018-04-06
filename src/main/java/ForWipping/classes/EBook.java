package ForWipping.classes;

import ForWipping.interfaces.Readable;
import ForWipping.interfaces.Surfable;

/**
 * Created by Anton_Chyrko on 4/6/2018.
 */
public class EBook implements Readable, Surfable{

  public void read() {
    System.out.println("Read books on the Electronic book");
  }

  public void surf() {
    System.out.println("Surf internet by Electronic book");
  }
}
