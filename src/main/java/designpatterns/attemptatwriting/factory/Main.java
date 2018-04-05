package designpatterns.attemptatwriting.factory;

/**
 * Created by Anton_Chyrko on 3/29/2018.
 */
public class Main {

  public static void main(String[] args) {

    WatchFactory factory = new CreateEnWatch();
    Watch watch = factory.createWatch();
    watch.showTime();

  }

}
