package designpatterns.abstractfactory.factories;

import designpatterns.abstractfactory.AbstractSquadronFactory;
import designpatterns.abstractfactory.impl.elfs.ElfArcher;
import designpatterns.abstractfactory.impl.elfs.ElfMage;
import designpatterns.abstractfactory.impl.elfs.ElfWarrior;
import designpatterns.abstractfactory.squadrons.Archer;
import designpatterns.abstractfactory.squadrons.Mage;
import designpatterns.abstractfactory.squadrons.Warrior;

/**
 * Created by Anton_Chyrko on 3/27/2018.
 */
public class ElfSquadronFactory extends AbstractSquadronFactory {

  @Override
  public Mage createMage() {
    return new ElfMage();
  }

  @Override
  public Archer createArcher() {
    return new ElfArcher();
  }

  @Override
  public Warrior createWarrior() {
    return new ElfWarrior();
  }
}
