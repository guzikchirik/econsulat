package designpatterns.factorymethod;

/**
 * Created by Anton_Chyrko on 3/27/2018.
 */
public class CreateTransportShip implements TransportCreator {

  @Override
  public Transport createTransport() {
    return new Ship();
  }
}
