package com.infongen.selenium.example;

import java.io.Serializable;

public class User implements Serializable{

  private final String name;
  private final String surname;
  private final int age;
  private final String adress;
  private final int phone;

  private User(UserBuilder userBuilder) {
    name = userBuilder.name;
    surname = userBuilder.surname;
    age = userBuilder.age;
    adress = userBuilder.adress;
    phone = userBuilder.phone;
  }

  public static class UserBuilder {
    private String name;
    private String surname;
    private int age;
    private String adress;
    private int phone;

    public UserBuilder(String name, String surname) {
      this.name = name;
      this.surname = surname;
    }

    public UserBuilder age(int age) {
      this.age = age;
      return this;
    }

    public UserBuilder phone(int phone) {
      this.phone = phone;
      return this;
    }

    public UserBuilder adress(String adress) {
      this.adress = adress;
      return this;
    }

    public User build() {
      User user = new User(this);
      if (user.getAge() > 120) {
        System.out.println("Wrong age = " + age);
      }
      return user;
    }
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", age=" + age +
        ", adress='" + adress + '\'' +
        ", phone=" + phone +
        '}';
  }

  public int getAge() {
    return age;
  }
}
