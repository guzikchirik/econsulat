package designpatterns.abstractfactory.impl.elfs;

import designpatterns.abstractfactory.squadrons.Archer;

/**
 * Created by Anton_Chyrko on 3/27/2018.
 */
public class ElfArcher implements Archer {

  @Override
  public void shoot() {
    System.out.println("Elf archer shooting!");
  }
}
