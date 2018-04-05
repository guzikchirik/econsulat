package refactoringguru.designpatterns.composite.shapes;

import java.awt.Graphics;

/**
 * Created by Anton_Chyrko on 3/30/2018.
 */
public interface Shape {

  int getX();

  int getY();

  int getWidth();

  int getHeight();

  void move(int x, int y);

  Boolean isInsideBounds(int x, int y);

  void select();

  void unSelect();

  Boolean isSelected();

  void paint(Graphics graphics);
}
