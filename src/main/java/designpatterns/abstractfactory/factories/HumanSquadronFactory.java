package designpatterns.abstractfactory.factories;

import designpatterns.abstractfactory.AbstractSquadronFactory;
import designpatterns.abstractfactory.impl.human.HumanArcher;
import designpatterns.abstractfactory.impl.human.HumanMage;
import designpatterns.abstractfactory.impl.human.HumanWarrior;
import designpatterns.abstractfactory.squadrons.Archer;
import designpatterns.abstractfactory.squadrons.Mage;
import designpatterns.abstractfactory.squadrons.Warrior;

/**
 * Created by Anton_Chyrko on 3/27/2018.
 */
public class HumanSquadronFactory extends AbstractSquadronFactory {

  @Override
  public Mage createMage() {
    return new HumanMage();
  }

  @Override
  public Archer createArcher() {
    return new HumanArcher();
  }

  @Override
  public Warrior createWarrior() {
    return new HumanWarrior();
  }
}
