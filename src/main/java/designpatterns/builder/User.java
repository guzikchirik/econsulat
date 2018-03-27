package designpatterns.builder;

/**
 * Created by Anton_Chyrko on 3/23/2018.
 */
public class User {

  private final String name;
  private final String surname;
  private final int age;
  private final String address;
  private final String phone;

  private User(UserBuilder userBuilder){
    this.name = userBuilder.name;
    this.surname = userBuilder.surname;
    this.age = userBuilder.age;
    this.address = userBuilder.address;
    this.phone = userBuilder.phone;
  }

  public static class UserBuilder{

    private final String name;
    private final String surname;
    private int age;
    private String address;
    private String phone;

    public UserBuilder(String name, String surname){
      this.name = name;
      this.surname = surname;
    }

    public UserBuilder age(int age){
      this.age = age;
      return this;
    }

    public UserBuilder address(String address){
      this.address = address;
      return this;
    }

    public UserBuilder phone(String phone){
      this.phone = phone;
      return this;
    }

    public User build(){
      User user = new User(this);
      return user;
    }

  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", age=" + age +
        ", address='" + address + '\'' +
        ", phone='" + phone + '\'' +
        '}';
  }
}
