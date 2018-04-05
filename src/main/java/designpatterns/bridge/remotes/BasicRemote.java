package designpatterns.bridge.remotes;

import designpatterns.bridge.devices.Device;

/**
 * Created by Anton_Chyrko on 3/30/2018.
 */
public class BasicRemote implements Remote {

  private Device device;

  public BasicRemote() {
  }

  public BasicRemote(Device device) {
    this.device = device;
  }

  @Override
  public void powerOn(boolean status) {
    device.isOn(status);
  }

  @Override
  public void setChannel(int channel) {
    System.out.println("Switch channel to " + channel);
    device.switchTheChannelTo(channel);
  }
}
