package designpatterns.bridge.remotes;

/**
 * Created by Anton_Chyrko on 3/30/2018.
 */
public interface Remote {

  void powerOn(boolean status);

  void setChannel(int channel);

}
