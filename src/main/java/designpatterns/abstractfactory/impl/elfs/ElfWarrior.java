package designpatterns.abstractfactory.impl.elfs;

import designpatterns.abstractfactory.squadrons.Warrior;

/**
 * Created by Anton_Chyrko on 3/27/2018.
 */
public class ElfWarrior implements Warrior {

  @Override
  public void attack() {
    System.out.println("ElfWarrior attacks!");
  }
}
