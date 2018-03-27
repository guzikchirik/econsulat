package designpatterns.factorymethod;

/**
 * Created by Anton_Chyrko on 3/27/2018.
 */
public class CreateTransportTrain implements TransportCreator{

  @Override
  public Transport createTransport() {
    return new Train();
  }
}
