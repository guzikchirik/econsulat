package designpatterns.abstractfactory;

import designpatterns.abstractfactory.squadrons.Archer;
import designpatterns.abstractfactory.squadrons.Mage;
import designpatterns.abstractfactory.squadrons.Warrior;

/**
 * Created by Anton_Chyrko on 3/27/2018.
 */
public abstract class AbstractSquadronFactory {

  public abstract Mage createMage();

  public abstract Archer createArcher();

  public abstract Warrior createWarrior();
}
