package designpatterns.bridge.devices;

/**
 * Created by Anton_Chyrko on 3/30/2018.
 */
public interface Device {

  void isOn(boolean status);

  void switchTheChannelTo(int channel);

}
