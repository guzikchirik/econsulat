package designpatterns.attemptatwriting.factory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Anton_Chyrko on 3/29/2018.
 */
public class RuWatch implements Watch {

  SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

  @Override
  public void showTime() {
    System.out.println(dateFormat.format(new Date()));
  }
}
