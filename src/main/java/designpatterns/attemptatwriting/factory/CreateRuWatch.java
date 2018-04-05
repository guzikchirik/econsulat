package designpatterns.attemptatwriting.factory;

/**
 * Created by Anton_Chyrko on 3/29/2018.
 */
public class CreateRuWatch extends WatchFactory {

  @Override
  Watch createWatch() {
    return new RuWatch();
  }
}
