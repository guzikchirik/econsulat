package designpatterns.abstractfactory.impl.human;

import designpatterns.abstractfactory.squadrons.Warrior;

/**
 * Created by Anton_Chyrko on 3/27/2018.
 */
public class HumanWarrior implements Warrior {

  @Override
  public void attack() {
    System.out.println("HumanWarrier attacks Elf");
  }
}
