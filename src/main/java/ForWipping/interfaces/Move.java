package ForWipping.interfaces;

/**
 * Created by Anton_Chyrko on 4/5/2018.
 */
public interface Move extends Run, Walk, Creep {

  void motion(int speed);


}
