package designpatterns.bridge;

import designpatterns.bridge.devices.Radio;
import designpatterns.bridge.devices.TV;
import designpatterns.bridge.remotes.BasicRemote;

/**
 * Created by Anton_Chyrko on 3/30/2018.
 */
public class Demo {

  public static void main(String[] args) {
    Radio radio = new Radio();
    TV tv = new TV();

    BasicRemote basicRemote = new BasicRemote(tv);

    basicRemote.powerOn(true);

    System.out.println(tv.toString());
    System.out.println(radio.toString());
  }
}
