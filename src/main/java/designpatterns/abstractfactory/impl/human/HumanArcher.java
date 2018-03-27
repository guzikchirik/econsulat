package designpatterns.abstractfactory.impl.human;

import designpatterns.abstractfactory.squadrons.Archer;

/**
 * Created by Anton_Chyrko on 3/27/2018.
 */
public class HumanArcher implements Archer {

  @Override
  public void shoot() {
    System.out.println("HumanArcher shoots on the bird!");
  }
}
