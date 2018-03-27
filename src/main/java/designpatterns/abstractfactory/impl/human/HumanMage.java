package designpatterns.abstractfactory.impl.human;

import designpatterns.abstractfactory.squadrons.Mage;

/**
 * Created by Anton_Chyrko on 3/27/2018.
 */
public class HumanMage implements Mage {

  @Override
  public void cast() {
    System.out.println("HumanMage casts spells!");

  }
}
