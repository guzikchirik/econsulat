package com.infongen.selenium.example;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BuilderPatternExample {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    User user =
        new User.UserBuilder("Anton", "Chyrko")
            .age(27)
            .adress("Minsk")
            .phone(7721991)
            .build();
    System.out.println("user = " + user);
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);
    oos.writeObject(user);
    oos.close();

    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bais);
    
    User userClone1 = (User) ois.readObject();
    System.out.println("userClone1 = " + userClone1);
  }
}
