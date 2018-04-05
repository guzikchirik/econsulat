package designpatterns.attemptatwriting.factory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Anton_Chyrko on 3/29/2018.
 */
public class EnWatch implements Watch {

  SimpleDateFormat dateFormat = new SimpleDateFormat("K:mm a", Locale.ENGLISH);

  @Override
  public void showTime() {
    System.out.println(dateFormat.format(new Date()));
  }
}
