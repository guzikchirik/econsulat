package designpatterns.bridge.devices;

/**
 * Created by Anton_Chyrko on 3/30/2018.
 */
public class TV implements Device {

  private int channel = 0;
  private boolean status = false;

  public TV() {
  }

  @Override
  public void isOn(boolean status) {
    this.status = status;
  }

  @Override
  public void switchTheChannelTo(int channel) {
    this.channel = channel;
  }

  public int getChannel() {
    return channel;
  }

  public boolean isStatus() {
    return status;
  }

  @Override
  public String toString() {
    return "TV{" +
        "channel=" + channel +
        ", status=" + status +
        '}';
  }
}
