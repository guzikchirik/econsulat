package ForWipping;

import static java.util.Arrays.asList;

import ForWipping.classes.EBook;
import ForWipping.classes.Laptop;
import ForWipping.classes.SmartPhone;
import ForWipping.interfaces.Playable;
import ForWipping.interfaces.Surfable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton_Chyrko on 4/5/2018.
 */
public class Demo {

  public static void main(String[] args) {
// I can send one common interface to different interfaces, which inherited from this common interface.
    EBook ebook = new EBook();
    Laptop laptop = new Laptop();
    SmartPhone smartPhone = new SmartPhone();

    List<Surfable> surfableDevices = new ArrayList<>();
    List<Playable> playableDevices = new ArrayList<>();

    surfableDevices.addAll(asList(ebook, laptop, smartPhone));
    playableDevices.addAll(asList(laptop, smartPhone));

    surfableDevices.forEach(Surfable::surf);
    playableDevices.forEach(Playable::play);

  }
}
