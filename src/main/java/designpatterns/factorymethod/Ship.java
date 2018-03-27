package designpatterns.factorymethod;

/**
 * Created by Anton_Chyrko on 3/27/2018.
 */
public class Ship implements Transport {
  private int amount;

  @Override
  public void deliver() {
    System.out.println("Ships deliver products by sea");
  }

  @Override
  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }
}
