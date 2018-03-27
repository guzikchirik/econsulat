package designpatterns.abstractfactory.impl.elfs;

import designpatterns.abstractfactory.squadrons.Mage;

/**
 * Created by Anton_Chyrko on 3/27/2018.
 */
public class ElfMage implements Mage {

  @Override
  public void cast() {
    System.out.println("ElfMage cast spells");
  }
}
