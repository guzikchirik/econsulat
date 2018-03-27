package designpatterns.factorymethod;

/**
 * Created by Anton_Chyrko on 3/27/2018.
 */
public class Train implements Transport {

  private int amount;

  @Override
  public void deliver() {
    System.out.println("Trains deliver products by rails!");
  }

  @Override
  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }
}
