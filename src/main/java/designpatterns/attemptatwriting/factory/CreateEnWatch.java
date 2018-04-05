package designpatterns.attemptatwriting.factory;

/**
 * Created by Anton_Chyrko on 3/29/2018.
 */
public class CreateEnWatch extends WatchFactory {

  @Override
  Watch createWatch() {
    return new EnWatch();
  }
}
