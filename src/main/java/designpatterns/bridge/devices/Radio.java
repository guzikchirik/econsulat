package designpatterns.bridge.devices;

/**
 * Created by Anton_Chyrko on 3/30/2018.
 */
public class Radio implements Device {

  private int channel = 0;
  private boolean status = false;

  public Radio() {
  }

  public Radio(int channel, boolean status) {
    this.channel = channel;
    this.status = status;
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
    return "Radio{" +
        "channel=" + channel +
        ", status=" + status +
        '}';
  }
}
